package com.example.unifacilita10;

public class Livro {
    private String autor;
    private String titulo;
    private String acao; // Ex: "Retirar"

    // Construtor
    public Livro(String autor, String titulo, String acao) {
        this.autor = autor;
        this.titulo = titulo;
        this.acao = acao;
    }

    // Getters e setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
}

