package com.exemplo.locadora;

import com.exemplo.locadora.negocio.entidade.disco.Disco;
import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;
import com.exemplo.locadora.negocio.entidade.veiculo.Veiculo;
import com.exemplo.locadora.negocio.fachada.veiculo.LocadoraDeVeiculoFachada;

public class Main {

    public static void main(String[] args) {

        Disco disco = new Disco();
        disco.setTitulo("Music Collection");
        disco.setArtista("Vários");
        disco.setAno_lancamento("2021");
        disco.setPreco_atual(59.90);
        disco.setValor_diaria(3.00);
        disco.setDanificado(false);
        System.out.println(disco);

        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Chevrolet");
        veiculo.setModelo("Corsa Sedan");
        veiculo.setKmAtual(150000L);
        veiculo.setValorDiaria(250.00);
        veiculo.setValorKmAdicional(5.00);
        System.out.println(veiculo);


//        LocadoraDeVeiculoFachada lvf = new LocadoraDeVeiculoFachada();
//        lvf.instanciarObjetos();
//
//        Locacao locacao = lvf.locar(1L, 1L);
//        System.out.println("\nLocação criada com as seguintes informações:");
//        System.out.println("- Id: " + locacao.getId());
//        System.out.println("- Data de início: " + locacao.getInicio());
//        System.out.println("- Paga: " + (locacao.getPaga() ? "Sim" : "Não"));
	}
}
