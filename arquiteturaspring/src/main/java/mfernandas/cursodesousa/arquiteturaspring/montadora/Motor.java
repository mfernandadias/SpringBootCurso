package mfernandas.cursodesousa.arquiteturaspring.montadora;

import lombok.Getter;

public class Motor {
    @Getter
    private String modelo;
    private Integer cavalos;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipo;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    /*
    public void setTipo(TipoMotor tipoMotor) {
        this.setTipoMotor = tipoMotor;
    }
    */
    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cavalos=" + cavalos +
                ", cilindros=" + cilindros +
                ", litragem=" + litragem +
                ", tipo=" + tipo +
                '}';
    }
}
