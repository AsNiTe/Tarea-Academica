/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.productos.model;

/**
 *
 * @author PC
 */
public class Precios {
    private String descripcion;
    private int idPrecio;
    private double precioUnitario;
    private int cantidadAsociada;
    private Producto producto;

    public Precios(String descripcion, double precioUnitario, int cantidadAsociada, Producto producto) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadAsociada = cantidadAsociada;
        this.producto = producto;
    }
    
    

    public int getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(int idPrecio) {
        this.idPrecio = idPrecio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
 
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadAsociada() {
        return cantidadAsociada;
    }

    public void setCantidadAsociada(int cantidadAsociada) {
        this.cantidadAsociada = cantidadAsociada;
    }


}
