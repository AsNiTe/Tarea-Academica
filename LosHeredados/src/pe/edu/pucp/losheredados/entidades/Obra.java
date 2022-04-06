package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
import java.util.Date;
class Obra{

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the encargado
     */
    public Cliente getEncargado() {
        return encargado;
    }

    /**
     * @param encargado the encargado to set
     */
    public void setEncargado(Cliente encargado) {
        this.encargado = encargado;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the zona
     */
    public Ubigeo getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(Ubigeo zona) {
        this.zona = zona;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ultimaVisita
     */
    public Date getUltimaVisita() {
        return ultimaVisita;
    }

    /**
     * @param ultimaVisita the ultimaVisita to set
     */
    public void setUltimaVisita(Date ultimaVisita) {
        this.ultimaVisita = ultimaVisita;
    }
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