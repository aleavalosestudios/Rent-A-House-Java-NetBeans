/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.EstadoCivil;
import controlador.EstadoCivilDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class VentanaMostrarEstadoCivil extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMostrarEstadoCivil
     */
    public VentanaMostrarEstadoCivil() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTodosLosEstadosCiviles = new javax.swing.JTable();
        btnBuscarEstadoCivil = new javax.swing.JButton();
        btnMostrarTodosLosEstadosCiviles = new javax.swing.JButton();
        btnActualizarEstadoCivil = new javax.swing.JButton();
        btnEliminarEstadoCivil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar Estado Civil"));

        jLabel1.setText("Estado Civil");

        tablaTodosLosEstadosCiviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Estado Civil", "Estado Civil"
            }
        ));
        jScrollPane1.setViewportView(tablaTodosLosEstadosCiviles);

        btnBuscarEstadoCivil.setText("Buscar Estado Civil");
        btnBuscarEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoCivilActionPerformed(evt);
            }
        });

        btnMostrarTodosLosEstadosCiviles.setText("Mostrar Estados Civiles");
        btnMostrarTodosLosEstadosCiviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosLosEstadosCivilesActionPerformed(evt);
            }
        });

        btnActualizarEstadoCivil.setText("Actualizar Estado Civil");
        btnActualizarEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEstadoCivilActionPerformed(evt);
            }
        });

        btnEliminarEstadoCivil.setText("Eliminar Estado Civil");
        btnEliminarEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEstadoCivilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarEstadoCivil)
                            .addComponent(btnMostrarTodosLosEstadosCiviles)
                            .addComponent(btnActualizarEstadoCivil)
                            .addComponent(btnEliminarEstadoCivil))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarEstadoCivil)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodosLosEstadosCiviles)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarEstadoCivil)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarEstadoCivil)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoCivilActionPerformed
        DefaultTableModel tabla = (DefaultTableModel)tablaTodosLosEstadosCiviles.getModel();
        EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
        
        String desc_estadoCivil = JOptionPane.showInputDialog(this, "Ingrese Nombre Estado Civil a Buscar");
        
        ArrayList<EstadoCivil> listaEstadoCivil = estadoCivilDao.buscarEstadoCivil(desc_estadoCivil);
        
        String [][] datoslistasEstadoCivil = new String[listaEstadoCivil.size()][2];
        
        for (int i = 0; i < listaEstadoCivil.size(); i++) {
            datoslistasEstadoCivil[i][0] = String.valueOf(listaEstadoCivil.get(i).getId_EstCivil());
            datoslistasEstadoCivil[i][1] = String.valueOf(listaEstadoCivil.get(i).getDesc_EstCivil());
            
            tabla.addRow(datoslistasEstadoCivil[i]);
        }
        
        tablaTodosLosEstadosCiviles.setModel(tabla);
        
    }//GEN-LAST:event_btnBuscarEstadoCivilActionPerformed

    private void btnMostrarTodosLosEstadosCivilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosLosEstadosCivilesActionPerformed
        DefaultTableModel tabla = (DefaultTableModel)tablaTodosLosEstadosCiviles.getModel();
        EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
        
        ArrayList<EstadoCivil> listaEstadoCivil = estadoCivilDao.todosLosEstadoCivil();
        
        String [][] datoslistasEstadoCivil = new String[listaEstadoCivil.size()][2];
        
        for (int i = 0; i < listaEstadoCivil.size(); i++) {
            datoslistasEstadoCivil[i][0] = String.valueOf(listaEstadoCivil.get(i).getId_EstCivil());
            datoslistasEstadoCivil[i][1] = String.valueOf(listaEstadoCivil.get(i).getDesc_EstCivil());
            
            tabla.addRow(datoslistasEstadoCivil[i]);
        }
        
        tablaTodosLosEstadosCiviles.setModel(tabla);
    }//GEN-LAST:event_btnMostrarTodosLosEstadosCivilesActionPerformed

    private void btnActualizarEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEstadoCivilActionPerformed
        int filaSeleccionada = tablaTodosLosEstadosCiviles.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");
        }else{
            int id_estadoCivil = Integer.parseInt(String.valueOf(tablaTodosLosEstadosCiviles.getValueAt(filaSeleccionada,0)));
            String desc_estadoCivil = String.valueOf(tablaTodosLosEstadosCiviles.getValueAt(filaSeleccionada,1));
            
            EstadoCivil estadoCivil = new EstadoCivil(id_estadoCivil, desc_estadoCivil);
            
            EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
            
            estadoCivilDao.actualizarEstadoCivil(estadoCivil);
            
            JOptionPane.showMessageDialog(this,"Estado Civil Actualizado");
        }
    }//GEN-LAST:event_btnActualizarEstadoCivilActionPerformed

    private void btnEliminarEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstadoCivilActionPerformed
        int filaSeleccionada = tablaTodosLosEstadosCiviles.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");
        }else{
            int id_estadoCivil = Integer.parseInt(String.valueOf(tablaTodosLosEstadosCiviles.getValueAt(filaSeleccionada,0)));
            String desc_estadoCivil = String.valueOf(tablaTodosLosEstadosCiviles.getValueAt(filaSeleccionada,1));
            
            EstadoCivil estadoCivil = new EstadoCivil(id_estadoCivil, desc_estadoCivil);
            
            EstadoCivilDao estadoCivilDao = new EstadoCivilDao();
            
            estadoCivilDao.eliminarEstadoCivil(estadoCivil);
            
            JOptionPane.showMessageDialog(this,"Estado Civil Eliminado");
        }
    }//GEN-LAST:event_btnEliminarEstadoCivilActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMostrarEstadoCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarEstadoCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarEstadoCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarEstadoCivil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrarEstadoCivil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEstadoCivil;
    private javax.swing.JButton btnBuscarEstadoCivil;
    private javax.swing.JButton btnEliminarEstadoCivil;
    private javax.swing.JButton btnMostrarTodosLosEstadosCiviles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTodosLosEstadosCiviles;
    // End of variables declaration//GEN-END:variables
}