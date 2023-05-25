package com.valdir.bookstore.dtos;

import com.valdir.bookstore.domain.Categoria;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class CategoriaDTO implements Serializable {

    private static final long serialVersionUID = 1l;

    private Integer id;
    @NotEmpty(message = "Campo NOME é requerido")
    @Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 e 100 caracteres")
    private String nome;

    @NotEmpty(message = "Campo DESCRIÇÂO é requerido")
    @Length(min = 3, max = 200, message = "O campo DESCRIÇÂO deve ter entre 3 e 200 caracteres")
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
