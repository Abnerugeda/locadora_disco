package com.exemplo.locadora.negocio.fachada.veiculo;

import com.exemplo.locadora.negocio.entidade.veiculo.LocatarioDeVeiculo;
import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;
import com.exemplo.locadora.negocio.entidade.interfaces.Locavel;
import com.exemplo.locadora.negocio.entidade.veiculo.LocacaoDeVeiculo;
import com.exemplo.locadora.negocio.entidade.veiculo.Veiculo;
import com.exemplo.locadora.negocio.fachada.interfaces.LocadoraFachada;

import java.util.ArrayList;

// Note que estamos no pacote "fachada.veiculo". Ou seja, essa é a fachada de uma
// locadora de veículos. Nessa implementação em específico, ela que determina a
// instanciação dos objetos concretos relacionadas com uma locadora de veículos,
// bem como o acesso a detalhes que só importam a uma locadora de veículos.
public class LocadoraDeVeiculoFachada extends LocadoraFachada {

    public void instanciarObjetos() {

        Veiculo v1 = new Veiculo();
        v1.setId(1L);
        v1.setMarca("Fiat");
        v1.setModelo("Pálio 1.6");
        v1.setKmAtual(0L);
        v1.setValorDiaria(100.0);
        v1.setValorKmAdicional(5.0);
        v1.setLocacoes(new ArrayList<>());
        getLocaveis().put(v1.getId(), v1);

        LocatarioDeVeiculo l1 = new LocatarioDeVeiculo();
        l1.setId(1L);
        l1.setNome("João Silva");
        l1.setLocacoes(new ArrayList<>());
        getLocatarios().put(l1.getId(), l1);
    }


    @Override
    protected Locacao instanciarLocacao() {

        LocacaoDeVeiculo locacao = new LocacaoDeVeiculo();

        return locacao;
    }

    @Override
    protected void tratarParticularidadesDaLocacao(Locacao _locacao, Locavel _locavel) {

        // Downcast para acesso a informacões específicas.
        LocacaoDeVeiculo locacao = (LocacaoDeVeiculo)_locacao;
        Veiculo          veiculo = (Veiculo)_locavel;

        // Aqui são tratadas as coisas específicas que
        // somente uma locação de veículo tem.
        locacao.setKmRetirada(veiculo.getKmAtual());
    }
}
