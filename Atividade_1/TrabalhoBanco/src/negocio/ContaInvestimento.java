package negocio;

import java.util.Collection;
import java.util.Date;

public class ContaInvestimento extends Conta{
    private Date inicioEm;
    private Double taxaDeRendimento;

    // RELACIONAMENTO
    public ContaInvestimento(){}
    public ContaInvestimento(Long _id, String _numero, Double _saldo, Agencia _agencia, Cliente _cliente,
                             Collection<Cliente> _clientes, Collection<Transferencia> _transferencias,
                             Date _inicioEm, Double _taxaDeRendimento) {
        super(_id, _numero, _saldo, _agencia, _cliente, _clientes, _transferencias);
        this.setInicioEm(_inicioEm);
        this.setTaxaDeRendimento(_taxaDeRendimento);
    }

    //GET & SET
    public Date getInicioEm() {
        return this.inicioEm;
    }
    public void setInicioEm(Date _inicioEm) {
        this.inicioEm = _inicioEm;
    }

    public Double getTaxaDeRendimento() {
        return this.taxaDeRendimento;
    }
    public void setTaxaDeRendimento(Double _taxaDeRendimento) {
        this.taxaDeRendimento = _taxaDeRendimento;
    }
}
