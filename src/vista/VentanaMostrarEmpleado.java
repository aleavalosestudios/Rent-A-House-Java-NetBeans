/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Empleado;
import controlador.EmpleadoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author aleja
 */
public class VentanaMostrarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMostrarEmpleado
     */
    public VentanaMostrarEmpleado() {
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
        tablaTodosLosEmpleados = new javax.swing.JTable();
        btnBuscarEmpleado = new javax.swing.JButton();
        btnMostrarTodosLosEmpleados = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnIngresarNuevoEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar Empleados"));

        jLabel1.setText("Empleados");

        tablaTodosLosEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Dv", "Apellido Paterno", "Apellido Materno", "Nombre", "Direccion", "Estado Civil", "Fono Fijo", "Celular", "Fecha Nacimiento", "Fecha Ingreso", "Sueldo", "Comuna", "Categoria Empleado", "Rut Supervisor"
            }
        ));
        jScrollPane1.setViewportView(tablaTodosLosEmpleados);

        btnBuscarEmpleado.setText("Buscar Empleado");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });

        btnMostrarTodosLosEmpleados.setText("Mostrar Todos los Empleados");
        btnMostrarTodosLosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosLosEmpleadosActionPerformed(evt);
            }
        });

        btnEditarEmpleado.setText("Editar Empleado");
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setText("Eliminar Empleado");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        btnIngresarNuevoEmpleado.setText("Ingresar Nuevo Empleado");
        btnIngresarNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarEmpleado)
                            .addComponent(btnMostrarTodosLosEmpleados)
                            .addComponent(btnEditarEmpleado)
                            .addComponent(btnEliminarEmpleado)
                            .addComponent(btnIngresarNuevoEmpleado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresarNuevoEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodosLosEmpleados)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarEmpleado))))
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

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        
        DefaultTableModel tabla = (DefaultTableModel)tablaTodosLosEmpleados.getModel();
        EmpleadoDao empleadoDao = new EmpleadoDao();
        
        int inputnumrut_emp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Rut Empleado A Buscar"));
        
        ArrayList<Empleado> listaempleados = empleadoDao.buscarEmpleado(inputnumrut_emp);
        
        limpiarTabla();
        
        if(listaempleados.isEmpty()){
            JOptionPane.showMessageDialog(this,"Empleado No Existe");
        }else{
            String [][] datoslistadoEmpleados = new String[listaempleados.size()][15];
            
            for (int i = 0; i < listaempleados.size(); i++) {
                datoslistadoEmpleados [i][0] = String.valueOf(listaempleados.get(i).getNumrut_emp());
                datoslistadoEmpleados [i][1] = String.valueOf(listaempleados.get(i).getDvrut_emp());
                datoslistadoEmpleados [i][2] = String.valueOf(listaempleados.get(i).getAppaterno_emp());
                datoslistadoEmpleados [i][3] = String.valueOf(listaempleados.get(i).getApmaterno_emp());
                datoslistadoEmpleados [i][4] = String.valueOf(listaempleados.get(i).getNombre_emp());
                datoslistadoEmpleados [i][5] = String.valueOf(listaempleados.get(i).getDireccion_emp());
                datoslistadoEmpleados [i][6] = String.valueOf(listaempleados.get(i).getId_estcivil());
                datoslistadoEmpleados [i][7] = String.valueOf(listaempleados.get(i).getFonofijo_emp());
                datoslistadoEmpleados [i][8] = String.valueOf(listaempleados.get(i).getCelular_emp());
                datoslistadoEmpleados [i][9] = String.valueOf(listaempleados.get(i).getFecnac_emp());
                datoslistadoEmpleados [i][10] = String.valueOf(listaempleados.get(i).getFecing_emp());
                datoslistadoEmpleados [i][11] = String.valueOf(listaempleados.get(i).getSueldo_emp());
                datoslistadoEmpleados [i][12] = String.valueOf(listaempleados.get(i).getId_comuna());
                datoslistadoEmpleados [i][13] = String.valueOf(listaempleados.get(i).getId_categoria_emp());
                datoslistadoEmpleados [i][14] = String.valueOf(listaempleados.get(i).getNumrut_supervisor());
                
                tabla.addRow(datoslistadoEmpleados[i]);
            }
            
            tablaTodosLosEmpleados.setModel(tabla);
        }    
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnMostrarTodosLosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosLosEmpleadosActionPerformed
        DefaultTableModel tabla = (DefaultTableModel)tablaTodosLosEmpleados.getModel();
        EmpleadoDao empleadoDao = new EmpleadoDao();
        ArrayList<Empleado> listaempleados = empleadoDao.todosLosEmpleados();
        
        limpiarTabla();
        
        if(listaempleados.isEmpty()){
            JOptionPane.showMessageDialog(this, "No Existen Empleados");
        }else{
            String [][] datoslistadoEmpleados = new String[listaempleados.size()][15];
            
            for (int i = 0; i < listaempleados.size(); i++) {
                datoslistadoEmpleados [i][0] = String.valueOf(listaempleados.get(i).getNumrut_emp());
                datoslistadoEmpleados [i][1] = String.valueOf(listaempleados.get(i).getDvrut_emp());
                datoslistadoEmpleados [i][2] = String.valueOf(listaempleados.get(i).getAppaterno_emp());
                datoslistadoEmpleados [i][3] = String.valueOf(listaempleados.get(i).getApmaterno_emp());
                datoslistadoEmpleados [i][4] = String.valueOf(listaempleados.get(i).getNombre_emp());
                datoslistadoEmpleados [i][5] = String.valueOf(listaempleados.get(i).getDireccion_emp());
                datoslistadoEmpleados [i][6] = String.valueOf(listaempleados.get(i).getId_estcivil());
                datoslistadoEmpleados [i][7] = String.valueOf(listaempleados.get(i).getFonofijo_emp());
                datoslistadoEmpleados [i][8] = String.valueOf(listaempleados.get(i).getCelular_emp());
                datoslistadoEmpleados [i][9] = String.valueOf(listaempleados.get(i).getFecnac_emp());
                datoslistadoEmpleados [i][10] = String.valueOf(listaempleados.get(i).getFecing_emp());
                datoslistadoEmpleados [i][11] = String.valueOf(listaempleados.get(i).getSueldo_emp());
                datoslistadoEmpleados [i][12] = String.valueOf(listaempleados.get(i).getId_comuna());
                datoslistadoEmpleados [i][13] = String.valueOf(listaempleados.get(i).getId_categoria_emp());
                datoslistadoEmpleados [i][14] = String.valueOf(listaempleados.get(i).getNumrut_supervisor());

                tabla.addRow(datoslistadoEmpleados[i]);
            }
        }
        tablaTodosLosEmpleados.setModel(tabla);
    }//GEN-LAST:event_btnMostrarTodosLosEmpleadosActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        
        int filaSeleccionada = tablaTodosLosEmpleados.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Seleccionar Una Fila");
        }else{
            
            int numrut_emp = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 0)));
            char dvrut_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 1)).charAt(0);
            String appaterno_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 2));
            String apmaterno_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada,3));
            String nombre_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 4));
            String direccion_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 5));
            int id_estcivil = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 6)));
            String fonofijo_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 7));
            String celular_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 8));
            String fecnac_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 9)); //debe ser formato yyyy-mm-d = d
            String fecing_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 10));
            int sueldo_emp = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 11)));
            int id_comuna = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 12)));
            int id_categoria_emp = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 13)));
            int numrut_supervisor = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 14)));
            
            Empleado empleado = new Empleado(numrut_emp, dvrut_emp, appaterno_emp, apmaterno_emp, nombre_emp, direccion_emp, id_estcivil, fonofijo_emp, celular_emp, fecnac_emp, fecing_emp, sueldo_emp, id_comuna, id_categoria_emp, numrut_supervisor);
            
            EmpleadoDao empleadoDao = new EmpleadoDao();
            
            empleadoDao.actualizarEmpleado(empleado);
            
            JOptionPane.showMessageDialog(this, "Empleado Actualizado");
        }
        
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        int filaSeleccionada = tablaTodosLosEmpleados.getSelectedRow();
        
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Seleccionar Una Fila");
        }else{
            
            int numrut_emp = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 0)));
            char dvrut_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 1)).charAt(0);
            String appaterno_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 2));
            String apmaterno_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada,3));
            String nombre_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 4));
            String direccion_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 5));
            int id_estcivil = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 6)));
            String fonofijo_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 7));
            String celular_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 8));
            String fecnac_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 9)); //debe ser formato yyyy-mm-d = d
            String fecing_emp = String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 10));
            int sueldo_emp = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 11)));
            int id_comuna = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 12)));
            int id_categoria_emp = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 13)));
            int numrut_supervisor = Integer.parseInt(String.valueOf(tablaTodosLosEmpleados.getValueAt(filaSeleccionada, 14)));
            
            Empleado empleado = new Empleado(numrut_emp, dvrut_emp, appaterno_emp, apmaterno_emp, nombre_emp, direccion_emp, id_estcivil, fonofijo_emp, celular_emp, fecnac_emp, fecing_emp, sueldo_emp, id_comuna, id_categoria_emp, numrut_supervisor);
            
            EmpleadoDao empleadoDao = new EmpleadoDao();
            
            empleadoDao.eliminarEmpleado(empleado);
            
            JOptionPane.showMessageDialog(this, "Empleado Eliminado");
            
            btnMostrarTodosLosEmpleados.doClick();
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnIngresarNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoEmpleadoActionPerformed
        VentanaIngresarEmpleado ventanaIngresarEmpleado = new VentanaIngresarEmpleado();
        abrirVentana(ventanaIngresarEmpleado,"Ingreso Nuevo Empleado");
    }//GEN-LAST:event_btnIngresarNuevoEmpleadoActionPerformed

    private void abrirVentana(javax.swing.JFrame Ventana, String tituloVentana){
        
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setTitle(tituloVentana);
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void limpiarTabla(){
        DefaultTableModel dtm=(DefaultTableModel)tablaTodosLosEmpleados.getModel();
        int n=tablaTodosLosEmpleados.getRowCount();
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
            java.util.logging.Logger.getLogger(VentanaMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMostrarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnIngresarNuevoEmpleado;
    private javax.swing.JButton btnMostrarTodosLosEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTodosLosEmpleados;
    // End of variables declaration//GEN-END:variables
}
