package pe.edu.pucp.losheredados.entidades;
import java.util.Date;
class Venta{

    /**
     * @return the tipoDePago
     */
    public String getTipoDePago() {
        return tipoDePago;
    }

    /**
     * @param tipoDePago the tipoDePago to set
     */
    public void setTipoDePago(String tipoDePago) {
        this.tipoDePago = tipoDePago;
    }

    /**
     * @return the fechaEntrega
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
	private String tipoDePago;
	private Date fechaEntrega;
	public Venta(String tipoDePago,Date fechaEntrega){
		this.tipoDePago=tipoDePago;
		this.fechaEntrega=fechaEntrega;
	}
}