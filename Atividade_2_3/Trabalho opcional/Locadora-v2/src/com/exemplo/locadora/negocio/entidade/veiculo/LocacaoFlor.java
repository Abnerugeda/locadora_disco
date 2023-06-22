package com.exemplo.locadora.negocio.entidade.veiculo;

import com.exemplo.locadora.negocio.entidade.interfaces.Locacao;

import java.time.LocalDate;

public class LocacaoFlor implements Locacao {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean paga;
    private boolean devolvidoDanificado;

    public LocacaoFlor(LocalDate dataInicio, LocalDate dataFim, boolean paga, boolean devolvidoDanificado) {
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
