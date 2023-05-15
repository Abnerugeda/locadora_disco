package negocio;

import java.util.Collection;

public class Cidade {
    private String nome;

    //RELACIONAMENTOS
    private Collection<Endereco> enderecos;
    private Estado estado;

    public Cidade(){}
    public Cidade(String _nome, Collection<Endereco> _enderecos, Estado _estado){
        this.setNome(_nome);
        this.setEnderecos(_enderecos);
        this.setEstado(_estado);
    }

    // GET & SET
    public String getNome() {
        return this.nome;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public Collection<Endereco> getEnderecos() {
        return this.enderecos;
    }
    public void setEnderecos(Collection<Endereco> _enderecos) {
        this.enderecos = _enderecos;
    }

    public Estado getEstado() {
        return this.estado;
    }
    public void setEstado(Estado _estado) {
        this.estado = _estado;
    }
}
