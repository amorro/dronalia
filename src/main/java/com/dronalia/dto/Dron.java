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

    public Dron(Integer id, String nombre, String ejes, String medida, Enum<EnumDronCategoria> dronCategoriaEnum, Enum<EnumDronColor> dronColorEnum, Double precioBase, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.ejes = ejes;
        this.medida = medida;
        this.dronCategoriaEnum = dronCategoriaEnum;
        this.dronColorEnum = dronColorEnum;
        this.precioBase = precioBase;
        this.foto = foto;
    }

    public Dron(String nombre, String ejes, String medida, Enum<EnumDronCategoria> dronCategoriaEnum, Enum<EnumDronColor> dronColorEnum, Double precioBase, String foto) {
        this.nombre = nombre;
        this.ejes = ejes;
        this.medida = medida;
        this.dronCategoriaEnum = dronCategoriaEnum;
        this.dronColorEnum = dronColorEnum;
        this.precioBase = precioBase;
        this.foto = foto;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dron dron = (Dron) o;
        return id.equals(dron.id) &&
                nombre.equals(dron.nombre) &&
                ejes.equals(dron.ejes) &&
                medida.equals(dron.medida) &&
                dronCategoriaEnum.equals(dron.dronCategoriaEnum) &&
                dronColorEnum.equals(dron.dronColorEnum) &&
                precioBase.equals(dron.precioBase) &&
                foto.equals(dron.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, foto);
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
                '}';
    }
}
