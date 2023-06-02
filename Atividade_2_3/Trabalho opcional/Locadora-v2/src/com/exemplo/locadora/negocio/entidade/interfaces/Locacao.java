package com.exemplo.locadora.negocio.entidade.interfaces;

import java.time.LocalDate;

public interface Locacao {
    LocalDate getDataInicio();
    LocalDate getDataFim();
    boolean isPaga();
    boolean isDevolvidoDanificado();
}
