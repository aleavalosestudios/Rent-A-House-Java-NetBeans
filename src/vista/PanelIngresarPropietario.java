/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.EstadoCivilDao;
import controlador.MisMetodos;
import controlador.PropietarioDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.EstadoCivil;
import modelo.Propietario;

/**
 *
 * @author aleja
 */
public class PanelIngresarPropietario extends javax.swing.JPanel {
    Propietario propietario;
    PropietarioDao propietarioDao = new PropietarioDao();
    EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
    MisMetodos misMetodos = new MisMetodos();
    /**
     * Creates new form PanelIngresarPropietario
     */
    public PanelIngresarPropietario() {
        initComponents();
        misMetodos.comboboxLLenado(comboBoxEstadoCivil, estadoCivilDao.todosLosEstadoCivil());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputNombre_prop = new javax.swing.JTextField();
        labelNombre_prop = new javax.swing.JLabel();
        inputDireccion_prop = new javax.swing.JTextField();
        labelDireccion_prop = new javax.swing.JLabel();
        inputFonofijo_prop = new javax.swing.JTextField();
        labelId_estcivil = new javax.swing.JLabel();
        inputCelular_prop = new javax.swing.JTextField();
        labelFonofijo_prop = new javax.swing.JLabel();
        inputId_comuna = new javax.swing.JTextField();
        labelCelular_prop = new javax.swing.JLabel();
        btnIngresarNuevoPropietario = new javax.swing.JButton();
        labelId_Comuna = new javax.swing.JLabel();
        btnLimpiarIngresoNuevoPropietario = new javax.swing.JButton();
        inputNumrut_prop = new javax.swing.JTextField();
        labelNumrut_prop = new javax.swing.JLabel();
        inputDvrut_prop = new javax.swing.JTextField();
        comboBoxEstadoCivil = new javax.swing.JComboBox<>();
        labelDvrut_prop = new javax.swing.JLabel();
        inputAppaterno_prop = new javax.swing.JTextField();
        labelAppaterno_prop = new javax.swing.JLabel();
        inputApmaterno_prop = new javax.swing.JTextField();
        labelApmaterno_prop = new javax.swing.JLabel();

        inputNombre_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputNombre_prop.setText("Ingrese Nombre Propietario");

        labelNombre_prop.setText("Nombre Propietario");

        inputDireccion_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputDireccion_prop.setText("Ingrese Direccion Propietario");

        labelDireccion_prop.setText("Dirección Propietario");

        inputFonofijo_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputFonofijo_prop.setText("Ingrese Fono Fijo Propietario");

        labelId_estcivil.setText("Id Estado Civil");

        inputCelular_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputCelular_prop.setText("Ingrese Celular Propietario");

        labelFonofijo_prop.setText("Fono fijo Propietario");

        inputId_comuna.setForeground(new java.awt.Color(153, 153, 153));
        inputId_comuna.setText("Ingrese Id Comuna");

        labelCelular_prop.setText("Celular Propietario");

        btnIngresarNuevoPropietario.setText("Ingresar Nuevo Propietario");
        btnIngresarNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoPropietarioActionPerformed(evt);
            }
        });

        labelId_Comuna.setText("Id Comuna");

        btnLimpiarIngresoNuevoPropietario.setText("Limpiar");
        btnLimpiarIngresoNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIngresoNuevoPropietarioActionPerformed(evt);
            }
        });

        inputNumrut_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputNumrut_prop.setText("Ingrese Numero Rut Propietario");

        labelNumrut_prop.setText("Nro Rut Propietario");

        inputDvrut_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputDvrut_prop.setText("Ingrese DV Rut Propietario");

        labelDvrut_prop.setText("DV Rut Propietario");

        inputAppaterno_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputAppaterno_prop.setText("Ingrese Apellido Paterno");

        labelAppaterno_prop.setText("Apellido Paterno Propietario");

        inputApmaterno_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputApmaterno_prop.setText("Ingrese Apellido Materno");

        labelApmaterno_prop.setText("Apellido Materno Propietario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumrut_prop)
                            .addComponent(labelDvrut_prop)
                            .addComponent(labelAppaterno_prop)
                            .addComponent(labelApmaterno_prop)
                            .addComponent(labelNombre_prop)
                            .addComponent(labelDireccion_prop)
                            .addComponent(labelId_estcivil)
                            .addComponent(labelFonofijo_prop)
                            .addComponent(labelCelular_prop)
                            .addComponent(labelId_Comuna))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNumrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputDvrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCelular_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputId_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputAppaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputApmaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNombre_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputDireccion_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFonofijo_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnIngresarNuevoPropietario)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarIngresoNuevoPropietario)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumrut_prop)
                    .addComponent(inputNumrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDvrut_prop)
                    .addComponent(inputDvrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAppaterno_prop)
                    .addComponent(inputAppaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApmaterno_prop)
                    .addComponent(inputApmaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre_prop)
                    .addComponent(inputNombre_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion_prop)
                    .addComponent(inputDireccion_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId_estcivil)
                    .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFonofijo_prop)
                    .addComponent(inputFonofijo_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelular_prop)
                    .addComponent(inputCelular_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId_Comuna)
                    .addComponent(inputId_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarNuevoPropietario)
                    .addComponent(btnLimpiarIngresoNuevoPropietario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoPropietarioActionPerformed
        
        int numrut_Prop = Integer.parseInt(String.valueOf(inputNumrut_prop.getText()));

        ArrayList<Propietario> listadopropietario = propietarioDao.buscarPropietario(numrut_Prop);
        ArrayList<EstadoCivil> listadoEstadoCivil = estadoCivilDao.buscarEstadoCivil(String.valueOf(comboBoxEstadoCivil.getSelectedItem()));
        

        if(listadopropietario.isEmpty()){

            char dvrut_prop = String.valueOf(inputDvrut_prop.getText()).charAt(0);
            String appaterno_prop = String.valueOf(inputAppaterno_prop.getText());
            String apmaterno_prop = String.valueOf(inputApmaterno_prop.getText());
            String nombre_prop = String.valueOf(inputNombre_prop.getText());
            String direccion_prop = String.valueOf(inputDireccion_prop.getText());
            
            int id_estcivil = misMetodos.comboBoxBuscarSeleccion(listadoEstadoCivil);
            //int id_estcivil = buscarSeleccionComboboxEstadoCivil(String.valueOf(comboBoxEstadoCivil.getSelectedItem()));
            
            String fonofijo_prop = String.valueOf(inputFonofijo_prop.getText());
            String celular_prop = String.valueOf(inputCelular_prop.getText());
            int id_comuna = Integer.parseInt(String.valueOf(inputId_comuna.getText()));

            propietario = new Propietario(numrut_Prop, dvrut_prop, appaterno_prop, apmaterno_prop, nombre_prop, direccion_prop, id_estcivil, fonofijo_prop, celular_prop, id_comuna);

            propietarioDao.ingresarPropietario(propietario);

            JOptionPane.showMessageDialog(this,"Propietario Ingresado Correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Propietario Ya Existe");
        }

    }//GEN-LAST:event_btnIngresarNuevoPropietarioActionPerformed

    private void btnLimpiarIngresoNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIngresoNuevoPropietarioActionPerformed
        misMetodos.panelLimpiarComponentes(this);
    }//GEN-LAST:event_btnLimpiarIngresoNuevoPropietarioActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarNuevoPropietario;
    private javax.swing.JButton btnLimpiarIngresoNuevoPropietario;
    private javax.swing.JComboBox<String> comboBoxEstadoCivil;
    private javax.swing.JTextField inputApmaterno_prop;
    private javax.swing.JTextField inputAppaterno_prop;
    private javax.swing.JTextField inputCelular_prop;
    private javax.swing.JTextField inputDireccion_prop;
    private javax.swing.JTextField inputDvrut_prop;
    private javax.swing.JTextField inputFonofijo_prop;
    private javax.swing.JTextField inputId_comuna;
    private javax.swing.JTextField inputNombre_prop;
    private javax.swing.JTextField inputNumrut_prop;
    private javax.swing.JLabel labelApmaterno_prop;
    private javax.swing.JLabel labelAppaterno_prop;
    private javax.swing.JLabel labelCelular_prop;
    private javax.swing.JLabel labelDireccion_prop;
    private javax.swing.JLabel labelDvrut_prop;
    private javax.swing.JLabel labelFonofijo_prop;
    private javax.swing.JLabel labelId_Comuna;
    private javax.swing.JLabel labelId_estcivil;
    private javax.swing.JLabel labelNombre_prop;
    private javax.swing.JLabel labelNumrut_prop;
    // End of variables declaration//GEN-END:variables
}
