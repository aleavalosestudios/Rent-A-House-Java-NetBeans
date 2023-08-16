/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aleja
 */
public class Propietario {
    private int numrut_prop;
    private char dvrut_prop;
    private String appaterno_prop;
    private String apmaterno_prop;
    private String nombre_prop;
    private String direccion_prop;
    private int id_estcivil;
    private String fonofijo_prop;
    private String celular_prop;
    private int id_comuna;

    public Propietario(int numrut_prop, char dvrut_prop, String appaterno_prop, String apmaterno_prop, String nombre_prop, String direccion_prop, int id_estcivil, String fonofijo_prop, String celular_prop, int id_comuna) {
        this.numrut_prop = numrut_prop;
        this.dvrut_prop = dvrut_prop;
        this.appaterno_prop = appaterno_prop;
        this.apmaterno_prop = apmaterno_prop;
        this.nombre_prop = nombre_prop;
        this.direccion_prop = direccion_prop;
        this.id_estcivil = id_estcivil;
        this.fonofijo_prop = fonofijo_prop;
        this.celular_prop = celular_prop;
        this.id_comuna = id_comuna;
    }

    public int getNumrut_prop() {
        return numrut_prop;
    }

    public void setNumrut_prop(int numrut_prop) {
        this.numrut_prop = numrut_prop;
    }

    public char getDvrut_prop() {
        return dvrut_prop;
    }

    public void setDvrut_prop(char dvrut_prop) {
        this.dvrut_prop = dvrut_prop;
    }

    public String getAppaterno_prop() {
        return appaterno_prop;
    }

    public void setAppaterno_prop(String appaterno_prop) {
        this.appaterno_prop = appaterno_prop;
    }

    public String getApmaterno_prop() {
        return apmaterno_prop;
    }

    public void setApmaterno_prop(String apmaterno_prop) {
        this.apmaterno_prop = apmaterno_prop;
    }

    public String getNombre_prop() {
        return nombre_prop;
    }

    public void setNombre_prop(String nombre_prop) {
        this.nombre_prop = nombre_prop;
    }

    public String getDireccion_prop() {
        return direccion_prop;
    }

    public void setDireccion_prop(String direccion_prop) {
        this.direccion_prop = direccion_prop;
    }

    public int getId_estcivil() {
        return id_estcivil;
    }

    public void setId_estcivil(int id_estcivil) {
        this.id_estcivil = id_estcivil;
    }

    public String getFonofijo_prop() {
        return fonofijo_prop;
    }

    public void setFonofijo_prop(String fonofijo_prop) {
        this.fonofijo_prop = fonofijo_prop;
    }

    public String getCelular_prop() {
        return celular_prop;
    }

    public void setCelular_prop(String celular_prop) {
        this.celular_prop = celular_prop;
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }
    
    
}
