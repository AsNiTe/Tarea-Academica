package pe.edu.pucp.losheredados.entidades;
public class Producto{
	private float precioUnitario;
	private int stock;
	private String nombre;
	private String descripcion;
	private String rendimiento;
	private String presentacion;
	private float densidad;
	private Categoria categoria;
	private String apariencia;
	private String diluyente;
	private String soluble;
	private String color;
	
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRendimiento() {
		return rendimiento;
	}
	public void setRendimiento(String rendimiento) {
		this.rendimiento = rendimiento;
	}

	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public float getDensidad() {
		return densidad;
	}
	public void setDensidad(float densidad) {
		this.densidad = densidad;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getApariencia() {
		return apariencia;
	}
	public void setApariencia(String apariencia) {
		this.apariencia = apariencia;
	}

	public String getDiluyente() {
		return diluyente;
	}
	public void setDiluyente(String diluyente) {
		this.diluyente = diluyente;
	}

	public String getSoluble() {
		return soluble;
	}
	public void setSoluble(String soluble) {
		this.soluble = soluble;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public Producto(float precioUnitario,int stock,String nombre,String descripcion,String rendimiento,String presentacion,float densidad,
					Categoria categoria, String apariencia, String diluyente,String soluble,String color){
		this.precioUnitario=precioUnitario;
		this.stock=stock;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.rendimiento=rendimiento;
		this.presentacion=presentacion;
		this.densidad=densidad;
		this.categoria=categoria;
		this.apariencia=apariencia;
		this.diluyente=diluyente;
		this.soluble=soluble;
		this.color=color;
	}
}
