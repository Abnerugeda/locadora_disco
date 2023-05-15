package negocio;

public abstract class Produto {
    private Long id;
    private Short totalDeMeses;
    private Short mesesDeCorridos;
    private Double montante;

    // RELACIONAMENTOS


    //GET & SET
    public Long getId() {
        return this.id;
    }
    public void setId(Long _id) {
        this.id = _id;
    }

    public Short getTotalDeMeses() {
        return this.totalDeMeses;
    }
    public void setTotalDeMeses(Short _totalDeMeses) {
        this.totalDeMeses = _totalDeMeses;
    }

    public Short getMesesDeCorridos() {
        return this.mesesDeCorridos;
    }
    public void setMesesDeCorridos(Short _mesesDeCorridos) {
        this.mesesDeCorridos = _mesesDeCorridos;
    }

    public Double getMontante() {
        return this.montante;
    }
    public void setMontante(Double _montante) {
        this.montante = _montante;
    }

}
