package negocio;

import java.util.Collection;

public abstract class Cliente {
    private String nome;

    //RELACIONAMENTO
    private Conta conta;
    private Collection<Conta> contas;
    private Collection<ClienteTemConta> clienteTemContas;

    public Cliente (){}
    public Cliente(String _nome, Conta _conta, Collection<Conta> _contas, Collection<ClienteTemConta> _clienteTemContas) {
        this.setNome(_nome);
        this.setConta(_conta);
        this.setContas(_contas);
        this.setClienteTemContas(_clienteTemContas);
    }

    //GET & SET
    public String getNome() {
        return this.nome;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public Conta getConta() {
        return this.conta;
    }
    public void setConta(Conta _conta) {
        this.conta = _conta;
    }

    public Collection<Conta> getContas() {
        return this.contas;
    }
    public void setContas(Collection<Conta> _contas) {
        this.contas = _contas;
    }

    public Collection<ClienteTemConta> getClienteTemContas() {
        return this.clienteTemContas;
    }
    public void setClienteTemContas(Collection<ClienteTemConta> _clienteTemContas) {
        this.clienteTemContas = _clienteTemContas;
    }
}
