class Trabajador extends Usuario{
	private String area;
	private String cargo;
	public Trabajador(String nombre, int telefono,String correo,String area,String cargo){
		super(nombre,telefono,correo);
		this.area=area;
		this.cargo=cargo;
	}
}