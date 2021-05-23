package com.wesley.bookstore.repositories;

import com.wesley.bookstore.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

    @Query("select obj from livro obj where obj.categoria.id = :id_cat order by obj.titulo")
    List<Livro> findAllCategoria(@Param(value = "id_cat") Integer id_cat);
}
