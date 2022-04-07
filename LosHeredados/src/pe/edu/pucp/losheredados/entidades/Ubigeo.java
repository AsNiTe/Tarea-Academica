package pe.edu.pucp.losheredados.entidades;
class Ubigeo{
	private int idUbigeo;
	private String distrito;
	private String provincia;
	private String departamento;
	private float costoDeEnvio;
	
	public int getIdUbigeo() {
		return idUbigeo;
	}
	public void setIdUbigeo(int idUbigeo) {
		this.idUbigeo = idUbigeo;
	}

	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public float getCostoDeEnvio() {
		return costoDeEnvio;
	}
	public void setCostoDeEnvio(float costoDeEnvio) {
		this.costoDeEnvio = costoDeEnvio;
	}
	
	public Ubigeo(int idUbigeo,String distrito,String provincia,String departamento,float costoDeEnvio){
		this.idUbigeo=idUbigeo;
		this.distrito=distrito;
		this.provincia=provincia;
		this.departamento=departamento;
		this.costoDeEnvio=costoDeEnvio;
	}
}
