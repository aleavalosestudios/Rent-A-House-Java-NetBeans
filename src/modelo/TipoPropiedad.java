/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aleja
 */
public class TipoPropiedad {
    private char id_tipo_propiedad;
    private String desc_tipo_propiedad;

    public TipoPropiedad(char id_tipo_propiedad, String desc_tipo_propiedad) {
        this.id_tipo_propiedad = id_tipo_propiedad;
        this.desc_tipo_propiedad = desc_tipo_propiedad;
    }

    public char getId_tipo_propiedad() {
        return id_tipo_propiedad;
    }

    public void setId_tipo_propiedad(char id_tipo_propiedad) {
        this.id_tipo_propiedad = id_tipo_propiedad;
    }

    public String getDesc_tipo_propiedad() {
        return desc_tipo_propiedad;
    }

    public void setDesc_tipo_propiedad(String desc_tipo_propiedad) {
        this.desc_tipo_propiedad = desc_tipo_propiedad;
    }
    
    
}
