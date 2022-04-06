package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
class Servicio{

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * @return the encargado
     */
    public ArrayList<Trabajador> getEncargado() {
        return encargado;
    }

    /**
     * @param encargado the encargado to set
     */
    public void setEncargado(ArrayList<Trabajador> encargado) {
        this.encargado = encargado;
    }
	private String nombre;
	private float costo;
	private ArrayList<Trabajador> encargado;
	public Servicio(String nombre,float costo){
		this.nombre=nombre;
		this.costo=costo;
	}
	public ArrayList<Trabajador> getEncargados(){
		return getEncargado();
	}
	public void setEncargados(ArrayList<Trabajador> encargado){
            this.setEncargado(encargado);
	}
}