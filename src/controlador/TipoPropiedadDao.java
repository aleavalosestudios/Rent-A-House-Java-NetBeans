/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.TipoPropiedad;
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
public class TipoPropiedadDao {
    
    public boolean ingresarTipoPropiedad(TipoPropiedad tipoPropiedad){
        boolean resultado = false;
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "insert into tipo_propiedad (id_tipo_propiedad,desc_tipo_propiedad) values (?,?)";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, String.valueOf(tipoPropiedad.getId_tipo_propiedad()));
            prepararConsulta.setString(2, tipoPropiedad.getDesc_tipo_propiedad());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }//FIN public boolean ingresarTipoPropiedad(TipoPropiedad tipoPropiedad){
    
    public boolean actualizarTipPropiedad(TipoPropiedad tipoPropiedad){
        boolean resultado = false;
        
        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "Update tipo_propiedad set desc_tipo_propiedad = ? where id_tipo_propiedad = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, tipoPropiedad.getDesc_tipo_propiedad());
            prepararConsulta.setString(2, String.valueOf(tipoPropiedad.getId_tipo_propiedad()));
            
            resultado = prepararConsulta.executeUpdate()== 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }
    
    public boolean eliminarTipoPropiedad(TipoPropiedad tipoPropiedad){
        boolean resultado = false;
        
        try{
            
            Connection ConexionBaseDatos = Conexion.getConexion();
            String query = "delete from tipo_propiedad where id_tipo_propiedad = ?";
            PreparedStatement prepararConsulta = ConexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, String.valueOf(tipoPropiedad.getId_tipo_propiedad()));
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
            
        }catch (SQLException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }
    
    public ArrayList<TipoPropiedad> todosLosTipoPropiedad(){
        
        ArrayList<TipoPropiedad> listadoTipoPropiedad = new ArrayList<>();
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from tipo_propiedad";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            TipoPropiedad tipoPropiedad;
            
            while(resultado.next()){
                
                String id_tipo_propiedad = resultado.getString(1);
                char id = id_tipo_propiedad.charAt(0);
                                
                tipoPropiedad = new TipoPropiedad(id, resultado.getString(2));
                
                listadoTipoPropiedad.add(tipoPropiedad);
            }
            
            prepararConsulta.close();
                        
        }catch (SQLException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }
               
        return listadoTipoPropiedad;
    }
    
    public ArrayList<TipoPropiedad> buscarTipoPropiedadPorDescripcion(String desc_tipoPropiedad){
        
        ArrayList<TipoPropiedad> listadoTipoPropiedadDescripcion = new ArrayList<>();
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from tipo_propiedad where desc_tipo_propiedad = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1,desc_tipoPropiedad);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            while(resultado.next()){
                char id_tipoPropiedad = resultado.getString(1).charAt(0);
                String nombretipoPropiedad = resultado.getString(2);
                
                TipoPropiedad tipoPropiedad = new TipoPropiedad(id_tipoPropiedad, nombretipoPropiedad);
                
                listadoTipoPropiedadDescripcion.add(tipoPropiedad);
            }
            
            prepararConsulta.close();
                
        }catch (SQLException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listadoTipoPropiedadDescripcion;
    }
    
    public ArrayList<TipoPropiedad> buscarTipoPropiedadPorId(char id_tipoPropiedad){
        
        ArrayList<TipoPropiedad> listadoTipoPropiedadID = new ArrayList<>();
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from tipo_propiedad where id_tipo_propiedad = ?";
            
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            String id_tipoPropiedadString = String.valueOf(id_tipoPropiedad);
            
            prepararConsulta.setString(1,id_tipoPropiedadString);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            while(resultado.next()){
                char id_tipoPropiedadChar = resultado.getString(1).charAt(0);
                String nombretipoPropiedad = resultado.getString(2);
                
                TipoPropiedad tipoPropiedad = new TipoPropiedad(id_tipoPropiedadChar, nombretipoPropiedad);
                
                listadoTipoPropiedadID.add(tipoPropiedad);
            }
            
            prepararConsulta.close();
                
        }catch (SQLException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TipoPropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listadoTipoPropiedadID;
    }
}
