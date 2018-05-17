/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import AppPackage.AnimationClass;
import Controlador.Usuario;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import scanner.WebcamQRCodeExample;

/**
 *
 * @author EHef_
 */


public class Admin extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();
    Agenda agenda = new Agenda();
    Consultorios consultorios = new Consultorios();
    MATERIALES materiales = new MATERIALES();
    public Admin(Usuario Admin) {
        initComponents();
        this.setLocationRelativeTo(null);
        ETIQUETAUSUARIO.setText(Admin.Nombre);
        jPanel3.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        jPanel3.add(agenda, c);
        c.gridx = 0;
        c.gridy = 0;
        jPanel3.add(consultorios, c);
        c.gridx = 0;
        c.gridy = 0;
        jPanel3.add(materiales, c);
        /*c.gridx = 0;
        c.gridy = 0;
        jPanel4.add(agenda, c);*/
        agenda.setVisible(false);
        consultorios.setVisible(false);
        materiales.setVisible(false);
        jPanel4.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ETIQUETAPACIENTE = new javax.swing.JLabel();
        ETIQUETAUSUARIO = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        PAGOS = new javax.swing.JLabel();
        fonLabel = new javax.swing.JLabel();
        bandejaLabel = new javax.swing.JLabel();
        sendLabel = new javax.swing.JLabel();
        vial = new javax.swing.JLabel();
        herramienta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/mas (2).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 51, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/ajustes (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 60, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/agenda (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/cepillo-de-dientes.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 47, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/silla-de-escritorio.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        ETIQUETAPACIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/monedas (1).png"))); // NOI18N
        ETIQUETAPACIENTE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ETIQUETAPACIENTEFocusGained(evt);
            }
        });
        ETIQUETAPACIENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ETIQUETAPACIENTEMouseClicked(evt);
            }
        });
        jPanel2.add(ETIQUETAPACIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        ETIQUETAUSUARIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ETIQUETAUSUARIO.setForeground(new java.awt.Color(255, 255, 255));
        ETIQUETAUSUARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ETIQUETAUSUARIO.setText("NOMBRE DE USUARIO");
        jPanel2.add(ETIQUETAUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MATERIALES");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONSULTORIOS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AGENDA");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 80, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 30, 90));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 50, 90));

        PAGOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PAGOS.setForeground(new java.awt.Color(255, 255, 255));
        PAGOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAGOS.setText("PAGOS");
        jPanel2.add(PAGOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 110));

        fonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/aprovechar.png"))); // NOI18N
        jPanel1.add(fonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 150, 60, 70));

        bandejaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/email (5).png"))); // NOI18N
        jPanel1.add(bandejaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 290, 70, 50));

        sendLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/email (8).png"))); // NOI18N
        jPanel1.add(sendLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 400, 70, -1));

        vial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/vial (1).png"))); // NOI18N
        jPanel1.add(vial, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 540, 60, -1));

        herramienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/taladro-dental (1).png"))); // NOI18N
        jPanel1.add(herramienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 670, 70, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Adobe Fangsong Std R", 2, 100)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BIENVENIDO");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 340));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 670, 260));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 690));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1050, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        AnimationClass fonR = new AnimationClass();
        fonR.jLabelXRight(-70, 20, 10, 5, fonLabel);
        
        AnimationClass fonL = new AnimationClass();
        fonL.jLabelXLeft(20, -70, 10, 5, fonLabel);

        AnimationClass bandejaR = new AnimationClass();
        bandejaR.jLabelXRight(-70, 20, 10, 5, bandejaLabel);

        AnimationClass bandejaL = new AnimationClass();
        bandejaL.jLabelXLeft(20, -70, 10, 5, bandejaLabel);

        AnimationClass correoR = new AnimationClass();
        correoR.jLabelXRight(-70, 20, 10, 5, sendLabel);

        AnimationClass correoL = new AnimationClass();
        correoL.jLabelXLeft(20, -70, 10, 5, sendLabel);
        
        AnimationClass herramientaR = new AnimationClass();
        herramientaR.jLabelXRight(-70, 20, 10, 5, herramienta);

        AnimationClass herramientaL = new AnimationClass();
        herramientaL.jLabelXLeft(20, -70, 10, 5, herramienta);
        
        AnimationClass vialR = new AnimationClass();
        vialR.jLabelXRight(-70, 20, 10, 5, vial);

        AnimationClass vialL = new AnimationClass();
        vialL.jLabelXLeft(20, -70, 10, 5, vial);
        
        File file = new File("");
        String a = "";
        try {
            a = file.getCanonicalFile().toString();
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        Icon icono = new ImageIcon(a+"/src/dentaltoolkit/Image/mas (3).png");
        if (jLabel5.getIcon().toString().equals(icono.toString())) {
            evt.consume();
            jLabel5.setIcon(new ImageIcon(a+"/src/dentaltoolkit/Image/mas (2).png"));
        } else {
            jLabel5.setIcon(new ImageIcon(a+"/src/dentaltoolkit/Image/mas (3).png"));
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        agenda.setVisible(true);
        consultorios.setVisible(false);
        materiales.setVisible(false);
        jPanel4.setVisible(false);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        agenda.setVisible(false);
        consultorios.setVisible(false);
        materiales.setVisible(true);
        jPanel4.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        agenda.setVisible(false);
        consultorios.setVisible(true);
        materiales.setVisible(false);
        jPanel4.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void ETIQUETAPACIENTEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ETIQUETAPACIENTEFocusGained
        
    }//GEN-LAST:event_ETIQUETAPACIENTEFocusGained

    private void ETIQUETAPACIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ETIQUETAPACIENTEMouseClicked
        WebcamQRCodeExample A = new WebcamQRCodeExample();
        String cliente=A.run();
        System.out.println(cliente);
    }//GEN-LAST:event_ETIQUETAPACIENTEMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ETIQUETAPACIENTE;
    private javax.swing.JLabel ETIQUETAUSUARIO;
    private javax.swing.JLabel PAGOS;
    private javax.swing.JLabel bandejaLabel;
    private javax.swing.JLabel fonLabel;
    private javax.swing.JLabel herramienta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel sendLabel;
    private javax.swing.JLabel vial;
    // End of variables declaration//GEN-END:variables
}
