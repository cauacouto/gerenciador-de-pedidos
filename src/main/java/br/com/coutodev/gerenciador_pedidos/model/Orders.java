package br.com.coutodev.gerenciador_pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Orders {
@Id
private Long id;
private LocalDate data;

    public Orders(Long id, LocalDate data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public Orders() {

    }
}
