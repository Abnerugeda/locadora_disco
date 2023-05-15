package com.exemplo.locadora.negocio.fachada.interfaces;

import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;
import com.exemplo.locadora.negocio.entidade.interfaces.Locatario;
import com.exemplo.locadora.negocio.entidade.interfaces.Locavel;

import java.security.InvalidParameterException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public  abstract class LocadoraFachada {

    // Os maps simulam um banco de dados com os objetos persistidos.
    private static Map<Long, Locavel>   locaveis   = new HashMap<>();
    private static Map<Long, Locatario> locatarios = new HashMap<>();
    private static Map<Long, Locacao>   locacoes   = new HashMap<>();

    public static Map<Long, Locavel> getLocaveis() {
        return locaveis;
    }

    public static Map<Long, Locatario> getLocatarios() {
        return locatarios;
    }

    // Métodos abstratos que representam o padrão de
    // projeto Template Method (vide material da aula).
    protected abstract Locacao instanciarLocacao();
    protected abstract void    tratarParticularidadesDaLocacao(Locacao _locacao, Locavel _locavel);

    public Locacao locar(Long _idLocatario, Long _idLocavel) {

        // 1. Verificar se o locatário de id respectivo existe e
        //    lançar uma mensagem de erro caso não exista.
        Locatario locatario = locatarios.get(_idLocatario);

        if (locatario == null) {
            throw new InvalidParameterException("Locatário não existe!");
        }

        // 2. Verificar se o veículo de id respectivo existe e
        //    lançar uma mensagem de erro caso não exista.
        Locavel locavel = locaveis.get(_idLocavel);

        if (locavel == null) {
            throw new InvalidParameterException("Item desejado para locação não existe!");
        }

        // 3. Verificar se o locável está disponível para locação e
        //    lançar uma mensagem de erro caso não esteja.
        if (!locavel.disponivel()) {
            throw new InvalidParameterException("O item já está locado!");
        }

        // 4. Criar uma locação com a data atual como data de início e demais
        //    detalhes que devem ser observados, dependendo do tipo de locação.
        Locacao locacao = this.instanciarLocacao();
        locacao.setId(locacoes.size() + 1L);
        locacao.setInicio(new Date());
        locacao.setPaga(false);

        // Trata as particularidades, dependendo do tipo de locadora.
        this.tratarParticularidadesDaLocacao(locacao, locavel);

        // Setando os relacionamentos bidirecionais.
        locacao.setLocatario(locatario);
        locatario.getLocacoes().add(locacao);
        locacao.setLocavel(locavel);
        locavel.getLocacoes().add(locacao);

        // Salvando no banco de dados simiulado.
        locacoes.put(locacao.getId(), locacao);

        return locacao;
    }

    // Como os parâmetros de devolução podem variar de um tipo de locadora
    // para outra, é necessário passar um map que contém essas diferenças.
    public void devolver(Long                _idLocacao,
                         Boolean             _paga,
                         Map<String, Object> _infoAdicionais) {

        // 1. Verificar se a locação de id respectivo existe e
        //    lançar uma mensagem de erro caso não exista.

        // 2. Setar a data de fim da locação para a data atual.

        // 3. Setar se a locacao foi paga.

        /**
         * Veja que a partir desse ponto, tudo se refere a uma locadora
         * veículos. Precisaríamos passar essas particularidades do
         * algoritmo para a fachada de locadora de veículos.
         **/

        // 4. Setar o km de entrega da locação.
        // 5. Atualizar a kilometragem do veículo.

    }
}
