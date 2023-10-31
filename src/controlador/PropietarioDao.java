/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Propietario;
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
public class PropietarioDao {
    
    public boolean ingresarPropietario(Propietario propietario){
        boolean respuesta = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "insert into propietario (numrut_prop,dvrut_prop,appaterno_prop,apmaterno_prop,nombre_prop,direccion_prop,id_estcivil,fonofijo_prop,celular_prop,id_Comuna) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1, propietario.getNumrut_prop());
            prepararConsulta.setString(2,String.valueOf(propietario.getDvrut_prop()));
            prepararConsulta.setString(3,propietario.getAppaterno_prop());
            prepararConsulta.setString(4,propietario.getApmaterno_prop());
            prepararConsulta.setString(5,propietario.getNombre_prop());
            prepararConsulta.setString(6,propietario.getDireccion_prop());
            prepararConsulta.setInt(7,propietario.getId_estcivil());
            prepararConsulta.setString(8,propietario.getFonofijo_prop());
            prepararConsulta.setString(9,propietario.getCelular_prop());
            prepararConsulta.setInt(10, propietario.getId_comuna());
            
            respuesta = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    
    public boolean actualizarPropietario(Propietario propietario){
        boolean respuesta = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "update propietario set dvrut_prop=?,appaterno_prop=?,apmaterno_prop=?,nombre_prop=?,direccion_prop=?,id_estcivil=?,fonofijo_prop=?,celular_prop=?,id_Comuna=? where numrut_prop = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1,String.valueOf(propietario.getDvrut_prop()));
            prepararConsulta.setString(2,propietario.getAppaterno_prop());
            prepararConsulta.setString(3,propietario.getApmaterno_prop());
            prepararConsulta.setString(4,propietario.getNombre_prop());
            prepararConsulta.setString(5,propietario.getDireccion_prop());
            prepararConsulta.setInt(6,propietario.getId_estcivil());
            prepararConsulta.setString(7,propietario.getFonofijo_prop());
            prepararConsulta.setString(8,propietario.getCelular_prop());
            prepararConsulta.setInt(9, propietario.getId_comuna());
            prepararConsulta.setInt(10, propietario.getNumrut_prop());
            
            respuesta = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    
    public boolean eliminarPropietario (Propietario propietario){
        boolean respuesta = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from propietario where numrut_prop = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1, propietario.getNumrut_prop());
            
            respuesta = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    public ArrayList<Propietario> mostrarTodosLosPropietarios(){
        ArrayList<Propietario> listadoPropietarios = new ArrayList<>();
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from propietario";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            ResultSet respuesta = prepararConsulta.executeQuery();
            
            Propietario propietario;
            
            while(respuesta.next()){
                String dv = respuesta.getString(2);
                char chdv = dv.charAt(0);
                
                propietario = new Propietario(respuesta.getInt(1), chdv, respuesta.getString(3), respuesta.getString(4), respuesta.getString(5), respuesta.getString(6), respuesta.getInt(7), respuesta.getString(8), respuesta.getString(9), respuesta.getInt(10));
                
                listadoPropietarios.add(propietario);
            }
            
            prepararConsulta.close();
        
        }catch (SQLException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listadoPropietarios;
    }
    
    public ArrayList<Propietario> buscarPropietario(int numrut_prop){
        ArrayList<Propietario> listadoPropietarios = new ArrayList<>();
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from propietario where numrut_prop = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1, numrut_prop);
            
            ResultSet respuesta = prepararConsulta.executeQuery();
            
            Propietario propietario;
            
            while(respuesta.next()){
                String dv = respuesta.getString(2);
                char chdv = dv.charAt(0);
                
                propietario = new Propietario(respuesta.getInt(1), chdv, respuesta.getString(3), respuesta.getString(4), respuesta.getString(5), respuesta.getString(6), respuesta.getInt(7), respuesta.getString(8), respuesta.getString(9), respuesta.getInt(10));
                
                listadoPropietarios.add(propietario);
            }
            
            prepararConsulta.close();
        
        }catch (SQLException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(PropietarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listadoPropietarios;
    }
    
    
}//Fin public class PropietarioDao {
