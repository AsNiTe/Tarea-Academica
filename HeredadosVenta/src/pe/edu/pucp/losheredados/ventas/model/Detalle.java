/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.ventas.model;

import pe.edu.pucp.losheredados.productos.model.Producto;
import pe.edu.pucp.losheredados.productos.model.Servicio;

/**
 *
 * @author PC
 */
public class Detalle {
    private int idDetalle;
     private double costoUnitario;
    private Producto producto;
    private Servicio servicio;
    private int cantidad;
    private double subTotal;

    public Detalle(){};
    
    public Detalle(double costoUnitario, Producto producto, Servicio servicio, int cantidad, double subTotal) {
        this.costoUnitario = costoUnitario;
        this.producto = producto;
        this.servicio = servicio;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

        public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }
    
    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
       
}
