/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.ComunaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Comuna;

/**
 *
 * @author aleja
 */
public class PanelIngresarComuna extends javax.swing.JPanel {

    /**
     * Creates new form PanelIngresarComuna
     */
    public PanelIngresarComuna() {
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

        labelNombreComuna = new javax.swing.JLabel();
        InputNombre_comuna = new javax.swing.JTextField();
        btnAgregarComuna = new javax.swing.JButton();
        btnLimpiarIngresoComuna = new javax.swing.JButton();
        btnVolverIngresoComuna = new javax.swing.JButton();

        labelNombreComuna.setText("Nombre Comuna:");

        InputNombre_comuna.setForeground(new java.awt.Color(153, 153, 153));
        InputNombre_comuna.setText("Ingrese Nombre Comuna");

        btnAgregarComuna.setText("Agregar Comuna");
        btnAgregarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComunaActionPerformed(evt);
            }
        });

        btnLimpiarIngresoComuna.setText("Limpiar");
        btnLimpiarIngresoComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarIngresoComunaActionPerformed(evt);
            }
        });

        btnVolverIngresoComuna.setText("Volver");
        btnVolverIngresoComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverIngresoComunaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarComuna)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarIngresoComuna)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolverIngresoComuna))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombreComuna)
                        .addGap(18, 18, 18)
                        .addComponent(InputNombre_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreComuna)
                    .addComponent(InputNombre_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarComuna)
                    .addComponent(btnLimpiarIngresoComuna)
                    .addComponent(btnVolverIngresoComuna))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComunaActionPerformed
        String nombre_comuna = InputNombre_comuna.getText();
        ArrayList<Comuna> listadoBuscarComuna = new ArrayList<>();

        ComunaDao comunaDao = new ComunaDao();
        Comuna comuna = new Comuna(0, nombre_comuna);

        listadoBuscarComuna = comunaDao.buscarComuna(nombre_comuna);

        if(listadoBuscarComuna.isEmpty()){
            comunaDao.ingresarComuna(comuna);
            JOptionPane.showMessageDialog(this,"Comuna Ingresada Correctamente");
        }else{
            JOptionPane.showMessageDialog(this,"Comuna ya existe");
        }

    }//GEN-LAST:event_btnAgregarComunaActionPerformed

    private void btnLimpiarIngresoComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarIngresoComunaActionPerformed
        JTextField input;
        PanelIngresarComuna panelIngresarComuna = new PanelIngresarComuna();
        for (int i = 0; i < panelIngresarComuna.getComponentCount(); i++) {
            if(panelIngresarComuna.getComponent(i).getName().equals("javax.swing.JTextField")){
                input = (JTextField)panelIngresarComuna.getComponent(i);
                input.setText("");
            }
        }

    }//GEN-LAST:event_btnLimpiarIngresoComunaActionPerformed

    private void btnVolverIngresoComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverIngresoComunaActionPerformed
        //dispose();
    }//GEN-LAST:event_btnVolverIngresoComunaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputNombre_comuna;
    private javax.swing.JButton btnAgregarComuna;
    private javax.swing.JButton btnLimpiarIngresoComuna;
    private javax.swing.JButton btnVolverIngresoComuna;
    private javax.swing.JLabel labelNombreComuna;
    // End of variables declaration//GEN-END:variables
}
