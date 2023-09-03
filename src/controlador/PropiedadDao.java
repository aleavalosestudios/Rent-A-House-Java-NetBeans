/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Propiedad;
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
public class PropiedadDao {
    
    public boolean ingresarPropiedad(Propiedad propiedad){
        boolean resultado = false;
        
        try{
            
            Connection ConexionBaseDatos = Conexion.getConexion();
            String query = "insert into propiedad (direccion_propiedad, superficie, nro_dormitorios, nro_banos, valor_arriendo, valor_gasto_comun,id_tipo_propiedad,id_comuna, numrut_prop, numrut_emp) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepararConsulta = ConexionBaseDatos.prepareStatement(query);
            
            
            prepararConsulta.setString(1, propiedad.getDireccion_propiedad());
            prepararConsulta.setFloat(2, propiedad.getSuperficie());
            prepararConsulta.setInt(3, propiedad.getNro_dormitorios());
            prepararConsulta.setInt(4, propiedad.getNro_banos());
            prepararConsulta.setInt(5, propiedad.getValor_arriendo());
            prepararConsulta.setInt(6, propiedad.getValor_gasto_comun());
            prepararConsulta.setString(7, String.valueOf(propiedad.getId_tipo_propiedad()));
            prepararConsulta.setInt(8, propiedad.getId_comuna());
            prepararConsulta.setInt(9, propiedad.getNumrut_prop());
            prepararConsulta.setInt(10, propiedad.getNumrut_emp());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(PropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Propiedad.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }
    
    public boolean actualizarPropiedad(Propiedad propiedad){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "update propiedad set direccion_propiedad = ?, superficie = ?, nro_dormitorios = ?, nro_banos = ?, valor_arriendo = ?, valor_gasto_comun = ?,id_tipo_propiedad = ?,id_comuna = ?, numrut_prop = ?, numrut_emp = ? where nro_propiedad = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1, propiedad.getDireccion_propiedad());
            prepararConsulta.setFloat(2, propiedad.getSuperficie());
            prepararConsulta.setInt(3, propiedad.getNro_dormitorios());
            prepararConsulta.setInt(4, propiedad.getNro_banos());
            prepararConsulta.setInt(5, propiedad.getValor_arriendo());
            prepararConsulta.setInt(6, propiedad.getValor_gasto_comun());
            prepararConsulta.setString(7, String.valueOf(propiedad.getId_tipo_propiedad()));
            prepararConsulta.setInt(8, propiedad.getId_comuna());
            prepararConsulta.setInt(9, propiedad.getNumrut_prop());
            prepararConsulta.setInt(10, propiedad.getNumrut_emp());
            prepararConsulta.setInt(11, propiedad.getNro_propiedad());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(PropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Propiedad.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }
    
    public boolean eliminarPropiedad(Propiedad propiedad){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from propiedad where nro_propiedad = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1, propiedad.getNro_propiedad());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(PropiedadDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Propiedad.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }
    
    public ArrayList<Propiedad> todasLasPropiedades(){
        
        ArrayList<Propiedad> listaPropiedades = new ArrayList<>();
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from propiedad";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            ResultSet resultado = prepararConsulta.executeQuery();
            
            Propiedad propiedad;
            
            while(resultado.next()){
                propiedad = new Propiedad(resultado.getInt(1), resultado.getString(2), resultado.getFloat(3),resultado.getInt(4),resultado.getInt(5),resultado.getInt(6),resultado.getInt(7),resultado.getString(8).charAt(0),resultado.getInt(9),resultado.getInt(10),resultado.getInt(11));
                listaPropiedades.add(propiedad);
            }
            
            prepararConsulta.close();
                        
        }catch(SQLException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listaPropiedades; 
    }


    public ArrayList<Propiedad> buscarPropiedad(int nro_propiedad){
        ArrayList<Propiedad> listaPropiedades = new ArrayList<>();

            try{
                Connection conexionBaseDatos = Conexion.getConexion();
                String query = "select * from propiedad where nro_propiedad = ?";
                PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
                prepararConsulta.setInt(1, nro_propiedad);
                
                ResultSet resultado = prepararConsulta.executeQuery();

                Propiedad propiedad;

                while(resultado.next()){
                    propiedad = new Propiedad(resultado.getInt(1), resultado.getString(2), resultado.getFloat(3),resultado.getInt(4),resultado.getInt(5),resultado.getInt(6),resultado.getInt(7),resultado.getString(8).charAt(0),resultado.getInt(9),resultado.getInt(10),resultado.getInt(11));
                    listaPropiedades.add(propiedad);
                }

                prepararConsulta.close();

            }catch(SQLException ex){
                Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
            }catch (ClassNotFoundException ex){
                Logger.getLogger(CategoriaEmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
            }
        return listaPropiedades;
    }
}

