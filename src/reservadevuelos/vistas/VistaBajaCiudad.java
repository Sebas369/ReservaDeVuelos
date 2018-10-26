/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.vistas;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import reservadevuelos.modelo.Ciudad;
import reservadevuelos.modelo.CiudadData;
import reservadevuelos.modelo.Conexion;

/**
 *
 * @author Usuario
 */
public class VistaBajaCiudad extends javax.swing.JInternalFrame {
    private Connection connection = null;
     private Conexion conexion;
    /**
     * Creates new form VistaBMCiudad
     */
    public VistaBajaCiudad() {
        initComponents();
        try {
             conexion = new Conexion("jdbc:mysql://localhost/reserva_de_vuelos", "root", "");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(VistaAltaVuelo.class.getName()).log(Level.SEVERE, null, ex);
         }
        deshabilitarCampos();
    }

    public void  deshabilitarCampos(){
        jTextIdCiudad.setEnabled(false);
        jTextNombreCiudad.setEnabled(false);
        jTextPais.setEnabled(false);
        jRadioBvigencia.setEnabled(false);
    }
    
    public void  habilitarCampos(){
        jTextIdCiudad.setEnabled(true);
        jTextNombreCiudad.setEnabled(true);
        jTextPais.setEnabled(true);
        jRadioBvigencia.setEnabled(true);
    }
    
    public void limpiarCampos(){
        jTextIdCiudad.setText(null);
        jTextNombreCiudad.setText(null);
        jTextPais.setText(null);
        jRadioBvigencia.setSelected(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNombreBuscar = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextIdCiudad = new javax.swing.JTextField();
        jTextNombreCiudad = new javax.swing.JTextField();
        jTextPais = new javax.swing.JTextField();
        jRadioBvigencia = new javax.swing.JRadioButton();
        jBlimpiar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("Ciudad");

        jLabel2.setText("Nombre ");

        jTextNombreBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreBuscarActionPerformed(evt);
            }
        });

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo");

        jLabel4.setText("Nombre");

        jLabel5.setText("Pais");

        jLabel6.setText("Vigencia");

        jTextNombreCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreCiudadActionPerformed(evt);
            }
        });

        jTextPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPaisActionPerformed(evt);
            }
        });

        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBborrar.setText("Borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Mapa_50x50_azul.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jTextNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jBbuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(jRadioBvigencia))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextPais)
                                                    .addComponent(jTextNombreCiudad)
                                                    .addComponent(jTextIdCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBlimpiar)
                                        .addGap(80, 80, 80)
                                        .addComponent(jBborrar)))))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextIdCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextNombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioBvigencia)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlimpiar)
                    .addComponent(jBborrar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreBuscarActionPerformed

    private void jTextNombreCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreCiudadActionPerformed

    private void jTextPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPaisActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        CiudadData cd=new CiudadData(conexion);
        cd.bajaCiudad(Integer.parseInt(jTextIdCiudad.getText()));
        limpiarCampos();
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        limpiarCampos();
        CiudadData cd=new CiudadData(conexion);
        Ciudad c= new Ciudad();
        c=cd.obtenerCiudad(jTextNombreBuscar.getText());
        habilitarCampos();
        jTextIdCiudad.setText(String.valueOf(c.getIdCiudad()));
        jTextNombreCiudad.setText(c.getNombreCiudad());
        jTextPais.setText(c.getPais());
        if (c.getVigencia()){
            jRadioBvigencia.setSelected(true);
        } 
        
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        jTextNombreBuscar.setText(null);
        deshabilitarCampos();
    }//GEN-LAST:event_jBlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioBvigencia;
    private javax.swing.JTextField jTextIdCiudad;
    private javax.swing.JTextField jTextNombreBuscar;
    private javax.swing.JTextField jTextNombreCiudad;
    private javax.swing.JTextField jTextPais;
    // End of variables declaration//GEN-END:variables
}
