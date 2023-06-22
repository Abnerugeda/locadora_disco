package com.exemplo.locadora.negocio.entidade.interfaces;

import java.time.LocalDate;

public interface LocadoraFactory {
    Locatario createLocatario(String nome, String cpf);
    Flor createVeiculo(String modelo, String marca, double precoDiaria, boolean danificado);
    Locacao createLocacao(LocalDate dataInicio, LocalDate dataFim, boolean paga, boolean devolvidoDanificado);
}
