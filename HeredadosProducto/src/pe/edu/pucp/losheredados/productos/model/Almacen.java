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
        private int id_Almacen;

    public Almacen( String direccion) {
        //this.producto = producto;
        this.direccion = direccion;
    }
        
        
	public ArrayList<Producto> getProducto() {
		return producto;
	}

        public int getId_Almacen() {
            return id_Almacen;
        }

        public void setId_Almacen(int id_Almacen) {
            this.id_Almacen = id_Almacen;
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
        
}
