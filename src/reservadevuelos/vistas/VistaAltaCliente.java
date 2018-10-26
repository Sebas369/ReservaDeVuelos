/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservadevuelos.vistas;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import reservadevuelos.modelo.Cliente;
import reservadevuelos.modelo.ClienteData;
import reservadevuelos.modelo.Conexion;

/**
 *
 * @author dario
 */
public class VistaAltaCliente extends javax.swing.JFrame {
    //private Cliente cliente;
    private ClienteData clienteData;
    private Conexion conexion;
     
    
     private Connection connection = null;
     
    public VistaAltaCliente() {
          initComponents();
        
         try {
             conexion = new Conexion("jdbc:mysql://localhost/reserva_de_vuelos", "root", "");
             clienteData = new ClienteData(conexion);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(VistaAltaCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
         
<<<<<<< HEAD
    }   
    
@SuppressWarnings("unchecked")
=======
        initComponents();
    }

>>>>>>> origin/master
         
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLCliente = new javax.swing.JLabel();
        jrFemenino = new javax.swing.JRadioButton();
        jrMasculino = new javax.swing.JRadioButton();
        jLDni = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jLNumeroPasaporte = new javax.swing.JLabel();
        jLNumeroDeTarjeta = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtNumeroPasaporte = new javax.swing.JTextField();
        jtNumeroTarjeta = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jLIdCliente = new javax.swing.JLabel();
        jtIdCliente = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLCliente.setText("    Cliente");

        jrFemenino.setText("Femenino");
        jrFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFemeninoActionPerformed(evt);
            }
        });

        jrMasculino.setText("Masculino");

        jLDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDni.setText("Dni");

        jLNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNombre.setText("Nombre");

        jLApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLApellido.setText("Apellido");

        jlSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlSexo.setText("Sexo");

        jLNumeroPasaporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumeroPasaporte.setText("Numero de Pasaporte");

        jLNumeroDeTarjeta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumeroDeTarjeta.setText("Numero de Tarjeta");

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEmail.setText("Email");

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        jtNombre.setText(" ");
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtNumeroPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroPasaporteActionPerformed(evt);
            }
        });

        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        jLIdCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLIdCliente.setText("IdCliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLNumeroPasaporte)
                                    .addComponent(jLNumeroDeTarjeta)
                                    .addComponent(jLEmail)
                                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLIdCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtDni)
                                            .addComponent(jtNumeroPasaporte)
                                            .addComponent(jtNumeroTarjeta)
                                            .addComponent(jtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jrFemenino)
                                                .addGap(18, 18, 18)
                                                .addComponent(jrMasculino))
                                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(jtApellido)
                                            .addComponent(jtIdCliente))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243)
                        .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo)
                    .addComponent(jrFemenino)
                    .addComponent(jrMasculino))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDni)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNumeroPasaporte)
                    .addComponent(jtNumeroPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNumeroDeTarjeta)
                    .addComponent(jtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLEmail)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(248, 248, 248))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
                    
         String nombre=jtNombre.getText();
         String apellido = jtApellido.getText();
         
          Cliente cliente=new Cliente(nombre,apellido,sexo,dni,numeroPasaporte,numeroTarjeta,eMail);
        clienteData.VistaAltaCliente(cliente);
        
        Cliente cliente=new Cliente(nombre,apellido,sexo,dni,numeroPasaporte,numeroTarjeta,eMail);
        ClienteData.guardarCliente(cliente);
        jtIdCliente.setText(cliente.getIdCliente()+"");
        
       
        /*String nombre=jtNombre.getText();
        /*
          String nombre=jtNombre.getText();
        LocalDate fecNac = LocalDate.parse(jtFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
       
        boolean activo=chActivo.isSelected();
        
        Alumno alumno=new Alumno(nombre,fecNac,activo);
        alumnoData.guardarAlumno(alumno);
        
        jtId.setText(alumno.getId()+"");
        /*
        
        Materia materia=new Materia(nombre);
        materiaData.guardarMateria(materia);
        
        jtId.setText(materia.getId()+"");
    }                                         */
        
    }                                         
        
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void jrFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFemeninoActionPerformed
      jRMasculino.setSelected(false);
    }//GEN-LAST:event_jrFemeninoActionPerformed

    private void jtNumeroPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroPasaporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroPasaporteActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed
    private void jRMasculinoActionPerformed(java.awt.event.ActionEvent evt) {                                           
      jRFemenino.setSelected(false);   }
    
  
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
            java.util.logging.Logger.getLogger(VistaAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable()) {
            public void run() {
                new VistaAltaCliente().setVisible(true);
            }
        }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLIdCliente;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNumeroDeTarjeta;
    private javax.swing.JLabel jLNumeroPasaporte;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JRadioButton jrFemenino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNumeroPasaporte;
    private javax.swing.JTextField jtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
