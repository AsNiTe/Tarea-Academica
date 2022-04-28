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
import pe.edu.pucp.losheredados.productos.dao.ProductoCategoriaDAO;
import pe.edu.pucp.losheredados.productos.model.ProductoyCategoria;


/**
 *
 * @author Roberto Carlos
 */
public class ProductoCategoriaMySQL implements ProductoCategoriaDAO{
    
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertar(ProductoyCategoria productoCategoria) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_PRODUCTO_CATEGORIA(?,?,?)}");
            cs.registerOutParameter("_id_producto_categoria", java.sql.Types.INTEGER);
            cs.setString("_nombre",productoCategoria.getNombre());
            cs.setString("_etapa_recomendada",productoCategoria.getEtapaRecomendada());
            
            cs.executeUpdate();
            productoCategoria.setIdProductoCategoria(cs.getInt("_id_producto_categoria"));
            
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(ProductoyCategoria productoCategoria) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_PRODUCTO_CATEGORIA(?,?,?)}");
            cs.setInt("_id_producto_categoria",productoCategoria.getIdProductoCategoria());
            cs.setString("_nombre",productoCategoria.getNombre());
            cs.setString("_etapa_recomendada",productoCategoria.getEtapaRecomendada());
            
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
    public int eliminar(int id_productoCategoria) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_PRODUCTO_CATEGORIA(?)}");
            cs.setInt("_id_producto_categoria",id_productoCategoria);
            
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
    public ArrayList<ProductoyCategoria> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
