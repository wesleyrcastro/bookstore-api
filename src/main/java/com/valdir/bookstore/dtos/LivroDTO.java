package com.valdir.bookstore.dtos;

import com.valdir.bookstore.domain.Livro;
import lombok.Data;

import java.io.Serializable;

@Data
public class LivroDTO implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer id;
    private String titulo;

    public LivroDTO() {
        super();
    }

    public LivroDTO(Livro obj) {
        super();
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
    }
}
