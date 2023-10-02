/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author aleja
 */
public class MisMetodos {
    
    
    //Método para contar Atributos de un objeto usando Reflexion.
    
    public static int contarAtributosObjeto(Object objeto) {
        // Obtener la clase del objeto
        Class<?> clase = objeto.getClass();        
        // Obtener todos los campos (atributos) de la clase
        Field[] atributos = clase.getDeclaredFields();
        // Contar la cantidad de campos
        return atributos.length;
    }
    
    //Método para obtener el tipo de datos de los Atributos de un objeto usando Reflexion
    public static AnnotatedType tiposdeDatosAtributosObjeto(Object objeto) {
        int cantidadAtributos;

        // Obtener la clase del objeto
        Class<?> clase = objeto.getClass();       
        // Obtener todos los campos (atributos) de la clase
        Field[] campos = clase.getDeclaredFields();
        cantidadAtributos = campos.length;
        //arreglo para almacenar el tipo de dato de cada atributo del objeto
        AnnotatedType[] tipoAtributos = new AnnotatedType[cantidadAtributos];
        
        for (int i = 0; i < cantidadAtributos; i++) {
            tipoAtributos[i] = campos[i].getAnnotatedType();
        }
        // Enviar los tipos de Atributos en un Array de tipo AnnotatedType
        return tipoAtributos[campos.length];
    }
    
    /////////////////////////////////////////////////////////////////////////////////
//METODOS PARA TABLAS

    public void tablaLimpiar(JTable nombreTabla) {
        // Obtener el modelo de tabla (DefaultTableModel) asociado a la tabla
        DefaultTableModel dtm = (DefaultTableModel) nombreTabla.getModel();
        // Obtener el número de filas en la tabla
        int n = nombreTabla.getRowCount();
        // Eliminar cada fila de la tabla
        for (int i = 0; i < n; i++) {
            // Elimina la última fila en cada iteración
            dtm.removeRow(dtm.getRowCount() - 1);
        }
    }
    
    public void tablaCentrarDatos(JTable nombreTabla) {
        // Crear un renderizador de celdas para centrar el contenido
        DefaultTableCellRenderer centrarTabla = new DefaultTableCellRenderer();
        centrarTabla.setHorizontalAlignment(JLabel.CENTER);

        // Iterar a través de todas las columnas de la tabla
        for (int i = 0; i < nombreTabla.getColumnCount(); i++) {
            // Establecer el renderizador de celdas centradas para cada columna
            nombreTabla.getColumnModel().getColumn(i).setCellRenderer(centrarTabla);
        }
    }
    
    
    
    
    
}


