package pe.edu.pucp.losheredados.entidades;
class Categoria{
	private String nombre;
	private String etapaRecomendada;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEtapaRecomendada() {
		return etapaRecomendada;
	}
	public void setEtapaRecomendada(String etapaRecomendada) {
		this.etapaRecomendada = etapaRecomendada;
	}

	public Categoria(String nombre,String etapaRecomendada){
		this.nombre=nombre;
		this.etapaRecomendada=etapaRecomendada;
	}
}

