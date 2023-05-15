package com.exemplo.locadora.negocio.entidade.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public abstract class Locavel {

    private Long id;
    private Collection<Locacao> locacoes = new ArrayList<>();;

    public Long getId() {
        return this.id;
    }

    public void setId(Long _id) {
        this.id = _id;
    }

    public Collection<Locacao> getLocacoes() {
        return this.locacoes;
    }

    public void setLocacoes(Collection<Locacao> _locacoes) {
        this.locacoes = _locacoes;
    }

    public Boolean disponivel() {

        for (Locacao locacao: this.getLocacoes()) {
            if (locacao.getFim() == null) {
                return false;
            }
        }

        return  true;
    }
}
