package com.valdir.bookstore.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//@Entity
@Data
public class Categoria {

    private Integer id;
    private String nome;
    private String descricao;

    private List<Livro> livros = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
}
