package negocio;

import java.util.Collection;

public class ContaPoupanca extends Conta {

    private Short diaDeAniversario;
    private Double taxaDeCorrecao;

    //RELACIONAMENTOS
    public ContaPoupanca(){}
    public ContaPoupanca(Long _id, String _numero, Double _saldo, Agencia _agencia, Cliente _cliente,
                         Collection<Cliente> _clientes, Collection<Transferencia> _transferencias,
                         Short _diaDeAniversario, Double _taxaDeCorrecao) {
        super(_id, _numero, _saldo, _agencia, _cliente, _clientes, _transferencias);
        this.setDiaDeAniversario(_diaDeAniversario);
        this.setTaxaDeCorrecao(_taxaDeCorrecao);
    }

    //GET & SET
    public Short getDiaDeAniversario() {
        return this.diaDeAniversario;
    }
    public void setDiaDeAniversario(Short _diaDeAniversario) {
        this.diaDeAniversario = _diaDeAniversario;
    }

    public Double getTaxaDeCorrecao() {
        return this.taxaDeCorrecao;
    }
    public void setTaxaDeCorrecao(Double _taxaDeCorrecao) {
        this.taxaDeCorrecao = _taxaDeCorrecao;
    }
}
