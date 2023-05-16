package com.exemplo.locadora.negocio.entidade.disco;

import com.exemplo.locadora.negocio.entidade.interfaces.Locavel;

public class Disco extends Locavel {
    private String              titulo;
    private String              artista;
    private String              ano_lancamento;
    private Double              preco_atual;
    private Double              valor_diaria;
    private Boolean              danificado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public double getPreco_atual() {
        return preco_atual;
    }

    public void setPreco_atual(double preco_atual) {
        this.preco_atual = preco_atual;
    }

    public double getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public boolean isDanificado() {
        System.out.println("Disco danificado. Disco não poderá ser locado!");
        return danificado;
    }

    public void setDanificado(boolean danificado) {
        this.danificado = danificado;
    }
    public boolean getDanificado() { return danificado; }
}
