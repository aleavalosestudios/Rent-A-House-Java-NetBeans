/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.MisMetodos;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author aleja
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    CardLayout cardLayout = new CardLayout();
    PanelIngresarCategoriaEmpleado panelCategoriaEmpleado;
    PanelInicial panelInicial = new PanelInicial();
    //JPanel panelVentanas = new JPanel();
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800,800));
        
               
        //Inicializar el CardLayout
        panelVentanas.setMaximumSize(new Dimension(1200,800));
        MisMetodos.panelCentrar(panelVentanas,panelInicial);
        panelVentanas.setLayout(cardLayout);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPanelPrincipal = new javax.swing.JScrollPane();
        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresarPropiedad = new javax.swing.JButton();
        btnIngresarPropietario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnIngresarPropiedadArrendada = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnIngresarEmpleado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEditarPropiedad = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        btnIngresarEstadoCivil = new javax.swing.JButton();
        btnIngresarTipoPropiedad = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnEditarTipoPropiedad = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnVerEditarCategortiaEmpleado = new javax.swing.JButton();
        btnEditarComuna = new javax.swing.JButton();
        btnIngresarCategoriaEmpleado = new javax.swing.JButton();
        btnIngresarComuna = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVerEditarCliente = new javax.swing.JButton();
        btnIngresarCliente = new javax.swing.JButton();
        btnEditarPropiedadArrendada = new javax.swing.JButton();
        btnEditarEstadoCivil = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEditarPropietario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ScrollPanelVentanas = new javax.swing.JScrollPane();
        panelVentanas = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ScrollPanelPrincipal.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollPanelPrincipal.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollPanelPrincipal.setViewportBorder(javax.swing.BorderFactory.createTitledBorder("ScrollPanel"));

        panelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel Principal"));

        jLabel1.setText("Categoria Empleado");

        btnIngresarPropiedad.setText("Ingresar Propiedad");
        btnIngresarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPropiedadActionPerformed(evt);
            }
        });

        btnIngresarPropietario.setText("Ingresar Propietario");
        btnIngresarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPropietarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Comuna");

        btnIngresarPropiedadArrendada.setText("Ingresar Propiedad Arrendada");
        btnIngresarPropiedadArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPropiedadArrendadaActionPerformed(evt);
            }
        });

        jLabel6.setText("Propiedad");

        btnIngresarEmpleado.setText("Ingresar Empleado");
        btnIngresarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEmpleadoActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado Civil");

        btnEditarPropiedad.setText("Ver / Modificar Propiedad");
        btnEditarPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPropiedadActionPerformed(evt);
            }
        });

        btnEditarEmpleado.setText("Ver / Modificar Empleado");
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });

        btnIngresarEstadoCivil.setText("Ingresar Estado Civil");
        btnIngresarEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEstadoCivilActionPerformed(evt);
            }
        });

        btnIngresarTipoPropiedad.setText("Ingresar Tipo Propiedad");
        btnIngresarTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarTipoPropiedadActionPerformed(evt);
            }
        });

        jLabel8.setText("Propietario");

        btnEditarTipoPropiedad.setText("Ver / Modificar Tipo Propiedad");
        btnEditarTipoPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTipoPropiedadActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo Propiedad");

        btnVerEditarCategortiaEmpleado.setText("Ver / Modificar Categoria Empleado");
        btnVerEditarCategortiaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEditarCategortiaEmpleadoActionPerformed(evt);
            }
        });

        btnEditarComuna.setText("Ver / Modificar Comuna");
        btnEditarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarComunaActionPerformed(evt);
            }
        });

        btnIngresarCategoriaEmpleado.setText("Ingresar Categoria Empleado");
        btnIngresarCategoriaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarCategoriaEmpleadoActionPerformed(evt);
            }
        });

        btnIngresarComuna.setText("Ingresar Comuna");
        btnIngresarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarComunaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente");

        btnVerEditarCliente.setText("Ver / Modificar Cliente");
        btnVerEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEditarClienteActionPerformed(evt);
            }
        });

        btnIngresarCliente.setText("Ingresar Cliente");
        btnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarClienteActionPerformed(evt);
            }
        });

        btnEditarPropiedadArrendada.setText("Ver / Modificar Propiedad Arrendada");
        btnEditarPropiedadArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPropiedadArrendadaActionPerformed(evt);
            }
        });

        btnEditarEstadoCivil.setText("Ver / Modiicar Estado Civil");
        btnEditarEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstadoCivilActionPerformed(evt);
            }
        });

        jLabel7.setText("Propiedad Arrendada");

        btnEditarPropietario.setText("Ver / Modificar Propietario");
        btnEditarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPropietarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Empleado");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnIngresarComuna)
                    .addComponent(btnIngresarEmpleado)
                    .addComponent(btnIngresarEstadoCivil)
                    .addComponent(btnIngresarPropiedad)
                    .addComponent(btnVerEditarCliente)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(btnEditarComuna)
                    .addComponent(btnEditarEstadoCivil)
                    .addComponent(btnEditarEmpleado)
                    .addComponent(btnIngresarCliente)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarCategoriaEmpleado)
                    .addComponent(btnVerEditarCategortiaEmpleado)
                    .addComponent(jLabel3)
                    .addComponent(btnIngresarPropiedadArrendada)
                    .addComponent(btnIngresarPropietario)
                    .addComponent(btnIngresarTipoPropiedad)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(btnEditarPropiedad)
                    .addComponent(btnEditarPropiedadArrendada)
                    .addComponent(btnEditarPropietario)
                    .addComponent(btnEditarTipoPropiedad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(btnIngresarCategoriaEmpleado)
                .addGap(18, 18, 18)
                .addComponent(btnVerEditarCategortiaEmpleado)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnVerEditarCliente)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarComuna)
                .addGap(18, 18, 18)
                .addComponent(btnEditarComuna)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(btnEditarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarEstadoCivil)
                .addGap(18, 18, 18)
                .addComponent(btnEditarEstadoCivil)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarPropiedad)
                .addGap(18, 18, 18)
                .addComponent(btnEditarPropiedad)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarPropiedadArrendada, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarPropiedadArrendada)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarPropietario)
                .addGap(18, 18, 18)
                .addComponent(btnEditarPropietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarTipoPropiedad)
                .addGap(18, 18, 18)
                .addComponent(btnEditarTipoPropiedad)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ScrollPanelPrincipal.setViewportView(panelPrincipal);

        ScrollPanelVentanas.setBorder(javax.swing.BorderFactory.createTitledBorder("ScrollPanelVentanas"));
        ScrollPanelVentanas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollPanelVentanas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelVentanas.setBorder(javax.swing.BorderFactory.createTitledBorder("Panel Ventanas"));

        javax.swing.GroupLayout panelVentanasLayout = new javax.swing.GroupLayout(panelVentanas);
        panelVentanas.setLayout(panelVentanasLayout);
        panelVentanasLayout.setHorizontalGroup(
            panelVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );
        panelVentanasLayout.setVerticalGroup(
            panelVentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ScrollPanelVentanas.setViewportView(panelVentanas);

        panelTitulo.setBackground(new java.awt.Color(0, 0, 255));
        panelTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("PanelTitulo"), "PanelTitulo"));
        panelTitulo.setName("panelTitulo"); // NOI18N

        jLabel10.setBackground(new java.awt.Color(0, 0, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RENT A HOUSE");

        btnInicio.setText("Inicio");
        btnInicio.setName("btnInicio"); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addGap(69, 69, 69))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(btnInicio))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPanelVentanas, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPanelVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrollPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Metodo para abrir cualquier ventana
    private void abrirVentana(javax.swing.JFrame Ventana, String tituloVentana){
        
        Ventana.setVisible(true);
        Ventana.setLocationRelativeTo(null);
        Ventana.setTitle(tituloVentana);
        Ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void btnIngresarCategoriaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarCategoriaEmpleadoActionPerformed
        panelCategoriaEmpleado = new PanelIngresarCategoriaEmpleado();
        MisMetodos.panelCentrar(panelVentanas, panelCategoriaEmpleado);
//        panelVentanas.add(panelCategoriaEmpleado, "PanelIngresarCategoria");
//        cardLayout.show(panelVentanas, "PanelIngresarCategoria");     
//        VentanaIngresarCategoriaEmpleado ventanaIngresarCategoriaEmpleado = new VentanaIngresarCategoriaEmpleado();
//        abrirVentana(ventanaIngresarCategoriaEmpleado,"Registro CategoriaEmpleado");
        
    }//GEN-LAST:event_btnIngresarCategoriaEmpleadoActionPerformed

    private void btnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarClienteActionPerformed
        PanelIngresarCliente panelIngresarCliente= new PanelIngresarCliente();
        MisMetodos.panelCentrar(panelVentanas, panelIngresarCliente);
        
//        panelVentanas.add(panelIngresarCliente, "PanelIngresarCliente");
//        cardLayout.show(panelVentanas, "PanelIngresarCliente");
//        
//        VentanaIngresarCliente  ventanaIngresarCliente = new VentanaIngresarCliente();
//        abrirVentana(ventanaIngresarCliente, "Registro Cliente");
    
    }//GEN-LAST:event_btnIngresarClienteActionPerformed

    private void btnVerEditarCategortiaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEditarCategortiaEmpleadoActionPerformed
        PanelMostrarCategoriaEmpleado panelMostrarcategoriaEmpleado = new PanelMostrarCategoriaEmpleado();
        MisMetodos.panelCentrar(panelVentanas, panelMostrarcategoriaEmpleado);
//        panelVentanas.add(panelMostrarcategoriaEmpleado, "PanelMostrarCategoriaEmpleado");
//        cardLayout.show(panelVentanas, "PanelMostrarCategoriaEmpleado");
//        VentanaMostrarCategoriaEmpleado ventanaMostrarCategoriaEmpleado = new VentanaMostrarCategoriaEmpleado();
//        abrirVentana(ventanaMostrarCategoriaEmpleado,"Ver Categorias Empleado");
    }//GEN-LAST:event_btnVerEditarCategortiaEmpleadoActionPerformed

    private void btnVerEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEditarClienteActionPerformed
        PanelMostrarCliente panelMostrarCliente = new PanelMostrarCliente();
        MisMetodos.panelCentrar(panelVentanas,panelMostrarCliente);
//        panelVentanas.add(panelMostrarCliente, "PanelMostrarCliente");
//        cardLayout.show(panelVentanas, "PanelMostrarCliente");
//        VentanaMostrarCiente ventanaMostrarCliente = new VentanaMostrarCiente();
//        abrirVentana(ventanaMostrarCliente,"Mostrar Clientes");
    }//GEN-LAST:event_btnVerEditarClienteActionPerformed

    private void btnIngresarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarComunaActionPerformed
        PanelIngresarComuna panelIngresarComuna= new PanelIngresarComuna();
        MisMetodos.panelCentrar(panelVentanas,panelIngresarComuna);
//        panelVentanas.add(panelIngresarComuna, "PanelIngresarComuna");
//        cardLayout.show(panelVentanas, "PanelIngresarComuna");

//        VentanaIngresarComuna ventanaIngresarComuna = new VentanaIngresarComuna();
//        abrirVentana(ventanaIngresarComuna,"Ingreso Nueva Comuna");        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarComunaActionPerformed

    private void btnIngresarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEmpleadoActionPerformed
        PanelIngresarEmpleado panelIngresarEmpleado = new PanelIngresarEmpleado();
        MisMetodos.panelCentrar(panelVentanas, panelIngresarEmpleado);
//        panelVentanas.add(panelIngresarEmpleado, "PanelIngresarEmpleado");
//        cardLayout.show(panelVentanas, "PanelIngresarEmpleado");
//        VentanaIngresarEmpleado ventanaIngresarEmpleado = new VentanaIngresarEmpleado();
//        abrirVentana(ventanaIngresarEmpleado,"Ingreso Nuevo Empleado");
    }//GEN-LAST:event_btnIngresarEmpleadoActionPerformed

    private void btnIngresarEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEstadoCivilActionPerformed
        PanelIngresarEstadoCivil panelIngresarEstadoCivil = new PanelIngresarEstadoCivil();
        MisMetodos.panelCentrar(panelVentanas, panelIngresarEstadoCivil);
//        panelVentanas.add(panelIngresarEstadoCivil, "PanelIngresarEstadoCivil");
//        cardLayout.show(panelVentanas, "PanelIngresarEstadoCivil");
//        VentanaIngresarEstadoCivil ventanaIngresarEstadoCivil = new VentanaIngresarEstadoCivil();
//        abrirVentana(ventanaIngresarEstadoCivil,"Ingreso Nuevo Estado Civil");
    }//GEN-LAST:event_btnIngresarEstadoCivilActionPerformed

    private void btnIngresarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPropiedadActionPerformed
        PanelIngresarPropiedad panelIngresarPropiedad= new PanelIngresarPropiedad();
        MisMetodos.panelCentrar(panelVentanas, panelIngresarPropiedad);
//        panelVentanas.add(panelIngresarPropiedad, "PanelIngresarPropiedad");
//        cardLayout.show(panelVentanas, "PanelIngresarPropiedad");
//        VentanaIngresarPropiedad ventanaIngresarPropiedad = new VentanaIngresarPropiedad();
//        abrirVentana(ventanaIngresarPropiedad,"Ingreso Nueva Propiedad");
    }//GEN-LAST:event_btnIngresarPropiedadActionPerformed

    private void btnIngresarPropiedadArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPropiedadArrendadaActionPerformed
        PanelIngresarPropiedadArrendada panelIngresarPropiedadArrendada= new PanelIngresarPropiedadArrendada();
        MisMetodos.panelCentrar(panelVentanas, panelIngresarPropiedadArrendada);
//        panelVentanas.add(panelIngresarPropiedadArrendada, "PanelIngresarPropiedadArrendada");
//        cardLayout.show(panelVentanas, "PanelIngresarPropiedadArrendada");

//        VentanaIngresoPropiedadArrendada ventanaIngresoPropiedadArrendada = new VentanaIngresoPropiedadArrendada();
//        abrirVentana(ventanaIngresoPropiedadArrendada,"Ingreso Nuevo Arriendo De Propiedad");
    }//GEN-LAST:event_btnIngresarPropiedadArrendadaActionPerformed

    private void btnIngresarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPropietarioActionPerformed
        PanelIngresarPropietario panelIngresarPropietario= new PanelIngresarPropietario();
        MisMetodos.panelCentrar(panelVentanas,panelIngresarPropietario);
//        panelVentanas.add(panelIngresarPropietario, "PanelIngresarPropietario");
//        cardLayout.show(panelVentanas, "PanelIngresarPropietario");

//        VentanaIngresarPropietario ventanaIngresarPropietario = new VentanaIngresarPropietario();
//        abrirVentana(ventanaIngresarPropietario,"Ingreso Nuevo Propietario");
    }//GEN-LAST:event_btnIngresarPropietarioActionPerformed

    private void btnIngresarTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarTipoPropiedadActionPerformed
        PanelIngresarTipoPropiedad panelIngresarTipoPropiedad= new PanelIngresarTipoPropiedad();
        MisMetodos.panelCentrar(panelVentanas, panelIngresarTipoPropiedad);
//        panelVentanas.add(panelIngresarTipoPropiedad, "PanelIngresarTipoPropiedad");
//        cardLayout.show(panelVentanas, "PanelIngresarTipoPropiedad");

//        VentanaIngresoTipoPropiedad ventanaIngresoTipoPropiedad = new VentanaIngresoTipoPropiedad();
//        abrirVentana(ventanaIngresoTipoPropiedad,"Ingreso Nuevo Tipo De Propidad");
    }//GEN-LAST:event_btnIngresarTipoPropiedadActionPerformed

    private void btnEditarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarComunaActionPerformed
        PanelMostrarComuna panelMostrarComuna= new PanelMostrarComuna();
        MisMetodos.panelCentrar(panelVentanas,panelMostrarComuna);
//        panelVentanas.add(panelMostrarComuna, "PanelMostrarComuna");
//        cardLayout.show(panelVentanas, "PanelMostrarComuna");

//        VentanaMostrarComuna ventanaMostrarComuna = new VentanaMostrarComuna();
//        abrirVentana(ventanaMostrarComuna,"Mostrar Comunas");
    }//GEN-LAST:event_btnEditarComunaActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        PanelMostrarEmpleado panelMostrarEmpleado = new PanelMostrarEmpleado();
        MisMetodos.panelCentrar(panelVentanas,panelMostrarEmpleado);
//        panelVentanas.add(panelMostrarEmpleado, "PanelMostrarEmpleado");
//        cardLayout.show(panelVentanas, "PanelMostrarEmpleado");

//        VentanaMostrarEmpleado ventanaMostrarEmpleado = new VentanaMostrarEmpleado();
//        abrirVentana(ventanaMostrarEmpleado,"Mostrar Empleados");
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void btnEditarEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstadoCivilActionPerformed
        PanelMostarEstadoCivil panelMostarEstadoCivil = new PanelMostarEstadoCivil();
        MisMetodos.panelCentrar(panelVentanas,panelMostarEstadoCivil);

//        panelVentanas.add(panelMostarEstadoCivil, "PanelMostararEstadoCivil");
//        cardLayout.show(panelVentanas, "PanelMostararEstadoCivil");

//        VentanaMostrarEstadoCivil ventanaMostrarEstadoCivil = new VentanaMostrarEstadoCivil();
//        abrirVentana(ventanaMostrarEstadoCivil,"Mostrar Registro Civil");
    }//GEN-LAST:event_btnEditarEstadoCivilActionPerformed

    private void btnEditarPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPropiedadActionPerformed
        PanelMostrarPropiedad panelMostrarPropiedad = new PanelMostrarPropiedad();
        MisMetodos.panelCentrar(panelVentanas, panelMostrarPropiedad);
//        panelVentanas.add(panelMostrarPropiedad, "PanelMostrarPropiedad");
//        cardLayout.show(panelVentanas, "PanelMostrarPropiedad");

//        VentanaMostrarPropiedad ventanaMostrarPropiedad = new VentanaMostrarPropiedad();
//        abrirVentana(ventanaMostrarPropiedad,"Mostrar Propiedad");
    }//GEN-LAST:event_btnEditarPropiedadActionPerformed

    private void btnEditarPropiedadArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPropiedadArrendadaActionPerformed
        PanelMostrarPropiedadArrendada panelMostrarPropiedadArrendada = new PanelMostrarPropiedadArrendada();
        MisMetodos.panelCentrar(panelVentanas, panelMostrarPropiedadArrendada);
//        panelVentanas.add(panelMostrarPropiedadArrendada, "PanelMostrarPropiedadArrendada");
//        cardLayout.show(panelVentanas, "PanelMostrarPropiedadArrendada");
//        VentanaMostrarPropiedadArrendada ventanaMostrarPropiedadArrendada = new VentanaMostrarPropiedadArrendada();
//        abrirVentana(ventanaMostrarPropiedadArrendada,"Mostrar Propiedad");
    }//GEN-LAST:event_btnEditarPropiedadArrendadaActionPerformed

    private void btnEditarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPropietarioActionPerformed
        PanelMostrarPropietario panelMostrarPropietario= new PanelMostrarPropietario();
        MisMetodos.panelCentrar(panelVentanas, panelMostrarPropietario);
//
//        VentanaMostrarPropietario ventanaMostrarPropietario = new VentanaMostrarPropietario();
//        abrirVentana(ventanaMostrarPropietario,"Mostrar Propietarios");
    }//GEN-LAST:event_btnEditarPropietarioActionPerformed

    private void btnEditarTipoPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTipoPropiedadActionPerformed
        PanelMostrarTipoPropiedad panelMostrarTipoPropiedad = new PanelMostrarTipoPropiedad();
        MisMetodos.panelCentrar(panelVentanas, panelMostrarTipoPropiedad);
//        panelVentanas.add(panelMostrarTipoPropiedad, "PanelMostrarTipoPropiedad");
//        cardLayout.show(panelVentanas, "PanelMostrarTipoPropiedad");
//        VentanaMostrarTipoPropiedad ventanaMostrarTipoPropiedad = new VentanaMostrarTipoPropiedad();
//        abrirVentana(ventanaMostrarTipoPropiedad,"Mostrar Tipo Propiedad");
    }//GEN-LAST:event_btnEditarTipoPropiedadActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MisMetodos.panelCentrar(panelVentanas,panelInicial);
        panelVentanas.setLayout(cardLayout);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        PanelInicial  panelVienbenida= new PanelInicial();
        MisMetodos.panelCentrar(panelVentanas, panelVienbenida);
        panelVentanas.setLayout(cardLayout);
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPanelPrincipal;
    private javax.swing.JScrollPane ScrollPanelVentanas;
    private javax.swing.JButton btnEditarComuna;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEditarEstadoCivil;
    private javax.swing.JButton btnEditarPropiedad;
    private javax.swing.JButton btnEditarPropiedadArrendada;
    private javax.swing.JButton btnEditarPropietario;
    private javax.swing.JButton btnEditarTipoPropiedad;
    private javax.swing.JButton btnIngresarCategoriaEmpleado;
    private javax.swing.JButton btnIngresarCliente;
    private javax.swing.JButton btnIngresarComuna;
    private javax.swing.JButton btnIngresarEmpleado;
    private javax.swing.JButton btnIngresarEstadoCivil;
    private javax.swing.JButton btnIngresarPropiedad;
    private javax.swing.JButton btnIngresarPropiedadArrendada;
    private javax.swing.JButton btnIngresarPropietario;
    private javax.swing.JButton btnIngresarTipoPropiedad;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVerEditarCategortiaEmpleado;
    private javax.swing.JButton btnVerEditarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelVentanas;
    // End of variables declaration//GEN-END:variables
    
}
