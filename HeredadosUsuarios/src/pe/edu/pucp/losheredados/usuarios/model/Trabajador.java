/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.usuarios.model;

import java.util.Date;


public class Trabajador extends Usuario{
	private String area;
	private String cargo;

	
	public String getArea() {
	return area;
	}
	public void setArea(String area) {
	this.area = area;
	}

	public String getCargo() {
	return cargo;
	}
	public void setCargo(String cargo) {
	this.cargo = cargo;
	}
	


        public Trabajador(String area, String cargo, String nombre, int telefono, String correo, Date fechaRegistro) {
            super(nombre, telefono, correo, fechaRegistro);
            this.area = area;
            this.cargo = cargo;
 
        }
	
	
}