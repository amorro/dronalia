package com.dronalia.dto;

import java.util.Objects;

public class Stock {

    private int alm_id;
    private int id;
    private String modelo;
    private int disponibles;
    private String estanteria;
    private String estante;

    public Stock(int alm_id, int id, String modelo, int disponibles, String estanteria, String estante) {
        this.alm_id = alm_id;
        this.id = id;
        this.modelo = modelo;
        this.disponibles = disponibles;
        this.estanteria = estanteria;
        this.estante = estante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlm_id() {
        return alm_id;
    }

    public void setAlm_id(int alm_id) {
        this.alm_id = alm_id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public String getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(String estanteria) {
        this.estanteria = estanteria;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return alm_id == stock.alm_id &&
                id == stock.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alm_id, id);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "alm_id=" + alm_id +
                ", id=" + id +
                ", modelo='" + modelo + '\'' +
                ", disponibles=" + disponibles +
                ", estanteria=" + estanteria +
                ", estante=" + estante +
                '}';
    }
}
