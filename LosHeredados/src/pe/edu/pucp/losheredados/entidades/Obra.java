package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
import java.util.Date;
class Obra{
	private String estado;
	private Cliente encargado;
	private ArrayList<Trabajador> personalEncargado;
	private Ubigeo zona;
	private String direccion;
	private Date ultimaVisita;
	
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

	public Date getUltimaVisita() {
		return ultimaVisita;
	}
	public void setUltimaVisita(Date ultimaVisita) {
		this.ultimaVisita = ultimaVisita;
	}

	public Obra(String estado,Cliente encargado,Ubigeo zona,String direccion,Date ultimaVisita){
		this.estado=estado;
		this.encargado=encargado;
		this.zona=zona;
		this.direccion=direccion;
		this.ultimaVisita=ultimaVisita;
	}
}
