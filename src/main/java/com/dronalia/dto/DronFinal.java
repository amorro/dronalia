package com.dronalia.dto;

import java.util.Objects;

public abstract class DronFinal {
    private Integer id;
    private String nombre;
    private Double precioBase;
    private String skinNombre;
    private Boolean tipusSkin;
    private Double precioSkin;

    public DronFinal(Integer id, String nombre, Double precioBase, String skinNombre, Boolean tipusSkin, Double precioSkin) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.skinNombre = skinNombre;
        this.tipusSkin = tipusSkin;
        this.precioSkin = precioSkin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public String getSkinNombre() {
        return skinNombre;
    }

    public void setSkinNombre(String skinNombre) {
        this.skinNombre = skinNombre;
    }

    public Boolean getTipusSkin() {
        return tipusSkin;
    }

    public void setTipusSkin(Boolean tipusSkin) {
        this.tipusSkin = tipusSkin;
    }

    public Double getPrecioSkin() {
        return precioSkin;
    }

    public void setPrecioSkin(Double precioSkin) {
        this.precioSkin = precioSkin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DronFinal dronFinal = (DronFinal) o;
        return Objects.equals(id, dronFinal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DronFinal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", skinNombre='" + skinNombre + '\'' +
                ", tipusSkin=" + tipusSkin +
                ", precioSkin=" + precioSkin +
                '}';
    }

    
}
