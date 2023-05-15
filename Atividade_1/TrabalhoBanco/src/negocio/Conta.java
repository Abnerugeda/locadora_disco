package negocio;

import java.util.Collection;

public abstract class Conta {
    private Long id;
    private String numero;
    private Double saldo;

    //RELACIONAMENTOS
    private Agencia agencia;
    private Cliente cliente;
    private Collection<Cliente> clientes;
    private Collection<Transferencia> transferencias;
    private Collection<ClienteTemConta> clienteTemContas;

    public Conta(){}
    public Conta(Long _id, String _numero, Double _saldo, Agencia _agencia,
                 Cliente _cliente, Collection<Cliente> _clientes,
                 Collection<Transferencia> _transferencias) {
        this.setId(_id);
        this.setNumero(_numero);
        this.setSaldo(_saldo);
        this.setAgencia(_agencia);
        this.setCliente(_cliente);
        this.setClientes(_clientes);
        this.setTransferencias(_transferencias);
    }

    // GET & SET
    public Long getId() {
        return this.id;
    }
    public void setId(Long _id) {
        this.id = _id;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String _numero) {
        this.numero = _numero;
    }

    public Double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(Double _saldo) {
        this.saldo = _saldo;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }
    public void setAgencia(Agencia _agencia) {
        this.agencia = _agencia;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    public void setCliente(Cliente _cliente) {
        this.cliente = _cliente;
    }

    public Collection<Cliente> getClientes() {
        return this.clientes;
    }
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Transferencia> getTransferencias() {
        return this.transferencias;
    }
    public void setTransferencias(Collection<Transferencia> _transferencias) {
        this.transferencias = _transferencias;
    }
}
