package pe.edu.pucp.losheredados.entidades;
import java.util.ArrayList;
class Almacen{

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
	private ArrayList<Producto> producto;
	private String direccion;

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