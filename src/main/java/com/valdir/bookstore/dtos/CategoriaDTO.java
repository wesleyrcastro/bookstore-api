package com.valdir.bookstore.dtos;

import com.valdir.bookstore.domain.Categoria;
import lombok.Data;

@Data
public class CategoriaDTO {

    private Integer id;
    private String nome;
    private String descricao;

    public CategoriaDTO() {
        super();
    }

    public CategoriaDTO(Categoria obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }
}
