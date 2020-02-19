package com.dronalia.dto;

import com.dronalia.enumeradas.EnumDronCategoria;
import com.dronalia.enumeradas.EnumDronColor;

import java.util.Objects;

public class Dron {

    private Integer id;
    private String nombre;
    private String ejes;
    private String medida;
    private Enum<EnumDronCategoria> dronCategoriaEnum;
    private Enum<EnumDronColor> dronColorEnum;
    private Double precioBase;
    private String foto;
    private String foto2;
    private String foto3;

    public Dron(Integer id, String nombre, String ejes, String medida, Enum<EnumDronCategoria> dronCategoriaEnum, Enum<EnumDronColor> dronColorEnum, Double precioBase, String foto, String foto2, String foto3) {
        this.id = id;
        this.nombre = nombre;
        this.ejes = ejes;
        this.medida = medida;
        this.dronCategoriaEnum = dronCategoriaEnum;
        this.dronColorEnum = dronColorEnum;
        this.precioBase = precioBase;
        this.foto = foto;
        this.foto2 = foto2;
        this.foto3 = foto3;
    }

    public Dron(String nombre, String ejes, String medida, Enum<EnumDronCategoria> dronCategoriaEnum, Enum<EnumDronColor> dronColorEnum, Double precioBase, String foto, String foto2, String foto3) {
        this.nombre = nombre;
        this.ejes = ejes;
        this.medida = medida;
        this.dronCategoriaEnum = dronCategoriaEnum;
        this.dronColorEnum = dronColorEnum;
        this.precioBase = precioBase;
        this.foto = foto;
        this.foto2 = foto2;
        this.foto3 = foto3;
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

    public String getEjes() {
        return ejes;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public Enum<EnumDronCategoria> getDronCategoriaEnum() {
        return dronCategoriaEnum;
    }

    public void setDronCategoriaEnum(Enum<EnumDronCategoria> dronCategoriaEnum) {
        this.dronCategoriaEnum = dronCategoriaEnum;
    }

    public Enum<EnumDronColor> getDronColorEnum() {
        return dronColorEnum;
    }

    public void setDronColorEnum(Enum<EnumDronColor> dronColorEnum) {
        this.dronColorEnum = dronColorEnum;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getFoto3() {
        return foto3;
    }

    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dron dron = (Dron) o;
        return Objects.equals(id, dron.id) &&
                Objects.equals(nombre, dron.nombre) &&
                Objects.equals(ejes, dron.ejes) &&
                Objects.equals(medida, dron.medida) &&
                Objects.equals(dronCategoriaEnum, dron.dronCategoriaEnum) &&
                Objects.equals(dronColorEnum, dron.dronColorEnum) &&
                Objects.equals(precioBase, dron.precioBase) &&
                Objects.equals(foto, dron.foto) &&
                Objects.equals(foto2, dron.foto2) &&
                Objects.equals(foto3, dron.foto3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, ejes, medida, dronCategoriaEnum, dronColorEnum, precioBase, foto, foto2, foto3);
    }

    @Override
    public String toString() {
        return "Dron{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ejes='" + ejes + '\'' +
                ", medida='" + medida + '\'' +
                ", dronCategoriaEnum=" + dronCategoriaEnum +
                ", dronColorEnum=" + dronColorEnum +
                ", precioBase=" + precioBase +
                ", foto='" + foto + '\'' +
                ", foto2='" + foto2 + '\'' +
                ", foto3='" + foto3 + '\'' +
                '}';
    }
}
