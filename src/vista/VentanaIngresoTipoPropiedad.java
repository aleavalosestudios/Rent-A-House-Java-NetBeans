/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.TipoPropiedad;
import controlador.TipoPropiedadDao;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author aleja
 */
public class VentanaIngresoTipoPropiedad extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIngresoTipoPropiedad
     */
    public VentanaIngresoTipoPropiedad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngresoTipoPropiedad = new javax.swing.JPanel();
        labelId_tipo_propiedad = new javax.swing.JLabel();
        labelDesc_tipo_propiedad = new javax.swing.JLabel();
        inputId_tipo_propiedad = new javax.swing.JTextField();
        inputDesc_tipo_propiedad = new javax.swing.JTextField();
        btnIngresoTipoPropiedad = new javax.swing.JButton();
        btnLimpiarIngresoTipoPropiedad = new javax.swing.JButton();
        btnVolverIngresoTipoPropiedad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelIngresoTipoPropiedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso Tipo Propiedad"));

        labelId_tipo_propiedad.setText("Id Tipo Propiedad");

        labelDesc_tipo_propiedad.setText("Descripcion Tipo Propiedad");

        inputId_tipo_propiedad.setForeground(new java.awt.Color(153, 153, 153));
        inputId_tipo_propiedad.setText("Ingrese Id Tipo Propiedad");

        inputDesc_tipo_propiedad.setForeground(new java.awt.Color(153, 153, 153));
        inputDesc_tipo_propiedad.setText("Ingrese Descripcion Tipo Propiedad");

        btnIngresoTipoPropiedad.setText("Ingreso Tipo Propiedad");
        btnIngresoTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoTipoPropiedadActionPerformed(evt);
            }
        });

        btnLimpiarIngresoTipoPropiedad.setText("Limpiar");
        btnLimpiarIngresoTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIngresoTipoPropiedadActionPerformed(evt);
            }
        });

        btnVolverIngresoTipoPropiedad.setText("Volver");
        btnVolverIngresoTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverIngresoTipoPropiedadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoTipoPropiedadLayout = new javax.swing.GroupLayout(panelIngresoTipoPropiedad);
        panelIngresoTipoPropiedad.setLayout(panelIngresoTipoPropiedadLayout);
        panelIngresoTipoPropiedadLayout.setHorizontalGroup(
            panelIngresoTipoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoTipoPropiedadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoTipoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelId_tipo_propiedad)
                    .addComponent(labelDesc_tipo_propiedad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIngresoTipoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputId_tipo_propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDesc_tipo_propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelIngresoTipoPropiedadLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnIngresoTipoPropiedad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnLimpiarIngresoTipoPropiedad)
                .addGap(26, 26, 26)
                .addComponent(btnVolverIngresoTipoPropiedad)
                .addGap(36, 36, 36))
        );
        panelIngresoTipoPropiedadLayout.setVerticalGroup(
            panelIngresoTipoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoTipoPropiedadLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelIngresoTipoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId_tipo_propiedad)
                    .addComponent(inputId_tipo_propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelIngresoTipoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDesc_tipo_propiedad)
                    .addComponent(inputDesc_tipo_propiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelIngresoTipoPropiedadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresoTipoPropiedad)
                    .addComponent(btnLimpiarIngresoTipoPropiedad)
                    .addComponent(btnVolverIngresoTipoPropiedad))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngresoTipoPropiedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngresoTipoPropiedad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoTipoPropiedadActionPerformed
        
        TipoPropiedadDao tipoPropiedadDao = new TipoPropiedadDao();
        
        char id_tipoPropiedad  = inputId_tipo_propiedad.getText().charAt(0);
        String desc_tipoPropiedad = inputDesc_tipo_propiedad.getText();
        
        if(tipoPropiedadDao.buscarTipoPropiedadPorId(id_tipoPropiedad).isEmpty() || tipoPropiedadDao.buscarTipoPropiedadPorDescripcion(desc_tipoPropiedad).isEmpty()){
            TipoPropiedad tipoPropiedad = new TipoPropiedad(id_tipoPropiedad, desc_tipoPropiedad);
            
            tipoPropiedadDao.ingresarTipoPropiedad(tipoPropiedad);
            
            JOptionPane.showMessageDialog(this,"Tipo Propiedad Ingresada");
        }
        else{
            JOptionPane.showMessageDialog(this,"Tipo propiedad Ya existe o La Descripcion Ya existe");
        }
        
    }//GEN-LAST:event_btnIngresoTipoPropiedadActionPerformed

    private void btnLimpiarIngresoTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIngresoTipoPropiedadActionPerformed
        JTextField input;
        
        for (int i = 0; i < panelIngresoTipoPropiedad.getComponentCount(); i++) {
            if(panelIngresoTipoPropiedad.getComponent(i).getName().equals("javax.swing.JTextField")){
                input = (JTextField)panelIngresoTipoPropiedad.getComponent(i);
                input.setText("");
            }
        }
    }//GEN-LAST:event_btnLimpiarIngresoTipoPropiedadActionPerformed

    private void btnVolverIngresoTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverIngresoTipoPropiedadActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverIngresoTipoPropiedadActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaIngresoTipoPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoTipoPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoTipoPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresoTipoPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngresoTipoPropiedad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresoTipoPropiedad;
    private javax.swing.JButton btnLimpiarIngresoTipoPropiedad;
    private javax.swing.JButton btnVolverIngresoTipoPropiedad;
    private javax.swing.JTextField inputDesc_tipo_propiedad;
    private javax.swing.JTextField inputId_tipo_propiedad;
    private javax.swing.JLabel labelDesc_tipo_propiedad;
    private javax.swing.JLabel labelId_tipo_propiedad;
    private javax.swing.JPanel panelIngresoTipoPropiedad;
    // End of variables declaration//GEN-END:variables
}
