/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Propietario;
import modelo.EstadoCivil;
import controlador.PropietarioDao;
import controlador.EstadoCivilDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author aleja
 */
public class VentanaIngresarPropietario extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIngresarPropietario
     */
    public VentanaIngresarPropietario() {
        initComponents();
        llenadoComboBoxEstadoCivil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngresarPropietario = new javax.swing.JPanel();
        labelNumrut_prop = new javax.swing.JLabel();
        labelDvrut_prop = new javax.swing.JLabel();
        labelAppaterno_prop = new javax.swing.JLabel();
        labelApmaterno_prop = new javax.swing.JLabel();
        labelNombre_prop = new javax.swing.JLabel();
        labelDireccion_prop = new javax.swing.JLabel();
        labelId_estcivil = new javax.swing.JLabel();
        labelFonofijo_prop = new javax.swing.JLabel();
        labelCelular_prop = new javax.swing.JLabel();
        labelId_Comuna = new javax.swing.JLabel();
        inputNumrut_prop = new javax.swing.JTextField();
        inputDvrut_prop = new javax.swing.JTextField();
        inputAppaterno_prop = new javax.swing.JTextField();
        inputApmaterno_prop = new javax.swing.JTextField();
        inputNombre_prop = new javax.swing.JTextField();
        inputDireccion_prop = new javax.swing.JTextField();
        inputFonofijo_prop = new javax.swing.JTextField();
        inputCelular_prop = new javax.swing.JTextField();
        inputId_comuna = new javax.swing.JTextField();
        btnIngresarNuevoPropietario = new javax.swing.JButton();
        btnLimpiarIngresoNuevoPropietario = new javax.swing.JButton();
        btnVolverIngresoNuevoPropietario = new javax.swing.JButton();
        comboBoxEstadoCivil = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelIngresarPropietario.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso Nuevo Propietario"));

        labelNumrut_prop.setText("Nro Rut Propietario");

        labelDvrut_prop.setText("DV Rut Propietario");

        labelAppaterno_prop.setText("Apellido Paterno Propietario");

        labelApmaterno_prop.setText("Apellido Materno Propietario");

        labelNombre_prop.setText("Nombre Propietario");

        labelDireccion_prop.setText("Direccion Propietario");

        labelId_estcivil.setText("Id Estado Civil");

        labelFonofijo_prop.setText("Fono fijo Propietario");

        labelCelular_prop.setText("Celular Propietario");

        labelId_Comuna.setText("Id Comuna");

        inputNumrut_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputNumrut_prop.setText("Ingrese Numero Rut Propietario");

        inputDvrut_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputDvrut_prop.setText("Ingrese DV Rut Propietario");

        inputAppaterno_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputAppaterno_prop.setText("Ingrese Apellido Paterno");

        inputApmaterno_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputApmaterno_prop.setText("Ingrese Apellido Materno");

        inputNombre_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputNombre_prop.setText("Ingrese Nombre Propietario");

        inputDireccion_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputDireccion_prop.setText("Ingrese Direccion Propietario");

        inputFonofijo_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputFonofijo_prop.setText("Ingrese Fono Fijo Propietario");

        inputCelular_prop.setForeground(new java.awt.Color(153, 153, 153));
        inputCelular_prop.setText("Ingrese Celular Propietario");

        inputId_comuna.setForeground(new java.awt.Color(153, 153, 153));
        inputId_comuna.setText("Ingrese Id Comuna");

        btnIngresarNuevoPropietario.setText("Ingresar Nuevo Propietario");
        btnIngresarNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoPropietarioActionPerformed(evt);
            }
        });

        btnLimpiarIngresoNuevoPropietario.setText("Limpiar");
        btnLimpiarIngresoNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIngresoNuevoPropietarioActionPerformed(evt);
            }
        });

        btnVolverIngresoNuevoPropietario.setText("Volver");
        btnVolverIngresoNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverIngresoNuevoPropietarioActionPerformed(evt);
            }
        });

        comboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelIngresarPropietarioLayout = new javax.swing.GroupLayout(panelIngresarPropietario);
        panelIngresarPropietario.setLayout(panelIngresarPropietarioLayout);
        panelIngresarPropietarioLayout.setHorizontalGroup(
            panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarPropietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelIngresarPropietarioLayout.createSequentialGroup()
                        .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNumrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputDvrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCelular_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputId_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputAppaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputApmaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNombre_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputDireccion_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFonofijo_prop, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(panelIngresarPropietarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnIngresarNuevoPropietario)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarIngresoNuevoPropietario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverIngresoNuevoPropietario)
                        .addGap(19, 19, 19))))
        );
        panelIngresarPropietarioLayout.setVerticalGroup(
            panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresarPropietarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumrut_prop)
                    .addComponent(inputNumrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDvrut_prop)
                    .addComponent(inputDvrut_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAppaterno_prop)
                    .addComponent(inputAppaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApmaterno_prop)
                    .addComponent(inputApmaterno_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre_prop)
                    .addComponent(inputNombre_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion_prop)
                    .addComponent(inputDireccion_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId_estcivil)
                    .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFonofijo_prop)
                    .addComponent(inputFonofijo_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelular_prop)
                    .addComponent(inputCelular_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId_Comuna)
                    .addComponent(inputId_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelIngresarPropietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarNuevoPropietario)
                    .addComponent(btnLimpiarIngresoNuevoPropietario)
                    .addComponent(btnVolverIngresoNuevoPropietario))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngresarPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngresarPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoPropietarioActionPerformed
        PropietarioDao propietarioDao = new PropietarioDao();
        
        int numrut_Prop = Integer.parseInt(String.valueOf(inputNumrut_prop.getText()));
        
        ArrayList<Propietario> listadopropietario = propietarioDao.buscarPropietario(numrut_Prop);
        
        if(listadopropietario.isEmpty()){
            
            
            char dvrut_prop = String.valueOf(inputDvrut_prop.getText()).charAt(0);
            String appaterno_prop = String.valueOf(inputAppaterno_prop.getText());
            String apmaterno_prop = String.valueOf(inputApmaterno_prop.getText());
            String nombre_prop = String.valueOf(inputNombre_prop.getText());
            String direccion_prop = String.valueOf(inputDireccion_prop.getText());
            int id_estcivil = buscarSeleccionComboboxEstadoCivil(String.valueOf(comboBoxEstadoCivil.getSelectedItem()));
            String fonofijo_prop = String.valueOf(inputFonofijo_prop.getText());;
            String celular_prop = String.valueOf(inputCelular_prop.getText());;
            int id_comuna = Integer.parseInt(String.valueOf(inputId_comuna.getText()));
            
            Propietario propietario = new Propietario(numrut_Prop, dvrut_prop, appaterno_prop, apmaterno_prop, nombre_prop, direccion_prop, id_estcivil, fonofijo_prop, celular_prop, id_comuna);
            
            propietarioDao.ingresarPropietario(propietario);
            
            JOptionPane.showMessageDialog(this,"Propietario Ingresado Correctamente");
        }else{
            JOptionPane.showMessageDialog(this, "Propietario Ya Existe");
        }
        
    }//GEN-LAST:event_btnIngresarNuevoPropietarioActionPerformed

    private void btnLimpiarIngresoNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIngresoNuevoPropietarioActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarIngresoNuevoPropietarioActionPerformed

    private void btnVolverIngresoNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverIngresoNuevoPropietarioActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverIngresoNuevoPropietarioActionPerformed

    private void llenadoComboBoxEstadoCivil(){
        
        comboBoxEstadoCivil.removeAllItems();
        EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
        ArrayList<EstadoCivil> listacomboBoxEstadoCivil = estadoCivilDao.todosLosEstadoCivil();

        for(EstadoCivil estadocivil : listacomboBoxEstadoCivil){

            String desc_EstadoCivil = estadocivil.getDesc_EstCivil();
            comboBoxEstadoCivil.addItem(desc_EstadoCivil);
        }
    }
    
    private int buscarSeleccionComboboxEstadoCivil(String seleccionEstadoCivil){
        
        EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
        ArrayList<EstadoCivil> listadoEstadoCivil = new ArrayList<>();
        int id_estcivil = 0;
        listadoEstadoCivil = estadoCivilDao.buscarEstadoCivil(seleccionEstadoCivil);
        
        for (EstadoCivil estadoCivil : listadoEstadoCivil){
            
            id_estcivil = estadoCivil.getId_EstCivil();
        }
        
        return id_estcivil;
    }
    
    private void limpiar(){
        JTextField caja;
        comboBoxEstadoCivil.setSelectedIndex(0);
        for(int i=0;i<panelIngresarPropietario.getComponentCount();i++){
            if(panelIngresarPropietario.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja=(JTextField)panelIngresarPropietario.getComponent(i);
                caja.setText("");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarPropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngresarPropietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarNuevoPropietario;
    private javax.swing.JButton btnLimpiarIngresoNuevoPropietario;
    private javax.swing.JButton btnVolverIngresoNuevoPropietario;
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
    private javax.swing.JPanel panelIngresarPropietario;
    // End of variables declaration//GEN-END:variables
}
