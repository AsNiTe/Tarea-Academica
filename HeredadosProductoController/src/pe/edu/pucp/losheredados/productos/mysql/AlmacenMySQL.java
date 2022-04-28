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
import pe.edu.pucp.losheredados.productos.dao.AlmacenDAO;
import pe.edu.pucp.losheredados.productos.model.Almacen;

/**
 *
 * @author Roberto Carlos
 */
public class AlmacenMySQL implements AlmacenDAO{

    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    @Override
    public int insertar(Almacen almacen) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_ALMACEN(?,?)}");
            cs.registerOutParameter("_id_almacen", java.sql.Types.INTEGER);
            cs.setString("_direccion",almacen.getDireccion());

            
            cs.executeUpdate();
            almacen.setId_Almacen(cs.getInt("_id_almacen"));
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Almacen almacen) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_ALMACEN(?,?)}");
            cs.setInt("_id_almacen", almacen.getId_Almacen());
            cs.setString("_nombre",almacen.getDireccion());

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
    public int eliminar(int id_almacen) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_ALMACEN(?)}");
            cs.setInt("_id_almacen", id_almacen);

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
    public ArrayList<Almacen> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
