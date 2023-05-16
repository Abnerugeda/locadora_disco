package com.exemplo.locadora.negocio.fachada.veiculo;


import com.exemplo.locadora.negocio.entidade.disco.Disco;
import com.exemplo.locadora.negocio.entidade.disco.LocacaoDeDisco;
import com.exemplo.locadora.negocio.entidade.disco.LocatarioDeDisco;
import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;
import com.exemplo.locadora.negocio.entidade.interfaces.Locavel;
import com.exemplo.locadora.negocio.fachada.interfaces.LocadoraFachada;

import java.util.ArrayList;

public class LocadoraDeDiscoFachada extends LocadoraFachada {
    public void instanciarObjetos() {

        Disco disco = new Disco();
        disco.setTitulo("Music Collection");
        disco.setArtista("Vários");
        disco.setAno_lancamento("2021");
        disco.setPreco_atual(59.90);
        disco.setValor_diaria(3.00);
        disco.setDanificado(false);
        disco.setLocacoes(new ArrayList<>());
        getLocaveis().put(disco.getId(), disco);

        LocatarioDeDisco d1 = new LocatarioDeDisco();
        d1.setId(1L);
        d1.setNome("Maria Fernanda");
        d1.setLocacoes(new ArrayList<>());
        getLocatarios().put(d1.getId(), d1);
    }

    @Override
    protected Locacao instanciarLocacao() {

        LocacaoDeDisco locacao = new LocacaoDeDisco();

        return locacao;
    }

    @Override
    protected void tratarParticularidadesDaLocacao(Locacao _locacao, Locavel _locavel) {

        LocacaoDeDisco locacao = (LocacaoDeDisco)_locacao;
        Disco          disco = (Disco)_locavel;
        locacao.setDevolvido_danificado(disco.getDanificado());
    }
}
