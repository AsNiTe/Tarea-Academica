/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.pucp.losheredados.ventas.model;
import java.util.Date;
public class Venta{
                 private int idVenta;
                 private Pago pago;
	private Date fechaEntrega;
                 private  Date fechaEmisionPago;
                 private int plazoPagoDias;
                 private Date fechaPago;
                 private Cotizacion cotizacion;
                 private String estado;
                 
                 
                 public Venta(){};

                public Venta(int idVenta, Pago pago, Date fechaEntrega, Date fechaEmisionPago, int plazoPagoDias, Date fechaPago, Cotizacion cotizacion, String estado) {
                    this.idVenta = idVenta;
                    this.pago = pago;
                    this.fechaEntrega = fechaEntrega;
                    this.fechaEmisionPago = fechaEmisionPago;
                    this.plazoPagoDias = plazoPagoDias;
                    this.fechaPago = fechaPago;
                    this.cotizacion = cotizacion;
                    this.estado = estado;
                }

                public int getIdVenta() {
                    return idVenta;
                }

                public void setIdVenta(int idVenta) {
                    this.idVenta = idVenta;
                }

                public Pago getPago() {
                    return pago;
                }

                public void setPago(Pago pago) {
                    this.pago = pago;
                }

                public Date getFechaEntrega() {
                    return fechaEntrega;
                }

                public void setFechaEntrega(Date fechaEntrega) {
                    this.fechaEntrega = fechaEntrega;
                }

                public Date getFechaEmisionPago() {
                    return fechaEmisionPago;
                }

                public void setFechaEmisionPago(Date fechaEmisionPago) {
                    this.fechaEmisionPago = fechaEmisionPago;
                }

                public int getPlazoPagoDias() {
                    return plazoPagoDias;
                }

                public void setPlazoPagoDias(int plazoPagoDias) {
                    this.plazoPagoDias = plazoPagoDias;
                }

                public Date getFechaPago() {
                    return fechaPago;
                }

                public void setFechaPago(Date fechaPago) {
                    this.fechaPago = fechaPago;
                }

                public Cotizacion getCotizacion() {
                    return cotizacion;
                }

                public void setCotizacion(Cotizacion cotizacion) {
                    this.cotizacion = cotizacion;
                }

                public String getEstado() {
                    return estado;
                }

                public void setEstado(String estado) {
                    this.estado = estado;
                }
	

}