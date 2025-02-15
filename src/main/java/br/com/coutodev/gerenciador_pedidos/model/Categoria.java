package br.com.coutodev.gerenciador_pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Categoria {

@Id
private long id;
private String nome;

    public Categoria(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Categoria() {

    }
}
