package pe.edu.pucp.losheredados.entidades;
class Producto{

    /**
     * @return the precioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the rendimiento
     */
    public String getRendimiento() {
        return rendimiento;
    }

    /**
     * @param rendimiento the rendimiento to set
     */
    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }

    /**
     * @return the presentacion
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * @param presentacion the presentacion to set
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * @return the densidad
     */
    public float getDensidad() {
        return densidad;
    }

    /**
     * @param densidad the densidad to set
     */
    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the apariencia
     */
    public String getApariencia() {
        return apariencia;
    }

    /**
     * @param apariencia the apariencia to set
     */
    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    /**
     * @return the diluyente
     */
    public String getDiluyente() {
        return diluyente;
    }

    /**
     * @param diluyente the diluyente to set
     */
    public void setDiluyente(String diluyente) {
        this.diluyente = diluyente;
    }

    /**
     * @return the soluble
     */
    public String getSoluble() {
        return soluble;
    }

    /**
     * @param soluble the soluble to set
     */
    public void setSoluble(String soluble) {
        this.soluble = soluble;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
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