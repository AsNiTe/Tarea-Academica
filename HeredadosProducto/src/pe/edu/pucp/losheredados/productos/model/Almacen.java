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
public class Almacen {
    	private ArrayList<Producto> producto;
	private String direccion;

	public ArrayList<Producto> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Almacen(String direccion){
		this.direccion=direccion;
	}
}
