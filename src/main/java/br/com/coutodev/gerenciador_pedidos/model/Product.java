package br.com.coutodev.gerenciador_pedidos.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column( nullable = false, unique = true)
    private String nome;
    @Column(name = "value")
    private double price;


    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public Product( String nome, double price) {
        this.nome = nome;
        this.price = price;

    }

    public Product() {

    }
}
