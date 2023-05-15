package negocio;

import java.util.Collection;

public class Agencia {
    private Long id;
    private String numero;
    private String nome;

    //RELACIONAMENTOS
    private Banco banco;
    private Endereco endereco;
    private Collection<Conta> contas;

    public Agencia () {}
    public Agencia(Long _id, String _numero, String _nome, Banco _banco, Endereco _endereco, Collection<Conta> _contas) {
        this.setId(_id);
        this.setNumero(_numero);
        this.setNome(_nome);
        this.setBanco(_banco);
        this.setEndereco(_endereco);
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

    public String getNome() {
        return this.nome;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public Banco getBanco() {
        return this.banco;
    }
    public void setBanco(Banco _banco) {
        this.banco = _banco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco _endereco) {
        this.endereco = _endereco;
    }

    public Collection<Conta> getContas() {
        return this.contas;
    }
    public void setContas(Collection<Conta> _contas) {
        this.contas = _contas;
    }

}
