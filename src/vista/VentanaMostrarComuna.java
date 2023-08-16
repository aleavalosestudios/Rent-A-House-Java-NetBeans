/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Comuna;
import controlador.ComunaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class VentanaMostrarComuna extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMostrarComuna
     */
    public VentanaMostrarComuna() {
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

        panelMostrarComunas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTodasLasComunas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarComuna = new javax.swing.JButton();
        btnMostrarTodasLasComunas = new javax.swing.JButton();
        btnEditarComuna = new javax.swing.JButton();
        btnEliminarComuna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMostrarComunas.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar Comunas"));

        tablaTodasLasComunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id Comuna", "Nombre Comuna"
            }
        ));
        jScrollPane1.setViewportView(tablaTodasLasComunas);

        jLabel1.setText("Comunas");

        btnBuscarComuna.setText("Buscar Comuna");
        btnBuscarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarComunaActionPerformed(evt);
            }
        });

        btnMostrarTodasLasComunas.setText("Mostrar Todas Las Comunas");
        btnMostrarTodasLasComunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodasLasComunasActionPerformed(evt);
            }
        });

        btnEditarComuna.setText("Editar Comuna");
        btnEditarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarComunaActionPerformed(evt);
            }
        });

        btnEliminarComuna.setText("Eliminar Comuna");
        btnEliminarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarComunaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarComunasLayout = new javax.swing.GroupLayout(panelMostrarComunas);
        panelMostrarComunas.setLayout(panelMostrarComunasLayout);
        panelMostrarComunasLayout.setHorizontalGroup(
            panelMostrarComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarComunasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelMostrarComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarComuna)
                    .addComponent(btnMostrarTodasLasComunas)
                    .addComponent(btnEditarComuna)
                    .addComponent(btnEliminarComuna))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMostrarComunasLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMostrarComunasLayout.setVerticalGroup(
            panelMostrarComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarComunasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelMostrarComunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMostrarComunasLayout.createSequentialGroup()
                        .addComponent(btnBuscarComuna)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodasLasComunas)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarComuna)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarComuna)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMostrarComunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMostrarComunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarComunaActionPerformed
        DefaultTableModel tabla = (DefaultTableModel)tablaTodasLasComunas.getModel();
        ComunaDao comunaDao = new ComunaDao();
        String nombre_comuna = JOptionPane.showInputDialog("Ingrese Nombre Comuna");
        ArrayList<Comuna> listadoBuscarComuna = comunaDao.buscarComuna(nombre_comuna);
        
        limpiarTabla();
        
        if(listadoBuscarComuna.isEmpty()){
            JOptionPane.showMessageDialog(this,"La comuna no existe");
        }else{
            String[][] datosListadoBuscarComuna = new String[listadoBuscarComuna.size()][2];
            
            for (int i = 0; i < listadoBuscarComuna.size(); i++) {
                
                datosListadoBuscarComuna[i][0] = String.valueOf(listadoBuscarComuna.get(i).getId_comuna());
                datosListadoBuscarComuna[i][1] = String.valueOf(listadoBuscarComuna.get(i).getNombre_comuna());
                
                tabla.addRow(datosListadoBuscarComuna[i]);
            }
            
            tablaTodasLasComunas.setModel(tabla);
        }
           
    }//GEN-LAST:event_btnBuscarComunaActionPerformed

    private void btnMostrarTodasLasComunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodasLasComunasActionPerformed
        DefaultTableModel tabla = (DefaultTableModel)tablaTodasLasComunas.getModel();
        ComunaDao comunaDao = new ComunaDao();
        ArrayList<Comuna> listaTodasLasComunas = comunaDao.mostrarComunas();
        
        String[][] datosListaTodasLasComunas = new String[listaTodasLasComunas.size()][2];
        
        for (int i = 0; i < listaTodasLasComunas.size(); i++) {
            
            datosListaTodasLasComunas[i][0] = String.valueOf(listaTodasLasComunas.get(i).getId_comuna());
            datosListaTodasLasComunas[i][1] = listaTodasLasComunas.get(i).getNombre_comuna();
            
            tabla.addRow(datosListaTodasLasComunas[i]);
        }
        
        tablaTodasLasComunas.setModel(tabla);
        
    }//GEN-LAST:event_btnMostrarTodasLasComunasActionPerformed

    private void btnEditarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarComunaActionPerformed
        
        int filaSeleccionada = tablaTodasLasComunas.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Seleccionar Una Fila");
        }else{
            
            int id_comuna = Integer.parseInt(String.valueOf(tablaTodasLasComunas.getValueAt(filaSeleccionada, 0)));
            String nombre_comuna = String.valueOf(tablaTodasLasComunas.getValueAt(filaSeleccionada, 1));
            
            Comuna comuna = new Comuna(id_comuna, nombre_comuna);
            
            ComunaDao comunaDao = new ComunaDao();
            
            comunaDao.actualizarComuna(comuna);
            
            JOptionPane.showMessageDialog(this,"Comuna Actualizada");
                    
        }
        
        
    }//GEN-LAST:event_btnEditarComunaActionPerformed

    private void btnEliminarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarComunaActionPerformed
        int filaSeleccionada = tablaTodasLasComunas.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Seleccionar Una Fila");
        }else{
            int id_comuna = Integer.parseInt(String.valueOf(tablaTodasLasComunas.getValueAt(filaSeleccionada,0)));
            String nombre_comuna = String.valueOf(tablaTodasLasComunas.getValueAt(filaSeleccionada,1));
            
            Comuna comuna = new Comuna(id_comuna, nombre_comuna);
            
            ComunaDao comunaDao = new ComunaDao();
            
            comunaDao.eliminarComuna(comuna);
            
            JOptionPane.showMessageDialog(this,"Comuna Eliminada");
        }
    }//GEN-LAST:event_btnEliminarComunaActionPerformed

    
    public void limpiarTabla(){
    DefaultTableModel dtm=(DefaultTableModel)tablaTodasLasComunas.getModel();
    int n=tablaTodasLasComunas.getRowCount();
    for (int i = 0; i < n ; i++) {
        dtm.removeRow(dtm.getRowCount()-1);
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
            java.util.logging.Logger.getLogger(VentanaMostrarComuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarComuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarComuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarComuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrarComuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarComuna;
    private javax.swing.JButton btnEditarComuna;
    private javax.swing.JButton btnEliminarComuna;
    private javax.swing.JButton btnMostrarTodasLasComunas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMostrarComunas;
    private javax.swing.JTable tablaTodasLasComunas;
    // End of variables declaration//GEN-END:variables
}