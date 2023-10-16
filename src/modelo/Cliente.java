package modelo;

import java.awt.Component;
import java.util.ArrayList;
import vista.PanelIngresarCliente;

public class Cliente {
    private int numrut_cli;
    private char dvrut_cli;
    private String appaterno_cli;
    private String apmaterno_cli;
    private String nombre_cli;
    private String direccion_cli;
    private int id_estcivil;
    private int fonofijo_cli;
    private int celular_cli;
    private int renta_cli;

    public Cliente(int numrut_cli, char dvrut_cli, String appaterno_cli, String apmaterno_cli, String nombre_cli, String direccion_cli, int id_estcivil, int fonofijo_cli, int celular_cli, int renta_cli) {
        this.numrut_cli = numrut_cli;
        this.dvrut_cli = dvrut_cli;
        this.appaterno_cli = appaterno_cli;
        this.apmaterno_cli = apmaterno_cli;
        this.nombre_cli = nombre_cli;
        this.direccion_cli = direccion_cli;
        this.id_estcivil = id_estcivil;
        this.fonofijo_cli = fonofijo_cli;
        this.celular_cli = celular_cli;
        this.renta_cli = renta_cli;
    }

    public int getNumrut_cli() {
        return numrut_cli;
    }

    public void setNumrut_cli(int numrut_cli) {
        this.numrut_cli = numrut_cli;
    }

    public char getDvrut_cli() {
        return dvrut_cli;
    }

    public void setDvrut_cli(char dvrut_cli) {
        this.dvrut_cli = dvrut_cli;
    }

    public String getAppaterno_cli() {
        return appaterno_cli;
    }

    public void setAppaterno_cli(String appaterno_cli) {
        this.appaterno_cli = appaterno_cli;
    }

    public String getApmaterno_cli() {
        return apmaterno_cli;
    }

    public void setApmaterno_cli(String apmaterno_cli) {
        this.apmaterno_cli = apmaterno_cli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getDireccion_cli() {
        return direccion_cli;
    }

    public void setDireccion_cli(String direccion_cli) {
        this.direccion_cli = direccion_cli;
    }

    public int getId_estcivil() {
        return id_estcivil;
    }

    public void setId_estcivil(int id_estcivil) {
        this.id_estcivil = id_estcivil;
    }

    public int getFonofijo_cli() {
        return fonofijo_cli;
    }

    public void setFonofijo_cli(int fonofijo_cli) {
        this.fonofijo_cli = fonofijo_cli;
    }

    public int getCelular_cli() {
        return celular_cli;
    }

    public void setCelular_cli(int celular_cli) {
        this.celular_cli = celular_cli;
    }

    public int getRenta_cli() {
        return renta_cli;
    }

    public void setRenta_cli(int renta_cli) {
        this.renta_cli = renta_cli;
    }
    
    //Creacion de metodos
    
    //Validador de rut
    
    
}//fin public class Cliente
