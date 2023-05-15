package com.exemplo.locadora.negocio.entidade.disco;

import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;

public class LocacaoDeDisco  extends Locacao {
    Disco disco = new Disco();
    private Boolean devolvido_danificado;
    @Override
    public Double valor() {
        if(devolvido_danificado){
            System.out.println("Disco danificado!");
            return disco.getValor_diaria() + disco.getPreco_atual();
        }else{
            return  disco.getValor_diaria();
        }
    }
}
