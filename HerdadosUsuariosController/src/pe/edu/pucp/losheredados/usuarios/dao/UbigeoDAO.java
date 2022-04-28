/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.losheredados.usuarios.model.Ubigeo;

public interface UbigeoDAO {
    int insertar(Ubigeo ubigeo);
    int modificar(Ubigeo ubigeo);
    int eliminar(int idUbigeo);
    ArrayList<Ubigeo> listarTodas();
    Ubigeo buscarPorId(int idUbigeo);   
}
