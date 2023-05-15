package negocio;

public class Consorcio extends Produto{

    private Boolean sorteado;

    //RELACIONAMENTO
    private ContaCorrente contaCorrente;
    public Consorcio(){}
    public Consorcio(Boolean _sorteado, ContaCorrente _contaCorrente) {
        this.setSorteado(_sorteado);
        this.setContaCorrente(_contaCorrente);

    }

    //GET & SET
    public Boolean getSorteado() {
        return this.sorteado;
    }
    public void setSorteado(Boolean _sorteado) {
        this.sorteado = _sorteado;
    }

    public ContaCorrente getContaCorrente() {
        return this.contaCorrente;
    }
    public void setContaCorrente(ContaCorrente _contaCorrente) {
        this.contaCorrente = _contaCorrente;
    }
}
