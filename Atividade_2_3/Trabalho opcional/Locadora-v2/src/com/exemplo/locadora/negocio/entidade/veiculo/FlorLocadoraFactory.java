package com.exemplo.locadora.negocio.entidade.veiculo;

import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;
import com.exemplo.locadora.negocio.entidade.interfaces.LocadoraFactory;
import com.exemplo.locadora.negocio.entidade.interfaces.Locatario;
import com.exemplo.locadora.negocio.entidade.interfaces.Flor;

import java.time.LocalDate;

public class FlorLocadoraFactory implements LocadoraFactory {
    private static FlorLocadoraFactory instance;

    private FlorLocadoraFactory() {
        // Construtor privado para impedir criação de instâncias externamente
    }

    public static synchronized FlorLocadoraFactory getInstance() {
        if (instance == null) {
            instance = new FlorLocadoraFactory();
        }
        return instance;
    }

    public Locatario createLocatario(String nome, String cpf) {
        return new LocatarioFlor(nome, cpf);
    }

    public Flor createVeiculo(String modelo, String marca, double precoDiaria, boolean danificado) {
        return new FlorVeiculo(modelo, marca, precoDiaria, danificado);
    }

    public Locacao createLocacao(LocalDate dataInicio, LocalDate dataFim, boolean paga, boolean devolvidoDanificado) {
        return new LocacaoFlor(dataInicio, dataFim, paga, devolvidoDanificado);
    }
}
