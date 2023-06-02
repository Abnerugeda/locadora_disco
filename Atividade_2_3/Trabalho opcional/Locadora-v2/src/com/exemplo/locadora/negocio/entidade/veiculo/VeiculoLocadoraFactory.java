package com.exemplo.locadora.negocio.entidade.veiculo;

import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;
import com.exemplo.locadora.negocio.entidade.interfaces.LocadoraFactory;
import com.exemplo.locadora.negocio.entidade.interfaces.Locatario;
import com.exemplo.locadora.negocio.entidade.interfaces.Veiculo;

import java.time.LocalDate;

public class VeiculoLocadoraFactory implements LocadoraFactory {
    private static VeiculoLocadoraFactory instance;

    private VeiculoLocadoraFactory() {
        // Construtor privado para impedir criação de instâncias externamente
    }

    public static synchronized VeiculoLocadoraFactory getInstance() {
        if (instance == null) {
            instance = new VeiculoLocadoraFactory();
        }
        return instance;
    }

    public Locatario createLocatario(String nome, String cpf) {
        return new LocatarioVeiculo(nome, cpf);
    }

    public Veiculo createVeiculo(String modelo, String marca, double precoDiaria, boolean danificado) {
        return new VeiculoVeiculo(modelo, marca, precoDiaria, danificado);
    }

    public Locacao createLocacao(LocalDate dataInicio, LocalDate dataFim, boolean paga, boolean devolvidoDanificado) {
        return new LocacaoVeiculo(dataInicio, dataFim, paga, devolvidoDanificado);
    }
}
