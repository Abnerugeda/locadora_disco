package com.exemplo.locadora.negocio.entidade.veiculo;

import com.exemplo.locadora.negocio.entidade.interfaces.Locavel;
import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Veiculo extends Locavel {

    private String              marca;
    private String              modelo;
    private Long                kmAtual;
    private Double              valorDiaria;
    private Double              valorKmAdicional;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String _marca) {
        this.marca = _marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String _modelo) {
        this.modelo = _modelo;
    }

    public Long getKmAtual() {
        return this.kmAtual;
    }

    public void setKmAtual(Long _kmAtual) {
        this.kmAtual = _kmAtual;
    }

    public Double getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(Double _valorDiaria) {
        this.valorDiaria = _valorDiaria;
    }

    public Double getValorKmAdicional() {
        return this.valorKmAdicional;
    }

    public void setValorKmAdicional(Double _valorKmAdicional) {
        this.valorKmAdicional = _valorKmAdicional;
    }

}
