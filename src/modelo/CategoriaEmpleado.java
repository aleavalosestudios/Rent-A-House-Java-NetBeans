/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aleja
 */
public class CategoriaEmpleado {
    
    private int id_categoria_emp;
    private String desc_categoria_emp;

    public CategoriaEmpleado(int id_categoria_emp, String desc_categoria_emp) {
        this.id_categoria_emp = id_categoria_emp;
        this.desc_categoria_emp = desc_categoria_emp;
    }

    public int getId_categoria_emp() {
        return id_categoria_emp;
    }

    public void setId_categoria_emp(int id_categoria_emp) {
        this.id_categoria_emp = id_categoria_emp;
    }

    public String getDesc_categoria_emp() {
        return desc_categoria_emp;
    }

    public void setDesc_categoria_emp(String desc_categoria_emp) {
        this.desc_categoria_emp = desc_categoria_emp;
    }
    
    
    
}
