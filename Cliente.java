import java.util.Date;
class Cliente extends Usuario{
	private int razonSocial;
	private String personaContacto;
	private Cliente_Categoria categoria;
	private Date ultimoContacto;
	
	public Cliente(String nombre,int telefono,String correo, int razonSocial,String personaContacto,Cliente_Categoria categoria, Date ultimoContacto){
		super(nombre,telefono,correo);
		this.razonSocial=razonSocial;
		this.personaContacto=personaContacto;
		this.categoria=categoria;
		this.ultimoContacto=ultimoContacto;
	}
}
