package pe.edu.pucp.losheredados.entidades;
class Cliente_Categoria{
	private String nombre;
	private float lineaCredito; 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLineaCredito() {
		return lineaCredito;
	}
	public void setLineaCredito(float lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
	
	public Cliente_Categoria(String nombre,float lineaCredito){
		this.nombre=nombre;
		this.lineaCredito=lineaCredito;
	}
}
