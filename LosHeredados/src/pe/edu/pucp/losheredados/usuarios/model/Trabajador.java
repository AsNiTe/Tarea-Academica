package pe.edu.pucp.losheredados.usuarios.model;
import java.util.ArrayList;
import java.util.Date;
import pe.edu.pucp.losheredados.entidades.Cotizacion;
import pe.edu.pucp.losheredados.entidades.Servicio;

public class Trabajador extends Usuario{
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

        public Trabajador(String area, String cargo, ArrayList<Servicio> servicio, ArrayList<Cotizacion> cotizacion, String nombre, int telefono, String correo, Date fechaRegistro) {
            super(nombre, telefono, correo, fechaRegistro);
            this.area = area;
            this.cargo = cargo;
            this.servicio = servicio;
            this.cotizacion = cotizacion;
        }
	
	
}
