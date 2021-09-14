package com.projeto.quarkus.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 14/09/2021 - 15:17
 */

@Entity
public class Categoria extends PanacheEntity {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
