package v;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class v_popUp_beli extends javax.swing.JFrame {

    public v_popUp_beli() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void btnTambah(ActionListener e) {
        this.btn_tambah.addActionListener(e);
    }

    public void btnKurang(ActionListener e) {
        this.btn_kurang.addActionListener(e);
    }

    public void btnBeli(ActionListener e) {
        this.btn_ok.addActionListener(e);
    }

    public void btnBatal(ActionListener e) {
        this.btn_batal.addActionListener(e);
    }

    public int getTotal() {
        String hasil = total.getText();
        return Integer.valueOf(hasil);
    }

    public void setHasil(String text) {
        total.setText(text);
    }

    public void setTextBeli(String text) {
        btn_ok.setText(text);
    }

    public JButton getTambah() {
        return btn_tambah;
    }

    public JButton getKurang() {
        return btn_kurang;
    }

    public JButton getBeli() {
        return btn_ok;
    }

    public JButton getBatal() {
        return btn_kurang;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_tambah = new javax.swing.JButton();
        btn_kurang = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pop_up/btn_tambah.png"))); // NOI18N
        btn_tambah.setBorderPainted(false);
        btn_tambah.setContentAreaFilled(false);
        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 45, 30, 30));

        btn_kurang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pop_up/btn_kurang.png"))); // NOI18N
        btn_kurang.setBorderPainted(false);
        btn_kurang.setContentAreaFilled(false);
        btn_kurang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 45, 30, 30));

        btn_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pop_up/btn_ok.png"))); // NOI18N
        btn_ok.setBorderPainted(false);
        btn_ok.setContentAreaFilled(false);
        btn_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 55, 30));

        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pop_up/btn_batal.png"))); // NOI18N
        btn_batal.setBorderPainted(false);
        btn_batal.setContentAreaFilled(false);
        btn_batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 55, 30));

        total.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("1");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 40, 70, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pop_up/ui.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(v_popUp_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_popUp_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_popUp_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_popUp_beli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_popUp_beli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_kurang;
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
