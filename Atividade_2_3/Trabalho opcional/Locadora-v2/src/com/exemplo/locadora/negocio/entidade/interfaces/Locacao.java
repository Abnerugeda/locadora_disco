package com.exemplo.locadora.negocio.entidade.interfaces;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public abstract class Locacao {

    private Long      id;
    private Date      inicio;
    private Date      fim;
    private Boolean   paga;

    private Locatario locatario;
    private Locavel   locavel;

    public Long getId() {
        return this.id;
    }

    public void setId(Long _id) {
        this.id = _id;
    }

    public Date getInicio() {
        return this.inicio;
    }

    public void setInicio(Date _inicio) {
        this.inicio = _inicio;
    }

    public Date getFim() {
        return this.fim;
    }

    public void setFim(Date _fim) {
        this.fim = _fim;
    }

    public Boolean getPaga() {
        return this.paga;
    }

    public void setPaga(Boolean _paga) {
        this.paga = _paga;
    }

    public Locatario getLocatario() {
        return this.locatario;
    }

    public void setLocatario(Locatario _locatario) {
        this.locatario = locatario;
    }

    public Locavel getLocavel() {
        return this.locavel;
    }

    public void setLocavel(Locavel _locavel) {
        this.locavel = _locavel;
    }

    public Long duracaoEmDias() {

        Long duracaoEmMilissegundos = this.getFim().getTime() - this.getInicio().getTime();
        Long duracaoEmDias          = TimeUnit.DAYS.convert(duracaoEmMilissegundos, TimeUnit.MILLISECONDS);

        if (duracaoEmDias == 0L) {
            duracaoEmDias = 1L;
        }
        return  duracaoEmDias;
    }

    public abstract Double valor();
}
