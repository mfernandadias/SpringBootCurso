package br.com.erudio.dto;

/*
DTOs (entrada e saída)
FraseRequest.java (o que chega no POST)
 */

public class FraseRequest {
    //
    private String texto;
    private String autor;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
