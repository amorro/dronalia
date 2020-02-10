package com.dronalia.dto;

import java.util.Objects;

public abstract class DronFinal{
    private Integer id;
    private String nombre;
    private String fotoDron;
    private Double precioBase;
    private String fotoSkin;
    private String skinNombre;
    private Boolean tipusSkin;
    private Double precioSkin;

    public DronFinal(Integer id, String nombre, String fotoDron, Double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.fotoDron = fotoDron;
        this.precioBase = precioBase;
    }

    public DronFinal(Integer id, String nombre, String fotoDron, Double precioBase, String fotoSkin, String skinNombre, Boolean tipusSkin, Double precioSkin) {
        this.id = id;
        this.nombre = nombre;
        this.fotoDron = fotoDron;
        this.precioBase = precioBase;
        this.fotoSkin = fotoSkin;
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

    public String getFotoDron() {
        return fotoDron;
    }

    public void setFotoDron(String fotoDron) {
        this.fotoDron = fotoDron;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public String getFotoSkin() {
        return fotoSkin;
    }

    public void setFotoSkin(String fotoSkin) {
        this.fotoSkin = fotoSkin;
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
        return id.equals(dronFinal.id) &&
                nombre.equals(dronFinal.nombre) &&
                fotoDron.equals(dronFinal.fotoDron) &&
                precioBase.equals(dronFinal.precioBase) &&
                Objects.equals(fotoSkin, dronFinal.fotoSkin) &&
                Objects.equals(skinNombre, dronFinal.skinNombre) &&
                Objects.equals(tipusSkin, dronFinal.tipusSkin) &&
                Objects.equals(precioSkin, dronFinal.precioSkin);
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
                ", fotoDron='" + fotoDron + '\'' +
                ", precioBase=" + precioBase +
                ", fotoSkin='" + fotoSkin + '\'' +
                ", skinNombre='" + skinNombre + '\'' +
                ", tipusSkin=" + tipusSkin +
                ", precioSkin=" + precioSkin +
                '}';
    }
}
