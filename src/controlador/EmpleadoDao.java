/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Empleado;
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
public class EmpleadoDao {
    
    public boolean ingresarEmpleado(Empleado empleado){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "insert into empleado (numrut_emp,dvrut_emp,appaterno_emp,apmaterno_emp,nombre_emp,direccion_emp,id_est_civil,fonofijo_emp,celular_emp,fecnac_emp,fecing_emp,sueldo_emp,id_comuna,id_categoria_emp,numrut_supervisor) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1,empleado.getNumrut_emp());
            prepararConsulta.setString(2,String.valueOf(empleado.getDvrut_emp()));
            prepararConsulta.setString(3,empleado.getAppaterno_emp());
            prepararConsulta.setString(4,empleado.getApmaterno_emp());
            prepararConsulta.setString(5,empleado.getNombre_emp());
            prepararConsulta.setString(6, empleado.getDireccion_emp());
            prepararConsulta.setInt(7,empleado.getId_estcivil());
            prepararConsulta.setString(8,empleado.getFonofijo_emp());
            prepararConsulta.setString(9,empleado.getCelular_emp());
            
            //Fecha Nacimiento
            prepararConsulta.setDate(10, empleado.transformarDeStringADate(empleado.getFecnac_emp()));
         
            //Fecha Ingreso
            prepararConsulta.setDate(11, empleado.transformarDeStringADate(empleado.getFecing_emp()));
            
            prepararConsulta.setInt(12,empleado.getSueldo_emp());
            prepararConsulta.setInt(13,empleado.getId_comuna());
            prepararConsulta.setInt(14,empleado.getId_categoria_emp());
            prepararConsulta.setInt(15,empleado.getNumrut_supervisor());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }//FIN public boolean ingresarEmpleado(Empleado empleado){
    
    public boolean actualizarEmpleado(Empleado empleado){
        boolean resultado = false;
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "update empleado set dvrut_emp = ?,appaterno_emp = ?,apmaterno_emp = ?,nombre_emp = ?,direccion_emp = ?,id_est_civil = ?,fonofijo_emp = ?,celular_emp = ?,fecnac_emp = ?,fecing_emp = ?,sueldo_emp = ?,id_comuna = ?,id_categoria_emp = ?,numrut_supervisor = ? where numrut_emp = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setString(1,String.valueOf(empleado.getDvrut_emp()));
            prepararConsulta.setString(2,empleado.getAppaterno_emp());
            prepararConsulta.setString(3,empleado.getApmaterno_emp());
            prepararConsulta.setString(4,empleado.getNombre_emp());
            prepararConsulta.setString(5, empleado.getDireccion_emp());
            prepararConsulta.setInt(6,empleado.getId_estcivil());
            prepararConsulta.setString(7,empleado.getFonofijo_emp());
            prepararConsulta.setString(8,empleado.getCelular_emp());
            
            //Fecha Nacimiento
            prepararConsulta.setDate(9, empleado.transformarDeStringADate(empleado.getFecnac_emp()));
         
            //Fecha Ingreso
            prepararConsulta.setDate(10, empleado.transformarDeStringADate(empleado.getFecing_emp()));
            
            prepararConsulta.setInt(11,empleado.getSueldo_emp());
            prepararConsulta.setInt(12,empleado.getId_comuna());
            prepararConsulta.setInt(13,empleado.getId_categoria_emp());
            prepararConsulta.setInt(14,empleado.getNumrut_supervisor());
            
            prepararConsulta.setInt(15,empleado.getNumrut_emp());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return resultado;
    }//FIN public boolean actualizarEmpleado(Empleado empleado){
    
    public boolean eliminarEmpleado(Empleado empleado){
        boolean resultado = false;
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "delete from empleado where numrut_emp = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            prepararConsulta.setInt(1,empleado.getNumrut_emp());
            
            resultado = prepararConsulta.executeUpdate() == 1;
            
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
             
        return resultado;
    }//FIN public boolean eliminarEmpleado(Empleado empleado){
    
    public ArrayList<Empleado> todosLosEmpleados(){
        ArrayList<Empleado> listadoEmpleados = new ArrayList<>();
        
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from empleado";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            Empleado empleado;
            
            while(resultado.next()){
                String dvString = resultado.getString(2);
                char dv = dvString.charAt(1);
                
                String fecha_Nacimiento = transformarDeDateAString(resultado.getDate(10));
                String fecha_ingreso = transformarDeDateAString(resultado.getDate(11));
                
                //cambiar Date a String
                empleado = new Empleado(resultado.getInt(1), dv, resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), resultado.getInt(7), resultado.getString(8), resultado.getString(9), fecha_Nacimiento, fecha_ingreso, resultado.getInt(12), resultado.getInt(13), resultado.getInt(14), resultado.getInt(15));
                
                listadoEmpleados.add(empleado);
            }
            prepararConsulta.close();
            
            
        }catch (SQLException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        return listadoEmpleados;
    }
    
    
    //Metodo para Transformar de fecha a String, este metodo debe estar aqui para poder crear el objeto empleado
    public String transformarDeDateAString(java.sql.Date fecha){
        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyy-MM-dd");
        
        String fechaString = formatoFecha.format(fecha);
        
    return fechaString;
    }
    
    //Metodo Para buscar Empleado
    public ArrayList<Empleado> buscarEmpleado(int numrut_emp){
        
        ArrayList<Empleado> listadoEmpleados = new ArrayList<>();
   
        try{
            Connection conexionBaseDatos = Conexion.getConexion();
            String query = "select * from empleado where numrut_emp = ?";
            PreparedStatement prepararConsulta = conexionBaseDatos.prepareStatement(query);
            
            ResultSet resultado = prepararConsulta.executeQuery();
            
            Empleado empleado;
            
            while(resultado.next()){
                String dvString = resultado.getString(2);
                char dv = dvString.charAt(1);
                
                String fecha_Nacimiento = transformarDeDateAString(resultado.getDate(10));
                String fecha_ingreso = transformarDeDateAString(resultado.getDate(11));
                
                //cambiar Date a String
                empleado = new Empleado(resultado.getInt(1), dv, resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), resultado.getInt(7), resultado.getString(8), resultado.getString(9), fecha_Nacimiento, fecha_ingreso, resultado.getInt(12), resultado.getInt(13), resultado.getInt(14), resultado.getInt(15));
                
                listadoEmpleados.add(empleado);
            }
            prepararConsulta.close();
            
        }catch (SQLException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listadoEmpleados;
        
    }
    
    
}//FIN public class EmpleadoDao {
