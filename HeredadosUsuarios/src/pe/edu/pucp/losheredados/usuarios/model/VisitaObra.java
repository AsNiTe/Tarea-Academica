/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.losheredados.usuarios.model;

/**
 *
 * @author PC
 */
import java.util.Date;

public class VisitaObra {
    private Date tiempoVisita;
    private Trabajador trabajador;
    private String descripcion;

    public VisitaObra(Date tiempoVisita, Trabajador trabajador, String descripcion) {
        this.tiempoVisita = tiempoVisita;
        this.trabajador = trabajador;
        this.descripcion = descripcion;
    }

    public Date getTiempoVisita() {
        return tiempoVisita;
    }

    public void setTiempoVisita(Date tiempoVisita) {
        this.tiempoVisita = tiempoVisita;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
