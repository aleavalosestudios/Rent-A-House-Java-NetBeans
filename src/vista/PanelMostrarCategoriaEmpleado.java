/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;
import vista.VentanaIngresarCategoriaEmpleado;
import controlador.CategoriaEmpleadoDao;
import controlador.MisMetodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import modelo.CategoriaEmpleado;
/**
/**
 *
 * @author aleja
 */
public class PanelMostrarCategoriaEmpleado extends javax.swing.JPanel {
    CategoriaEmpleado categoriaEmpleado;
    CategoriaEmpleadoDao categoriaEmpleadoDao = new CategoriaEmpleadoDao();
    MisMetodos misMetodos = new MisMetodos();
    DefaultTableModel tabla;

    /**
     * Creates new form PanelMostrarCategoriaEmpleado
     */
    public PanelMostrarCategoriaEmpleado() {
        initComponents();
        btnMostrarCategoriasEmpleados.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscarCategoriaEmpleado = new javax.swing.JButton();
        btnModificarCategoriaEmpleado = new javax.swing.JButton();
        btnEliminarCategoriaEmpleado = new javax.swing.JButton();
        btnMostrarCategoriasEmpleados = new javax.swing.JButton();
        btnNuevaCategoriaEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodasCategoriaEmpleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        btnBuscarCategoriaEmpleado.setText("Buscar Categoria Empleado");
        btnBuscarCategoriaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriaEmpleadoActionPerformed(evt);
            }
        });

        btnModificarCategoriaEmpleado.setText("Modificar Categoria Empleado");
        btnModificarCategoriaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarCategoriaEmpleado.setText("Eliminar Categoria Empleado");
        btnEliminarCategoriaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriaEmpleadoActionPerformed(evt);
            }
        });

        btnMostrarCategoriasEmpleados.setText("Mostrar Todas Las Categorias De Empleados");
        btnMostrarCategoriasEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCategoriasEmpleadosActionPerformed(evt);
            }
        });

        btnNuevaCategoriaEmpleado.setText("Nueva Categoria Empleado");
        btnNuevaCategoriaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaEmpleadoActionPerformed(evt);
            }
        });

        tblTodasCategoriaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id Categoria Empleado", "Descripcion Categoria Empleado"
            }
        ));
        jScrollPane1.setViewportView(tblTodasCategoriaEmpleado);

        jLabel1.setText("Categorias Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarCategoriaEmpleado)
                            .addComponent(btnNuevaCategoriaEmpleado)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMostrarCategoriasEmpleados)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCategoriaEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCategoriaEmpleado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevaCategoriaEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCategoriaEmpleado))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarCategoriasEmpleados)
                    .addComponent(btnModificarCategoriaEmpleado)
                    .addComponent(btnEliminarCategoriaEmpleado))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCategoriaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaEmpleadoActionPerformed

        String desc_categoria_emp =JOptionPane.showInputDialog(this, "Ingrese Categoria Empleado a Buscar");

        tabla = (DefaultTableModel)tblTodasCategoriaEmpleado.getModel();
        ArrayList<CategoriaEmpleado> listadobuscarCategoriaEmpleados = categoriaEmpleadoDao.buscarCategoriaEmpleado(desc_categoria_emp);

        misMetodos.tablaLimpiar(tblTodasCategoriaEmpleado);

        if(listadobuscarCategoriaEmpleados.isEmpty()){
            JOptionPane.showInputDialog(this, "Categoria No Existe");
        }else{
            String [][] datosListadoBuscarCategoriaEmpleados = new String [listadobuscarCategoriaEmpleados.size()][2];

            for (int i = 0; i < listadobuscarCategoriaEmpleados.size(); i++){
                datosListadoBuscarCategoriaEmpleados[i][0] = String.valueOf(listadobuscarCategoriaEmpleados.get(i).getId_categoria_emp());
                datosListadoBuscarCategoriaEmpleados[i][1] = listadobuscarCategoriaEmpleados.get(i).getDesc_categoria_emp();

                tabla.addRow(datosListadoBuscarCategoriaEmpleados[i]);
            }
            tblTodasCategoriaEmpleado.setModel(tabla);
            misMetodos.tablaCentrarDatos(tblTodasCategoriaEmpleado);
        }
    }//GEN-LAST:event_btnBuscarCategoriaEmpleadoActionPerformed

    private void btnModificarCategoriaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaEmpleadoActionPerformed

        int filaSeleccionada = tblTodasCategoriaEmpleado.getSelectedRow();

        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Selecionar Una Fila");

        }else{

            int id_categoria_emp = Integer.parseInt(String.valueOf(tblTodasCategoriaEmpleado.getValueAt(filaSeleccionada,0)));
            String desc_categoria_emp = String.valueOf(tblTodasCategoriaEmpleado.getValueAt(filaSeleccionada,1));

            categoriaEmpleado = new CategoriaEmpleado(id_categoria_emp, desc_categoria_emp);
            categoriaEmpleadoDao.actualizarCategoriaEmpleado(categoriaEmpleado);

            JOptionPane.showMessageDialog(this, "Categoria de Empleado Actualizada Correctamente");
        }
    }//GEN-LAST:event_btnModificarCategoriaEmpleadoActionPerformed

    private void btnEliminarCategoriaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaEmpleadoActionPerformed

        int filaSeleccionada = tblTodasCategoriaEmpleado.getSelectedRow();

        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Debe Selecionar Una Fila");

        }else{

            int id_catecogria_emp = Integer.parseInt(String.valueOf(tblTodasCategoriaEmpleado.getValueAt(filaSeleccionada,0)));
            String desc_categoria_emp = String.valueOf(tblTodasCategoriaEmpleado.getValueAt(filaSeleccionada,1));

            categoriaEmpleado = new CategoriaEmpleado(id_catecogria_emp, desc_categoria_emp);
            categoriaEmpleadoDao.eliminarCategoriaEmpleado(categoriaEmpleado);

            JOptionPane.showMessageDialog(this, "Categoria de Empleado Eliminado Correctamente");

            btnMostrarCategoriasEmpleados.doClick(); //Presiona el boton Mostrar categoria para dar el efecto de eliminacion y actualizacion al usuario
        }
    }//GEN-LAST:event_btnEliminarCategoriaEmpleadoActionPerformed

    private void btnMostrarCategoriasEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCategoriasEmpleadosActionPerformed

        tabla = (DefaultTableModel)tblTodasCategoriaEmpleado.getModel();
        ArrayList<CategoriaEmpleado> listadoCategoriaEmpleados = categoriaEmpleadoDao.todasLasCategoriaEmpleado();

        misMetodos.tablaLimpiar(tblTodasCategoriaEmpleado);

        if(listadoCategoriaEmpleados.isEmpty()){

            JOptionPane.showMessageDialog(this, "No Existen Categorias de Empleados");

        }else{
            String [][] datoslistadoCategoriaEmpleados = new String[listadoCategoriaEmpleados.size()][2];
            for (int i = 0; i < listadoCategoriaEmpleados.size(); i++){
                datoslistadoCategoriaEmpleados[i][0] = String.valueOf(listadoCategoriaEmpleados.get(i).getId_categoria_emp());
                datoslistadoCategoriaEmpleados[i][1] = listadoCategoriaEmpleados.get(i).getDesc_categoria_emp();

                tabla.addRow(datoslistadoCategoriaEmpleados[i]);
            }
            tblTodasCategoriaEmpleado.setModel(tabla);
            misMetodos.tablaCentrarDatos(tblTodasCategoriaEmpleado);           
        }

    }//GEN-LAST:event_btnMostrarCategoriasEmpleadosActionPerformed

    private void btnNuevaCategoriaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaEmpleadoActionPerformed
        VentanaIngresarCategoriaEmpleado ventanaIngresarCategoriaEmpleado = new VentanaIngresarCategoriaEmpleado();
        misMetodos.abrirVentana(ventanaIngresarCategoriaEmpleado,"Ingreso Nueva Categoria Empleado");
    }//GEN-LAST:event_btnNuevaCategoriaEmpleadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCategoriaEmpleado;
    private javax.swing.JButton btnEliminarCategoriaEmpleado;
    private javax.swing.JButton btnModificarCategoriaEmpleado;
    private javax.swing.JButton btnMostrarCategoriasEmpleados;
    private javax.swing.JButton btnNuevaCategoriaEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTodasCategoriaEmpleado;
    // End of variables declaration//GEN-END:variables
}
