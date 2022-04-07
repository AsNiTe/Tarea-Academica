package pe.edu.pucp.losheredados.entidades;
import java.util.Date;
class Venta{
	private String tipoDePago;
	private Date fechaEntrega;
	
	public String getTipoDePago() {
		return tipoDePago;
	}
	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Venta(String tipoDePago,Date fechaEntrega){
		this.tipoDePago=tipoDePago;
		this.fechaEntrega=fechaEntrega;
	}
}
