import java.util.ArrayList;
class Servicio{
	private String nombre;
	private float costo;
	private ArrayList<Trabajador> encargado;
	public Servicio(String nombre,float costo){
		this.nombre=nombre;
		this.costo=costo;
	}
	public ArrayList<Trabajador> getEncargados(){
		return encargado;
	}
	public void setEncargados(ArrayList<Trabajador> encargado){
		this.encargado = encargado;
	}
}