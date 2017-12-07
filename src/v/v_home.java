package v;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class v_home extends javax.swing.JFrame {

    public v_home() {
        initComponents();
    }

    public void addBtnNewGame(ActionListener e) {
        this.btn_permainan_baru.addActionListener(e);
    }

    public void addBtnContinueGame(ActionListener e) {
        this.btn_lanjutkan.addActionListener(e);
    }

    public void keluar(ActionListener e) {
        this.btn_keluar.addActionListener(e);
    }

    public JButton getKeluar() {
        return btn_keluar;
    }

    public JButton getNew() {
        return btn_permainan_baru;
    }

    public JButton getContinu() {
        return btn_lanjutkan;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_permainan_baru = new javax.swing.JButton();
        btn_lanjutkan = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_permainan_baru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/btn_permainan_baru.png"))); // NOI18N
        btn_permainan_baru.setBorderPainted(false);
        btn_permainan_baru.setContentAreaFilled(false);
        btn_permainan_baru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_permainan_baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 245, 260, 50));

        btn_lanjutkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/btn_lanjutkan.png"))); // NOI18N
        btn_lanjutkan.setBorderPainted(false);
        btn_lanjutkan.setContentAreaFilled(false);
        btn_lanjutkan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_lanjutkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 305, 260, 50));

        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/btn_home.png"))); // NOI18N
        btn_keluar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_keluar.setBorderPainted(false);
        btn_keluar.setContentAreaFilled(false);
        btn_keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/ui.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(v_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_lanjutkan;
    private javax.swing.JButton btn_permainan_baru;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
