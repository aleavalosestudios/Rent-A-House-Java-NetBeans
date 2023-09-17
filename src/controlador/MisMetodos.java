/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Empleado;

/**
 *
 * @author aleja
 */
public class MisMetodos {
    
    public static void abrirVentana(javax.swing.JFrame Ventana, String tituloVentana){
        
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setTitle(tituloVentana);
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public static void limpiarTabla(javax.swing.JTable nombreTabla){
        DefaultTableModel tabla = (DefaultTableModel)nombreTabla.getModel();
        
        int filas = nombreTabla.getRowCount();
        for (int i = 0; i < filas; i++) {
            tabla.removeRow(tabla.getRowCount()-1);
        }
    }
    
    public static void limpiarInputs(javax.swing.JPanel nombrePanel){
        JTextField input;
        
        for (int i = 0; i < nombrePanel.getComponentCount(); i++) {
            if(nombrePanel.getComponent(i).getName().equals("javax.swing.JTextField")){
                input = (JTextField)nombrePanel.getComponent(i);
                input.setText("");
            }            
        }
    }
    
    public static void limpiarComboBox(javax.swing.JComboBox<String> nombreCombobox){
        nombreCombobox.setSelectedIndex(0);
    }
    
    public static String transformarDeDateAString(java.sql.Date fecha){
        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyy-MM-dd");
        
        String fechaString = formatoFecha.format(fecha);
        
        return fechaString;
    }
    
    public java.sql.Date transformarDeStringADate(String fecha){
        java.text.SimpleDateFormat formatoDate = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
                
        try {
            utilDate = formatoDate.parse(fecha);
                       
        } catch (ParseException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //retorna la nueva fecha en formato String;
        return new java.sql.Date(utilDate.getTime());
    }
    
    //Analizar la forma de llenar los combobox y la seleccion de este
    
    //Controladores de valores Null
    
    //validador de Valores en inputs
    
    //Validador de Rut travez de modulo 11
    public static boolean validadorRut(int numrut, char dv){
        char dv2;
        int modulo,sumaNumerosRut = 0, division11, diferencia, largoRut, digitoverificador;
        boolean resultado;
        
        String rutString = String.valueOf(numrut);
        largoRut = rutString.length();
        
        for (int i = 0,j=2 ; i < largoRut; i++,j++) {
            modulo = numrut%10;
            numrut = numrut/10;
            if(j > 7 ){
                j = 2;
            }
            sumaNumerosRut += modulo*j;
        }
        division11 = sumaNumerosRut/11;
        diferencia = sumaNumerosRut - division11*11;
        
        if(diferencia < 0){ 
            diferencia = diferencia*(-1);
        }
        digitoverificador = 11-diferencia;
        
        if(digitoverificador == 11){
            dv2 = '0';
        }else{
            if(digitoverificador == 10){
                dv2 = 'K';
            }else{
                dv2 = String.valueOf(digitoverificador).charAt(0);
            }
        }            
        resultado = dv == dv2;
        return  resultado;
    }
    
    
    //Metodo que recive como parametro un comboBox y una lista de objetos
    //LLenara un combo box con los valores String de un objeto.
    //creado para llenar un comboBox desde una base de datos con un ID numerico
    //y una descripcion de tipo String
    public void llenadoComboBox(javax.swing.JComboBox<String> nombreCombobox, ArrayList<?> listadoCombobox){
        
        try{
            nombreCombobox.removeAllItems();

            for(Object object : listadoCombobox){
                //Obtener la clase del objto dentro de la lista
                Class<?> clase = object.getClass();
                //obtener el nombre de los atributos de la clase
                Field[] atributosClase = clase.getDeclaredFields();

                //Recorrer los atributos
                for (int i = 0; i < atributosClase.length; i++) {
                    
                    //comparar si los atributos pueden ser traspasado a String
                    if(String.class.isAssignableFrom(atributosClase[i].getType())){
                        //obtener el nombre del atributo
                        Field atributo = clase.getDeclaredField(atributosClase[i].getName());
                        //hacer accesible al atributo
                        atributo.setAccessible(true);
                        //Agregar el atributo a un combobox
                        nombreCombobox.addItem(String.valueOf(atributo.get(object)));
                    }
                }
            }
        }catch(NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
