package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
import java.util.Date;
class Obra{
	private String estado;
	private Cliente encargado;
	private String correo;
	private ArrayList<Trabajador> personalEncargado;
	private Ubigeo zona;
	private String direccion;
	private Date ultimaVisita;
	public Obra(String estado,Cliente encargado,String correo,Ubigeo zona,String direccion,Date ultimaVisita){
		this.estado=estado;
		this.encargado=encargado;
		this.correo=correo;
		this.zona=zona;
		this.direccion=direccion;
		this.ultimaVisita=ultimaVisita;
	}
	public ArrayList<Trabajador> getPersonalEncargado(){
		return personalEncargado;
	}
	public void setPersonalEncargado(ArrayList<Trabajador> personalEncargado){
		this.personalEncargado = personalEncargado;
	}
}