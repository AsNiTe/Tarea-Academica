package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;

class Trabajador extends Usuario{
	private String area;
	private String cargo;
	private ArrayList<Servicio> servicio;
	private ArrayList<Cotizacion> cotizacion;
	
	public String getArea() {
	return area;
	}
	public void setArea(String area) {
	this.area = area;
	}

	public String getCargo() {
	return cargo;
	}
	public void setCargo(String cargo) {
	this.cargo = cargo;
	}
	
	public ArrayList<Servicio> getServicio() {
		return servicio;
	}
	public void setServicio(ArrayList<Servicio> servicio) {
		this.servicio = servicio;
	}
	
	public ArrayList<Cotizacion> getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(ArrayList<Cotizacion> cotizacion) {
		this.cotizacion = cotizacion;
	}
	
	public Trabajador(String nombre, int telefono,String correo,String area,String cargo){
		super(nombre,telefono,correo);
		this.area=area;
		this.cargo=cargo;
	}
}
