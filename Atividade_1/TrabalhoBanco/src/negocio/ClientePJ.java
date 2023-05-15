package negocio;

import java.util.Collection;

public class ClientePJ extends Cliente{

    private String cnpj;

    //RELACIONAMENTO
    public ClientePJ(){}
    public ClientePJ(String _nome, Conta _conta, Collection<Conta> _contas,
                     Collection<ClienteTemConta> _clienteTemContas, String _cnpj) {
        super(_nome, _conta, _contas, _clienteTemContas);
        this.setCnpj(_cnpj);
    }

    //GET & SET
    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String _cnpj) {
        this.cnpj = _cnpj;
    }
}
