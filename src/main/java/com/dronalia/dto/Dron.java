package com.dronalia.dto;

import com.dronalia.enumeradas.EnumDronCategoria;
import com.dronalia.enumeradas.EnumDronColor;
import java.util.Objects;

public class Dron {

    private int id;
    private String nombre;
    private String ejes;
    private String medida;
    private Enum<EnumDronCategoria> dronCategoriaEnum;
    private Enum<EnumDronColor> dronColorEnum;
    private double precioBase;

    public Dron(int id, String nombre, String ejes, String medida, Enum<EnumDronCategoria> dronCategoriaEnum, Enum<EnumDronColor> dronColorEnum, double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.ejes = ejes;
        this.medida = medida;
        this.dronCategoriaEnum = dronCategoriaEnum;
        this.dronColorEnum = dronColorEnum;
        this.precioBase = precioBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dron dron = (Dron) o;
        return id == dron.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
                '}';
    }
}
