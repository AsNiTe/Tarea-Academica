package pe.edu.pucp.losheredados.usuarios.model;

import java.util.Date;

public class Usuario{
	private String nombre;
	private int telefono;
	private String correo;
        private Date fechaRegistro;
	
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

        public Usuario(String nombre, int telefono, String correo, Date fechaRegistro) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.correo = correo;
            this.fechaRegistro = fechaRegistro;
        }

        

	
}
