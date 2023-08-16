/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.PropiedadArrendada;
import modelo.Propiedad;
import modelo.Cliente;
import controlador.PropiedadArrendadaDao;
import controlador.ClienteDao;
import controlador.PropiedadDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aleja
 */
public class VentanaIngresoPropiedadArrendada extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIngresoPropiedadArrendada
     */
    public VentanaIngresoPropiedadArrendada() {
        initComponents();
    }
    
     private void abrirVentana(javax.swing.JFrame Ventana, String tituloVentana){
        
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setTitle(tituloVentana);
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngresoArriendoPropiedad = new javax.swing.JPanel();
        labelNro_propiedad = new javax.swing.JLabel();
        labelFecini_arriendo = new javax.swing.JLabel();
        labelFecter_arriendo = new javax.swing.JLabel();
        labelNumrut_cli = new javax.swing.JLabel();
        inputNro_propiedad = new javax.swing.JTextField();
        inputFecini_arriendo = new javax.swing.JTextField();
        inputFecter_arriendo = new javax.swing.JTextField();
        inputNumrut_cli = new javax.swing.JTextField();
        btnIngresoArriendoPropiedad = new javax.swing.JButton();
        btnLimpiarIngresoArriendoPropiedad = new javax.swing.JButton();
        btnVolverIngresoArriendoPropiedad = new javax.swing.JButton();
        btnIngresarPropiedad = new javax.swing.JButton();
        btnIngresarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelIngresoArriendoPropiedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso Arriendo Propiedad"));

        labelNro_propiedad.setText("Nro Propiedad");

        labelFecini_arriendo.setText("Fecha Inicio Arriendo");

        labelFecter_arriendo.setText("Fecha Termino Arriendo");

        labelNumrut_cli.setText("Nro Rut Cliente");

        inputNro_propiedad.setForeground(new java.awt.Color(153, 153, 153));
        inputNro_propiedad.setText("Ingrese Numero Propiedad");

        inputFecini_arriendo.setForeground(new java.awt.Color(153, 153, 153));
        inputFecini_arriendo.setText("Ingrese Fecha Inicio Arriendo");
        inputFecini_arriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFecini_arriendoActionPerformed(evt);
            }
        });

        inputFecter_arriendo.setForeground(new java.awt.Color(153, 153, 153));
        inputFecter_arriendo.setText("Ingrese Fecha Termino Arriendo");

        inputNumrut_cli.setForeground(new java.awt.Color(153, 153, 153));
        inputNumrut_cli.setText("Ingrese Numero de rut del Cliente");

        btnIngresoArriendoPropiedad.setText("Ingreso Arriendo Propiedad");
        btnIngresoArriendoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoArriendoPropiedadActionPerformed(evt);
            }
        });

        btnLimpiarIngresoArriendoPropiedad.setText("Limpiar");
        btnLimpiarIngresoArriendoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIngresoArriendoPropiedadActionPerformed(evt);
            }
        });

        btnVolverIngresoArriendoPropiedad.setText("Volver");
        btnVolverIngresoArriendoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverIngresoArriendoPropiedadActionPerformed(evt);
            }
        });

        btnIngresarPropiedad.setText("Ingresar Nueva Propiedad");
        btnIngresarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPropiedadActionPerformed(evt);
            }
        });

        btnIngresarCliente.setText("Ingresar Nuevo Cliente");
        btnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoArriendoPropiedadLayout = new javax.swing.GroupLayout(panelIngresoArriendoPropiedad);
        panelIngresoArriendoPropiedad.setLayout(panelIngresoArriendoPropiedadLayout);
        panelIngresoArriendoPropiedadLayout.setHorizontalGroup(
            panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoArriendoPropiedadLayout.createSequentialGroup()
                .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoArriendoPropiedadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoArriendoPropiedadLayout.createSequentialGroup()
                                .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNro_propiedad)
                                    .addComponent(labelFecter_arriendo)
                                    .addComponent(labelNumrut_cli))
                                .addGap(49, 49, 49))
                            .addGroup(panelIngresoArriendoPropiedadLayout.createSequentialGroup()
                                .addComponent(labelFecini_arriendo)
                                .addGap(64, 64, 64)))
                        .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNro_propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFecini_arriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFecter_arriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNumrut_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresarCliente)
                            .addComponent(btnIngresarPropiedad)))
                    .addGroup(panelIngresoArriendoPropiedadLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnIngresoArriendoPropiedad)
                        .addGap(32, 32, 32)
                        .addComponent(btnLimpiarIngresoArriendoPropiedad)
                        .addGap(26, 26, 26)
                        .addComponent(btnVolverIngresoArriendoPropiedad)))
                .addContainerGap())
        );
        panelIngresoArriendoPropiedadLayout.setVerticalGroup(
            panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoArriendoPropiedadLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNro_propiedad)
                    .addComponent(inputNro_propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarPropiedad))
                .addGap(8, 8, 8)
                .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecini_arriendo)
                    .addComponent(inputFecini_arriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecter_arriendo)
                    .addComponent(inputFecter_arriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumrut_cli)
                    .addComponent(inputNumrut_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(panelIngresoArriendoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresoArriendoPropiedad)
                    .addComponent(btnLimpiarIngresoArriendoPropiedad)
                    .addComponent(btnVolverIngresoArriendoPropiedad))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngresoArriendoPropiedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngresoArriendoPropiedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFecini_arriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFecini_arriendoActionPerformed
       
    }//GEN-LAST:event_inputFecini_arriendoActionPerformed

    private void btnIngresarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPropiedadActionPerformed
        VentanaIngresarPropiedad ventanaIngresarPropiedad = new VentanaIngresarPropiedad();
        abrirVentana(ventanaIngresarPropiedad,"Ingreso Nueva Propiedad");
    }//GEN-LAST:event_btnIngresarPropiedadActionPerformed

    private void btnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarClienteActionPerformed
        VentanaIngresarCliente  ventanaIngresarCliente = new VentanaIngresarCliente();
        abrirVentana(ventanaIngresarCliente, "Registro Cliente");
    }//GEN-LAST:event_btnIngresarClienteActionPerformed

    private void btnIngresoArriendoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoArriendoPropiedadActionPerformed
        
        int nroPropiedad = Integer.parseInt(String.valueOf(inputNro_propiedad.getText()));
        int numrut_cli = Integer.parseInt(String.valueOf(inputNumrut_cli.getText()));
        
        
        boolean clienteExiste = buscadorClienteExiste(numrut_cli);
        boolean propiedadexiste = buscadorPropiedadExiste(nroPropiedad);
        
        if(clienteExiste == false || propiedadexiste == false){
            JOptionPane.showMessageDialog(this,"Error en el ingreso de datos");
        }else{
            
            String fec_inicio = String.valueOf(inputFecini_arriendo.getText());
            String fec_termino = String.valueOf(inputFecter_arriendo.getText());
            
            PropiedadArrendada propiedadArrendada= new PropiedadArrendada(nroPropiedad, fec_inicio, fec_termino, numrut_cli);
            
            PropiedadArrendadaDao propiedadArrendadaDao = new PropiedadArrendadaDao();
            
            propiedadArrendadaDao.agregarPropiedadArrendada(propiedadArrendada);
            
            JOptionPane.showMessageDialog(this,"Arriendo De Propiedad Ingresado Correctamente");
        }
        
        
    }//GEN-LAST:event_btnIngresoArriendoPropiedadActionPerformed

    private void btnLimpiarIngresoArriendoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIngresoArriendoPropiedadActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarIngresoArriendoPropiedadActionPerformed

    private void btnVolverIngresoArriendoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverIngresoArriendoPropiedadActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverIngresoArriendoPropiedadActionPerformed

    private void limpiar(){
        JTextField caja;
        
        for(int i=0;i<panelIngresoArriendoPropiedad.getComponentCount();i++){
            if(panelIngresoArriendoPropiedad.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja=(JTextField)panelIngresoArriendoPropiedad.getComponent(i);
                caja.setText("");
            }
        }
    }
    
    public boolean buscadorPropiedadExiste(int nroPropiedad){
        boolean resultado = true;
        PropiedadDao propiedadDao = new PropiedadDao();
        
        ArrayList<Propiedad> listadoPropiedades = propiedadDao.buscarPropiedad(nroPropiedad);
        
        if(listadoPropiedades.isEmpty()){
            resultado = false;
        }
        
        return resultado;
    }
    
    public boolean buscadorClienteExiste(int numrut_cli){
        boolean resultado = true;
        ClienteDao clienteDao = new ClienteDao();
        
        ArrayList<Cliente> listadoclientes = clienteDao.buscarCliente(numrut_cli);
        
        if(listadoclientes.isEmpty()){
            resultado = false;
        }
        
        return resultado;
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
            java.util.logging.Logger.getLogger(VentanaIngresoPropiedadArrendada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoPropiedadArrendada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoPropiedadArrendada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoPropiedadArrendada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngresoPropiedadArrendada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarCliente;
    private javax.swing.JButton btnIngresarPropiedad;
    private javax.swing.JButton btnIngresoArriendoPropiedad;
    private javax.swing.JButton btnLimpiarIngresoArriendoPropiedad;
    private javax.swing.JButton btnVolverIngresoArriendoPropiedad;
    private javax.swing.JTextField inputFecini_arriendo;
    private javax.swing.JTextField inputFecter_arriendo;
    private javax.swing.JTextField inputNro_propiedad;
    private javax.swing.JTextField inputNumrut_cli;
    private javax.swing.JLabel labelFecini_arriendo;
    private javax.swing.JLabel labelFecter_arriendo;
    private javax.swing.JLabel labelNro_propiedad;
    private javax.swing.JLabel labelNumrut_cli;
    private javax.swing.JPanel panelIngresoArriendoPropiedad;
    // End of variables declaration//GEN-END:variables
}
