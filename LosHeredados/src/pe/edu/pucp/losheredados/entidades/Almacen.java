package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
class Almacen{
	private ArrayList<Producto> producto;
	private String direccion;

	public ArrayList<Producto> getProducto() {
	return producto;
	}
	public void setProducto(ArrayList<Producto> producto) {
	this.producto = producto;
	}

	public String getDireccion() {
	return direccion;
	}
	public void setDireccion(String direccion) {
	this.direccion = direccion;
	}
	
	public ArrayList<Producto> getProductos(){
	return getProducto();
	}
	public void setProductos(ArrayList<Producto> producto){
	this.setProducto(producto);
	}
	public Almacen(String direccion){
	this.direccion=direccion;
	}
}
