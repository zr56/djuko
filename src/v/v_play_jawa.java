package v;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class v_play_jawa extends javax.swing.JFrame {

    int tambah;
    public JProgressBar umur = new JProgressBar(0, 10);
    public JProgressBar hp = new JProgressBar(0, 100);
    ArrayList<JButton> btn = new ArrayList<JButton>();

    public v_play_jawa() {
        initComponents();
    }

    public JTextField getId() {
        return id;
    }

    //back
    public void backListener(ActionListener e) {
        this.btn_back.addActionListener(e);
    }

    public void setUang(int text) {
        this.jumlah_uang.setText(text + "");
    }

    public void setMakanan(int text) {
        this.jumlah_makanan.setText(text + "");
    }

    public void setObat(int text) {
        this.jumlah_obat.setText(text + "");
    }

    public void setIkan(int text) {
        this.jumlah_ikan.setText(text + "");
    }

    public int setJumlahUang(int text) {
        this.jumlah_uang.setText(text + "");
        return text;
    }

    public int setJumlahMakanan(int text) {
        this.jumlah_makanan.setText(text + "");
        return text;
    }

    public int setJumlahObat(int text) {
        this.jumlah_obat.setText(text + "");
        return text;
    }

    public int setJumlahIkan(int text) {
        this.jumlah_ikan.setText(text + "");
        return text;
    }

    //tambah Ikan Random
    public void tambahIkan(int x, int y, int value, int value_2, ActionListener e, String id[]) {
        //umur
        umur = new JProgressBar(0, 10);
        umur.setValue(value);
        umur.setStringPainted(true);
        panel.add(umur);
        umur.setBounds(x + 70, y, 60, 20);
        //label hp
        JLabel uLabel = new JLabel("hp");
        uLabel.setBounds(x, y - 20, 40, 20);
        panel.add(uLabel);
        //makan
        hp = new JProgressBar(0, 100);
        hp.setValue(value_2);
        hp.setStringPainted(true);
        panel.add(hp);
        hp.setBounds(x, y, 60, 20);
        //label hp
        JLabel hLabel = new JLabel("umur");
        hLabel.setBounds(x + 70, y - 20, 40, 20);
        panel.add(hLabel);
        //ikan
        panel.setLayout(null);
        JButton tombol = new JButton();
        tombol.setIcon(new ImageIcon(getClass().getResource("/img/fish_jawa.gif")));
        tombol.setBorderPainted(false);
        tombol.addActionListener(e);
        tombol.setContentAreaFilled(false);
        tombol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn.add(tombol);
        for (int i = 0; i < btn.size(); i++) {
            btn.get(i).setText(id[i]);
            panel.add(btn.get(i));
        }
        tombol.setBounds(x, y, 165, 85);
    }

    //beri makan & obat
    public void beriMakanListener(ActionListener a) {
        this.btn_beri_makan.addActionListener(a);
    }

    public JToggleButton getBeriMakan() {
        return btn_beri_makan;
    }

    public String setBeriMakan(String text) {
        this.txt_beri_makan.setText(text + "");
        return text;
    }

    public void beriObatListener(ActionListener a) {
        this.btn_beri_obat.addActionListener(a);
    }

    public JToggleButton getBeriObat() {
        return btn_beri_obat;
    }

    public String setBeriObat(String text) {
        this.txt_beri_obat.setText(text + "");
        return text;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jumlah_uang = new javax.swing.JLabel();
        jumlah_makanan = new javax.swing.JLabel();
        jumlah_obat = new javax.swing.JLabel();
        jumlah_ikan = new javax.swing.JLabel();
        btn_beri_obat = new javax.swing.JToggleButton();
        txt_beri_makan = new javax.swing.JLabel();
        txt_beri_obat = new javax.swing.JLabel();
        btn_beri_makan = new javax.swing.JToggleButton();
        btn_back = new javax.swing.JButton();
        daerah = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setOpaque(false);
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 730, 340));
        getContentPane().add(jumlah_uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, 20));

        jumlah_makanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jumlah_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 30, 30));

        jumlah_obat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jumlah_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 30, 30));

        jumlah_ikan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jumlah_ikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 30, 30));

        btn_beri_obat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_daerah/btn_beri_obat.png"))); // NOI18N
        btn_beri_obat.setBorderPainted(false);
        btn_beri_obat.setContentAreaFilled(false);
        btn_beri_obat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_beri_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 92, 52, 28));

        txt_beri_makan.setFont(new java.awt.Font("Roboto Condensed", 0, 10)); // NOI18N
        txt_beri_makan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_beri_makan.setText("OFF");
        getContentPane().add(txt_beri_makan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 20, 15));

        txt_beri_obat.setFont(new java.awt.Font("Roboto Condensed", 0, 10)); // NOI18N
        txt_beri_obat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_beri_obat.setText("OFF");
        getContentPane().add(txt_beri_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 100, 20, 15));

        btn_beri_makan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_daerah/btn_beri_makan.png"))); // NOI18N
        btn_beri_makan.setBorderPainted(false);
        btn_beri_makan.setContentAreaFilled(false);
        btn_beri_makan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_beri_makan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 92, 52, 28));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_daerah/btn_back.png"))); // NOI18N
        btn_back.setBorderPainted(false);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        daerah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        daerah.setForeground(new java.awt.Color(255, 255, 255));
        daerah.setText("Level Jawa");
        getContentPane().add(daerah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_daerah/ui.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        id.setText("jTextField1");
        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        id.setOpaque(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

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
            java.util.logging.Logger.getLogger(v_play_jawa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_play_jawa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_play_jawa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_play_jawa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_play_jawa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_back;
    private javax.swing.JToggleButton btn_beri_makan;
    private javax.swing.JToggleButton btn_beri_obat;
    private javax.swing.JLabel daerah;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jumlah_ikan;
    private javax.swing.JLabel jumlah_makanan;
    private javax.swing.JLabel jumlah_obat;
    private javax.swing.JLabel jumlah_uang;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txt_beri_makan;
    private javax.swing.JLabel txt_beri_obat;
    // End of variables declaration//GEN-END:variables
}
