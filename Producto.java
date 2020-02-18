package com.dronalia.dto;

//Debe convertirse cada producto en una linea de factura//
public class Producto extends DronFinal{


    public Producto(Integer id, String nombre, String fotoDron, Double precioBase) {
        super(id, nombre, fotoDron, precioBase);
    }

    public Producto(Integer id, String nombre, String fotoDron, Double precioBase, String fotoSkin, String skinNombre, Boolean tipusSkin, Double precioSkin) {
        super(id, nombre, fotoDron, precioBase, fotoSkin, skinNombre, tipusSkin, precioSkin);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getFotoDron() {
        return super.getFotoDron();
    }

    @Override
    public void setFotoDron(String fotoDron) {
        super.setFotoDron(fotoDron);
    }

    @Override
    public Double getPrecioBase() {
        return super.getPrecioBase();
    }

    @Override
    public void setPrecioBase(Double precioBase) {
        super.setPrecioBase(precioBase);
    }

    @Override
    public String getFotoSkin() {
        return super.getFotoSkin();
    }

    @Override
    public void setFotoSkin(String fotoSkin) {
        super.setFotoSkin(fotoSkin);
    }

    @Override
    public String getSkinNombre() {
        return super.getSkinNombre();
    }

    @Override
    public void setSkinNombre(String skinNombre) {
        super.setSkinNombre(skinNombre);
    }

    @Override
    public Boolean getTipusSkin() {
        return super.getTipusSkin();
    }

    @Override
    public void setTipusSkin(Boolean tipusSkin) {
        super.setTipusSkin(tipusSkin);
    }

    @Override
    public Double getPrecioSkin() {
        return super.getPrecioSkin();
    }

    @Override
    public void setPrecioSkin(Double precioSkin) {
        super.setPrecioSkin(precioSkin);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
