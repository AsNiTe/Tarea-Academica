/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.productos.model;

import pe.edu.pucp.losheredados.usuarios.model.Trabajador;
import java.util.ArrayList;
public class Servicio{
	private String nombre;
	private float costo;
	private ArrayList<Trabajador> encargado;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}

	public ArrayList<Trabajador> getEncargado() {
		return encargado;
	}
	public void setEncargado(ArrayList<Trabajador> encargado) {
		this.encargado = encargado;
	}

	public Servicio(String nombre,float costo){
		this.nombre=nombre;
		this.costo=costo;
	}
}
