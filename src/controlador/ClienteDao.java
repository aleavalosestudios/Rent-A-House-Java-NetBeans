/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDao {
    
    public boolean ingresarCliente(Cliente cliente){
        boolean respuesta = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "insert into cliente (numrut_cli,dvrut_cli,appaterno_cli,apmaterno_cli,nombre_cli,direccion_cli,id_estcivil,fonofijo_cli,celular_cli,renta_cli) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1,cliente.getNumrut_cli());
            prepararConsulta.setString(2,String.valueOf(cliente.getDvrut_cli()));
            prepararConsulta.setString(3, cliente.getAppaterno_cli());
            prepararConsulta.setString(4, cliente.getApmaterno_cli());
            prepararConsulta.setString(5, cliente.getNombre_cli());
            prepararConsulta.setString(6, cliente.getDireccion_cli());
            prepararConsulta.setInt(7,cliente.getId_estcivil());
            prepararConsulta.setInt(8,cliente.getFonofijo_cli());
            prepararConsulta.setInt(9,cliente.getCelular_cli());
            prepararConsulta.setInt(10,cliente.getRenta_cli());
            
            respuesta = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    
    public boolean actualizarCliente (Cliente cliente){
        boolean respuesta = false;
            
            try{
                Connection conexionBaseDatos = Conexion.getConexion();
                String query = "update cliente set dvrut_cli = ?,appaterno_cli = ?,apmaterno_cli  = ?,nombre_cli = ?,direccion_cli = ?,id_estcivil = ?,fonofijo_cli = ?,celular_cli = ?,renta_cli = ? where numrut_cli = ?" ;
                PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
                
                prepararConsulta.setString(1,String.valueOf(cliente.getDvrut_cli()));
                prepararConsulta.setString(2, cliente.getAppaterno_cli());
                prepararConsulta.setString(3, cliente.getApmaterno_cli());
                prepararConsulta.setString(4, cliente.getNombre_cli());
                prepararConsulta.setString(5, cliente.getDireccion_cli());
                prepararConsulta.setInt(6,cliente.getId_estcivil());
                prepararConsulta.setInt(7,cliente.getFonofijo_cli());
                prepararConsulta.setInt(8,cliente.getCelular_cli());
                prepararConsulta.setInt(9,cliente.getRenta_cli());
                prepararConsulta.setInt(10,cliente.getNumrut_cli());
                
                respuesta = prepararConsulta.executeUpdate() == 1;
                
                prepararConsulta.close();
                
            }catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return respuesta;
    }
    
    public boolean eliminarCliente(Cliente cliente){
        boolean respuesta = false;
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from cliente where numrut_cli = ? ";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);

            prepararConsulta.setInt(1, cliente.getNumrut_cli());

            respuesta = prepararConsulta.executeUpdate() == 1;

            prepararConsulta.close();

        }catch (SQLException ex) {
        Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
        Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    public ArrayList<Cliente> TodoslosClientes(){
        ArrayList<Cliente>  listadoClientes = new ArrayList<>();
        try{
            Connection conexionBaseDatosConnection = Conexion.getConexion();
            String query = "select * from cliente";
            PreparedStatement prepararConsulta = conexionBaseDatosConnection.prepareStatement(query);
            ResultSet resultado = prepararConsulta.executeQuery();
            
            Cliente cliente;
            
            while(resultado.next()){
                
                String dv = resultado.getString(2);
                char chdv = dv.charAt(0);
                cliente = new Cliente(resultado.getInt(1),chdv,resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getInt(7),resultado.getInt(8),resultado.getInt(9),resultado.getInt(10));
                
                listadoClientes.add(cliente);
                
            }
            
            prepararConsulta.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoClientes;
    }
    
    public ArrayList<Cliente> buscarCliente(int numrut_cli){
        ArrayList<Cliente> listadoCliente = new ArrayList<>();
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from cliente where numrut_cli = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareCall(query);
            
            prepararConsulta.setInt(1, numrut_cli);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            Cliente cliente;
            while(resultado.next()){
                String dv = resultado.getString(2);
                char chdv = dv.charAt(0);
                cliente = new Cliente(resultado.getInt(1),chdv,resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getInt(7),resultado.getInt(8),resultado.getInt(9),resultado.getInt(10));
                
                listadoCliente.add(cliente);
            }
            
            prepararConsulta.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listadoCliente;
    }
}
