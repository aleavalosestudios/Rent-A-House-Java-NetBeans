/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;


/**
 *
 * @author aleja
 */
public class MisMetodosDeObjetos {
    
    
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
}
