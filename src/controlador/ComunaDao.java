/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Comuna;
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
public class ComunaDao {
    
    public boolean ingresarComuna(Comuna comuna){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "insert into comuna (nombre_comuna) values(?) ";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1,comuna.getNombre_comuna());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        } 
        return resultado;
    }//FIN public boolean ingresarComuna(Comuna comuna)
    
    public boolean actualizarComuna (Comuna comuna){
        boolean resultado = false;
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "Update comuna set desc_categoria = ? where id_comuna = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, comuna.getNombre_comuna());
            prepararConsulta.setInt(2,comuna.getId_comuna());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch(SQLException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }//FIN public boolean actualizarComuna (Comuna comuna){
    
    public boolean eliminarComuna(Comuna comuna){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from comuna where id_comuna = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1, comuna.getId_comuna());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
            
        }catch(SQLException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        }

        return resultado;
        
    }//FIN public boolean eliminarComuna(Comuna comuna){
    
    public ArrayList<Comuna> mostrarComunas(){
        ArrayList<Comuna> listadoComuna = new ArrayList<>();
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from comuna";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            ResultSet resultado = prepararConsulta.executeQuery();
            
            Comuna comuna;
            
            while (resultado.next()){
                comuna = new Comuna(resultado.getInt(1),resultado.getString(2));
                listadoComuna.add(comuna);
            }
            prepararConsulta.close();
            
        }catch(SQLException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        
        return listadoComuna;
    }//FIN public ArrayList<Comuna> mostrarComunas(){
    
    public ArrayList<Comuna> buscarComuna(String nombre_comuna){
        ArrayList<Comuna> listadoComuna = new ArrayList<>();
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select id_comuna, nombre_comuna from comuna where comuna_nombre = ? ";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, nombre_comuna);
            ResultSet resultado = prepararConsulta.executeQuery();
            
            Comuna comuna;
            
            while(resultado.next()){
                comuna = new Comuna(resultado.getInt(1),resultado.getString(2));
                listadoComuna.add(comuna);
            }
            
            prepararConsulta.close();
            
            
        }catch (SQLException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(ComunaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listadoComuna;
    }
    
}//FIN public class ComunaDao {
