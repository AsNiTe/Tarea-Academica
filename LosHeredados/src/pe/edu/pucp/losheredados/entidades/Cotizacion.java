package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
import java.util.Date;
class Cotizacion{
	private float costo;
	private ArrayList<Producto> producto;
	private ArrayList<Servicio> servicio;
	private Trabajador vendedor;
	private Cliente cliente;
	private Date fecha;
	private String estado;
	private int plazo;
	public Cotizacion(float costo,Trabajador vendedor,Cliente cliente,Date fecha,String estado,int plazo){
		this.costo=costo;
		this.vendedor=vendedor;
		this.cliente=cliente;
		this.fecha=fecha;
		this.estado=estado;
		this.plazo=plazo;
	}
	public ArrayList<Producto> getProductos(){
		return producto;
	}
	public void setProductos(ArrayList<Producto> producto){
		this.producto = producto;
	}
	public ArrayList<Servicio> getServicios(){
		return servicio;
	}
	public void setServicios(ArrayList<Servicio> servicio){
		this.servicio = servicio;
	}
	
}