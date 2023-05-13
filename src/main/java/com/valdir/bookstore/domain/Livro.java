package com.valdir.bookstore.domain;

import lombok.Data;

@Data
public class Livro {

    private Integer id;
    private String titulo;
    private String nomeAutor;
    private String texto;

    private Categoria categoria;

    public Livro() {
    }

    public Livro(Integer id, String titulo, String nomeAutor, String texto, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.texto = texto;
        this.categoria = categoria;
    }
}
