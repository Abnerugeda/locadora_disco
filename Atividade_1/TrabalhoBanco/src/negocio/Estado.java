package negocio;

import java.util.Collection;

public class Estado {
    private String nome;
    private String sigla;

    //RELACIONAMENTOS
    private Collection<Cidade> cidades;
    public Estado(){}
    public Estado(String _nome, String _sigla, Collection<Cidade> _cidades) {
        this.setNome(_nome);
        this.setSigla(_sigla);
        this.setCidades(_cidades);
    }

    // GET & SET
    public String getNome() {
        return this.nome;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public String getSigla() {
        return this.sigla;
    }
    public void setSigla(String _sigla) {
        this.sigla = _sigla;
    }

    public Collection<Cidade> getCidades() {
        return this.cidades;
    }
    public void setCidades(Collection<Cidade> _cidades) {
        this.cidades = _cidades;
    }
}
