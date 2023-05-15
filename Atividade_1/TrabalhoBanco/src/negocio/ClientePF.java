package negocio;

import java.util.Collection;

public class ClientePF extends Cliente{
    private String cpf;

    //RELACIONAMENTO
    public ClientePF(){}
    public ClientePF(String _nome, Conta _conta, Collection<Conta> _contas,
                     Collection<ClienteTemConta> _clienteTemContas, String _cpf) {
        super(_nome, _conta, _contas, _clienteTemContas);
        this.setCpf(_cpf);
    }

    //GET & SET
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String _cpf) {
        this.cpf = _cpf;
    }

}
