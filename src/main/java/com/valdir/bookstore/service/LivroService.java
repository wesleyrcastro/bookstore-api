package com.valdir.bookstore.service;

import com.valdir.bookstore.domain.Categoria;
import com.valdir.bookstore.domain.Livro;
import com.valdir.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    public Livro findById(Integer id){
        Optional<Livro> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado Id: " + id + ", Tipo: " + Livro.class.getName()));
    }

    public List<Livro> findByAll(Integer id_cat) {
        categoriaService.findById(id_cat);
        return repository.findAllByCategoria(id_cat);
    }
}
