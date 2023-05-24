package com.valdir.bookstore.repositories;

import com.valdir.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

    @Query("SELECT obj FROM Livro obj WHERE obj.categoria.id = :id_cat ORDER BY obj.titulo")
    List<Livro> findAllByCategoria(@Param(value = "id_cat") Integer id_cat);
}
