package pe.edu.pucp.losheredados.entidades;
class Trabajador extends Usuario{

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
	private String area;
	private String cargo;
	public Trabajador(String nombre, int telefono,String correo,String area,String cargo){
		super(nombre,telefono,correo);
		this.area=area;
		this.cargo=cargo;
	}
}