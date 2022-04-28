/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.usuarios.model;

/**
 *
 * @author PC
 */
import java.util.Date;

public class Usuario{
        private int idUsuario;
	private String nombre;
	private int telefono;
	private String correo;
        private Date fechaRegistro;
        
        public int getIdUsuario() {
           return idUsuario;
       }

       public void setIdUsuario(int idUsuario) {
           this.idUsuario = idUsuario;
       }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

        public Date getFechaRegistro() {
            return fechaRegistro;
        }

        public void setFechaRegistro(Date fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
        }
        
        public Usuario(){}

        public Usuario(String nombre, int telefono, String correo) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.correo = correo;
        }

     
}
