/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;
import controlador.MisMetodos;
import modelo.Propiedad;
import controlador.PropiedadDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aleja
 */
public class PanelMostrarPropiedad extends javax.swing.JPanel {
    Propiedad propiedad;
    PropiedadDao propiedadDao = new PropiedadDao();
    MisMetodos misMetodos =new MisMetodos();
    DefaultTableModel tabla;
    /**
     * Creates new form PanelMostrarPropiedad
     */
    public PanelMostrarPropiedad() {
        initComponents();
        btnMostrarTodasLasPropiedades.doClick();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTodasLasPropiedades = new javax.swing.JTable();
        btnIngresarNuevaPropiedad = new javax.swing.JButton();
        btnBuscarPropiedad = new javax.swing.JButton();
        btnMostrarTodasLasPropiedades = new javax.swing.JButton();
        btnModificarPropiedad = new javax.swing.JButton();
        btnEliminarPropiedad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tablaTodasLasPropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Propiedad", "Direccion", "Superficie", "Dormitorios", "Baños", "Valor Arriendo", "Gasto Comun", "Tipo Propiedad", "Comuna", "Rut Propietario", "Rut Empleado"
            }
        ));
        jScrollPane1.setViewportView(tablaTodasLasPropiedades);
        if (tablaTodasLasPropiedades.getColumnModel().getColumnCount() > 0) {
            tablaTodasLasPropiedades.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaTodasLasPropiedades.getColumnModel().getColumn(4).setPreferredWidth(50);
            tablaTodasLasPropiedades.getColumnModel().getColumn(8).setPreferredWidth(50);
        }

        btnIngresarNuevaPropiedad.setText("Ingresar Nueva Propiedad");
        btnIngresarNuevaPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevaPropiedadActionPerformed(evt);
            }
        });

        btnBuscarPropiedad.setText("Buscar Propiedad");
        btnBuscarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPropiedadActionPerformed(evt);
            }
        });

        btnMostrarTodasLasPropiedades.setText("Mostrar Todas Las Propiedades");
        btnMostrarTodasLasPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodasLasPropiedadesActionPerformed(evt);
            }
        });

        btnModificarPropiedad.setText("Modificar Propiedad");
        btnModificarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPropiedadActionPerformed(evt);
            }
        });

        btnEliminarPropiedad.setText("Eliminar Propiedad");
        btnEliminarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPropiedadActionPerformed(evt);
            }
        });

        jLabel1.setText("Propiedades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnIngresarNuevaPropiedad)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPropiedad)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodasLasPropiedades)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarPropiedad)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPropiedad))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarNuevaPropiedad)
                    .addComponent(btnBuscarPropiedad)
                    .addComponent(btnMostrarTodasLasPropiedades)
                    .addComponent(btnModificarPropiedad)
                    .addComponent(btnEliminarPropiedad))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarNuevaPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevaPropiedadActionPerformed
        VentanaIngresarPropiedad ventanaIngresarPropiedad = new VentanaIngresarPropiedad();
        misMetodos.abrirVentana(ventanaIngresarPropiedad,"Ingreso Nueva Propiedad");
    }//GEN-LAST:event_btnIngresarNuevaPropiedadActionPerformed

    private void btnBuscarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPropiedadActionPerformed

        tabla = (DefaultTableModel)tablaTodasLasPropiedades.getModel();
        int nro_propiedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero propiedad"));
        ArrayList<Propiedad> listaPropiedades = propiedadDao.buscarPropiedad(nro_propiedad);

        misMetodos.tablaLimpiar(tablaTodasLasPropiedades);

        if (listaPropiedades.isEmpty()){
            JOptionPane.showMessageDialog(this,"No existe Propiedad");
        }else{

            String [][] datoslistaPropiedades = new String[listaPropiedades.size()][11];

            for (int i = 0; i < listaPropiedades.size(); i++) {
                datoslistaPropiedades[i][0] = String.valueOf(listaPropiedades.get(i).getNro_propiedad());
                datoslistaPropiedades[i][1] = String.valueOf(listaPropiedades.get(i).getDireccion_propiedad());
                datoslistaPropiedades[i][2] = String.valueOf(listaPropiedades.get(i).getSuperficie());
                datoslistaPropiedades[i][3] = String.valueOf(listaPropiedades.get(i).getNro_dormitorios());
                datoslistaPropiedades[i][4] = String.valueOf(listaPropiedades.get(i).getNro_banos());
                datoslistaPropiedades[i][5] = String.valueOf(listaPropiedades.get(i).getValor_arriendo());
                datoslistaPropiedades[i][6] = String.valueOf(listaPropiedades.get(i).getValor_gasto_comun());
                datoslistaPropiedades[i][7] = String.valueOf(listaPropiedades.get(i).getId_tipo_propiedad());
                datoslistaPropiedades[i][8] = String.valueOf(listaPropiedades.get(i).getId_comuna());
                datoslistaPropiedades[i][9] = String.valueOf(listaPropiedades.get(i).getNumrut_prop());
                datoslistaPropiedades[i][10] = String.valueOf(listaPropiedades.get(i).getNumrut_emp());

                tabla.addRow(datoslistaPropiedades[i]);
            }

            tablaTodasLasPropiedades.setModel(tabla);
            misMetodos.tablaCentrarDatos(tablaTodasLasPropiedades);
        }
    }//GEN-LAST:event_btnBuscarPropiedadActionPerformed

    private void btnMostrarTodasLasPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodasLasPropiedadesActionPerformed
        tabla = (DefaultTableModel)tablaTodasLasPropiedades.getModel();
        ArrayList<Propiedad> listaPropiedades = propiedadDao.todasLasPropiedades();

        misMetodos.tablaLimpiar(tablaTodasLasPropiedades);

        if (listaPropiedades.isEmpty()){
            JOptionPane.showMessageDialog(this,"No existen Propiedades");
        }else{

            String [][] datoslistaPropiedades = new String[listaPropiedades.size()][11];

            for (int i = 0; i < listaPropiedades.size(); i++) {
                datoslistaPropiedades[i][0] = String.valueOf(listaPropiedades.get(i).getNro_propiedad());
                datoslistaPropiedades[i][1] = String.valueOf(listaPropiedades.get(i).getDireccion_propiedad());
                datoslistaPropiedades[i][2] = String.valueOf(listaPropiedades.get(i).getSuperficie());
                datoslistaPropiedades[i][3] = String.valueOf(listaPropiedades.get(i).getNro_dormitorios());
                datoslistaPropiedades[i][4] = String.valueOf(listaPropiedades.get(i).getNro_banos());
                datoslistaPropiedades[i][5] = String.valueOf(listaPropiedades.get(i).getValor_arriendo());
                datoslistaPropiedades[i][6] = String.valueOf(listaPropiedades.get(i).getValor_gasto_comun());
                datoslistaPropiedades[i][7] = String.valueOf(listaPropiedades.get(i).getId_tipo_propiedad());
                datoslistaPropiedades[i][8] = String.valueOf(listaPropiedades.get(i).getId_comuna());
                datoslistaPropiedades[i][9] = String.valueOf(listaPropiedades.get(i).getNumrut_prop());
                datoslistaPropiedades[i][10] = String.valueOf(listaPropiedades.get(i).getNumrut_emp());

                tabla.addRow(datoslistaPropiedades[i]);
            }

            tablaTodasLasPropiedades.setModel(tabla);
            misMetodos.tablaCentrarDatos(tablaTodasLasPropiedades);
        }
    }//GEN-LAST:event_btnMostrarTodasLasPropiedadesActionPerformed

    private void btnModificarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPropiedadActionPerformed

        int filaSeleccionada = tablaTodasLasPropiedades.getSelectedRow();

        if (filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");
        }else{
            int nro_propiedad = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 0)));
            String direccion_propiedad = String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 1));
            float superficie = Float.valueOf(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 2)));
            int nro_dormitorios = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 3)));
            int nro_banos = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 4)));
            int valor_arriendo = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 5)));
            int valor_gasto_comun = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 6)));
            char id_tipo_propiedad = String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 7)).charAt(0);
            int id_comuna = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 8)));
            int numrut_prop = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 9)));
            int numrut_emp = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 10)));

            propiedad = new Propiedad(nro_propiedad, direccion_propiedad, superficie, nro_dormitorios, nro_banos, valor_arriendo, valor_gasto_comun, id_tipo_propiedad, id_comuna, numrut_prop, numrut_emp);
            propiedadDao.actualizarPropiedad(propiedad);

            JOptionPane.showMessageDialog(this,"Propiedad Modificada");
        }
    }//GEN-LAST:event_btnModificarPropiedadActionPerformed

    private void btnEliminarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPropiedadActionPerformed
        int filaSeleccionada = tablaTodasLasPropiedades.getSelectedRow();

        if (filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");
        }else{
            int nro_propiedad = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 0)));
            String direccion_propiedad = String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 1));
            float superficie = Float.valueOf(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 2)));
            int nro_dormitorios = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 3)));
            int nro_banos = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 4)));
            int valor_arriendo = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 5)));
            int valor_gasto_comun = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 6)));
            char id_tipo_propiedad = String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 7)).charAt(0);
            int id_comuna = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 8)));
            int numrut_prop = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 9)));
            int numrut_emp = Integer.parseInt(String.valueOf(tablaTodasLasPropiedades.getValueAt(filaSeleccionada, 10)));

            propiedad = new Propiedad(nro_propiedad, direccion_propiedad, superficie, nro_dormitorios, nro_banos, valor_arriendo, valor_gasto_comun, id_tipo_propiedad, id_comuna, numrut_prop, numrut_emp);
            propiedadDao.eliminarPropiedad(propiedad);

            JOptionPane.showMessageDialog(this,"Propiedad Eliminada");

            btnMostrarTodasLasPropiedades.doClick();
        }
    }//GEN-LAST:event_btnEliminarPropiedadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPropiedad;
    private javax.swing.JButton btnEliminarPropiedad;
    private javax.swing.JButton btnIngresarNuevaPropiedad;
    private javax.swing.JButton btnModificarPropiedad;
    private javax.swing.JButton btnMostrarTodasLasPropiedades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTodasLasPropiedades;
    // End of variables declaration//GEN-END:variables
}
