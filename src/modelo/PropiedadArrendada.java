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
public class PropiedadArrendada {
    private int nro_propiedad;
    private String fecini_arriendo;
    private String fecter_arriendo;
    private int numrut_cli;

    public PropiedadArrendada(int nro_propiedad, String fecini_arriendo, String fecter_arriendo, int numrut_cli) {
        this.nro_propiedad = nro_propiedad;
        this.fecini_arriendo = fecini_arriendo;
        this.fecter_arriendo = fecter_arriendo;
        this.numrut_cli = numrut_cli;
    }

    public int getNro_propiedad() {
        return nro_propiedad;
    }

    public void setNro_propiedad(int nro_propiedad) {
        this.nro_propiedad = nro_propiedad;
    }

    public String getFecini_arriendo() {
        return fecini_arriendo;
    }

    public void setFecini_arriendo(String fecini_arriendo) {
        this.fecini_arriendo = fecini_arriendo;
    }

    public String getFecter_arriendo() {
        return fecter_arriendo;
    }

    public void setFecter_arriendo(String fecter_arriendo) {
        this.fecter_arriendo = fecter_arriendo;
    }

    public int getNumrut_cli() {
        return numrut_cli;
    }

    public void setNumrut_cli(int numrut_cli) {
        this.numrut_cli = numrut_cli;
    }
    
    //creacion de metodos
    //metodos para fechas de String a date
    public java.sql.Date transformarDeStringADate(String fecha_arr){
        java.text.SimpleDateFormat formatoDate = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
                
        try {
            utilDate = formatoDate.parse(fecha_arr);
                       
        } catch (ParseException ex) {
            Logger.getLogger(PropiedadArrendada.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //retorna la nueva fecha en formato String;
        return new java.sql.Date(utilDate.getTime());
    }
}
