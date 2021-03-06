/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Clases.Sucursal;
import Metodos.CRUD;
import Metodos.Formato;
import Metodos.Validar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class registrarVendedor extends javax.swing.JFrame {

    CRUD c = new CRUD();
    Validar v = new Validar();
    modificarVendedor mv = new modificarVendedor();
    Formato f = new Formato();

    /**
     * Contructor de registrarVendedor. Iniciara llenando la tabla de vendedores
     * con los datos que se encuentren en ella. Luego llenara un ComboBox con
     * los IDs de la tabla sucursal.
     */
    public registrarVendedor() {
        initComponents();

        c.mostrar_v(Tabla_v);

        DefaultComboBoxModel model = new DefaultComboBoxModel(c.mostrarSucursal());
        cbxID_s.setModel(model);

    }

    /**
     * Metodo Limpiar dejara todos los campos de texto en blanco.
     */
    public void Limpiar() {
        jtfCampo.setText("");
        jtfRut_v.setText("");
        jtfRut2_v.setText("");
        jtfNombre_v.setText("");
        jtfAP_v.setText("");
        jtfAM_v.setText("");
        jtfDireccion_v.setText("");
        jtfTelefono_v.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfRut_v = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfRut2_v = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre_v = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfAP_v = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfDireccion_v = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfAM_v = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbxTipoFiltro = new javax.swing.JComboBox<>();
        jtfCampo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_v = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jtfTelefono_v = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cbxID_s = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Vendedores");

        jLabel2.setText("Rut:");

        jtfRut_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRut_vActionPerformed(evt);
            }
        });

        jLabel1.setText("-");

        jtfRut2_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRut2_vActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Sucursal:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido Paterno:");

        jLabel7.setText("Dirección:");

        jtfDireccion_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDireccion_vActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido Materno:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbxTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Vendedor", "ID Sucursal", "Nombre", "Rut" }));
        cbxTipoFiltro.setToolTipText("");
        cbxTipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoFiltroActionPerformed(evt);
            }
        });

        jButton4.setText("Filtrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Tabla_v.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Vendedor", "ID Sucursal", "Rut", "Nombre", "Telefono", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_vMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_v);

        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefono:");

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfNombre_v, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfAP_v, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtfRut_v)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfRut2_v, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfAM_v, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxID_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfDireccion_v, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jtfTelefono_v)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(cbxTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxID_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfDireccion_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfRut_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRut2_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jtfTelefono_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombre_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfAP_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfAM_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfRut2_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRut2_vActionPerformed

    }//GEN-LAST:event_jtfRut2_vActionPerformed

    private void jtfDireccion_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDireccion_vActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDireccion_vActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Limpiar();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxTipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoFiltroActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtfRut_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRut_vActionPerformed

    }//GEN-LAST:event_jtfRut_vActionPerformed
    /**
     * Se verifica que los campos esten validados. Finalmente se valida que el
     * numero sea correcto y se procede a enviar los datos a la BD.
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (v.valVendedor(jtfRut_v, jtfRut2_v, jtfNombre_v, jtfAP_v, jtfAM_v, jtfDireccion_v)) {

            if (v.valNumero(jtfTelefono_v)) {
                c.guardar_v((Sucursal) cbxID_s.getSelectedItem(), f.formatoRut(jtfRut_v, jtfRut2_v), f.formatoNombre(jtfNombre_v), f.formatoNombre(jtfAP_v), f.formatoNombre(jtfAM_v), f.formatoNombre(jtfDireccion_v), jtfTelefono_v);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Al momento de dar click a "modificar" se hace visible la ventana
     * "mv"(modificar vendedor)
     *
     * @param evt
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        mv.Limpiar();
        mv.setVisible(true);
        mv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton7ActionPerformed
    /**
     * Al hacer click en la tabla de vendedor primero se valida si la ventana
     * "mv" esta visible, si lo esta, se enviaran los datos de la tabla vendedor
     * a la ventana "mv" para realizar la modificacion
     *
     * @param evt
     */
    private void Tabla_vMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_vMouseClicked

        if (mv.isShowing()) {
            c.camposMODV(Tabla_v, mv.ID(), mv.nom(), mv.app(), mv.apm(), mv.dir(), mv.num());
        }
    }//GEN-LAST:event_Tabla_vMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        c.mostrar_v(Tabla_v);

    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * Al dar al boton eliminar primero se verificara que algun campo de la
     * tabla vendedor este seleccionado, si no lo esta, se mostrara un mensaje
     * pidiendo seleccionar un campo, de lo contrario se mostrara un mensaje
     * pidiendo la confirmacion de la eliminacion.
     *
     * @param evt
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if (Tabla_v.getSelectedRow() >= 0) {
            int des = JOptionPane.showConfirmDialog(null, "Eliminar vendedor", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (des == JOptionPane.YES_OPTION) {

                c.eliminar_v(Tabla_v);
                c.mostrar_v(Tabla_v);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un campo");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * Si tipo de filtro es igual a rut, a la variable "cam" se le aplicara el
     * proceso de formato de rut, añadiendo los puntos y guion correspondientes,
     * para de esta manera, poder encontrar las coincidencias en la BD
     *
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String cam = jtfCampo.getText();

        if (cbxTipoFiltro.getSelectedItem().equals("Rut")) {

            c.filtrarVendedor(Tabla_v, f.formatoRutfiltro(cam), cbxTipoFiltro);

        } else {
            c.filtrarVendedor(Tabla_v, cam, cbxTipoFiltro);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(registrarVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarVendedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_v;
    private javax.swing.JComboBox<String> cbxID_s;
    private javax.swing.JComboBox<String> cbxTipoFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jtfAM_v;
    private javax.swing.JTextField jtfAP_v;
    private javax.swing.JTextField jtfCampo;
    private javax.swing.JTextField jtfDireccion_v;
    private javax.swing.JTextField jtfNombre_v;
    private javax.swing.JTextField jtfRut2_v;
    private javax.swing.JTextField jtfRut_v;
    private javax.swing.JTextField jtfTelefono_v;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
