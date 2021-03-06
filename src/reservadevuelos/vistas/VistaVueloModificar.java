/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import reservadevuelos.modelo.Ciudad;
import reservadevuelos.modelo.CiudadData;
import reservadevuelos.modelo.Conexion;
import reservadevuelos.modelo.Vuelo;
import reservadevuelos.modelo.VueloData;
/**
 *
 * @author Usuario
 */
public class VistaVueloModificar extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaVuelo
     */
    
     private Connection connection = null;
     private Conexion conexion;
     
    public VistaVueloModificar() {
        initComponents();
         try {
             conexion = new Conexion("jdbc:mysql://localhost/reserva_de_vuelos", "root", "");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(VistaVueloModificar.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        this.jComboBoxCiudadOrigen.removeAllItems();
        this.jComboBoxCiudadDestino.removeAllItems();
        try {
            connection = conexion.getConexion();
            String sql = " SELECT * FROM ciudad WHERE vigencia = 1";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                this.jComboBoxCiudadOrigen.addItem(resultSet.getString("nbreCiudad"));
                this.jComboBoxCiudadDestino.addItem(resultSet.getString("nbreCiudad"));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
   
    public void limpiarCampos(){
        jTextFieldAerolinea.setText(null);
        jTextFieldAeronave.setText(null);
        jDateFechaSalida.setCalendar(null);
        jDateFechaLlegada.setCalendar(null);
        jTextFieldEstadoVuelo.setText(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        tablaVuelos = new javax.swing.JScrollPane();
        tVuelos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAerolinea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAeronave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCiudadDestino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jDateFechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jDateFechaLlegada = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEstadoVuelo = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jComboBoxCiudadOrigen = new javax.swing.JComboBox();
        jBlimpiar = new javax.swing.JButton();
        jImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        tVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ciudad Origen", "Ciudad Destino", "Aerolinea", "Aeronave", "Fecha Salida", "Fecha Llegada", "Estado de Vuelo", "Codigo de Vuelo"
            }
        ));
        tablaVuelos.setViewportView(tVuelos);

        jLabel1.setText("Modificar  Vuelo");

        jLabel2.setText("Aerolinea");

        jLabel3.setText("Aeronave");

        jTextFieldAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAeronaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Ciudad Origen");

        jLabel5.setText("Ciudad Destino");

        jComboBoxCiudadDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCiudadDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCiudadDestinoActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha Salida");

        jLabel7.setText("Fecha Llegada");

        jLabel8.setText("Estado de Vuelo");

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jComboBoxCiudadOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCiudadOrigenActionPerformed(evt);
            }
        });

        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservadevuelos/imagen/Avion_50x50.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ciudad Origen", "Ciudad Destino", "Aerolinea", "Aeronave", "Fecha Salida", "Fecha Llegada", "Estado Vuelo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(140, 140, 140)
                                    .addComponent(jLabel7)
                                    .addGap(4, 4, 4)
                                    .addComponent(jDateFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(140, 140, 140)
                                            .addComponent(jLabel3)
                                            .addGap(29, 29, 29)
                                            .addComponent(jTextFieldAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(15, 15, 15)
                                            .addComponent(jComboBoxCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(140, 140, 140)
                                            .addComponent(jLabel5)
                                            .addGap(4, 4, 4)
                                            .addComponent(jComboBoxCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEstadoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jBlimpiar)
                        .addGap(37, 37, 37)
                        .addComponent(jBguardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jImagen)
                                .addGap(275, 275, 275)
                                .addComponent(jLabel1)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33))
                    .addComponent(jImagen))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstadoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlimpiar)
                    .addComponent(jBguardar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAeronaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAeronaveActionPerformed

    private void jComboBoxCiudadDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCiudadDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCiudadDestinoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        CiudadData cd= new CiudadData(conexion);
        Ciudad c= new Ciudad();
        c= cd.obtenerCiudad((String)jComboBoxCiudadOrigen.getSelectedItem());
        Ciudad c2= new Ciudad();
        c2= cd.obtenerCiudad((String)jComboBoxCiudadDestino.getSelectedItem());
        Vuelo vuelo1;
        vuelo1= new Vuelo(c, c2,jTextFieldAerolinea.getText(),jTextFieldAeronave.getText(),jDateFechaSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),jDateFechaLlegada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jTextFieldEstadoVuelo.getText() );
        VueloData vd= new VueloData(conexion);
        vd.altaVuelo(vuelo1);
        limpiarCampos();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jComboBoxCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCiudadOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCiudadOrigenActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_jBlimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBoxCiudadDestino;
    private javax.swing.JComboBox jComboBoxCiudadOrigen;
    private com.toedter.calendar.JDateChooser jDateFechaLlegada;
    private com.toedter.calendar.JDateChooser jDateFechaSalida;
    private javax.swing.JLabel jImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAerolinea;
    private javax.swing.JTextField jTextFieldAeronave;
    private javax.swing.JTextField jTextFieldEstadoVuelo;
    private javax.swing.JTable tVuelos;
    private javax.swing.JScrollPane tablaVuelos;
    // End of variables declaration//GEN-END:variables

   
}
