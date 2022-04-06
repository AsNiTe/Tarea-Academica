package pe.edu.pucp.losheredados.entidades;
class Producto{
	private float precioUnitario;
	private int idProducto;
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
	public Producto(float precioUnitario,int idProducto,int stock,String nombre,String descripcion,String rendimiento,String presentacion,float densidad,
					Categoria categoria, String apariencia, String diluyente,String soluble,String color){
		this.precioUnitario=precioUnitario;
		this.idProducto=idProducto;
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