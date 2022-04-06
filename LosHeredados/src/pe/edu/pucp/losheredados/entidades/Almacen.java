package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
class Almacen{
	private ArrayList<Producto> producto;
	private String direccion;

	public ArrayList<Producto> getProductos(){
		return producto;
	}
	public void setProductos(ArrayList<Producto> producto){
		this.producto = producto;
	}
	public Almacen(String direccion){
		this.direccion=direccion;
	}
}