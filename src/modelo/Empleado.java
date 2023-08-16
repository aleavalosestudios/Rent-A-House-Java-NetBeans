/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleja
 */
public class Empleado {
    
    private int numrut_emp;
    private char dvrut_emp;
    private String appaterno_emp;
    private String apmaterno_emp;
    private String nombre_emp;
    private String direccion_emp;
    private int id_estcivil;
    private String fonofijo_emp;
    private String celular_emp;
    private String fecnac_emp; //debe ser formato yyyy-mm-dd
    private String fecing_emp;
    private int sueldo_emp;
    private int id_comuna;
    private int id_categoria_emp;
    private int numrut_supervisor;

    public Empleado(int numrut_emp, char dvrut_emp, String appaterno_emp, String apmaterno_emp, String nombre_emp, String direccion_emp, int id_estcivil, String fonofijo_emp, String celular_emp, String fecnac_emp, String fecing_emp, int sueldo_emp, int id_comuna, int id_categoria_emp, int numrut_supervisor) {
        this.numrut_emp = numrut_emp;
        this.dvrut_emp = dvrut_emp;
        this.appaterno_emp = appaterno_emp;
        this.apmaterno_emp = apmaterno_emp;
        this.nombre_emp = nombre_emp;
        this.direccion_emp = direccion_emp;
        this.id_estcivil = id_estcivil;
        this.fonofijo_emp = fonofijo_emp;
        this.celular_emp = celular_emp;
        this.fecnac_emp = fecnac_emp;
        this.fecing_emp = fecing_emp;
        this.sueldo_emp = sueldo_emp;
        this.id_comuna = id_comuna;
        this.id_categoria_emp = id_categoria_emp;
        this.numrut_supervisor = numrut_supervisor;
    }

    public int getNumrut_emp() {
        return numrut_emp;
    }

    public void setNumrut_emp(int numrut_emp) {
        this.numrut_emp = numrut_emp;
    }

    public char getDvrut_emp() {
        return dvrut_emp;
    }

    public void setDvrut_emp(char dvrut_emp) {
        this.dvrut_emp = dvrut_emp;
    }

    public String getAppaterno_emp() {
        return appaterno_emp;
    }

    public void setAppaterno_emp(String appaterno_emp) {
        this.appaterno_emp = appaterno_emp;
    }

    public String getApmaterno_emp() {
        return apmaterno_emp;
    }

    public void setApmaterno_emp(String apmaterno_emp) {
        this.apmaterno_emp = apmaterno_emp;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getDireccion_emp() {
        return direccion_emp;
    }

    public void setDireccion_emp(String direccion_emp) {
        this.direccion_emp = direccion_emp;
    }

    public int getId_estcivil() {
        return id_estcivil;
    }

    public void setId_estcivil(int id_estcivil) {
        this.id_estcivil = id_estcivil;
    }

    public String getFonofijo_emp() {
        return fonofijo_emp;
    }

    public void setFonofijo_emp(String fonofijo_emp) {
        this.fonofijo_emp = fonofijo_emp;
    }

    public String getCelular_emp() {
        return celular_emp;
    }

    public void setCelular_emp(String celular_emp) {
        this.celular_emp = celular_emp;
    }

    public String getFecnac_emp() {
        return fecnac_emp;
    }

    public void setFecnac_emp(String fecnac_emp) {
        this.fecnac_emp = fecnac_emp;
    }

    public String getFecing_emp() {
        return fecing_emp;
    }

    public void setFecing_emp(String fecing_emp) {
        this.fecing_emp = fecing_emp;
    }

    public int getSueldo_emp() {
        return sueldo_emp;
    }

    public void setSueldo_emp(int sueldo_emp) {
        this.sueldo_emp = sueldo_emp;
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public int getId_categoria_emp() {
        return id_categoria_emp;
    }

    public void setId_categoria_emp(int id_categoria_emp) {
        this.id_categoria_emp = id_categoria_emp;
    }

    public int getNumrut_supervisor() {
        return numrut_supervisor;
    }

    public void setNumrut_supervisor(int numrut_supervisor) {
        this.numrut_supervisor = numrut_supervisor;
    }
    
    //creacion de metodos
    
    //Verificador de rut
    
    public boolean verificadorDeRut( int numrut_emp, char dvrut_emp ){
        boolean resultado = true;
        
        
        
        
        return resultado;
    }
    
    //pasar fecha de String a date
    public java.sql.Date transformarDeStringADate(String fecha_emp){
        java.text.SimpleDateFormat formatoDate = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
                
        try {
            utilDate = formatoDate.parse(fecha_emp);
                       
        } catch (ParseException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //retorna la nueva fecha en formato String;
        return new java.sql.Date(utilDate.getTime());
    }
    
    
}
