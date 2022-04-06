package pe.edu.pucp.losheredados.entidades;
class Categoria{

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
     * @return the etapaRecomendada
     */
    public String getEtapaRecomendada() {
        return etapaRecomendada;
    }

    /**
     * @param etapaRecomendada the etapaRecomendada to set
     */
    public void setEtapaRecomendada(String etapaRecomendada) {
        this.etapaRecomendada = etapaRecomendada;
    }
	private String nombre;
	private String etapaRecomendada;
	
	public Categoria(String nombre,String etapaRecomendada){
		this.nombre=nombre;
		this.etapaRecomendada=etapaRecomendada;
	}
}

