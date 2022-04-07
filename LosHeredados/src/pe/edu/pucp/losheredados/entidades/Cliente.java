package pe.edu.pucp.losheredados.entidades;
import java.util.Date;
import java.util.ArrayList;
class Cliente extends Usuario{
	private int razonSocial;
	private String personaContacto;
	private Cliente_Categoria categoria;
	private Date ultimoContacto;
	private Arraylist<> Obra;

	public int getRazonSocial() {
	return razonSocial;
	}
	public void setRazonSocial(int razonSocial) {
	this.razonSocial = razonSocial;
	}

	public String getPersonaContacto() {
	return personaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
	this.personaContacto = personaContacto;
	}

	public Cliente_Categoria getCategoria() {
	return categoria;
	}
	public void setCategoria(Cliente_Categoria categoria) {
	this.categoria = categoria;
	}

	public Date getUltimoContacto() {
	return ultimoContacto;
	}

	public void setUltimoContacto(Date ultimoContacto) {
	this.ultimoContacto = ultimoContacto;
	}
	
	public Cliente(String nombre,int telefono,String correo, int razonSocial,String personaContacto,Cliente_Categoria categoria, Date ultimoContacto){
		super(nombre,telefono,correo);
		this.razonSocial=razonSocial;
		this.personaContacto=personaContacto;
		this.categoria=categoria;
		this.ultimoContacto=ultimoContacto;
	}
}
