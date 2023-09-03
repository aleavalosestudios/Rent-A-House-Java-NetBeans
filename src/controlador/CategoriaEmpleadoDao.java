/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.CategoriaEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class CategoriaEmpleadoDao {
    
    public boolean IngresarCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado){
        boolean resultado = false;
        try{
            //preparar Conexion
            Connection conexionBaseDatos = Conexion.getConexion();//si no esta dentro de un try catch arroja error
            
            //crear consulta para la base de datos
            String query = "insert into categoria_empleado(desc_categoria_emp) values(?)";
            
            //Ingresar valores a query
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            //id_categoria es Autonumber
            prepararConsulta.setString(1,categoriaEmpleado.getDesc_categoria_emp());
            
            //Ejecutar consulta
            //valoresConsulta.executeUpdate() == 1; es una sentencia verdadera o falsa
            resultado = prepararConsulta.executeUpdate() == 1;
            
            //Cerrar consulta
            prepararConsulta.close();
            
            
        }catch (SQLException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
        
    }//FIN public boolean IngresarCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado){
    
    
    public boolean actualizarCategoriaEmpleado (CategoriaEmpleado categoriaEmpleado){
        boolean resultado = false;
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "update categoria_empleado set desc_categoria_emp = ? where id_categoria_emp = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, categoriaEmpleado.getDesc_categoria_emp());
            prepararConsulta.setInt(2,categoriaEmpleado.getId_categoria_emp());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
            
        }catch(SQLException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }//Fin public boolean actualizarCategoriaEmpleado (CategoriaEmpleado categoriaEmpleado){
    
    
    public boolean eliminarCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from categoria_empleado where id_categoria_emp = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1, categoriaEmpleado.getId_categoria_emp());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch(SQLException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    
    }
    
    
    public ArrayList<CategoriaEmpleado> todasLasCategoriaEmpleado(){
        
        ArrayList<CategoriaEmpleado> listacategoriaEmpleado = new ArrayList<>();
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "Select * from categoria_empleado";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            ResultSet resultado = prepararConsulta.executeQuery();
            
            CategoriaEmpleado categoriaEmpleado;
            
            while(resultado.next()){
                categoriaEmpleado = new CategoriaEmpleado(resultado.getInt(1), resultado.getString(2));
                listacategoriaEmpleado.add(categoriaEmpleado);
            }
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listacategoriaEmpleado;
    }//FIN public ArrayList<CategoriaEmpleado> todasLasCategoriaEmpleado(int id_categoria_empleado ){
    
    public ArrayList<CategoriaEmpleado> buscarCategoriaEmpleado (String desc_categoria_emp){
        
        ArrayList<CategoriaEmpleado> listaCategoriaEmpleado = new ArrayList<>();
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from categoria_empleado where desc_categoria_emp = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, desc_categoria_emp);
            ResultSet resultado = prepararConsulta.executeQuery();
            
            CategoriaEmpleado categoriaEmpleado;
            
            while(resultado.next()){
                categoriaEmpleado = new CategoriaEmpleado(resultado.getInt(1), resultado.getString(2));
                listaCategoriaEmpleado.add(categoriaEmpleado);
            }
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaCategoriaEmpleado;
        
    }
    
}//FIN public class CategoriaEmpleadoDao
