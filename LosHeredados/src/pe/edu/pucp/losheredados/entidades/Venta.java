package pe.edu.pucp.losheredados.entidades;
import java.util.Date;
class Venta{
	private String tipoDePago;
	private Date fechaEntrega;
	public Venta(String tipoDePago,Date fechaEntrega){
		this.tipoDePago=tipoDePago;
		this.fechaEntrega=fechaEntrega;
	}
}