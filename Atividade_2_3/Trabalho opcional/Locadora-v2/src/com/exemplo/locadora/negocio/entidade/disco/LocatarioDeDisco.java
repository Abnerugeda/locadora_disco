package com.exemplo.locadora.negocio.entidade.disco;

public class LocatarioDeDisco {
    private String nome;
    private String cpf;

    public LocatarioDeDisco(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
