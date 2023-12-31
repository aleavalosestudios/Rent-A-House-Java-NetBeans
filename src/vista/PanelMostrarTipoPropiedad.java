/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;
import controlador.MisMetodos;
import modelo.TipoPropiedad;
import controlador.TipoPropiedadDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleja
 */
public class PanelMostrarTipoPropiedad extends javax.swing.JPanel {
    TipoPropiedad tipoPropiedad;
    TipoPropiedadDao tipoPropiedadDao = new TipoPropiedadDao();
    MisMetodos misMetodos = new MisMetodos();
    DefaultTableModel tabla;
    /**
     * Creates new form PanelMostrarTipoPropiedad
     */
    public PanelMostrarTipoPropiedad() {
        initComponents();
        btnMostrarTodosLosTiposDePropiedad.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscarTipoPropiedad = new javax.swing.JButton();
        btnMostrarTodosLosTiposDePropiedad = new javax.swing.JButton();
        btnEditarTipoPropiedad = new javax.swing.JButton();
        btnEliminarTipoPropiedad = new javax.swing.JButton();
        btnNuevoIngresoTipoPropiedad = new javax.swing.JButton();
        labelTitulopanelMostrarTipoPropiedad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoPropiedad = new javax.swing.JTable();

        btnBuscarTipoPropiedad.setText("Buscar Tipo Propiedad");
        btnBuscarTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoPropiedadActionPerformed(evt);
            }
        });

        btnMostrarTodosLosTiposDePropiedad.setText("Mostrar Todos Los Tipos De Propiedad");
        btnMostrarTodosLosTiposDePropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosLosTiposDePropiedadActionPerformed(evt);
            }
        });

        btnEditarTipoPropiedad.setText("Editar Tipo Propiedad");
        btnEditarTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTipoPropiedadActionPerformed(evt);
            }
        });

        btnEliminarTipoPropiedad.setText("Eliminar Tipo Propiedad");
        btnEliminarTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoPropiedadActionPerformed(evt);
            }
        });

        btnNuevoIngresoTipoPropiedad.setText("Ingresar Nuevo Tipo de Propiedad");
        btnNuevoIngresoTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoIngresoTipoPropiedadActionPerformed(evt);
            }
        });

        labelTitulopanelMostrarTipoPropiedad.setText("Tipos de Propiedades");

        tablaTipoPropiedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Tipo Propiedad", "TIpo Propiedad"
            }
        ));
        jScrollPane1.setViewportView(tablaTipoPropiedad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(labelTitulopanelMostrarTipoPropiedad))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarTipoPropiedad)
                            .addComponent(btnNuevoIngresoTipoPropiedad)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMostrarTodosLosTiposDePropiedad)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarTipoPropiedad)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarTipoPropiedad)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulopanelMostrarTipoPropiedad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevoIngresoTipoPropiedad)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarTipoPropiedad)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarTodosLosTiposDePropiedad)
                    .addComponent(btnEditarTipoPropiedad)
                    .addComponent(btnEliminarTipoPropiedad))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoPropiedadActionPerformed

        tabla = (DefaultTableModel)tablaTipoPropiedad.getModel();

        String desc_tipoPropiedad = JOptionPane.showInputDialog("Ingrese Descripcion Tipo Propiedad");
        ArrayList<TipoPropiedad> listaBuscarTipoPropiedad = tipoPropiedadDao.buscarTipoPropiedadPorDescripcion(desc_tipoPropiedad);

        misMetodos.tablaLimpiar(tablaTipoPropiedad);

        if(listaBuscarTipoPropiedad.isEmpty()){
            JOptionPane.showMessageDialog(this,"Tipo De Propiedad No Existe");
        }else{
            String[][] datosListaBuscarTipoPropiedad = new String[listaBuscarTipoPropiedad.size()][2];

            for (int i = 0; i < listaBuscarTipoPropiedad.size(); i++) {

                datosListaBuscarTipoPropiedad[i][0] = String.valueOf(listaBuscarTipoPropiedad.get(i).getId_tipo_propiedad());
                datosListaBuscarTipoPropiedad[i][1] = listaBuscarTipoPropiedad.get(i).getDesc_tipo_propiedad();

                tabla.addRow(datosListaBuscarTipoPropiedad[i]);
            }
            tablaTipoPropiedad.setModel(tabla);
            misMetodos.tablaCentrarDatos(tablaTipoPropiedad);
        }
    }//GEN-LAST:event_btnBuscarTipoPropiedadActionPerformed

    private void btnMostrarTodosLosTiposDePropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosLosTiposDePropiedadActionPerformed

        tabla = (DefaultTableModel)tablaTipoPropiedad.getModel();
        ArrayList<TipoPropiedad> listaTodosLosTiposDePropiedad = tipoPropiedadDao.todosLosTipoPropiedad();

        misMetodos.tablaLimpiar(tablaTipoPropiedad);

        if(listaTodosLosTiposDePropiedad.isEmpty()){
            JOptionPane.showMessageDialog(this,"No existen Tipos de Propiedad");
        }else{
            String[][] datosListatodosLosTiposDePropiedad = new String[listaTodosLosTiposDePropiedad.size()][2];

            for (int i = 0; i < listaTodosLosTiposDePropiedad.size(); i++) {
                datosListatodosLosTiposDePropiedad[i][0] = String.valueOf(listaTodosLosTiposDePropiedad.get(i).getId_tipo_propiedad());
                datosListatodosLosTiposDePropiedad[i][1] = String.valueOf(listaTodosLosTiposDePropiedad.get(i).getDesc_tipo_propiedad());

                tabla.addRow(datosListatodosLosTiposDePropiedad[i]);
            }

            tablaTipoPropiedad.setModel(tabla);
            misMetodos.tablaCentrarDatos(tablaTipoPropiedad);
        }
    }//GEN-LAST:event_btnMostrarTodosLosTiposDePropiedadActionPerformed

    private void btnEditarTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTipoPropiedadActionPerformed

        int filaSelecionada = tablaTipoPropiedad.getSelectedRow();

        if(filaSelecionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");

        }else{
            String id_tipoPropiedadString = String.valueOf(tablaTipoPropiedad.getValueAt(filaSelecionada,0));
            char id_tipoPropiedadChar = id_tipoPropiedadString.charAt(0);
            String desc_tipoPropiedad = String.valueOf(tablaTipoPropiedad.getValueAt(filaSelecionada, 1));

            tipoPropiedad = new TipoPropiedad(id_tipoPropiedadChar, desc_tipoPropiedad);
            tipoPropiedadDao.actualizarTipPropiedad(tipoPropiedad);

            JOptionPane.showMessageDialog(this, "Tipo Propiedad Modificada");

            btnMostrarTodosLosTiposDePropiedad.doClick();
        }
    }//GEN-LAST:event_btnEditarTipoPropiedadActionPerformed

    private void btnEliminarTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoPropiedadActionPerformed
        int filaSelecionada = tablaTipoPropiedad.getSelectedRow();

        if(filaSelecionada == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar Una Fila");
        }else{
            String id_tipoPropiedadString = String.valueOf(tablaTipoPropiedad.getValueAt(filaSelecionada,0));
            char id_tipoPropiedadChar = id_tipoPropiedadString.charAt(0);
            String des_tipoPropiedadString = String.valueOf(tablaTipoPropiedad.getValueAt(filaSelecionada,1));

            tipoPropiedad = new TipoPropiedad(id_tipoPropiedadChar, des_tipoPropiedadString);
            tipoPropiedadDao.eliminarTipoPropiedad(tipoPropiedad);

            JOptionPane.showMessageDialog(this,"Tipo Propiedad Eliminada");
        }
        btnMostrarTodosLosTiposDePropiedad.doClick();
    }//GEN-LAST:event_btnEliminarTipoPropiedadActionPerformed

    private void btnNuevoIngresoTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoIngresoTipoPropiedadActionPerformed
        VentanaIngresoTipoPropiedad ventanaIngresoTipoPropiedad = new VentanaIngresoTipoPropiedad();
        misMetodos.abrirVentana(ventanaIngresoTipoPropiedad,"Ingreso Nuevo Tipo De Propidad");
    }//GEN-LAST:event_btnNuevoIngresoTipoPropiedadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarTipoPropiedad;
    private javax.swing.JButton btnEditarTipoPropiedad;
    private javax.swing.JButton btnEliminarTipoPropiedad;
    private javax.swing.JButton btnMostrarTodosLosTiposDePropiedad;
    private javax.swing.JButton btnNuevoIngresoTipoPropiedad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulopanelMostrarTipoPropiedad;
    private javax.swing.JTable tablaTipoPropiedad;
    // End of variables declaration//GEN-END:variables
}
