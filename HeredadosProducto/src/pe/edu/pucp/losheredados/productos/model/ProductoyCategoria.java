/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.productos.model;

/**
 *
 * @author PC
 */
public class ProductoyCategoria {
    private int idProductoCategoria;
    private String nombre;
    private String etapaRecomendada;

    public ProductoyCategoria(String nombre, String etapaRecomendada) {
        this.nombre = nombre;
        this.etapaRecomendada = etapaRecomendada;
    }

   
    public int getIdProductoCategoria() {
        return idProductoCategoria;
    }

    public void setIdProductoCategoria(int idProductoCategoria) {
        this.idProductoCategoria = idProductoCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtapaRecomendada() {
        return etapaRecomendada;
    }

    public void setEtapaRecomendada(String etapaRecomendada) {
        this.etapaRecomendada = etapaRecomendada;
    }
       
}
