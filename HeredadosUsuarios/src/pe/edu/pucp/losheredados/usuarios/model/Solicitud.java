/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.usuarios.model;

import java.util.Date;

/**
 *
 * @author JOSE
 */
public class Solicitud {
    private String tipo;
    private String medio;
    private Date fechaCreacion;
    private Date fechaAtendida;
    private Trabajador trabajdor;
    private Cliente cliente;
    private Obra obra;
    private String reporteTrabajador;

    public Solicitud(String tipo, String medio, Date fechaCreacion, Date fechaAtendida, Trabajador trabajdor, Cliente cliente, Obra obra, String reporteTrabajador) {
        this.tipo = tipo;
        this.medio = medio;
        this.fechaCreacion = fechaCreacion;
        this.fechaAtendida = fechaAtendida;
        this.trabajdor = trabajdor;
        this.cliente = cliente;
        this.obra = obra;
        this.reporteTrabajador = reporteTrabajador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaAtendida() {
        return fechaAtendida;
    }

    public void setFechaAtendida(Date fechaAtendida) {
        this.fechaAtendida = fechaAtendida;
    }

    public Trabajador getTrabajdor() {
        return trabajdor;
    }

    public void setTrabajdor(Trabajador trabajdor) {
        this.trabajdor = trabajdor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public String getReporteTrabajador() {
        return reporteTrabajador;
    }

    public void setReporteTrabajador(String reporteTrabajador) {
        this.reporteTrabajador = reporteTrabajador;
    }
    
    
    
}
