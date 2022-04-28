/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.usuarios.model;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author PC
 */
public class Obra{
        private int idObra;
	private String estado;
	private Cliente encargado;
	private ArrayList<Trabajador> personalEncargado;
	private Ubigeo zona;
	private String direccion;
        private ArrayList<VisitaObra> visitas; 

        public int getIdObra() {
            return idObra;
        }

        public void setIdObra(int idObra) {
            this.idObra = idObra;
        }
        
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getEncargado() {
		return encargado;
	}
	public void setEncargado(Cliente encargado) {
		this.encargado = encargado;
	}

	public Ubigeo getZona() {
		return zona;
	}
	public void setZona(Ubigeo zona) {
		this.zona = zona;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

        public ArrayList<Trabajador> getPersonalEncargado() {
            return personalEncargado;
        }

        public void setPersonalEncargado(ArrayList<Trabajador> personalEncargado) {
            this.personalEncargado = personalEncargado;
        }

        public ArrayList<VisitaObra> getVisitas() {
            return visitas;
        }

        public void setVisitas(ArrayList<VisitaObra> visitas) {
            this.visitas = visitas;
        }

        public Obra(){}
        
        public Obra(String estado, Cliente encargado, Ubigeo zona, String direccion) {
            this.estado = estado;
            this.encargado = encargado;
            this.zona = zona;
            this.direccion = direccion;
        }
        
        
	

	
}
