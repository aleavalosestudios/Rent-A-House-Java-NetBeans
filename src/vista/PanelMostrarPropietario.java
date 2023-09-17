/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;
import modelo.Propietario;
import controlador.PropietarioDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author aleja
 */
public class PanelMostrarPropietario extends javax.swing.JPanel {
    PropietarioDao propietarioDao = new PropietarioDao();
    Propietario propietario;
    /**
     * Creates new form PanelMostrarPropietario
     */
    public PanelMostrarPropietario() {
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

        btnBuscarPropietario = new javax.swing.JButton();
        btnMostrarPropietarios = new javax.swing.JButton();
        btnModificarPropietario = new javax.swing.JButton();
        btnEliminarPropietario = new javax.swing.JButton();
        btnIngresarNuevoPropietario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        btnBuscarPropietario.setText("Buscar Propietario");
        btnBuscarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPropietarioActionPerformed(evt);
            }
        });

        btnMostrarPropietarios.setText("Mostrar Propietarios");
        btnMostrarPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPropietariosActionPerformed(evt);
            }
        });

        btnModificarPropietario.setText("Modificar Propietario");
        btnModificarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPropietarioActionPerformed(evt);
            }
        });

        btnEliminarPropietario.setText("Eliminar Propietario");
        btnEliminarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPropietarioActionPerformed(evt);
            }
        });

        btnIngresarNuevoPropietario.setText("Ingresar Nuevo Propietario");
        btnIngresarNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoPropietarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Propietarios");

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Dv", "Apellido Paterno", "Apellido Materno", "Nombre", "Direccion", "Estado Civil", "Fono Fijo", "Celular", "Comuna"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarPropietario)
                            .addComponent(btnBuscarPropietario)
                            .addComponent(btnMostrarPropietarios)
                            .addComponent(btnEliminarPropietario)
                            .addComponent(btnIngresarNuevoPropietario))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(508, 508, 508))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresarNuevoPropietario)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPropietario)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarPropietarios)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarPropietario)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPropietario)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPropietarioActionPerformed

        int numrut_prop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Rut Propietario"));

        DefaultTableModel tabla = (DefaultTableModel)tablaEmpleados.getModel();

        ArrayList<Propietario> listaPropietario = propietarioDao.buscarPropietario(numrut_prop);

        if(listaPropietario.isEmpty()){
            JOptionPane.showInputDialog("Ingrese Rut Propietario");
        }else{
            String [][] datosListaPropietario = new String[listaPropietario.size()][10];

            for(int i = 0; i < listaPropietario.size(); i++) {

                datosListaPropietario[i][0] = String.valueOf(listaPropietario.get(i).getNumrut_prop());
                datosListaPropietario[i][1] = String.valueOf(listaPropietario.get(i).getDvrut_prop());
                datosListaPropietario[i][2] = listaPropietario.get(i).getAppaterno_prop();
                datosListaPropietario[i][3] = listaPropietario.get(i).getApmaterno_prop();
                datosListaPropietario[i][4] = listaPropietario.get(i).getNombre_prop();
                datosListaPropietario[i][5] = listaPropietario.get(i).getDireccion_prop();
                datosListaPropietario[i][6] = String.valueOf(listaPropietario.get(i).getId_estcivil());
                datosListaPropietario[i][7] = listaPropietario.get(i).getFonofijo_prop();
                datosListaPropietario[i][8] = listaPropietario.get(i).getCelular_prop();
                datosListaPropietario[i][9] = String.valueOf(listaPropietario.get(i).getId_comuna());

                tabla.addRow(datosListaPropietario[i]);
            }

            tablaEmpleados.setModel(tabla);
        }
    }//GEN-LAST:event_btnBuscarPropietarioActionPerformed

    private void btnMostrarPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPropietariosActionPerformed

        DefaultTableModel tabla = (DefaultTableModel)tablaEmpleados.getModel();

        ArrayList<Propietario> listaPropietario = propietarioDao.mostrarTodosLosPropietarios();

        if(listaPropietario.isEmpty()){
            JOptionPane.showInputDialog("No Existen Propietarios");
        }else{
            String [][] datosListaPropietario = new String[listaPropietario.size()][10];

            for(int i = 0; i < listaPropietario.size(); i++) {

                datosListaPropietario[i][0] = String.valueOf(listaPropietario.get(i).getNumrut_prop());
                datosListaPropietario[i][1] = String.valueOf(listaPropietario.get(i).getDvrut_prop());
                datosListaPropietario[i][2] = listaPropietario.get(i).getAppaterno_prop();
                datosListaPropietario[i][3] = listaPropietario.get(i).getApmaterno_prop();
                datosListaPropietario[i][4] = listaPropietario.get(i).getNombre_prop();
                datosListaPropietario[i][5] = listaPropietario.get(i).getDireccion_prop();
                datosListaPropietario[i][6] = String.valueOf(listaPropietario.get(i).getId_estcivil());
                datosListaPropietario[i][7] = listaPropietario.get(i).getFonofijo_prop();
                datosListaPropietario[i][8] = listaPropietario.get(i).getCelular_prop();
                datosListaPropietario[i][9] = String.valueOf(listaPropietario.get(i).getId_comuna());

                tabla.addRow(datosListaPropietario[i]);
            }

            tablaEmpleados.setModel(tabla);
        }
    }//GEN-LAST:event_btnMostrarPropietariosActionPerformed

    private void btnModificarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPropietarioActionPerformed

        int filaSeleccionada = tablaEmpleados.getSelectedRow();

        if(filaSeleccionada == -1){
            JOptionPane.showInputDialog("Debe Seleccionar Una Fila");
        }else{

            int numrut_prop = Integer.parseInt(String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,0)));
            char dvrut_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,1)).charAt(0);
            String appaterno_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,2));
            String apmaterno_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,3));
            String nombre_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,4));
            String direccion_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,5));
            int id_estcivil = Integer.parseInt(String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,6)));
            String fonofijo_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,7));
            String celular_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,8));
            int id_comuna = Integer.parseInt(String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,9)));

            propietario = new Propietario(numrut_prop, dvrut_prop, appaterno_prop, apmaterno_prop, nombre_prop, direccion_prop, id_estcivil, fonofijo_prop, celular_prop, id_comuna);

            propietarioDao.actualizarPropietario(propietario);

            JOptionPane.showMessageDialog(this,"Propietario Modificado");
        }
    }//GEN-LAST:event_btnModificarPropietarioActionPerformed

    private void btnEliminarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPropietarioActionPerformed
        int filaSeleccionada = tablaEmpleados.getSelectedRow();

        if(filaSeleccionada == -1){
            JOptionPane.showInputDialog("Debe Seleccionar Una Fila");
        }else{

            int numrut_prop = Integer.parseInt(String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,0)));
            char dvrut_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,1)).charAt(0);
            String appaterno_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,2));
            String apmaterno_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,3));
            String nombre_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,4));
            String direccion_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,5));
            int id_estcivil = Integer.parseInt(String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,6)));
            String fonofijo_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,7));
            String celular_prop = String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,8));
            int id_comuna = Integer.parseInt(String.valueOf(tablaEmpleados.getValueAt(filaSeleccionada,9)));

            propietario = new Propietario(numrut_prop, dvrut_prop, appaterno_prop, apmaterno_prop, nombre_prop, direccion_prop, id_estcivil, fonofijo_prop, celular_prop, id_comuna);

            propietarioDao.eliminarPropietario(propietario);

            JOptionPane.showMessageDialog(this,"Propietario Eliminado");
        }
    }//GEN-LAST:event_btnEliminarPropietarioActionPerformed

    private void btnIngresarNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoPropietarioActionPerformed
        VentanaIngresarPropietario ventanaIngresarPropietario = new VentanaIngresarPropietario();
        abrirVentana(ventanaIngresarPropietario,"Ingreso Nuevo Propietario");
    }//GEN-LAST:event_btnIngresarNuevoPropietarioActionPerformed

     private void abrirVentana(javax.swing.JFrame Ventana, String tituloVentana){
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setTitle(tituloVentana);
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void limpiarTabla(){
        DefaultTableModel dtm=(DefaultTableModel)tablaEmpleados.getModel();
        int n=tablaEmpleados.getRowCount();
        for (int i = 0; i < n ; i++) {
            dtm.removeRow(dtm.getRowCount()-1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPropietario;
    private javax.swing.JButton btnEliminarPropietario;
    private javax.swing.JButton btnIngresarNuevoPropietario;
    private javax.swing.JButton btnModificarPropietario;
    private javax.swing.JButton btnMostrarPropietarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
}
