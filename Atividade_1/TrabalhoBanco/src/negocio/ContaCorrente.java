package negocio;

import java.util.Collection;

public class ContaCorrente extends Conta{
    private Double limite;
    private Double taxa;

    //RELACIONAMENTOS
    private Financiamento financiamento;
    private Collection<Consorcio> consorcios;

    public ContaCorrente(){}
    public ContaCorrente(Long _id, String _numero, Double _saldo, Agencia _agencia, Cliente _cliente,
                         Collection<Cliente> _clientes, Collection<Transferencia> _transferencias,
                         Double _limite, Double _taxa, Financiamento _financiamento, Collection<Consorcio> _consorcios) {
        super(_id, _numero, _saldo, _agencia, _cliente, _clientes, _transferencias);
        this.setLimite(_limite);
        this.setTaxa(_taxa);
        this.setFinanciamento(_financiamento);
        this.setConsorcios(_consorcios);
    }

    //GET & SET
    public Double getLimite() {
        return this.limite;
    }
    public void setLimite(Double _limite) {
        this.limite = _limite;
    }

    public Double getTaxa() {
        return this.taxa;
    }
    public void setTaxa(Double _taxa) {
        this.taxa = _taxa;
    }

    public Financiamento getFinanciamento() {
        return this.financiamento;
    }
    public void setFinanciamento(Financiamento _financiamento) {
        this.financiamento = _financiamento;
    }

    public Collection<Consorcio> getConsorcios() {
        return this.consorcios;
    }
    public void setConsorcios(Collection<Consorcio> _consorcios) {
        this.consorcios = _consorcios;
    }
}
