package com.exemplo.locadora;

import com.exemplo.locadora.negocio.entidade.disco.*;
import com.exemplo.locadora.negocio.entidade.interfaces.LocadoraFactory;
import com.exemplo.locadora.negocio.entidade.interfaces.Locatario;
import com.exemplo.locadora.negocio.entidade.interfaces.Flor;
import com.exemplo.locadora.negocio.entidade.veiculo.LocacaoFlor;
import com.exemplo.locadora.negocio.entidade.veiculo.FlorLocadoraFactory;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocatarioDeDisco locatario = new LocatarioDeDisco("João", "12345678900");
        Disco disco = new Disco("Título do Disco", "Artista", 2021, 50.0, 5.0, false);
        LocalDate dataInicio = LocalDate.of(2023, 5, 1);
        LocalDate dataFim = LocalDate.of(2023, 5, 5);
        Locacao locacao = new Locacao(dataInicio, dataFim, true, false);

        try {
            double valorLocacao = Locadora.calcularValorLocacao(disco, locacao);
            System.out.println("Valor da locação: R$" + valorLocacao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        LocadoraFactory factory = FlorLocadoraFactory.getInstance();

        // Criar objetos da família de locação de flores
        Locatario locatarioVeiculo = factory.createLocatario("João", "12345678900");
        Flor flor = factory.createVeiculo("Modelo da Flor", "Marca da Flor", 100.0, false);
        LocalDate dataInicioVeiculo = LocalDate.of(2023, 5, 1);
        LocalDate dataFimVeiculo = LocalDate.of(2023, 5, 5);
        LocacaoFlor locacaoVeiculo = (LocacaoFlor) factory.createLocacao(dataInicio, dataFim, true, false);

        try {
            double valorLocacao = calcularValorLocacao(flor, locacao);
            System.out.println("Valor da locação: R$" + valorLocacao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static double calcularValorLocacao(Flor flor, Locacao locacao) throws Exception {
        if (flor.isDanificado()) {
            throw new Exception("Não é possível locar uma flor danificada.");
        }

        double valorLocacao = locacao.getDataInicio().until(locacao.getDataFim()).getDays() * flor.getPrecoDiaria();

        if (locacao.isDevolvidoDanificado()) {
            valorLocacao += flor.getPrecoDiaria();
        }

        return valorLocacao;
	}
}
