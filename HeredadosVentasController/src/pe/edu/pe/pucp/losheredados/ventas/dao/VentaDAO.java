/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pe.pucp.losheredados.ventas.dao;

import java.util.ArrayList;
import pe.edu.pe.pucp.losheredados.ventas.model.Venta;

/**
 *
 * @author PC
 */
public interface VentaDAO {
        ArrayList<Venta> listarTodas();
        int insertar(Venta venta);
        int modificar(Venta venta);
        int eliminar(int idVenta);
       // Venta buscarPorId(int idVenta);
}
