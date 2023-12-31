/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableCellRenderer;
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
    
    public static void panelCentrar(javax.swing.JPanel panelVentanas, javax.swing.JPanel panelACentrar) {
        panelVentanas.removeAll();
        
        GridBagConstraints gbc = new GridBagConstraints();
        panelVentanas.setLayout(new GridBagLayout());

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.CENTER;

        panelVentanas.add(panelACentrar, gbc);
        panelVentanas.revalidate();
        panelVentanas.repaint();
    }
    
    //Este Metodo inicializa todos los labels de los campos vacios, dejandolos no visibles, JTextField.setVisible(false)
    public static void panelCamposErrorInicializador(javax.swing.JPanel nombrePanel){        
        for (int i = 0; i < nombrePanel.getComponentCount(); i++) {
            boolean clasePanelEsJlabel = nombrePanel.getComponent(i).getClass().getName().equals("javax.swing.JLabel");
            boolean nombreComponenteNoVacio = nombrePanel.getComponent(i).getName() != null;  
            boolean nombreComponenteContieneError = nombrePanel.getComponent(i).getName().contains("Error");  
            
            
            if (clasePanelEsJlabel && nombreComponenteNoVacio && nombreComponenteContieneError) {
                nombrePanel.getComponent(i).setVisible(false);
            }            
        }        
    }
    
    
    //Metodo que limpia Componentes del panel (inputs, combobox, etc.) cuando hay mas de un panel en el mismo sector
    //Y si es el mismo panel al que se le quiere limpiar los imputs.
    //se debe reemplazar nombrePanel por 'this'
    //se debe establecer el nombre de la variable en las propiedad name
    public static void panelLimpiarComponentes(javax.swing.JPanel nombrePanel){
        JTextField input;
        JComboBox comboBox;
        for (int i = 0; i < nombrePanel.getComponentCount(); i++) {
            if(nombrePanel.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                input = (JTextField)nombrePanel.getComponent(i);
                input.setText("");
            }
            
            if(nombrePanel.getComponent(i).getClass().getName().equals("javax.swing.JComboBox")){
                comboBox = (JComboBox)nombrePanel.getComponent(i);
                comboBox.setSelectedIndex(0);
            }        
        }
        
    }
    
    //comboboxLLenado(javax.swing.JComboBox<String> nombreCombobox, ArrayList<?> listadoCombobox)
    //Metodo que recive como parametro un comboBox y una lista de objetos
    //LLenara un combo box con los valores String de un objeto.
    //creado para llenar un comboBox desde una base de datos con un ID numerico
    //y una descripcion de tipo String
    public static void comboboxLLenado(javax.swing.JComboBox<String> nombreCombobox, ArrayList<?> listadoCombobox){        
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
    
    //Este metodo cambia la seleccion de la descripcion de un comboCombobo y retorna el id
    //de la seleccion del combobox. Siempre y cuando el array que ingresa a la funcion contenga
    //un objeto y el primer atributo de este objeto sea de tipo INT, 
    //Se usa un array ya que el retorno de buscarDao es un ArrayList
    public static int comboBoxBuscarSeleccion(ArrayList<?> listadoBuscarDao) {
        // Inicializa la variable 'id' con el valor 0.
        int id = 0;
        try {
            // Obtiene el primer objeto de la lista.
            Object objeto = listadoBuscarDao.get(0);
            // Obtiene la clase (tipo) del objeto.
            Class<?> clase = objeto.getClass();
            // Obtiene un arreglo de campos (atributos) declarados en la clase del objeto.
            Field[] atributosClase = objeto.getClass().getDeclaredFields();
            // Obtiene el primer campo (atributo) en la clase del objeto.
            Field atributo = clase.getDeclaredField(atributosClase[0].getName());
            // Hace que el campo (atributo) sea accesible, incluso si es privado.
            atributo.setAccessible(true);
            // Obtiene el valor del campo (atributo) en el objeto.
            id = atributo.getInt(objeto);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
        // Retorna el valor de 'id', que puede haber cambiado si se encontró un atributo válido.
        return id;
    }    
    
    //###################FECHAS###################

    public static String transformarDeDateAString(java.sql.Date fecha){
        java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("yyyy-MM-dd");
        
        String fechaString = formatoFecha.format(fecha);
        
        return fechaString;
    }
    
    
    public static java.sql.Date transformarDeStringADate(String fecha){
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
    
    public static boolean esFechaValida(String fecha){
        java.text.SimpleDateFormat formatoDate = new java.text.SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate;                
        try {
            utilDate = formatoDate.parse(fecha);
            return true;
        } catch (ParseException ex) {
            //Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }
    
    public static boolean fechaExisteNoValido(ArrayList<Component> listadoinputsFechas){
        javax.swing.JTextField inputFecha;
        Component fecha;
        for (int i = 0; i < listadoinputsFechas.size(); i++) {
            fecha = listadoinputsFechas.get(i);
            inputFecha = (javax.swing.JTextField)fecha;
            
            if(!esFechaValida(inputFecha.getText())){
                return false;
            }
            
        }
        return true;
    }
    
    public static void fechasListadoModificador(ArrayList<Component> listadoinputsFechas, ArrayList<Component> listadolabelErrorFechas){
        Component fechaInput;
        javax.swing.JTextField fechaTextField;
        String nombreFechaInput;
        
        Component labelError;
        String nombreLabelError;
        javax.swing.JLabel label;
        
        for (int i = 0; i < listadoinputsFechas.size(); i++) {
            fechaInput = listadoinputsFechas.get(i);
            fechaTextField = (javax.swing.JTextField)fechaInput;

            fechaInput = listadoinputsFechas.get(i);
            nombreFechaInput = fechaInput.getName().substring(5);
            
            if(esFechaValida(fechaTextField.getText())){
        
                for (int j = 0; j < listadolabelErrorFechas.size(); j++) {
                    labelError = listadolabelErrorFechas.get(i);
                    label = (javax.swing.JLabel)labelError;
                    nombreLabelError = label.getName();
                        
                    if(nombreLabelError.contains(nombreFechaInput)){
                        labelMensajeValidacion(label, "Ok", "Ok");
                    }
                }
            }else{
                for (int j = 0; j < listadolabelErrorFechas.size(); j++) {
                    labelError = listadolabelErrorFechas.get(i);
                    label = (javax.swing.JLabel)labelError;
                    nombreLabelError = label.getName();
                    
                    if(nombreLabelError.contains(nombreFechaInput)){
                        labelMensajeValidacion(label, "Fecha debe ser yyyy/MM/dd", "error");                 
                    }
                }
            }       
        }
    }
        
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
        
 //Método para contar Atributos de un objeto usando Reflexion.
    public static int objetoContarAtributos(Object objeto) {
        // Obtener la clase del objeto
        Class<?> clase = objeto.getClass();        
        // Obtener todos los campos (atributos) de la clase
        Field[] atributos = clase.getDeclaredFields();
        // Contar la cantidad de campos
        return atributos.length;
    }
    
    //Método para obtener el tipo de datos de los Atributos de un objeto usando Reflexion
    public static AnnotatedType objetoTiposdeDatosAtributos(Object objeto) {
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
    
    public static boolean existeBusqueda(ArrayList<?> listadoObjetos){
        boolean resultado = true;
                
        if(listadoObjetos.isEmpty()){
            return false;
        }
        return resultado;
    }
    /////////////////////////////////////////////////////////////////////////////////
//METODOS PARA TABLAS

    public static void tablaLimpiar(JTable nombreTabla) {
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
    
    public static void tablaCentrarDatos(JTable nombreTabla) {
        // Crear un renderizador de celdas para centrar el contenido
        DefaultTableCellRenderer centrarTabla = new DefaultTableCellRenderer();
        centrarTabla.setHorizontalAlignment(JLabel.CENTER);

        // Iterar a través de todas las columnas de la tabla
        for (int i = 0; i < nombreTabla.getColumnCount(); i++) {
            // Establecer el renderizador de celdas centradas para cada columna
            nombreTabla.getColumnModel().getColumn(i).setCellRenderer(centrarTabla);
        }
    }
    
    
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
        return tipoAtributos[campos.length-1];
    }
    
    /////////////////////////////////////////////////////////////////////////////////
//METODOS PARA TABLAS

    
    public static void labelMensajeValidacion(javax.swing.JLabel Label, String MensajeLabel, String tipo){
        if (tipo == "error"){
            Label.setVisible(true);
            Label.setText(MensajeLabel);
            Label.setForeground(Color.red);
        }else{
            Label.setVisible(true);
            Label.setText(MensajeLabel);
            Label.setForeground(Color.green);
        }
    } 
    
    public static ArrayList<Component> panelLabelErrorListado(javax.swing.JPanel nombrePanel){
        
        ArrayList<Component> listaLabels = new ArrayList();
        
        for (int i = 0; i < nombrePanel.getComponentCount(); i++) {
            if(nombrePanel.getComponent(i).getName() != null && nombrePanel.getComponent(i).getName().contains("Error")){
                listaLabels.add(nombrePanel.getComponent(i));
            }
        }
        return listaLabels;
        
    }
    
    public static ArrayList<Component> panelInputsErrorListado(javax.swing.JPanel nombrePanel){
        
        ArrayList<Component> listaInputs = new ArrayList();
        
        for (int i = 0; i < nombrePanel.getComponentCount(); i++) {
            if(nombrePanel.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                listaInputs.add(nombrePanel.getComponent(i));
            }
        }
        return listaInputs;
        
    }
    
    
    //####################Validadores de datos not null;
    
    public static boolean InputExisteVacio(ArrayList<Component> listaInputs){
        Component componente;
        JTextField field;
        
        for (int i = 0; i < listaInputs.size(); i++) {
            componente = listaInputs.get(i);
            field = (javax.swing.JTextField)componente;
            
            if(field.getText().isEmpty()){
                return true;
            }   
        }
        return false;
    }
    
    public static void inputsNoPuedenEstarVacios(ArrayList<Component> listaLabelError,ArrayList<Component> listaInputs){        
        Component componenteInput;
        Component componentelabel;
        Component componenteInput2;
        Component componentelabel2;
        JTextField input;
        String nombreInput;
        JLabel label;
        String nombreLabel;
        JLabel label2;
        String nombreLabel2;
        for (int i = 0; i < listaInputs.size(); i++) {
            componenteInput = listaInputs.get(i);
            input = (javax.swing.JTextField)componenteInput;
            //Quitar las primeras 5 letras del nombre de input
            nombreInput = (input.getName()).substring(5);

            if((input.getText()).isEmpty()|| (input.getText())==""){
                for(int j = 0; j < listaLabelError.size(); j++){
                    componentelabel = listaLabelError.get(j);
                    label = (javax.swing.JLabel)componentelabel;
                    nombreLabel = label.getName();
                    if(nombreLabel.contains(nombreInput)){
                        labelMensajeValidacion(label, "Campo no puede ser vacio", "error");
                    }
                }             
            }else{
                for(int h = 0; h < listaLabelError.size(); h++){
                    componentelabel2 = listaLabelError.get(h);
                    label2 = (javax.swing.JLabel)componentelabel2;
                    nombreLabel2 = label2.getName();

                    if(nombreLabel2.contains(nombreInput)){
                        labelMensajeValidacion(label2, "Ok", "ok");
                    }
                }//Fin for
            }//fin Else
        }//Fin for
    }
    
    //##################################Validador numerico
    public static boolean inputNumeroEntero(javax.swing.JTextField input){

        try{
            int numero = Integer.parseInt(input.getText());
            
            return true;

        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean inputNumeroFlotante(JTextField input){
        
        try{
            float numero = Float.parseFloat(input.getText());               
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    
    public static boolean inputListadoNumeroNoValido(ArrayList<Component> listadoInputsNumeros){
        boolean resultado = false;
        Component componente;
        javax.swing.JTextField input;
            for (int i = 0; i < listadoInputsNumeros.size(); i++) {
                componente = listadoInputsNumeros.get(i);
                input = (javax.swing.JTextField)componente;
                if(inputNumeroEntero(input)){
                    resultado = false;
                }else{                   
                    return true;
                }    
            }
        return resultado;       
    }
    
    public static void InputsExisteNumeroNoValido(ArrayList<Component> listadoInputsNumericos, ArrayList<Component> listadoLabelError){
        
        Component componenteinput;
        Component componenteLabel;
        Component componenteLabel2;
        
        JTextField input;
        String nombreInput;
        
        JLabel label;
        String nombreLabel;
        JLabel label2;
        String nombreLabel2;
        //Recorrer inputs
        for (int i = 0; i < listadoInputsNumericos.size(); i++) {
            
            componenteinput = listadoInputsNumericos.get(i);
            input = (javax.swing.JTextField)componenteinput;
            //Obtener nombreInput y quitar la palabrainput
            nombreInput = input.getName().substring(5);
            //Validar si el input es numero Entero
            if(inputNumeroEntero(input)){
                //Recorrer LabelError
                for (int j = 0; j < listadoLabelError.size(); j++) {
                    componenteLabel = listadoLabelError.get(i);
                    //Obtener Label
                    
                    label = (javax.swing.JLabel)componenteLabel;
                    //Obtener nombre Label
                    nombreLabel = label.getName();
                    //Comparar nombreLabel con nombreInput
                    if(nombreLabel.contains(nombreInput)){
                        labelMensajeValidacion(label, "Ok", "Ok");
                    }
                }
            }else{
                
                for (int h = 0; h < listadoLabelError.size(); h++) {
                    componenteLabel2 = listadoLabelError.get(h);
                    //Obtener Label
                    label2= (javax.swing.JLabel)componenteLabel2;
                    //Obtener nombre Label
                    nombreLabel2 = label2.getName();
                    //Comparar nombreLabel con nombreInput
                    if(nombreLabel2.contains(nombreInput)){
                        labelMensajeValidacion(label2, "No Es Un Valor Numérico Entero", "error");
                    }
                }
            }
            
        }
    }
    
    //################################validador input char
    public static boolean inputEsChar(javax.swing.JTextField input){
        String contenidoInput = input.getText();
        return contenidoInput.length() == 1;
    }
    
    public static void ValidadorCharPermitido(char[] ArrayCharPermitido, javax.swing.JTextField input, javax.swing.JLabel labelError){
        
        if(!inputEsChar(input)){
            labelMensajeValidacion(labelError, "debe ingresar un solo valor", "error");
        }else{
            ArrayList<Character> listadoCharPermitido = new ArrayList<>();
            for(char c : ArrayCharPermitido){
                listadoCharPermitido.add(c);
            }
            char contenidoInput = input.getText().charAt(0);
            
            if(listadoCharPermitido.contains(contenidoInput)){
                labelMensajeValidacion(labelError, "OK", "ok");                
            }else{
                labelMensajeValidacion(labelError, "Valor no permitido", "error");
            }
        }
    }
    
    
}