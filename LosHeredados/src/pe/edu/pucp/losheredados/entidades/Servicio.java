package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
class Servicio{
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
