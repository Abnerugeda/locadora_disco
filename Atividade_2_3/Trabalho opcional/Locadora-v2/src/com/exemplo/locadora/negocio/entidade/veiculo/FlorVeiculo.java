package com.exemplo.locadora.negocio.entidade.veiculo;

import com.exemplo.locadora.negocio.entidade.interfaces.Flor;

public class FlorVeiculo implements Flor {
    private String modelo;
    private String marca;
    private double precoDiaria;
    private boolean danificado;

    public FlorVeiculo(String modelo, String marca, double precoDiaria, boolean danificado) {
        this.modelo = modelo;
        this.marca = marca;
        this.precoDiaria = precoDiaria;
        this.danificado = danificado;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public boolean isDanificado() {
        return danificado;
    }
}

