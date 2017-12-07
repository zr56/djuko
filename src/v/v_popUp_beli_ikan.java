package v;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class v_popUp_beli_ikan extends javax.swing.JFrame {

    public v_popUp_beli_ikan() {
        initComponents();
    }

    public void btnTambah_ikan(ActionListener e) {
        this.btn_tambah_ikan.addActionListener(e);
    }

    public void btnKurang_ikan(ActionListener e) {
        this.btn_kurang_ikan.addActionListener(e);
    }

    public void btnBeli_ikan(ActionListener e) {
        this.btn_beli_ikan.addActionListener(e);
    }

    public void btnBatal_ikan(ActionListener e) {
        this.btn_batal_ikan.addActionListener(e);
    }

    public int getTotal_ikan() {
        String hasil_ikan = total_ikan.getText();
        return Integer.valueOf(hasil_ikan);
    }

    public void setHasil_ikan(String text) {
        total_ikan.setText(text);
    }

    public void setTextBeli_ikan(String text) {
        btn_beli_ikan.setText(text);
    }

    public JButton getTambah_ikan() {
        return btn_tambah_ikan;
    }

    public JButton getKurang_ikan() {
        return btn_kurang_ikan;
    }

    public JButton getBeli_ikan() {
        return btn_beli_ikan;
    }

    public JButton getBatal_ikan() {
        return btn_batal_ikan;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_tambah_ikan = new javax.swing.JButton();
        btn_kurang_ikan = new javax.swing.JButton();
        total_ikan = new javax.swing.JLabel();
        btn_beli_ikan = new javax.swing.JButton();
        btn_batal_ikan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tambah_ikan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_next.png"))); // NOI18N
        btn_tambah_ikan.setBorderPainted(false);
        btn_tambah_ikan.setContentAreaFilled(false);
        getContentPane().add(btn_tambah_ikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 60, 50));

        btn_kurang_ikan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_prev.png"))); // NOI18N
        btn_kurang_ikan.setBorderPainted(false);
        btn_kurang_ikan.setContentAreaFilled(false);
        getContentPane().add(btn_kurang_ikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 60, 50));

        total_ikan.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        total_ikan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_ikan.setText("1");
        getContentPane().add(total_ikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, 40));

        btn_beli_ikan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_beli.png"))); // NOI18N
        btn_beli_ikan.setBorderPainted(false);
        btn_beli_ikan.setContentAreaFilled(false);
        getContentPane().add(btn_beli_ikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, 40));

        btn_batal_ikan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_batal.png"))); // NOI18N
        btn_batal_ikan.setBorderPainted(false);
        btn_batal_ikan.setContentAreaFilled(false);
        getContentPane().add(btn_batal_ikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pop_up.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
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
            java.util.logging.Logger.getLogger(v_popUp_beli_ikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_popUp_beli_ikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_popUp_beli_ikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_popUp_beli_ikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_popUp_beli_ikan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal_ikan;
    private javax.swing.JButton btn_beli_ikan;
    private javax.swing.JButton btn_kurang_ikan;
    private javax.swing.JButton btn_tambah_ikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel total_ikan;
    // End of variables declaration//GEN-END:variables
}
