package v;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class v_login extends javax.swing.JFrame {

    public v_login() {
        initComponents();
    }

    public void btnLogin(ActionListener action) {
        this.btn_masuk.addActionListener(action);
    }


    public void keluar(ActionListener e) {
        this.btn_keluar.addActionListener(e);
    }

    public JButton getKeluar() {
        return btn_keluar;
    }

    public String getUser() {
        String username = txt_user.getText();
        return username;
    }

    public String getPass() {
        String password = txt_pass.getText();
        return password;
    }

    public void pesanTampil(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public int pilihanTampil(String pesan) {
        return JOptionPane.showConfirmDialog(this, pesan, null, JOptionPane.YES_NO_OPTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_masuk = new javax.swing.JButton();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        btn_keluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HALAMAN LOGIN");
        setAutoRequestFocus(false);
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btn_masuk.png"))); // NOI18N
        btn_masuk.setBorderPainted(false);
        btn_masuk.setContentAreaFilled(false);
        btn_masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_masuk.setDefaultCapable(false);
        btn_masuk.setPreferredSize(new java.awt.Dimension(130, 55));
        getContentPane().add(btn_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 350, 95, 40));

        txt_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setToolTipText("username");
        txt_user.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_user.setOpaque(false);
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 252, 230, 30));

        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setToolTipText("password");
        txt_pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_pass.setOpaque(false);
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 302, 230, 30));

        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btn_home.png"))); // NOI18N
        btn_keluar.setBorderPainted(false);
        btn_keluar.setContentAreaFilled(false);
        btn_keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 0, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/ui_2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_masuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
