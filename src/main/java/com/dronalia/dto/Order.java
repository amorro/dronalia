package com.dronalia.dto;

import java.time.LocalDate;
import java.util.Objects;

public class Order extends Producto {
    private Integer idFactura;
    private String comprador;
    private LocalDate fecha;
    private Double precioTotal();


    public Order(Integer id, String nombre, String fotoDron, Double precioBase) {
        super(id, nombre, fotoDron, precioBase);
    }

    public Order(Integer id, String nombre, String fotoDron, Double precioBase, String fotoSkin, String skinNombre, Boolean tipusSkin, Double precioSkin) {
        super(id, nombre, fotoDron, precioBase, fotoSkin, skinNombre, tipusSkin, precioSkin);
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
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

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return Objects.equals(idFactura, order.idFactura) &&
                Objects.equals(comprador, order.comprador) &&
                Objects.equals(fecha, order.fecha) &&
                Objects.equals(precioTotal, order.precioTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idFactura, comprador, fecha, precioTotal);
    }

    @Override
    public String toString() {
        return "Order{" +
                "idFactura=" + idFactura +
                ", comprador='" + comprador + '\'' +
                ", fecha=" + fecha +
                ", precioTotal=" + precioTotal +
                '}';
    }
}