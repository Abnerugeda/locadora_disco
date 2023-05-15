package com.exemplo.locadora.negocio.entidade.veiculo;

import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;

public class LocacaoDeVeiculo extends Locacao {

    private Long kmRetirada;
    private Long kmDevolucao;

    public Long getKmRetirada() {
        return this.kmRetirada;
    }

    public void setKmRetirada(Long _kmRetirada) {
        this.kmRetirada = _kmRetirada;
    }

    public Long getKmDevolucao() {
        return this.kmDevolucao;
    }

    public void setKmDevolucao(Long _kmDevolucao) {
        this.kmDevolucao = _kmDevolucao;
    }

    public Long kmRodados() {
        return this.getKmDevolucao() - this.getKmRetirada();
    }

    public Double valor() {

        Veiculo veiculo = (Veiculo)this.getLocavel();

        Double valorDiarias      = this.duracaoEmDias() * veiculo.getValorDiaria();
        Double valorKmAdicionais = 0.0;
        Long   kmAdicionais      = this.kmRodados() - (this.duracaoEmDias() * 200);

        if (kmAdicionais > 0) {
            valorKmAdicionais = kmAdicionais * veiculo.getValorKmAdicional();
        }

        return valorDiarias + valorKmAdicionais;
    }
}
