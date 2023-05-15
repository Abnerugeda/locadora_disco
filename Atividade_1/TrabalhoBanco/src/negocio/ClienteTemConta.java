package negocio;

import java.util.Collection;

public class ClienteTemConta {
    private char titularidade;

    //RELACIONAMENTO
    private Conta conta;
    private Cliente cliente;
    private Collection<Transacao> transacoes;

    public ClienteTemConta(){}
    public ClienteTemConta(char _titularidade, Conta _conta, Cliente _cliente, Collection<Transacao> _transacoes) {
        this.setTitularidade(_titularidade);
        this.setConta(_conta);
        this.setCliente(_cliente);
        this.setTransacoes(_transacoes);
    }

    //GET & SET
    public char getTitularidade() {
        return this.titularidade;
    }
    public void setTitularidade(char _titularidade) {
        this.titularidade = _titularidade;
    }

    public Conta getConta() {
        return this.conta;
    }
    public void setConta(Conta _conta) {
        this.conta = _conta;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente _cliente) {
        this.cliente = _cliente;
    }

    public Collection<Transacao> getTransacoes() {
        return this.transacoes;
    }
    public void setTransacoes(Collection<Transacao> _transacoes) {
        this.transacoes = _transacoes;
    }
}
