/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.usuarios.model;

/**
 *
 * @author PC
 */
public class Ubigeo {
        private int idUbigeo;
	private String distrito;
	private String provincia;
	private String departamento;
	private double costoDeEnvio;
	
	public int getIdUbigeo() {
		return idUbigeo;
	}
	public void setIdUbigeo(int idUbigeo) {
		this.idUbigeo = idUbigeo;
	}

	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double getCostoDeEnvio() {
		return costoDeEnvio;
	}
	public void setCostoDeEnvio(double costoDeEnvio) {
		this.costoDeEnvio = costoDeEnvio;
	}
	
        public Ubigeo(){}
	public Ubigeo(int idUbigeo,String distrito,String provincia,String departamento,double costoDeEnvio){
		this.idUbigeo=idUbigeo;
		this.distrito=distrito;
		this.provincia=provincia;
		this.departamento=departamento;
		this.costoDeEnvio=costoDeEnvio;
	}
}
