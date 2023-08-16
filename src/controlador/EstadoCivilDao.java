/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.EstadoCivil;
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
public class EstadoCivilDao {
    
    public boolean agregarEstadoCivil(EstadoCivil estadoCivil){
        boolean resultado = false;
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "insert into estado_civil (desc_Estcivil) values (?)";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, estadoCivil.getDesc_EstCivil());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch  (SQLException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
        
    }//FIN public boolean agregarEstadoCivil(EstadoCivil estadoCivil){
    
    
    public boolean actualizarEstadoCivil(EstadoCivil estadoCivil){
        boolean resultado = false;
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "Update estado_civil set dec_Estcivil = ? where id_estcivil = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1,estadoCivil.getDesc_EstCivil());
            prepararConsulta.setInt(2, estadoCivil.getId_EstCivil());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    
    }//FIN public boolean actualizarEstadoCivil(EstadoCivil estadoCivil){
    
    public boolean eliminarEstadoCivil (EstadoCivil estadocivil){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from estado_civil where id_estcivil = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1, estadocivil.getId_EstCivil());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    
    }//FIN public boolean eliminarEstadoCivil (EstadoCivil estadocivil){
    
    
    public ArrayList<EstadoCivil> todosLosEstadoCivil(){
        
        ArrayList<EstadoCivil> listadoEstadoCivil = new ArrayList<>();
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from estado_civil";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);

            ResultSet resultado = prepararConsulta.executeQuery();

            EstadoCivil estadocivil;

            while (resultado.next()){
                estadocivil = new EstadoCivil(resultado.getInt(1),resultado.getString(2));
                listadoEstadoCivil.add(estadocivil);
            }
            
        }catch (SQLException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listadoEstadoCivil;   
    }//FIN public ArrayList<EstadoCivil> todosLosEstadoCivil(){
    
    public ArrayList<EstadoCivil> buscarEstadoCivil (String desc_Estcivil){
        ArrayList<EstadoCivil> listaEstadoCivil = new ArrayList<>();
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = " select * from estado_civil where desc_Estcivil = ?";
            PreparedStatement preparConsulta = conexionBaseDatos.prepareStatement(query);
            
            preparConsulta.setString(1, desc_Estcivil);
            
            ResultSet resultado = preparConsulta.executeQuery();
            
            EstadoCivil estadocivil;
            
            while(resultado.next()){
                estadocivil = new EstadoCivil(resultado.getInt(1), resultado.getString(2));
                
                listaEstadoCivil.add(estadocivil);
            }
            
            preparConsulta.close();
                
        }catch (SQLException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EstadoCivilDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listaEstadoCivil;
    }

}//FIN public class EstadoCivilDao {
