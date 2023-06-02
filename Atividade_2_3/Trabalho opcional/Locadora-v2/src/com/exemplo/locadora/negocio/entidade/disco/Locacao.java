package com.exemplo.locadora.negocio.entidade.disco;

import java.time.LocalDate;

public class Locacao {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean paga;
    private boolean devolvidoDanificado;

    public Locacao(LocalDate dataInicio, LocalDate dataFim, boolean paga, boolean devolvidoDanificado) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.paga = paga;
        this.devolvidoDanificado = devolvidoDanificado;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public boolean isPaga() {
        return paga;
    }

    public boolean isDevolvidoDanificado() {
        return devolvidoDanificado;
    }
}
