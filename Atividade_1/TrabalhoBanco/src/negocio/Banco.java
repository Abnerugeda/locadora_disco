package negocio;

import java.util.Collection;

public class Banco {
     private Long id;
     private String numero;
     private String cnpj;
     private String nome;

     //RELACIONAMENTO
    private Agencia agencia;
    private Collection<Agencia> agencias;
    private Collection<Conta> contas;

    public Banco (){}
    public Banco(Long _id, String _numero, String _cnpj, String _nome, Agencia _agencia, Collection<Agencia> _agencias,
                 Collection<Conta> _contas) {
        this.setId(_id);
        this.setNumero(_numero);
        this.setCnpj(_cnpj);
        this.setNome(_nome);
        this.setAgencias(_agencia);
        this.setAgencia(_agencias);
        this.setContas(_contas);
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

    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String _cnpj) {
        this.cnpj = _cnpj;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public Collection<Agencia> getAgencia() {
        return this.agencias;
    }
    public void setAgencia(Collection<Agencia> _agencias) {
        this.agencias = _agencias;
    }

    public Agencia getAgencias() {
        return this.agencia;
    }
    public void setAgencias(Agencia _agencia) {
        this.agencia = _agencia;
    }

    public Collection<Conta> getContas() {
        return this.contas;
    }
    public void setContas(Collection<Conta> _contas) {
        this.contas = _contas;
    }
}
