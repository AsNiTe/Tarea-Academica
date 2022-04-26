/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pe.pucp.losheredados.ventas.model;

/**
 *
 * @author PC
 */
public class Pago {
    private double parteContado;
    private double parteCredito;
    private TiposdePago tipoPago;

    public Pago(double parteContado, double parteCredito, TiposdePago tipoPago) {
        this.parteContado = parteContado;
        this.parteCredito = parteCredito;
        this.tipoPago = tipoPago;
    }

    public double getParteContado() {
        return parteContado;
    }

    public void setParteContado(double parteContado) {
        this.parteContado = parteContado;
    }

    public double getParteCredito() {
        return parteCredito;
    }

    public void setParteCredito(double parteCredito) {
        this.parteCredito = parteCredito;
    }

    public TiposdePago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TiposdePago tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    
}
