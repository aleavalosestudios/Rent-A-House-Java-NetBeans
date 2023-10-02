/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package vista;
import controlador.MisMetodos;
import modelo.PropiedadArrendada;
import controlador.PropiedadArrendadaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aleja
 */
public class PanelMostrarPropiedadArrendada extends javax.swing.JPanel {
    PropiedadArrendada propiedadArrendada;
    PropiedadArrendadaDao propiedadArrendadaDao = new PropiedadArrendadaDao();
    MisMetodos misMetodos = new MisMetodos();
    DefaultTableModel tabla;
    
    /** Creates new form PanelMostrarPropiedadArrendada */
    public PanelMostrarPropiedadArrendada() {
        initComponents();
        btnMostrarPropiedadesArrendadas.doClick();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscarPropiedadesArrendadas = new javax.swing.JButton();
        btnMostrarPropiedadesArrendadas = new javax.swing.JButton();
        btnActualizarPropiedadArrendada = new javax.swing.JButton();
        btnEliminarPropiedadArrendada = new javax.swing.JButton();
        btnIngresarNuevaVentana = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTodasLasPropiedadesArrendadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        btnBuscarPropiedadesArrendadas.setText("Buscar Propiedades Arrendadas");
        btnBuscarPropiedadesArrendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPropiedadesArrendadasActionPerformed(evt);
            }
        });

        btnMostrarPropiedadesArrendadas.setText("Mostrar Todas las Propiedades Arrendadas");
        btnMostrarPropiedadesArrendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPropiedadesArrendadasActionPerformed(evt);
            }
        });

        btnActualizarPropiedadArrendada.setText("Modificar propiedad Arrendada");
        btnActualizarPropiedadArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPropiedadArrendadaActionPerformed(evt);
            }
        });

        btnEliminarPropiedadArrendada.setText("Eliminar Propiedad Arrendada");
        btnEliminarPropiedadArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPropiedadArrendadaActionPerformed(evt);
            }
        });

        btnIngresarNuevaVentana.setText("Ingresar Nuevo Arriendo");
        btnIngresarNuevaVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevaVentanaActionPerformed(evt);
            }
        });

        tablaTodasLasPropiedadesArrendadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Propiedad", "Inicio Arriendo", "Termino Arriendo", "Rut Cliente"
            }
        ));
        jScrollPane1.setViewportView(tablaTodasLasPropiedadesArrendadas);

        jLabel1.setText("Propiedades Arrendadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarPropiedadesArrendadas)
                            .addComponent(btnIngresarNuevaVentana)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMostrarPropiedadesArrendadas)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarPropiedadArrendada)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPropiedadArrendada)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresarNuevaVentana)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPropiedadesArrendadas))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPropiedadesArrendadas)
                    .addComponent(btnActualizarPropiedadArrendada)
                    .addComponent(btnEliminarPropiedadArrendada))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPropiedadesArrendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPropiedadesArrendadasActionPerformed
        tabla = (DefaultTableModel)tablaTodasLasPropiedadesArrendadas.getModel();
        propiedadArrendadaDao = new PropiedadArrendadaDao();

        int nro_propiedad = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese numero de propiedad")));

        ArrayList<PropiedadArrendada> listaPropiedadesArrendadas = propiedadArrendadaDao.buscarPropiedadesArrendadas(nro_propiedad);

        if(listaPropiedadesArrendadas.isEmpty()){
            JOptionPane.showMessageDialog(this,"Propiedad No Existe");
        }else{
            String [][] datoslistaPropiedadesArrendadas = new String[listaPropiedadesArrendadas.size()][4];

            for (int i = 0; i < listaPropiedadesArrendadas.size(); i++) {
                datoslistaPropiedadesArrendadas[i][0] = String.valueOf(listaPropiedadesArrendadas.get(i).getNro_propiedad());
                datoslistaPropiedadesArrendadas[i][1] = listaPropiedadesArrendadas.get(i).getFecini_arriendo();
                datoslistaPropiedadesArrendadas[i][2] = listaPropiedadesArrendadas.get(i).getFecter_arriendo();
                datoslistaPropiedadesArrendadas[i][3] = String.valueOf(listaPropiedadesArrendadas.get(i).getNumrut_cli());

                tabla.addRow(datoslistaPropiedadesArrendadas[i]);
            }
            tablaTodasLasPropiedadesArrendadas.setModel(tabla);
            misMetodos.tablaCentrarDatos(tablaTodasLasPropiedadesArrendadas);
        }
    }//GEN-LAST:event_btnBuscarPropiedadesArrendadasActionPerformed

    private void btnMostrarPropiedadesArrendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPropiedadesArrendadasActionPerformed
        tabla = (DefaultTableModel)tablaTodasLasPropiedadesArrendadas.getModel();
        propiedadArrendadaDao = new PropiedadArrendadaDao();

        ArrayList<PropiedadArrendada> listaPropiedadesArrendadas = propiedadArrendadaDao.todasLasPropiedadesArrendadas();

        misMetodos.tablaLimpiar(tablaTodasLasPropiedadesArrendadas);

        if(listaPropiedadesArrendadas.isEmpty()){
            JOptionPane.showMessageDialog(this," No Existen Propiedades Arrendadas");
        }else{
            String [][] datoslistaPropiedadesArrendadas = new String[listaPropiedadesArrendadas.size()][4];

            for (int i = 0; i < listaPropiedadesArrendadas.size(); i++) {
                datoslistaPropiedadesArrendadas[i][0] = String.valueOf(listaPropiedadesArrendadas.get(i).getNro_propiedad());
                datoslistaPropiedadesArrendadas[i][1] = listaPropiedadesArrendadas.get(i).getFecini_arriendo();
                datoslistaPropiedadesArrendadas[i][2] = listaPropiedadesArrendadas.get(i).getFecter_arriendo();
                datoslistaPropiedadesArrendadas[i][3] = String.valueOf(listaPropiedadesArrendadas.get(i).getNumrut_cli());

                tabla.addRow(datoslistaPropiedadesArrendadas[i]);
            }
            tablaTodasLasPropiedadesArrendadas.setModel(tabla);
            misMetodos.tablaCentrarDatos(tablaTodasLasPropiedadesArrendadas);

        }
    }//GEN-LAST:event_btnMostrarPropiedadesArrendadasActionPerformed

    private void btnActualizarPropiedadArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPropiedadArrendadaActionPerformed

        int filaSeleccionada = tablaTodasLasPropiedadesArrendadas.getSelectedRow();

        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");
        }else{
            int nro_propiedad = Integer.parseInt(String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,0)));
            String fecini_arriendo = String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,1));
            String fecter_arriendo = String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,2));
            int numrut_cli = Integer.parseInt(String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,3)));

            propiedadArrendada = new PropiedadArrendada(nro_propiedad, fecini_arriendo, fecter_arriendo, numrut_cli);
            propiedadArrendadaDao.actualizarPropiedadArrendada(propiedadArrendada);

            JOptionPane.showMessageDialog(this,"Propiedad Arrendada Modificada");

            btnMostrarPropiedadesArrendadas.doClick();
        }
    }//GEN-LAST:event_btnActualizarPropiedadArrendadaActionPerformed

    private void btnEliminarPropiedadArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPropiedadArrendadaActionPerformed
        int filaSeleccionada = tablaTodasLasPropiedadesArrendadas.getSelectedRow();

        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");
        }else{
            int nro_propiedad = Integer.parseInt(String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,0)));
            String fecini_arriendo = String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,1));
            String fecter_arriendo = String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,2));
            int numrut_cli = Integer.parseInt(String.valueOf(tablaTodasLasPropiedadesArrendadas.getValueAt(filaSeleccionada,3)));

            propiedadArrendada = new PropiedadArrendada(nro_propiedad, fecini_arriendo, fecter_arriendo, numrut_cli);
            propiedadArrendadaDao.eliminarPropiedadArrendada(propiedadArrendada);

            JOptionPane.showMessageDialog(this,"Propiedad Arrendada eliminada");

            btnMostrarPropiedadesArrendadas.doClick();
        }
    }//GEN-LAST:event_btnEliminarPropiedadArrendadaActionPerformed

    private void btnIngresarNuevaVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevaVentanaActionPerformed
        VentanaIngresoPropiedadArrendada ventanaIngresoPropiedadArrendada = new VentanaIngresoPropiedadArrendada();
        misMetodos.abrirVentana(ventanaIngresoPropiedadArrendada,"Ingreso Nuevo Arriendo De Propiedad");
    }//GEN-LAST:event_btnIngresarNuevaVentanaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPropiedadArrendada;
    private javax.swing.JButton btnBuscarPropiedadesArrendadas;
    private javax.swing.JButton btnEliminarPropiedadArrendada;
    private javax.swing.JButton btnIngresarNuevaVentana;
    private javax.swing.JButton btnMostrarPropiedadesArrendadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTodasLasPropiedadesArrendadas;
    // End of variables declaration//GEN-END:variables

}
