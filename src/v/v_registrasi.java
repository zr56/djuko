package v;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class v_registrasi extends javax.swing.JFrame {

    public v_registrasi() {
        initComponents();
    }

    //back
       public void addBuatAkunListener(ActionListener e) {
        this.btn_daftar.addActionListener(e);
    }
       
    public void keluar(ActionListener e) {
        this.btn_keluar.addActionListener(e);
    }

    public JButton getKeluar() {
        return btn_keluar;
    }

    public JButton getSimpan() {
        return btn_daftar;
    }

    public JTextField getId() {
        return txt_id;
    }

    public JTextField get_userDaftar() {
        return txt_daftarUser;
    }

    public JTextField get_passDaftar() {
        return txt_daftarPass;
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

        txt_daftarUser = new javax.swing.JTextField();
        txt_daftarPass = new javax.swing.JTextField();
        btn_daftar = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_daftarUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_daftarUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_daftarUser.setToolTipText("username");
        txt_daftarUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_daftarUser.setOpaque(false);
        getContentPane().add(txt_daftarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 240, 30));

        txt_daftarPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_daftarPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_daftarPass.setToolTipText("password");
        txt_daftarPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_daftarPass.setOpaque(false);
        getContentPane().add(txt_daftarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 240, 30));

        btn_daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/daftar/btn_daftar.png"))); // NOI18N
        btn_daftar.setBorderPainted(false);
        btn_daftar.setContentAreaFilled(false);
        btn_daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 345, 95, 40));

        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/daftar/btn_home.png"))); // NOI18N
        btn_keluar.setBorderPainted(false);
        btn_keluar.setContentAreaFilled(false);
        btn_keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/daftar/ui.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_id.setEditable(false);
        txt_id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_id.setOpaque(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 50, 40));

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
            java.util.logging.Logger.getLogger(v_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_daftar;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_daftarPass;
    private javax.swing.JTextField txt_daftarUser;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
