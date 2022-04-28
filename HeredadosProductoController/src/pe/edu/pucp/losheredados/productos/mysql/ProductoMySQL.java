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
import pe.edu.pucp.losheredados.productos.dao.ProductoDAO;
import pe.edu.pucp.losheredados.productos.model.Producto;

/**
 *
 * @author Roberto Carlos
 */
public class ProductoMySQL implements ProductoDAO{
    
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertarProducto(Producto producto) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_PRODUCTO(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.registerOutParameter("_id_producto", java.sql.Types.INTEGER);
            cs.setInt("_stock",producto.getStock());
            cs.setString("_nombre",producto.getNombre());
            cs.setString("_descripcion",producto.getDescripcion());
            cs.setString("_rendimiento",producto.getRendimiento());
            cs.setString("_presentacion",producto.getPresentacion());
            cs.setDouble("_densidad",producto.getDensidad());
            cs.setString("_apariencia",producto.getApariencia());
            cs.setString("_diluyente",producto.getDiluyente());
            cs.setString("_color",producto.getColor());
            cs.setInt("_fid_producto_categoria",producto.getCategoria().getIdProductoCategoria());//necesita un ID
            cs.setInt("_fid_almacen",producto.getAlmacen().getId_Almacen());//necesita un ID
            cs.executeUpdate();
            producto.setIdProducto(cs.getInt("_id_producto"));
            resultado = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public int modificar(Producto producto) {
            int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call MODIFICAR_PRODUCTO(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt("_id_producto",producto.getIdProducto());
            cs.setInt("_stock",producto.getStock());
            cs.setString("_nombre",producto.getNombre());
            cs.setString("_descripcion",producto.getDescripcion());
            cs.setString("_rendimiento",producto.getRendimiento());
            cs.setString("_presentacion",producto.getPresentacion());
            cs.setDouble("_densidad",producto.getDensidad());
            cs.setString("_apariencia",producto.getApariencia());
            cs.setString("_diluyente",producto.getDiluyente());
            cs.setString("_color",producto.getColor());
            cs.setInt("_fid_producto_categoria",producto.getCategoria().getIdProductoCategoria());//necesita un ID
            cs.setInt("_fid_almacen",producto.getAlmacen().getId_Almacen());//necesita un ID
            
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
    public int eliminar(int idProducto) {
        int resultado = 0;
        try {
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_PRODUCTO(?)}");
            cs.setInt("_id_producto",idProducto);
            
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
    public ArrayList<Producto> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto buscarPorId(int idProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
