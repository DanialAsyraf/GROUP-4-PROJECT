/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupprojectmusic;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class groupMenu2 extends javax.swing.JFrame {

    /**
     * Creates new form groupMenu2
     */
    public groupMenu2() {
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

        btnDrama = new javax.swing.JButton();
        btnMovie = new javax.swing.JButton();
        btnShort = new javax.swing.JButton();
        btnTiktok = new javax.swing.JButton();
        btnMusic = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(74, 31, 61));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDrama.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        btnDrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupprojectmusic/DRAMABTN-01.png"))); // NOI18N
        btnDrama.setText("DRAMA");
        btnDrama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        btnDrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDramaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 100, 50));

        btnMovie.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        btnMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupprojectmusic/MOVIEBTN-01.png"))); // NOI18N
        btnMovie.setText("MOVIE");
        btnMovie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        btnMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovieActionPerformed(evt);
            }
        });
        getContentPane().add(btnMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 50));

        btnShort.setFont(new java.awt.Font("The Bold Font", 0, 14)); // NOI18N
        btnShort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupprojectmusic/SHORTBTN-01-01-01.png"))); // NOI18N
        btnShort.setText("Short video");
        btnShort.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        btnShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShortActionPerformed(evt);
            }
        });
        getContentPane().add(btnShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 100, 50));

        btnTiktok.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        btnTiktok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupprojectmusic/TIKTOKBTN-01.png"))); // NOI18N
        btnTiktok.setText("Tik tok");
        btnTiktok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        btnTiktok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiktokActionPerformed(evt);
            }
        });
        getContentPane().add(btnTiktok, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 100, 50));

        btnMusic.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        btnMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupprojectmusic/musicBUTTON-01.png"))); // NOI18N
        btnMusic.setText("MUSIC");
        btnMusic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        btnMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicActionPerformed(evt);
            }
        });
        getContentPane().add(btnMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 50));

        btnExit.setFont(new java.awt.Font("The Bold Font", 0, 14)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("University", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  MUSIC AND VIDEO MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 290, 70));

        jTextField1.setBackground(new java.awt.Color(2, 17, 46));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 290, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupprojectmusic/forGUI4-01.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicActionPerformed
        // TODO add your handling code here:
        new musicOptionPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMusicActionPerformed

    private void btnMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovieActionPerformed
        // TODO add your handling code here:
        new AdminCustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMovieActionPerformed

    private void btnTiktokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiktokActionPerformed
        // TODO add your handling code here:
        new TikTokGui().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTiktokActionPerformed

    private void btnDramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDramaActionPerformed
        // TODO add your handling code here:
        new Drama3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDramaActionPerformed

    private void btnShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShortActionPerformed
        // TODO add your handling code here:
        new ShortVideoData().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnShortActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?","Confirm Exit",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(groupMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(groupMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(groupMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(groupMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new groupMenu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDrama;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMovie;
    private javax.swing.JButton btnMusic;
    private javax.swing.JButton btnShort;
    private javax.swing.JButton btnTiktok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
