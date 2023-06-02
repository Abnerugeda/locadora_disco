package com.exemplo.locadora.negocio.entidade.disco;

import com.exemplo.locadora.negocio.entidade.disco.Locacao;

public class Locadora {
    public static double calcularValorLocacao(Disco disco, Locacao locacao) throws Exception {
        if (disco.isDanificado()) {
            throw new Exception("Não é possível locar um disco danificado.");
        }

        double valorLocacao = locacao.getDataInicio().until(locacao.getDataFim()).getDays() * disco.getValorDiaria();

        if (locacao.isDevolvidoDanificado()) {
            valorLocacao += disco.getPrecoAtual();
        }

        return valorLocacao;
    }
}