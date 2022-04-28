
package pe.edu.pucp.losheredados.usuarios.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import pe.edu.pucp.heredadossoft.config.DBManager;
import pe.edu.pucp.losheredados.usuarios.dao.Cliente_CategoriaDAO;
import pe.edu.pucp.losheredados.usuarios.model.Cliente_Categoria;

/**
 *
 * @author JOSE
 */
public class Cliente_CategoriaMySQL implements Cliente_CategoriaDAO  {
    private Connection con;
    private ResultSet rs;
    private CallableStatement cs;

    @Override
    public int insertar(Cliente_Categoria cliente_categoria) {
        int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_CLIENTE_CATEGORIA(?,?,?)}");
        cs.registerOutParameter("_id_cliente_categoria", java.sql.Types.INTEGER);
        cs.setString("_nombre", cliente_categoria.getNombre());
        cs.setDouble("_linea_credito",cliente_categoria.getLineaCredito());
        cs.executeUpdate();
        cliente_categoria.setIdCliente_Categoria(cs.getInt("_id_cliente_categoria"));
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;   
    }

    @Override
    public int modificar(Cliente_Categoria cliente_categoria) {
         int resultado = 0;
    try{
        con = DBManager.getInstance().getConnection();
        cs = con.prepareCall("{call INSERTAR_CLIENTE_CATEGORIA(?,?,?)}");
        cs.setInt("_id_cliente_categoria", cliente_categoria.getIdCliente_Categoria());
        cs.setString("_nombre", cliente_categoria.getNombre());
        cs.setDouble("_linea_credito",cliente_categoria.getLineaCredito());
        cs.executeUpdate();
        resultado = 1;
        
    } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return resultado;   
    }

    @Override
    public int eliminar(int idCliente_Categoria) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call ELIMINAR_CLIENTE_CATEGORIA(?)}");
            cs.setInt("_id_cliente_categoria", idCliente_Categoria);
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
    public ArrayList<Cliente_Categoria> listarTodas() {
         ArrayList<Cliente_Categoria> cates = new ArrayList<>();
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call LISTAR_CLIENTE_CATEGORIA_TODAS()}");
            rs = cs.executeQuery();
            while(rs.next()){
               Cliente_Categoria cate = new Cliente_Categoria();
               cate.setIdCliente_Categoria(rs.getInt("id_cliente_categoria"));
               cate.setNombre(rs.getString("nombre"));
               cate.setLineaCredito(rs.getDouble("linea_credito"));
               cates.add(cate);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(Exception ex){System.out.println(ex.getMessage());}
        }
        return cates;
    }

    @Override
    public Cliente_Categoria buscarPorId(int idCliente_Categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
