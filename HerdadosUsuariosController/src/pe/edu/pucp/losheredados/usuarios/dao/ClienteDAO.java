/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.usuarios.model.Cliente;

/**
 *
 * @author JOSE
 */
public interface ClienteDAO {
     int insertar(Cliente cliente);
    int modificar(Cliente cliente);
    int eliminar(int idCliente);
    ArrayList<Cliente> listarTodas();
    Cliente buscarPorId(int idCliente);   
}
