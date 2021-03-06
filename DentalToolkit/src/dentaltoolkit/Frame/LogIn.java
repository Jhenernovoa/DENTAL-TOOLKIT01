/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author EHef_
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    GridBagLayout layout = new GridBagLayout();
    Panel1 p1 = new Panel1();
    LoginDoc Doc = new LoginDoc();
    LoginAdmin Admin = new LoginAdmin();
    String a="";
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        panel2.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panel2.add(p1, c);
        panel2.add(Doc, c);
        panel2.add(Admin, c);
        p1.setVisible(true);
        Doc.setVisible(false);
        Admin.setVisible(false);
        File file = new File("");
        try {
            a= file.getCanonicalFile().toString();
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        rsscalelabel.RSScaleLabel.setScaleLabel(img1,a+"\\src\\dentaltoolkit\\Image\\doctor (3).png");
        rsscalelabel.RSScaleLabel.setScaleLabel(img2,a+"\\src\\dentaltoolkit\\Image\\gerente (2).png");
        this.setTitle("Dental Toolkit");
        ImageIcon img = new ImageIcon(a+"\\src\\Splash\\Splash3.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setBackground(new java.awt.Color(255, 255, 255));
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/doctor (3).png"))); // NOI18N
        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
        });
        menu.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 170, 170));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/gerente (2).png"))); // NOI18N
        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img2MouseClicked(evt);
            }
        });
        menu.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 170, 170));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        menu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 200, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DOCTOR");
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 120, 30));

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRADOR");
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 120, 30));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked
        Doc.setVisible(true);
        p1.setVisible(false);
        Admin.setVisible(false);
    }//GEN-LAST:event_img1MouseClicked

    private void img2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseClicked
        Doc.setVisible(false);
        p1.setVisible(false);
        Admin.setVisible(true);
    }//GEN-LAST:event_img2MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
