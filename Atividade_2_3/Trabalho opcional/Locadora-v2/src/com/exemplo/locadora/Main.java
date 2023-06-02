package com.exemplo.locadora;

import com.exemplo.locadora.negocio.entidade.disco.*;
import com.exemplo.locadora.negocio.entidade.interfaces.LocadoraFactory;
import com.exemplo.locadora.negocio.entidade.interfaces.Locatario;
import com.exemplo.locadora.negocio.entidade.interfaces.Veiculo;
import com.exemplo.locadora.negocio.entidade.veiculo.LocacaoVeiculo;
import com.exemplo.locadora.negocio.entidade.veiculo.VeiculoLocadoraFactory;

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
        LocadoraFactory factory = VeiculoLocadoraFactory.getInstance();

        // Criar objetos da família de locação de veículos
        Locatario locatarioVeiculo = factory.createLocatario("João", "12345678900");
        Veiculo veiculo = factory.createVeiculo("Modelo do Veículo", "Marca do Veículo", 100.0, false);
        LocalDate dataInicioVeiculo = LocalDate.of(2023, 5, 1);
        LocalDate dataFimVeiculo = LocalDate.of(2023, 5, 5);
        LocacaoVeiculo locacaoVeiculo = (LocacaoVeiculo) factory.createLocacao(dataInicio, dataFim, true, false);

        try {
            double valorLocacao = calcularValorLocacao(veiculo, locacao);
            System.out.println("Valor da locação: R$" + valorLocacao);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static double calcularValorLocacao(Veiculo veiculo, Locacao locacao) throws Exception {
        if (veiculo.isDanificado()) {
            throw new Exception("Não é possível locar um veículo danificado.");
        }

        double valorLocacao = locacao.getDataInicio().until(locacao.getDataFim()).getDays() * veiculo.getPrecoDiaria();

        if (locacao.isDevolvidoDanificado()) {
            valorLocacao += veiculo.getPrecoDiaria();
        }

        return valorLocacao;
	}
}
