/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.usuarios.model;

/**
 *
 * @author PC
 */
public class Cliente_Categoria {
	private String nombre;
	private float lineaCredito; 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLineaCredito() {
		return lineaCredito;
	}
	public void setLineaCredito(float lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
	
	public Cliente_Categoria(String nombre,float lineaCredito){
		this.nombre=nombre;
		this.lineaCredito=lineaCredito;
	}    
}
