package negocio;

public class Financiamento extends Produto {
    private Double taxaDeJuro;

    //RELACIONAMENTO
    private ContaCorrente contaCorrente;
    public Financiamento(){}
    public Financiamento(Double _taxaDeJuro, ContaCorrente _contaCorrente) {
        this.setTaxaDeJuro(_taxaDeJuro);
        this.setContaCorrente(_contaCorrente);
    }

    //GET & SET
    public Double getTaxaDeJuro() {
        return this.taxaDeJuro;
    }
    public void setTaxaDeJuro(Double _taxaDeJuro) {
        this.taxaDeJuro = _taxaDeJuro;
    }

    public ContaCorrente getContaCorrente() {
        return this.contaCorrente;
    }
    public void setContaCorrente(ContaCorrente _contaCorrente) {
        this.contaCorrente = _contaCorrente;
    }
}
