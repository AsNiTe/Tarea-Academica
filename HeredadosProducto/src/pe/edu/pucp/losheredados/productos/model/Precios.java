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
    private double precioUnitario;
    private int cantidadAsociada;

     public Precios(String descripcion, double precioUnitario, int cantidadAsociada) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadAsociada = cantidadAsociada;
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
