/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aleja
 */
public class Propiedad {
    private int nro_propiedad;
    private String direccion_propiedad;
    private float superficie;
    private int nro_dormitorios;
    private int nro_banos;
    private int valor_arriendo;
    private int valor_gasto_comun;
    private char id_tipo_propiedad;
    private int id_comuna;
    private int numrut_prop;
    private int numrut_emp;

    public Propiedad(int nro_propiedad, String direccion_propiedad, float superficie, int nro_dormitorios, int nro_banos, int valor_arriendo, int valor_gasto_comun, char id_tipo_propiedad, int id_comuna, int numrut_prop, int numrut_emp) {
        this.nro_propiedad = nro_propiedad;
        this.direccion_propiedad = direccion_propiedad;
        this.superficie = superficie;
        this.nro_dormitorios = nro_dormitorios;
        this.nro_banos = nro_banos;
        this.valor_arriendo = valor_arriendo;
        this.valor_gasto_comun = valor_gasto_comun;
        this.id_tipo_propiedad = id_tipo_propiedad;
        this.id_comuna = id_comuna;
        this.numrut_prop = numrut_prop;
        this.numrut_emp = numrut_emp;
    }

    public int getNro_propiedad() {
        return nro_propiedad;
    }

    public void setNro_propiedad(int nro_propiedad) {
        this.nro_propiedad = nro_propiedad;
    }

    public String getDireccion_propiedad() {
        return direccion_propiedad;
    }

    public void setDireccion_propiedad(String direccion_propiedad) {
        this.direccion_propiedad = direccion_propiedad;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public int getNro_dormitorios() {
        return nro_dormitorios;
    }

    public void setNro_dormitorios(int nro_dormitorios) {
        this.nro_dormitorios = nro_dormitorios;
    }

    public int getNro_banos() {
        return nro_banos;
    }

    public void setNro_banos(int nro_banos) {
        this.nro_banos = nro_banos;
    }

    public int getValor_arriendo() {
        return valor_arriendo;
    }

    public void setValor_arriendo(int valor_arriendo) {
        this.valor_arriendo = valor_arriendo;
    }

    public int getValor_gasto_comun() {
        return valor_gasto_comun;
    }

    public void setValor_gasto_comun(int valor_gasto_comun) {
        this.valor_gasto_comun = valor_gasto_comun;
    }

    public char getId_tipo_propiedad() {
        return id_tipo_propiedad;
    }

    public void setId_tipo_propiedad(char id_tipo_propiedad) {
        this.id_tipo_propiedad = id_tipo_propiedad;
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public int getNumrut_prop() {
        return numrut_prop;
    }

    public void setNumrut_prop(int numrut_prop) {
        this.numrut_prop = numrut_prop;
    }

    public int getNumrut_emp() {
        return numrut_emp;
    }

    public void setNumrut_emp(int numrut_emp) {
        this.numrut_emp = numrut_emp;
    }
    
    
}
