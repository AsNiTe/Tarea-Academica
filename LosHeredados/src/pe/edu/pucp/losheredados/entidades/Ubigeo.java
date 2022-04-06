package pe.edu.pucp.losheredados.entidades;
class Ubigeo{

    /**
     * @return the idUbigeo
     */
    public int getIdUbigeo() {
        return idUbigeo;
    }

    /**
     * @param idUbigeo the idUbigeo to set
     */
    public void setIdUbigeo(int idUbigeo) {
        this.idUbigeo = idUbigeo;
    }

    /**
     * @return the distrito
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * @param distrito the distrito to set
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
	private int idUbigeo;
	private String distrito;
	private String provincia;
	private String departamento;
	public Ubigeo(int idUbigeo,String distrito,String provincia,String departamento){
		this.idUbigeo=idUbigeo;
		this.distrito=distrito;
		this.provincia=provincia;
		this.departamento=departamento;
	}
}