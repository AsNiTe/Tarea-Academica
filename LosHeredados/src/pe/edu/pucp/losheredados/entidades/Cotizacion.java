package pe.edu.pucp.losheredados.entidades;
import pe.edu.pucp.losheredados.usuarios.model.Obra;
import pe.edu.pucp.losheredados.usuarios.model.Trabajador;
import pe.edu.pucp.losheredados.usuarios.model.Cliente;
import java.util.ArrayList;
import java.util.Date;
public class Cotizacion{
	private float costo;
	private ArrayList<Producto> producto;
	private ArrayList<Servicio> servicio;
	private Obra obra;
	private Trabajador vendedor;
	private Cliente cliente;
	private Date fecha;
	private String estado;
	private int plazo;
	private float subTotal;
	private float IGV;
	private float total;
	
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}

	public ArrayList<Producto> getProducto() {
		return producto;
	}
	public void setProducto(ArrayList<Producto> producto) {
		this.producto = producto;
	}

	public ArrayList<Servicio> getServicio() {
		return servicio;
	}
	public void setServicio(ArrayList<Servicio> servicio) {
		this.servicio = servicio;
	}

	public Obra getObra(){
		return obra;
	}
	public void setObra(Obra obra){
		this.obra = obra;
	}
	
	public Trabajador getVendedor() {
		return vendedor;
	}
	public void setVendedor(Trabajador vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getSubTotal() {
		return subTotal;
	}
	public void SubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
	
	public float getIGV() {
		return IGV;
	}
	public void setIGV(float IGV) {
		this.IGV = IGV;
	}
	
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public Cotizacion(float costo,Obra obra,Trabajador vendedor,Cliente cliente,Date fecha,String estado,int plazo,float subTotal,float IGV,float total){
		this.costo=costo;
		this.obra=obra;
		this.vendedor=vendedor;
		this.cliente=cliente;
		this.fecha=fecha;
		this.estado=estado;
		this.plazo=plazo;
		this.subTotal=subTotal;
		this.IGV=IGV;
		this.total=total;
	}
}
