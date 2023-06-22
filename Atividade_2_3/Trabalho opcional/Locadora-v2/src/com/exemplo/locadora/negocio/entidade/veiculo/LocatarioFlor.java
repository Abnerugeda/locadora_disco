package com.exemplo.locadora.negocio.entidade.veiculo;

import com.exemplo.locadora.negocio.entidade.interfaces.Locatario;

public class LocatarioFlor implements Locatario {
    private String nome;
    private String cpf;

    public LocatarioFlor(String nome, String cpf) {
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