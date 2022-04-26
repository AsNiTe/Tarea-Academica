/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pe.pucp.losheredados.ventas.dao;

import java.util.ArrayList;
import pe.edu.pe.pucp.losheredados.ventas.model.Cotizacion;

/**
 *
 * @author PC
 */
public interface CotizacionDAO {
     int insertar(Cotizacion cotizacion);
    int modificar(Cotizacion cotizacion);
    int eliminar(int idCotizacion);
    ArrayList<Cotizacion> listarTodas();
    Cotizacion buscarPorId(int idCotizacion);
}
