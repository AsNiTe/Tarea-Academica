package pe.edu.pucp.losheredados.entidades;
class Cliente_Categoria{

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
     * @return the lineaCredito
     */
    public float getLineaCredito() {
        return lineaCredito;
    }

    /**
     * @param lineaCredito the lineaCredito to set
     */
    public void setLineaCredito(float lineaCredito) {
        this.lineaCredito = lineaCredito;
    }
	private String nombre;
	private float lineaCredito; 
	public Cliente_Categoria(String nombre,float lineaCredito){
		this.nombre=nombre;
		this.lineaCredito=lineaCredito;
	}
}