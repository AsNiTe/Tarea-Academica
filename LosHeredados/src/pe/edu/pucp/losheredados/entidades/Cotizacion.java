package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
import java.util.Date;
class Cotizacion{

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
     * @return the producto
     */
    public ArrayList<Producto> getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    /**
     * @return the servicio
     */
    public ArrayList<Servicio> getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(ArrayList<Servicio> servicio) {
        this.servicio = servicio;
    }

    /**
     * @return the vendedor
     */
    public Trabajador getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Trabajador vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
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
		return getProducto();
	}
	public void setProductos(ArrayList<Producto> producto){
            this.setProducto(producto);
	}
	public ArrayList<Servicio> getServicios(){
		return getServicio();
	}
	public void setServicios(ArrayList<Servicio> servicio){
            this.setServicio(servicio);
	}
	
}