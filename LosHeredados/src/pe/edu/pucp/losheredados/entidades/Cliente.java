package pe.edu.pucp.losheredados.entidades;
import java.util.Date;
class Cliente extends Usuario{

    /**
     * @return the razonSocial
     */
    public int getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(int razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the personaContacto
     */
    public String getPersonaContacto() {
        return personaContacto;
    }

    /**
     * @param personaContacto the personaContacto to set
     */
    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    /**
     * @return the categoria
     */
    public Cliente_Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Cliente_Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the ultimoContacto
     */
    public Date getUltimoContacto() {
        return ultimoContacto;
    }

    /**
     * @param ultimoContacto the ultimoContacto to set
     */
    public void setUltimoContacto(Date ultimoContacto) {
        this.ultimoContacto = ultimoContacto;
    }
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
