package com.exemplo.locadora.negocio.entidade.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Locatario {

    private Long                id;
    private String              nome;
    private String              cpf;
    private Collection<Locacao> locacoes = new ArrayList<>();


    public Long getId() {
        return this.id;
    }

    public void setId(Long _id) {
        this.id = _id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public Collection<Locacao> getLocacoes() {
        return this.locacoes;
    }

    public void setLocacoes(Collection<Locacao> _locacoes) {
        this.locacoes = _locacoes;
    }
    public String getCpf(){return this.cpf;}
    public void setCpf(String _cpf){this.cpf = _cpf;}

    public Collection<Locacao> locacoesNaoPagas() {

        Collection<Locacao> locacoesNaoPagas = new ArrayList<>();

        for (Locacao locacao: this.getLocacoes()) {
            if (!locacao.getPaga()) {
                locacoesNaoPagas.add(locacao);
            }
        }

        return locacoesNaoPagas;
    }

    public Double divida() {

        Double totalDivida = 0.0;

        for (Locacao locacaoNaoPaga: this.locacoesNaoPagas()) {
            totalDivida += locacaoNaoPaga.valor();
        }

        return totalDivida;
    }
}
