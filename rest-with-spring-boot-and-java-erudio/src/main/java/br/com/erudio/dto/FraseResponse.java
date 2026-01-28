package br.com.erudio.dto;

public class FraseResponse {
    private Long id;
    private String texto;
    private String autor;

    public FraseResponse(Long id, String autor, String texto) {
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
