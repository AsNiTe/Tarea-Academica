/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.losheredados.productos.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.heredadossoft.config.DBManager;
import pe.edu.pucp.losheredados.productos.dao.PreciosDAO;
import pe.edu.pucp.losheredados.productos.model.Precios;

/**
 *
 * @author Roberto Carlos
 */
public class PreciosMySQL implements PreciosDAO{

    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    @Override
    public int insertar(Precios precios) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_PRECIO(?,?,?,?,?)}");
            cs.registerOutParameter("_id_precio", java.sql.Types.INTEGER);
            cs.setString("_descripcion",precios.getDescripcion());
            cs.setDouble("_preciounitario",precios.getPrecioUnitario());
            cs.setInt("_cantidadasociada",precios.getCantidadAsociada());
            cs.setInt("_fid_producto",precios.getProducto().getIdProducto());
           
            cs.executeUpdate();
            precios.setIdPrecio(cs.getInt("_id_precio"));
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Precios precios) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_PRECIO(?,?,?,?,?)}");
            cs.setInt("_id_precio", precios.getIdPrecio());
            cs.setString("_descripcion",precios.getDescripcion());
            cs.setDouble("_preciounitario",precios.getPrecioUnitario());
            cs.setInt("_cantidadasociada",precios.getCantidadAsociada());
            cs.setInt("_fid_producto",precios.getProducto().getIdProducto());
           
            cs.executeUpdate();
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int eliminar(int id_precios) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_PRECIO(?)}");
            cs.setInt("_id_precio", id_precios);
            cs.executeUpdate();
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public ArrayList<Precios> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
