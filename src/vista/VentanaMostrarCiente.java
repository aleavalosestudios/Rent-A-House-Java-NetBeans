/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Cliente;
import controlador.ClienteDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class VentanaMostrarCiente extends javax.swing.JFrame {

    
    public VentanaMostrarCiente() {
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
        tablaTodosLosClientes = new javax.swing.JTable();
        btnBuscarCliente = new javax.swing.JButton();
        btnMostrarTodosLosCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnIngresarNuevoCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar Clientes"));

        jLabel1.setText("Clientes");

        tablaTodosLosClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "dv", "Apellido Paterno", "Apellido Materno", "Nombre", "Direccion", "Estado civil", "Fono Fijo", "Celular", "Renta"
            }
        ));
        jScrollPane1.setViewportView(tablaTodosLosClientes);

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnMostrarTodosLosCliente.setText("Mostrar Todosl los Clientes");
        btnMostrarTodosLosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosLosClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setText("Modificar Cliente");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar Cliente");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnIngresarNuevoCliente.setText("Ingresar Nuevo Cliente");
        btnIngresarNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(484, 484, 484)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarCliente)
                            .addComponent(btnMostrarTodosLosCliente)
                            .addComponent(btnModificarCliente)
                            .addComponent(btnEliminarCliente)
                            .addComponent(btnIngresarNuevoCliente))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresarNuevoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodosLosCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente)))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        
        ClienteDao clienteDao = new ClienteDao();
        String numrut_cliString = JOptionPane.showInputDialog(this,"Ingrese Rut Cliente");
        int numrut_cliInt = Integer.parseInt(numrut_cliString);
        
        DefaultTableModel tabla = (DefaultTableModel)tablaTodosLosClientes.getModel();
        
        ArrayList<Cliente> listabuscarCliente = clienteDao.buscarCliente(numrut_cliInt);
        
        limpiarTabla();
        
        if(listabuscarCliente.isEmpty()){
            JOptionPane.showInputDialog(this,"Cliente " + numrut_cliString + " No existe");
        }else{
            String [][] datosListaTodosLosClientes = new String[listabuscarCliente.size()][10];
            
            for(int i=0; i < listabuscarCliente.size();i++){
                datosListaTodosLosClientes[i][0] = String.valueOf(listabuscarCliente.get(i).getNumrut_cli());
                datosListaTodosLosClientes[i][1] = String.valueOf(listabuscarCliente.get(i).getDvrut_cli());
                datosListaTodosLosClientes[i][2] = listabuscarCliente.get(i).getAppaterno_cli();
                datosListaTodosLosClientes[i][3] = listabuscarCliente.get(i).getApmaterno_cli();
                datosListaTodosLosClientes[i][4] = listabuscarCliente.get(i).getNombre_cli();
                datosListaTodosLosClientes[i][5] = listabuscarCliente.get(i).getDireccion_cli();
                datosListaTodosLosClientes[i][6] = String.valueOf(listabuscarCliente.get(i).getId_estcivil());
                datosListaTodosLosClientes[i][7] = String.valueOf(listabuscarCliente.get(i).getFonofijo_cli());
                datosListaTodosLosClientes[i][8] = String.valueOf(listabuscarCliente.get(i).getCelular_cli());
                datosListaTodosLosClientes[i][9] = String.valueOf(listabuscarCliente.get(i).getRenta_cli());
                
                tabla.addRow(datosListaTodosLosClientes[i]);
            }
            
            tablaTodosLosClientes.setModel(tabla);
        }
      
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnMostrarTodosLosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosLosClienteActionPerformed
        ClienteDao clienteDao = new ClienteDao();
        DefaultTableModel tabla = (DefaultTableModel)tablaTodosLosClientes.getModel();
        ArrayList<Cliente> listaTodosLosClientes = clienteDao.TodoslosClientes();
        
        limpiarTabla();
        
        if(listaTodosLosClientes.isEmpty()){
            JOptionPane.showMessageDialog(this,"No Existen Clientes");
        }else{
            String [][] datosListaTodosLosClientes = new String[listaTodosLosClientes.size()][10];
            
            for(int i=0; i < listaTodosLosClientes.size();i++){
                datosListaTodosLosClientes[i][0] = String.valueOf(listaTodosLosClientes.get(i).getNumrut_cli());
                datosListaTodosLosClientes[i][1] = String.valueOf(listaTodosLosClientes.get(i).getDvrut_cli());
                datosListaTodosLosClientes[i][2] = listaTodosLosClientes.get(i).getAppaterno_cli();
                datosListaTodosLosClientes[i][3] = listaTodosLosClientes.get(i).getApmaterno_cli();
                datosListaTodosLosClientes[i][4] = listaTodosLosClientes.get(i).getNombre_cli();
                datosListaTodosLosClientes[i][5] = listaTodosLosClientes.get(i).getDireccion_cli();
                datosListaTodosLosClientes[i][6] = String.valueOf(listaTodosLosClientes.get(i).getId_estcivil());
                datosListaTodosLosClientes[i][7] = String.valueOf(listaTodosLosClientes.get(i).getFonofijo_cli());
                datosListaTodosLosClientes[i][8] = String.valueOf(listaTodosLosClientes.get(i).getCelular_cli());
                datosListaTodosLosClientes[i][9] = String.valueOf(listaTodosLosClientes.get(i).getRenta_cli());
                
                tabla.addRow(datosListaTodosLosClientes[i]);
            }
            
            tablaTodosLosClientes.setModel(tabla);
        }
        
        
    }//GEN-LAST:event_btnMostrarTodosLosClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed

        int filaSeleccionada = tablaTodosLosClientes.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Seleccionar Una Fila");
        }else{
            int numrut_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,0)));
            char dvrut_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,1)).charAt(0);
            String appaterno_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,2));
            String apmaterno_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,3));
            String nombre_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,4));
            String direccion_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,5));
            int id_estcivil = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,6)));
            int fonofijo_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,7)));
            int celular_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,8)));
            int renta_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,9)));
            
            ClienteDao clienteDao = new ClienteDao();
            Cliente cliente = new Cliente(numrut_cli, dvrut_cli, appaterno_cli, apmaterno_cli, nombre_cli, direccion_cli, id_estcivil, fonofijo_cli, celular_cli, renta_cli);
            
            clienteDao.actualizarCliente(cliente);
           
           JOptionPane.showMessageDialog(this,"Cliente Modificado");
        }
        
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        
        ClienteDao clienteDao = new ClienteDao();
        
        int filaSeleccionada = tablaTodosLosClientes.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Seleccionar Una Fila");
        }else{
            
            int numrut_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,0)));
            char dvrut_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,1)).charAt(0);
            String appaterno_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,2));
            String apmaterno_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,3));
            String nombre_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,4));
            String direccion_cli = String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,5));
            int id_estcivil = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,6)));
            int fonofijo_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,7)));
            int celular_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,8)));
            int renta_cli = Integer.parseInt(String.valueOf(tablaTodosLosClientes.getValueAt(filaSeleccionada,9)));


            Cliente cliente = new Cliente(numrut_cli, dvrut_cli, appaterno_cli, apmaterno_cli, nombre_cli, direccion_cli, id_estcivil, fonofijo_cli, celular_cli, renta_cli);

            clienteDao.eliminarCliente(cliente); //Para optimizar codigo se deberia solicitar solo el rut de la fila seleccionada

            JOptionPane.showMessageDialog(this,"Cliente Eliminado");
            
            btnMostrarTodosLosCliente.doClick();
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnIngresarNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoClienteActionPerformed
         VentanaIngresarCliente ventanaIngresarCliente = new VentanaIngresarCliente();
         abrirVentana(ventanaIngresarCliente,"Ingreso Nuevo Cliente");
    }//GEN-LAST:event_btnIngresarNuevoClienteActionPerformed
    
    private void abrirVentana(javax.swing.JFrame Ventana, String tituloVentana){
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setTitle(tituloVentana);
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void limpiarTabla(){
        DefaultTableModel dtm=(DefaultTableModel)tablaTodosLosClientes.getModel();
        int n=tablaTodosLosClientes.getRowCount();
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
            java.util.logging.Logger.getLogger(VentanaMostrarCiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarCiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrarCiente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnIngresarNuevoCliente;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnMostrarTodosLosCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTodosLosClientes;
    // End of variables declaration//GEN-END:variables
}
