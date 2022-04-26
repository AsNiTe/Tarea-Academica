/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.productos.model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Producto {
    	private ArrayList<Precios> precios;
                  private ArrayList<Promocion> promociones;
	private int stock;
	private String nombre;
	private String descripcion;
	private String rendimiento;
	private String presentacion;
	private double densidad;
	private ProductoyCategoria categoria;
	private String apariencia;
	private String diluyente;
	private String soluble;
	private String color;

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRendimiento() {
		return rendimiento;
	}
	public void setRendimiento(String rendimiento) {
		this.rendimiento = rendimiento;
	}

	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getDensidad() {
		return densidad;
	}
	public void setDensidad(double densidad) {
		this.densidad = densidad;
	}

                public ArrayList<Precios> getPrecios() {
                    return precios;
                }

                public void setPrecios(ArrayList<Precios> precios) {
                    this.precios = precios;
                }

                public ArrayList<Promocion> getPromociones() {
                    return promociones;
                }

                public void setPromociones(ArrayList<Promocion> promociones) {
                    this.promociones = promociones;
                }

                public ProductoyCategoria getCategoria() {
                    return categoria;
                }

                public void setCategoria(ProductoyCategoria categoria) {
                    this.categoria = categoria;
                }

	public String getApariencia() {
		return apariencia;
	}
	public void setApariencia(String apariencia) {
		this.apariencia = apariencia;
	}

	public String getDiluyente() {
		return diluyente;
	}
	public void setDiluyente(String diluyente) {
		this.diluyente = diluyente;
	}

	public String getSoluble() {
		return soluble;
	}
	public void setSoluble(String soluble) {
		this.soluble = soluble;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

    public Producto(ArrayList<Precios> precios, ArrayList<Promocion> promociones, int stock, String nombre, String descripcion, String rendimiento, String presentacion, 
            double densidad, ProductoyCategoria categoria, String apariencia, String diluyente, String soluble, String color) {
        this.precios = precios;
        this.promociones = promociones;
        this.stock = stock;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rendimiento = rendimiento;
        this.presentacion = presentacion;
        this.densidad = densidad;
        this.categoria = categoria;
        this.apariencia = apariencia;
        this.diluyente = diluyente;
        this.soluble = soluble;
        this.color = color;
    }

	

}
