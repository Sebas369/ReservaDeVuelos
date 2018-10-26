/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.vistas;

import java.util.logging.Level;
import java.util.logging.Logger;
import reservadevuelos.modelo.CiudadData;
import reservadevuelos.modelo.Conexion;

/**
 *
 * @author Usuario
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAgregarVuelo = new javax.swing.JMenuItem();
        jMenuEliminarVuelo = new javax.swing.JMenuItem();
        jMenuModificarVuelo = new javax.swing.JMenuItem();
        jMenuConsultaVuelo = new javax.swing.JMenuItem();
        jMenuAsiento = new javax.swing.JMenu();
        jMenuItemGestionar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-cerrar-ventana-48.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ciudad");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-marcador-48.png"))); // NOI18N
        jMenuItem5.setText("Agregar Ciudad");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-editar-48.png"))); // NOI18N
        jMenuItem6.setText("Modificar Ciudad");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-eliminar-48.png"))); // NOI18N
        jMenuItem7.setText("Eliminar Ciudad");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Vuelo");

        jMenuAgregarVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-aeropuerto-48.png"))); // NOI18N
        jMenuAgregarVuelo.setText("Agregar Vuelo");
        jMenuAgregarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgregarVueloActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAgregarVuelo);

        jMenuEliminarVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-eliminar-propiedad-48.png"))); // NOI18N
        jMenuEliminarVuelo.setText("Eliminar Vuelo");
        jMenuEliminarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEliminarVueloActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEliminarVuelo);

        jMenuModificarVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-editar-propiedad-48.png"))); // NOI18N
        jMenuModificarVuelo.setText("Modificar Vuelo");
        jMenuModificarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModificarVueloActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuModificarVuelo);

        jMenuConsultaVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-búsqueda-de-propiedad-48.png"))); // NOI18N
        jMenuConsultaVuelo.setText("Consultar Vuelos");
        jMenuConsultaVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaVueloActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuConsultaVuelo);

        jMenuBar1.add(jMenu2);

        jMenuAsiento.setText("Asiento");

        jMenuItemGestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-ventana-del-avión-cerrada-48.png"))); // NOI18N
        jMenuItemGestionar.setText("Agregar asientos");
        jMenuItemGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionarActionPerformed(evt);
            }
        });
        jMenuAsiento.add(jMenuItemGestionar);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-multiedición-48.png"))); // NOI18N
        jMenuItem3.setText("Gestionar asientos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuAsiento.add(jMenuItem3);

        jMenuBar1.add(jMenuAsiento);

        jMenu4.setText("Cliente");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-añadir-usuaria-48.png"))); // NOI18N
        jMenuItem1.setText("Agregar Cliente");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-eliminar-usuaria-48.png"))); // NOI18N
        jMenuItem2.setText("Eliminar Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8-editar-usuaria-48.png"))); // NOI18N
        jMenuItem8.setText("Modificar Datos");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgregarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgregarVueloActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAltaVuelo vm=new VistaAltaVuelo();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
    }//GEN-LAST:event_jMenuAgregarVueloActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuConsultaVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaVueloActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        VistaConsultaVuelo vm=new VistaConsultaVuelo();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
    }//GEN-LAST:event_jMenuConsultaVueloActionPerformed

    private void jMenuItemGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionarActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        VistaAltaAsiento vaa = new VistaAltaAsiento();
        vaa.setVisible(true);
        escritorio.add(vaa);
        escritorio.moveToFront(vaa);
    }//GEN-LAST:event_jMenuItemGestionarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaGestionAsiento vga = new VistaGestionAsiento();
        vga.setVisible(true);
        escritorio.add(vga);
        escritorio.moveToFront(vga);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuEliminarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEliminarVueloActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaBajaVuelo bv = new VistaBajaVuelo();
        bv.setVisible(true);
        escritorio.add(bv);
        escritorio.moveToFront(bv);
    }//GEN-LAST:event_jMenuEliminarVueloActionPerformed

    private void jMenuModificarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModificarVueloActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaModifVuelo mv = new VistaModifVuelo();
        mv.setVisible(true);
        escritorio.add(mv);
        escritorio.moveToFront(mv);
    }//GEN-LAST:event_jMenuModificarVueloActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAltaCiudad ac = new VistaAltaCiudad();
        ac.setVisible(true);
        escritorio.add(ac);
        escritorio.moveToFront(ac);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaModifCiudad mc = new VistaModifCiudad();
        mc.setVisible(true);
        escritorio.add(mc);
        escritorio.moveToFront(mc);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaBajaCiudad bc = new VistaBajaCiudad();
        bc.setVisible(true);
        escritorio.add(bc);
        escritorio.moveToFront(bc);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Conexion conexion = null;
        try {
            conexion = new Conexion("jdbc:mysql://localhost/reserva_de_vuelos", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CiudadData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
        
             }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuAgregarVuelo;
    private javax.swing.JMenu jMenuAsiento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultaVuelo;
    private javax.swing.JMenuItem jMenuEliminarVuelo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemGestionar;
    private javax.swing.JMenuItem jMenuModificarVuelo;
    // End of variables declaration//GEN-END:variables
}
