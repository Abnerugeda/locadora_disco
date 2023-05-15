package negocio;

public class Endereco {
    private String logradouro;
    private String numero;

    //RELACIONAMENTO
    private Agencia agencia;
    private Cidade cidade;
    public Endereco(){}
    public Endereco(String _logradouro, String _numero, Agencia _agencia, Cidade _cidade) {
        this.setLogradouro(_logradouro);
        this.setNumero(_numero);
        this.setAgencia(_agencia);
        this.setCidade(_cidade);
    }

    // GET & SET
    public String getLogradouro() {
        return this.logradouro;
    }
    public void setLogradouro(String _logradouro) {
        this.logradouro = _logradouro;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String _numero) {
        this.numero = _numero;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }
    public void setAgencia(Agencia _agencia) {
        this.agencia = _agencia;
    }

    public Cidade getCidade() {
        return this.cidade;
    }
    public void setCidade(Cidade _cidade) {
        this.cidade = _cidade;
    }


}
