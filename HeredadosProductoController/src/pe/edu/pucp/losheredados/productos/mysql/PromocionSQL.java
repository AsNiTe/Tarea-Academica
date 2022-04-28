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
import pe.edu.pucp.losheredados.productos.dao.PromocionDAO;
import pe.edu.pucp.losheredados.productos.model.Promocion;

/**
 *
 * @author Roberto Carlos
 */
public class PromocionSQL implements PromocionDAO{

    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;
    @Override
    public int insertar(Promocion promocion) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_PROMOCION(?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter("_id_promocion", java.sql.Types.INTEGER);
            cs.setString("_nombre",promocion.getNombre());
            cs.setString("_descripcion",promocion.getDescripcion());
            cs.setDouble("_preciounitario",promocion.getPrecioUnitario());
            cs.setDate("_fechainicio",new java.sql.Date(promocion.getFechaInicio().getTime()));
            cs.setDate("_fechafin",new java.sql.Date(promocion.getFechaFin().getTime()));
            cs.setInt("_cantidadminima",promocion.getCantidadMinima());
            cs.setString("_unidad",promocion.getUnidad());
            cs.setInt("_fid_producto",promocion.getProducto().getIdProducto());

            
            cs.executeUpdate();
            promocion.setIdPromocion(cs.getInt("_id_promocion"));
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Promocion promocion) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_PROMOCION(?,?,?,?,?,?,?,?,?)}");
            cs.setInt("_id_promocion", promocion.getIdPromocion());
            cs.setString("_nombre",promocion.getNombre());
            cs.setString("_descripcion",promocion.getDescripcion());
            cs.setDouble("_preciounitario",promocion.getPrecioUnitario());
            cs.setDate("_fechainicio",new java.sql.Date(promocion.getFechaInicio().getTime()));
            cs.setDate("_fechafin",new java.sql.Date(promocion.getFechaFin().getTime()));
            cs.setInt("_cantidadminima",promocion.getCantidadMinima());
            cs.setString("_unidad",promocion.getUnidad());
            cs.setInt("_fid_producto",promocion.getProducto().getIdProducto());
         
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
    public int eliminar(int id_promocion) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_PROMOCION(?)}");
            cs.setInt("_id_promocion", id_promocion);

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
    public ArrayList<Promocion> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
