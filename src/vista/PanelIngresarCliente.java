/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.ClienteDao;
import controlador.EstadoCivilDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cliente;
import modelo.EstadoCivil;

/**
 *
 * @author aleja
 */
public class PanelIngresarCliente extends javax.swing.JPanel {

    /**
     * Creates new form PanelIngresarCliente
     */
    public PanelIngresarCliente() {
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

        labelNumeroRutCli = new javax.swing.JLabel();
        inputNumrut_cli = new javax.swing.JTextField();
        labelDigitoVerificadorCli = new javax.swing.JLabel();
        inputDvrut_cli = new javax.swing.JTextField();
        labelApellidoPaternoCli = new javax.swing.JLabel();
        inputAppaterno_cli = new javax.swing.JTextField();
        labelApellidoMaternoCli = new javax.swing.JLabel();
        inputApmaterno_cli = new javax.swing.JTextField();
        labelNombreCli = new javax.swing.JLabel();
        inputNombre_cli = new javax.swing.JTextField();
        labelDireccionCli = new javax.swing.JLabel();
        inputDireccion_cli = new javax.swing.JTextField();
        labelEstadoCivilCli = new javax.swing.JLabel();
        comboboxEstadoCivil = new javax.swing.JComboBox<>();
        labelTelefonoFijoCli = new javax.swing.JLabel();
        inputFonofijo_cli = new javax.swing.JTextField();
        labelCelularCli = new javax.swing.JLabel();
        inputCelular_cli = new javax.swing.JTextField();
        labelRentaCli = new javax.swing.JLabel();
        inputRenta_cli = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        btnVolverCliente = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso Clientes"));

        labelNumeroRutCli.setText("Numero de rut");

        inputNumrut_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputNumrut_cli.setText("Ingrese numero de rut");
        inputNumrut_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumrut_cliActionPerformed(evt);
            }
        });

        labelDigitoVerificadorCli.setText("Digito Verificador");

        inputDvrut_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputDvrut_cli.setText("Ingrese digito verificador");
        inputDvrut_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDvrut_cliActionPerformed(evt);
            }
        });

        labelApellidoPaternoCli.setText("Apellido Paterno");

        inputAppaterno_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputAppaterno_cli.setText("Ingrese apellido paterno");

        labelApellidoMaternoCli.setText("Apellido Materno");

        inputApmaterno_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputApmaterno_cli.setText("Ingrese apellido materno");

        labelNombreCli.setText("Nombre");

        inputNombre_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputNombre_cli.setText("Ingrese nombre");

        labelDireccionCli.setText("Direcion");

        inputDireccion_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputDireccion_cli.setText("Ingrese direccion");

        labelEstadoCivilCli.setText("Estado Civil");

        comboboxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxEstadoCivilActionPerformed(evt);
            }
        });

        labelTelefonoFijoCli.setText("Telefono Fijo");

        inputFonofijo_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputFonofijo_cli.setText("Ingrese telefono fijo");

        labelCelularCli.setText("Celular");

        inputCelular_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputCelular_cli.setText("Ingrese  telefono celular");

        labelRentaCli.setText("Renta");

        inputRenta_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputRenta_cli.setText("Ingrese Renta del cliente");

        btnGuardarCliente.setText("Guardar Cliente");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnLimpiarCliente.setText("Limpiar");
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        btnVolverCliente.setText("Volver");
        btnVolverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelCelularCli, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEstadoCivilCli, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelApellidoPaternoCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelApellidoMaternoCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDigitoVerificadorCli, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(labelNumeroRutCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNombreCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelDireccionCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelTelefonoFijoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelRentaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputDvrut_cli)
                        .addComponent(inputAppaterno_cli)
                        .addComponent(inputApmaterno_cli)
                        .addComponent(inputNombre_cli)
                        .addComponent(inputDireccion_cli)
                        .addComponent(inputFonofijo_cli)
                        .addComponent(comboboxEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputCelular_cli)
                        .addComponent(inputNumrut_cli)
                        .addComponent(inputRenta_cli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroRutCli)
                    .addComponent(inputNumrut_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDigitoVerificadorCli)
                    .addComponent(inputDvrut_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellidoPaternoCli)
                    .addComponent(inputAppaterno_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellidoMaternoCli)
                    .addComponent(inputApmaterno_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreCli)
                    .addComponent(inputNombre_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccionCli)
                    .addComponent(inputDireccion_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstadoCivilCli)
                    .addComponent(comboboxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefonoFijoCli)
                    .addComponent(inputFonofijo_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelularCli, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCelular_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRentaCli)
                    .addComponent(inputRenta_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente)
                    .addComponent(btnLimpiarCliente)
                    .addComponent(btnVolverCliente))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNumrut_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumrut_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumrut_cliActionPerformed

    private void inputDvrut_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDvrut_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDvrut_cliActionPerformed

    private void comboboxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxEstadoCivilActionPerformed

    }//GEN-LAST:event_comboboxEstadoCivilActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed

        ClienteDao clienteDao = new ClienteDao();

        int numrut_cli;
        char dvrut_cli;
        String appaterno_cli;
        String apmaterno_cli;
        String nombre_cli;
        String direccion_cli;
        int id_estcivil;
        int fonofijo_cli;
        int celular_cli;
        int renta_cli;

        numrut_cli = Integer.parseInt(inputNumrut_cli.getText());
        dvrut_cli = inputDvrut_cli.getText().charAt(0);
        appaterno_cli = inputAppaterno_cli.getText();
        apmaterno_cli = inputApmaterno_cli.getText();
        nombre_cli = inputNombre_cli.getText();
        direccion_cli = inputDireccion_cli.getText();
        id_estcivil = buscarSeleccionComboboxEstadoCivil((String)comboboxEstadoCivil.getSelectedItem());
        fonofijo_cli = Integer.parseInt(inputFonofijo_cli.getText());
        celular_cli = Integer.parseInt(inputCelular_cli.getText());
        renta_cli = Integer.parseInt(inputRenta_cli.getText());

        Cliente cliente = new Cliente( numrut_cli,dvrut_cli,appaterno_cli,apmaterno_cli,nombre_cli,direccion_cli,id_estcivil,fonofijo_cli,celular_cli,renta_cli);

        if(clienteDao.buscarCliente(numrut_cli).isEmpty()){
            clienteDao.ingresarCliente(cliente);
            JOptionPane.showMessageDialog(this,"Cliente "+
                cliente.getNombre_cli()+" "+
                cliente.getAppaterno_cli()+
                "\nIngresado");
        }else{
            JOptionPane.showMessageDialog(this,"Cliente ya existe");//para enviar mensaje a usuario
        }
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed
        JTextField caja;
        PanelIngresarCliente panelIngresarCliente = new PanelIngresarCliente();
        comboboxEstadoCivil.setSelectedIndex(0);
        for(int i=0;i<panelIngresarCliente.getComponentCount();i++){
            if(panelIngresarCliente.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja=(JTextField)panelIngresarCliente.getComponent(i);
                caja.setText("");
            }
        }
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    private void btnVolverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverClienteActionPerformed
        
    }//GEN-LAST:event_btnVolverClienteActionPerformed
    
    private void llenadoComboBoxEstadoCivil(){
        
        comboboxEstadoCivil.removeAllItems();
        EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
        ArrayList<EstadoCivil> listacomboBoxEstadoCivil = estadoCivilDao.todosLosEstadoCivil();

        for(EstadoCivil estadocivil : listacomboBoxEstadoCivil){

            String desc_EstadoCivil = estadocivil.getDesc_EstCivil();
            comboboxEstadoCivil.addItem(desc_EstadoCivil);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnVolverCliente;
    private javax.swing.JComboBox<String> comboboxEstadoCivil;
    private javax.swing.JTextField inputApmaterno_cli;
    private javax.swing.JTextField inputAppaterno_cli;
    private javax.swing.JTextField inputCelular_cli;
    private javax.swing.JTextField inputDireccion_cli;
    private javax.swing.JTextField inputDvrut_cli;
    private javax.swing.JTextField inputFonofijo_cli;
    private javax.swing.JTextField inputNombre_cli;
    private javax.swing.JTextField inputNumrut_cli;
    private javax.swing.JTextField inputRenta_cli;
    private javax.swing.JLabel labelApellidoMaternoCli;
    private javax.swing.JLabel labelApellidoPaternoCli;
    private javax.swing.JLabel labelCelularCli;
    private javax.swing.JLabel labelDigitoVerificadorCli;
    private javax.swing.JLabel labelDireccionCli;
    private javax.swing.JLabel labelEstadoCivilCli;
    private javax.swing.JLabel labelNombreCli;
    private javax.swing.JLabel labelNumeroRutCli;
    private javax.swing.JLabel labelRentaCli;
    private javax.swing.JLabel labelTelefonoFijoCli;
    // End of variables declaration//GEN-END:variables
}
