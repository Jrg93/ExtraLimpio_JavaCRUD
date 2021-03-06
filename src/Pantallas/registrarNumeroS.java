package Pantallas;

import Clases.Sucursal;
import Metodos.CRUD;
import Metodos.Validar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class registrarNumeroS extends javax.swing.JFrame {

    Sucursal s = new Sucursal();
    CRUD c = new CRUD();
    Validar v = new Validar();

    public registrarNumeroS() {
        initComponents();

        c.mostrar_n(Tabla_n);

        DefaultComboBoxModel rg = new DefaultComboBoxModel(c.mostrarSucursal());
        cbxSucursal.setModel(rg);

    }

    void Limpiar() {
        numero_s.setText("");
        numero_mod.setText("");
        campo_n.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero_s = new javax.swing.JTextField();
        btnActualizar_n = new javax.swing.JButton();
        btnFiltrar_n = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        numero_mod = new javax.swing.JTextField();
        btnModificar_n = new javax.swing.JButton();
        Tipofiltro_n = new javax.swing.JComboBox<>();
        btnEliminar_n = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Registrar_n = new javax.swing.JButton();
        campo_n = new javax.swing.JTextField();
        Limpiar_n = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Cancelar_n = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_n = new javax.swing.JTable();
        cbxSucursal = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numero_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_sActionPerformed(evt);
            }
        });

        btnActualizar_n.setText("Actualizar");
        btnActualizar_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar_nActionPerformed(evt);
            }
        });

        btnFiltrar_n.setText("Filtrar");
        btnFiltrar_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrar_nActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono:");

        btnModificar_n.setText("Modificar");
        btnModificar_n.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnModificar_nItemStateChanged(evt);
            }
        });
        btnModificar_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_nActionPerformed(evt);
            }
        });

        Tipofiltro_n.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Sucursal", "Numero" }));
        Tipofiltro_n.setToolTipText("");
        Tipofiltro_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipofiltro_nActionPerformed(evt);
            }
        });

        btnEliminar_n.setText("Eliminar");
        btnEliminar_n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminar_nMouseClicked(evt);
            }
        });
        btnEliminar_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_nActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Numeros Sucursal");

        Registrar_n.setText("Registrar");
        Registrar_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar_nActionPerformed(evt);
            }
        });

        campo_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nActionPerformed(evt);
            }
        });

        Limpiar_n.setText("Limpiar");
        Limpiar_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_nActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefono:");

        Cancelar_n.setText("Cancelar");
        Cancelar_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_nActionPerformed(evt);
            }
        });

        Tabla_n.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Telefonos", "Nombre Sucursal", "Numero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_nMouseClicked(evt);
            }
        });
        Tabla_n.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Tabla_nPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_n);

        cbxSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSucursalActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Tipofiltro_n, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campo_n, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrar_n)
                        .addGap(181, 181, 181))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(btnModificar_n, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnActualizar_n, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnEliminar_n, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(numero_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addComponent(Registrar_n, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel8)
                                        .addGap(30, 30, 30)
                                        .addComponent(numero_s, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(Limpiar_n, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(Cancelar_n, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipofiltro_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar_n))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar_n)
                            .addComponent(btnModificar_n)
                            .addComponent(btnEliminar_n))
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(numero_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelar_n)
                            .addComponent(Limpiar_n)
                            .addComponent(Registrar_n))
                        .addGap(69, 69, 69))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_sActionPerformed


    }//GEN-LAST:event_numero_sActionPerformed

    private void btnActualizar_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar_nActionPerformed

        c.mostrar_n(Tabla_n);

    }//GEN-LAST:event_btnActualizar_nActionPerformed

    private void btnFiltrar_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrar_nActionPerformed

        String cam = campo_n.getText();
        c.filtrarNumero(Tabla_n, cam, Tipofiltro_n);

    }//GEN-LAST:event_btnFiltrar_nActionPerformed

    private void btnModificar_nItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnModificar_nItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificar_nItemStateChanged

    private void btnModificar_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_nActionPerformed

        if (Tabla_n.getSelectedRow() >= 0) {
            int des = JOptionPane.showConfirmDialog(null, "Modificar numero", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (des == JOptionPane.YES_OPTION) {

                if (v.valNumero(numero_mod)) {
                    c.modificar_n(Tabla_n, numero_mod);
                    c.mostrar_n(Tabla_n);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un campo");
        }

    }//GEN-LAST:event_btnModificar_nActionPerformed

    private void Tipofiltro_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipofiltro_nActionPerformed

    }//GEN-LAST:event_Tipofiltro_nActionPerformed

    private void btnEliminar_nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminar_nMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar_nMouseClicked

    private void btnEliminar_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_nActionPerformed

        if (Tabla_n.getSelectedRow() >= 0) {
            int des = JOptionPane.showConfirmDialog(null, "Eliminar numero", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (des == JOptionPane.YES_OPTION) {

                c.eliminar_n(Tabla_n);
                c.mostrar_n(Tabla_n);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un campo");
        }


    }//GEN-LAST:event_btnEliminar_nActionPerformed

    private void Registrar_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar_nActionPerformed

        if (v.valNumero(numero_s)) {
            c.guardar_n(numero_s, (Sucursal) cbxSucursal.getSelectedItem());
        }

    }//GEN-LAST:event_Registrar_nActionPerformed

    private void campo_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nActionPerformed

    private void Limpiar_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_nActionPerformed

        Limpiar();

    }//GEN-LAST:event_Limpiar_nActionPerformed

    private void Cancelar_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_nActionPerformed

        this.dispose();

    }//GEN-LAST:event_Cancelar_nActionPerformed

    private void Tabla_nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_nMouseClicked

        c.camposMODNUM(Tabla_n, numero_mod);

    }//GEN-LAST:event_Tabla_nMouseClicked

    private void Tabla_nPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Tabla_nPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla_nPropertyChange

    private void cbxSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSucursalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSucursalActionPerformed

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
            java.util.logging.Logger.getLogger(registrarNumeroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarNumeroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarNumeroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarNumeroS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarNumeroS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar_n;
    private javax.swing.JButton Limpiar_n;
    private javax.swing.JButton Registrar_n;
    private javax.swing.JTable Tabla_n;
    private javax.swing.JComboBox<String> Tipofiltro_n;
    private javax.swing.JButton btnActualizar_n;
    private javax.swing.JButton btnEliminar_n;
    private javax.swing.JButton btnFiltrar_n;
    private javax.swing.JButton btnModificar_n;
    private javax.swing.JTextField campo_n;
    private javax.swing.JComboBox<String> cbxSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField numero_mod;
    private javax.swing.JTextField numero_s;
    // End of variables declaration//GEN-END:variables
}
