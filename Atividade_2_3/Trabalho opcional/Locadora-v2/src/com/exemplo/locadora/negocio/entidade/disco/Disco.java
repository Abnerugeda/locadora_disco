package com.exemplo.locadora.negocio.entidade.disco;

public class Disco{
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double precoAtual;
    private double valorDiaria;
    private boolean danificado;

    public Disco(String titulo, String artista, int anoLancamento, double precoAtual, double valorDiaria, boolean danificado) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.precoAtual = precoAtual;
        this.valorDiaria = valorDiaria;
        this.danificado = danificado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDanificado() {
        return danificado;
    }
}