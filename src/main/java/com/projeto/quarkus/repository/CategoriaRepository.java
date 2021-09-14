package com.projeto.quarkus.repository;

import com.projeto.quarkus.entity.Categoria;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * @Autor Jairo Nascimento
 * @Created 14/09/2021 - 15:29
 */
@ApplicationScoped
public class CategoriaRepository implements PanacheRepository<Categoria> {
}
