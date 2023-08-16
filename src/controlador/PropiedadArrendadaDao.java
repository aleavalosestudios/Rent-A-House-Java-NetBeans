/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.PropiedadArrendada;
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

//Esta clase debe funcionar de forma distinta ya que la insercion de datos debe ser desde otras tablas y la fecha debe ser ingresada de forma manual
public class PropiedadArrendadaDao {
    
    public boolean agregarPropiedadArrendada (PropiedadArrendada propiedadArrendada){
        boolean resultado = false;
        try {
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "insert into propiead_arrendad (nro_Propiedad,fecini_arriendo,feter_arriendo,numrut_cli) values(?,?,?,?)";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            //Cambiar fecha de String a Date
            java.sql.Date fechini_arriendoDate = propiedadArrendada.transformarDeStringADate(propiedadArrendada.getFecini_arriendo());
            java.sql.Date fecter_arriendoDate = propiedadArrendada.transformarDeStringADate(propiedadArrendada.getFecter_arriendo());
            
            //Ingreso de datos a query
            prepararConsulta.setInt(1, propiedadArrendada.getNro_propiedad());
            prepararConsulta.setDate(2,fechini_arriendoDate);
            prepararConsulta.setDate(3,fecter_arriendoDate);
            prepararConsulta.setInt(4, propiedadArrendada.getNumrut_cli());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }
    
    public boolean actualizarPropiedadArrendada(PropiedadArrendada propiedadArrendada) {
        boolean resultado = false;

        try {
            Connection conexionBaseConnection = Conexion.getConexion();
            String query = "update propiedad_arrendada set fechini_arriendo = ?, fecter_arriendo = ?, nuemrut_cli = ? where Nro_Propiedad = ?";
            PreparedStatement prepararConsulta = conexionBaseConnection.prepareStatement(query);

            java.sql.Date fechini_arriendoDate = propiedadArrendada.transformarDeStringADate(propiedadArrendada.getFecini_arriendo());
            java.sql.Date fecter_arriendoDate = propiedadArrendada.transformarDeStringADate(propiedadArrendada.getFecter_arriendo());

            //Ingreso de datos a query

            prepararConsulta.setDate(1,fechini_arriendoDate);
            prepararConsulta.setDate(2,fecter_arriendoDate);
            prepararConsulta.setInt(3, propiedadArrendada.getNumrut_cli());
            prepararConsulta.setInt(4, propiedadArrendada.getNro_propiedad());

            resultado = prepararConsulta.executeUpdate() == 1;

        prepararConsulta.close();

        }catch (SQLException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }

        return resultado;
    }
        
    public boolean eliminarPropiedadArrendada(PropiedadArrendada propiedadArrendada){
        boolean resultado = false;

        try{
            
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from propiedad_arrendada where nro propiedad = ? and fecini_arriendo = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            java.sql.Date fechini_arriendoDate = propiedadArrendada.transformarDeStringADate(propiedadArrendada.getFecini_arriendo());

            prepararConsulta.setInt(1, propiedadArrendada.getNro_propiedad());
            prepararConsulta.setDate(2,fechini_arriendoDate);
            
            resultado = prepararConsulta.executeUpdate() == 1;

        prepararConsulta.close();
            
        }catch (SQLException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return resultado;
    }

    public ArrayList<PropiedadArrendada> todasLasPropiedadesArrendadas(){
        ArrayList<PropiedadArrendada> listadoPropiedadesArrendadas = new ArrayList<>();
        PropiedadArrendada propiedadArrendada;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "Select * from propiedad_arrendada;";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            while(resultado.next()){
                String fechaInicioArriendo = transformarDeDateAString(resultado.getDate(2));
                String fechaTerminoArriendo = transformarDeDateAString(resultado.getDate(3));
                
                propiedadArrendada = new PropiedadArrendada(resultado.getInt(1), fechaInicioArriendo,fechaTerminoArriendo,resultado.getInt(4));
                
                listadoPropiedadesArrendadas.add(propiedadArrendada);
            }
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listadoPropiedadesArrendadas;
    }
    
    public ArrayList<PropiedadArrendada> buscarPropiedadesArrendadas(int nro_propiedad){
        ArrayList<PropiedadArrendada> listadoPropiedadesArrendadas = new ArrayList<>();
        PropiedadArrendada propiedadArrendada;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "Select * from propiedad_arrendada where nro_propiedad = ?;";
            
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            prepararConsulta.setInt(1, nro_propiedad);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            while(resultado.next()){
                String fechaInicioArriendo = transformarDeDateAString(resultado.getDate(2));
                String fechaTerminoArriendo = transformarDeDateAString(resultado.getDate(3));
                
                propiedadArrendada = new PropiedadArrendada(resultado.getInt(1), fechaInicioArriendo,fechaTerminoArriendo,resultado.getInt(4));
                
                listadoPropiedadesArrendadas.add(propiedadArrendada);
            }
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
        Logger.getLogger(PropiedadArrendadaDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listadoPropiedadesArrendadas;
    }
    

    public String transformarDeDateAString(java.sql.Date fecha){
        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyy-MM-dd");

        String fechaString = formatoFecha.format(fecha);

    return fechaString;
    }
    
}
