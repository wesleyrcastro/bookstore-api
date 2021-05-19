package com.wesley.bookstore.service;

import com.wesley.bookstore.domain.Categoria;
import com.wesley.bookstore.domain.Livro;
import com.wesley.bookstore.repositories.CategoriaRepository;
import com.wesley.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados() {
        Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
        Categoria cat2 = new Categoria(null, "Ficção Cientifica", "Livro de Ficção Cientifica");
        Categoria cat3 = new Categoria(null, "Biografia", "Livros de Biografia");

        Livro l1 = new Livro(null, "Clean code", "Robert Martins", "Lorem ipsum", cat1);
        Livro l2 = new Livro(null, "Engenharia de Software", "Louis V. gerstner", "Lorem ipsum", cat1);
        Livro l3 = new Livro(null, "The time Machine", "H.G Wells", "Lorem ipsum", cat2);
        Livro l4 = new Livro(null, "The War of the Worlds", "Martins N. B.", "Lorem ipsum", cat2);
        Livro l5 = new Livro(null, "I. Robot", "Isaac Asimov", "Lorem ipsum", cat2);

        cat1.getLivros().addAll(Arrays.asList(l1, l2));
        cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroRepository.saveAll(Arrays.asList(l1, l2, l3,l4,l5));
    }
}
