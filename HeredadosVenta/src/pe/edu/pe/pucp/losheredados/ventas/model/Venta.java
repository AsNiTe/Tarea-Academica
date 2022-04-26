/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.pucp.losheredados.ventas.model;
import java.util.Date;
public class Venta{
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