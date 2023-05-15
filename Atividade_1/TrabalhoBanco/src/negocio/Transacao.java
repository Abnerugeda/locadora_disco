package negocio;

import java.util.Date;

public abstract class Transacao {
    private Double valor;
    private Date efetivadaEm;

    //RELACIONAMENTOS
    private ClienteTemConta clientetemConta;

    public Transacao(){}
    public Transacao(Double _valor, Date _efetivadaEm, ClienteTemConta _clientetemConta) {
        this.setValor(_valor);
        this.setEfetivadaEm(_efetivadaEm);
        this.setClientetemConta(_clientetemConta);
    }

    //GET & SET
    public Double getValor() {
        return this.valor;
    }
    public void setValor(Double _valor) {
        this.valor = _valor;
    }

    public Date getEfetivadaEm() {
        return this.efetivadaEm;
    }
    public void setEfetivadaEm(Date _efetivadaEm) {
        this.efetivadaEm = _efetivadaEm;
    }

    public ClienteTemConta getClientetemConta() {
        return this.clientetemConta;
    }
    public void setClientetemConta(ClienteTemConta _clientetemConta) {
        this.clientetemConta = _clientetemConta;
    }
}
