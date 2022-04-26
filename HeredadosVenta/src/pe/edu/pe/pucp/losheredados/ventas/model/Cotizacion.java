/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.pucp.losheredados.ventas.model;
import pe.edu.pucp.losheredados.usuarios.model.Obra;
import pe.edu.pucp.losheredados.usuarios.model.Trabajador;
import pe.edu.pucp.losheredados.usuarios.model.Cliente;
import java.util.ArrayList;
import java.util.Date;

public class Cotizacion{
                  private int idCotizacion;
	private ArrayList<Detalle> detalleCotizacion;
                 private Obra obraAsociada;
                 private Trabajador vendedor;
                 private Cliente cliente;
                 private Date fecha;
                 private String estado;
                 	private float subTotal;
	private float IGV;
	private float total;
public Cotizacion(){};
    public Cotizacion(Obra obraAsociada, Trabajador vendedor, Cliente cliente, Date fecha, String estado, float subTotal, float IGV, float total) {
        this.obraAsociada = obraAsociada;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.fecha = fecha;
        this.estado = estado;
        this.subTotal = subTotal;
        this.IGV = IGV;
        this.total = total;
    }

        public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }
    

    public ArrayList<Detalle> getDetalleCotizacion() {
        return detalleCotizacion;
    }

    public void setDetalleCotizacion(ArrayList<Detalle> detalleCotizacion) {
        this.detalleCotizacion = detalleCotizacion;
    }

    public Obra getObraAsociada() {
        return obraAsociada;
    }

    public void setObraAsociada(Obra obraAsociada) {
        this.obraAsociada = obraAsociada;
    }

    public Trabajador getVendedor() {
        return vendedor;
    }

    public void setVendedor(Trabajador vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getIGV() {
        return IGV;
    }

    public void setIGV(float IGV) {
        this.IGV = IGV;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
                 

	

}
