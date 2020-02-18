package com.dronalia.dto;

import java.util.Objects;

public class Producto{
    private Integer id;
    private String nombre;
    private String fotoDron;
    private Double precioBase;
    private String fotoSkin;
    private String skinNombre;
    private Boolean tipusSkin;
    private Double precioSkin;

    public void precioProducto() {
        Double precioProducto = precioBase + precioSkin;
    }

    public Producto(Integer id, String nombre, String fotoDron, Double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.fotoDron = fotoDron;
        this.precioBase = precioBase;
    }

    public Producto(Integer id, String nombre, String fotoDron, Double precioBase, String fotoSkin, String skinNombre, Boolean tipusSkin, Double precioSkin) {
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
        Producto producto = (Producto) o;
        return id.equals(producto.id) &&
                nombre.equals(producto.nombre) &&
                fotoDron.equals(producto.fotoDron) &&
                precioBase.equals(producto.precioBase) &&
                Objects.equals(fotoSkin, producto.fotoSkin) &&
                Objects.equals(skinNombre, producto.skinNombre) &&
                Objects.equals(tipusSkin, producto.tipusSkin) &&
                Objects.equals(precioSkin, producto.precioSkin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fotoDron, precioBase, fotoSkin, skinNombre, tipusSkin, precioSkin);
    }
}
