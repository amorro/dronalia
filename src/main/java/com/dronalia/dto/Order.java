package com.dronalia.dto;

import java.time.LocalDate;

public class Order {
    private Integer id;
    private String comprador;
    private LocalDate fecha;

    private Void precioTotal() {
        return null;
    }

    public Order(Integer id, String comprador, LocalDate fecha) {
        this.id = id;
        this.comprador = comprador;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", comprador='" + comprador + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
