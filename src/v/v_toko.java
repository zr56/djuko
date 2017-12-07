package v;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class v_toko extends javax.swing.JFrame {

    public v_toko() {
        initComponents();
        btn_ikan_sumatera.setEnabled(false);
        btn_ikan_kalimantan.setEnabled(false);
        btn_ikan_sulawesi.setEnabled(false);
        btn_ikan_papua.setEnabled(false);
        btn_ikan_jawa.setEnabled(false);
    }

    //action listener
    public void setBtnJual(ActionListener e) {
        this.btn_jual.addActionListener(e);
    }

    public void setBtnBeli(ActionListener e) {
        this.btn_beli.addActionListener(e);
    }

    public void btnMakananListener(ActionListener e) {
        this.btn_makanan.addActionListener(e);
    }

    public void btnObatListener(ActionListener e) {
        this.btn_obat.addActionListener(e);
    }

    public void btnIkanSumateraListener(ActionListener e) {
        this.btn_ikan_sumatera.addActionListener(e);
    }

    public void btnIkanKalimantanListener(ActionListener e) {
        this.btn_ikan_kalimantan.addActionListener(e);
    }

    public void btnIkanSulawesiListener(ActionListener e) {
        this.btn_ikan_sulawesi.addActionListener(e);
    }

    public void btnIkanPapuaListener(ActionListener e) {
        this.btn_ikan_papua.addActionListener(e);
    }

    public void btnIkanJawaListener(ActionListener e) {
        this.btn_ikan_jawa.addActionListener(e);
    }

    //jbutton
    public JButton getMakanan() {
        return btn_makanan;
    }

    public JButton getObat() {
        return btn_obat;
    }

    public JButton getIkanSumatera() {
        return btn_ikan_sumatera;
    }

    public JButton getIkanKalimantan() {
        return btn_ikan_kalimantan;
    }

    public JButton getIkanSulawesi() {
        return btn_ikan_sulawesi;
    }

    public JButton getIkanPapua() {
        return btn_ikan_papua;
    }

    public JButton getIkanJawa() {
        return btn_ikan_jawa;
    }

    //uang
    public void setUang(int text) {
        this.txt_uang.setText(text + "");
    }

    public int setJumlahUang(int text) {
        this.txt_uang.setText(text + "");
        return text;
    }

    //makanan
    public void setMakanan(int text) {
        this.txt_jumlah_makanan.setText(text + "");
    }

    public int setJumlahMakanan(int text) {
        this.txt_jumlah_makanan.setText(text + "");
        return text;
    }

    public int setHargaMakanan(int text) {
        this.txt_harga_makanan.setText(text + "");
        return text;
    }

    //obat
    public void setObat(int text) {
        this.txt_jumlah_obat.setText(text + "");
    }

    public int setJumlahObat(int text) {
        this.txt_jumlah_obat.setText(text + "");
        return text;
    }

    public int setHargaObat(int text) {
        this.txt_harga_obat.setText(text + "");
        return text;
    }

    //ikan
    public void setIkanSumatera(int text) {
        this.txt_jumlah_sumatera.setText(text + "");
    }

    public int setJumlahIkanSumatera(int text) {
        this.txt_jumlah_sumatera.setText(text + "");
        return text;
    }

    public int setHargaIkanSumatera(int text) {
        this.txt_harga_sumatera.setText(text + "");
        return text;
    }

    public void setIkanKalimantan(int text) {
        this.txt_jumlah_kalimantan.setText(text + "");
    }

    public int setJumlahIkanKalimantan(int text) {
        this.txt_jumlah_kalimantan.setText(text + "");
        return text;
    }

    public int setHargaIkanKalimantan(int text) {
        this.txt_harga_kalimantan.setText(text + "");
        return text;
    }

    public void setIkanSulawesi(int text) {
        this.txt_jumlah_sulawesi.setText(text + "");
    }

    public int setJumlahIkanSulawesi(int text) {
        this.txt_jumlah_sulawesi.setText(text + "");
        return text;
    }

    public int setHargaIkanSulawesi(int text) {
        this.txt_harga_sulawesi.setText(text + "");
        return text;
    }

    public void setIkanPapua(int text) {
        this.txt_jumlah_papua.setText(text + "");
    }

    public int setJumlahIkanPapua(int text) {
        this.txt_jumlah_papua.setText(text + "");
        return text;
    }

    public int setHargaIkanPapua(int text) {
        this.txt_harga_papua.setText(text + "");
        return text;
    }

    public void setIkanJawa(int text) {
        this.txt_jumlah_jawa.setText(text + "");
    }

    public int setJumlahIkanJawa(int text) {
        this.txt_jumlah_jawa.setText(text + "");
        return text;
    }

    public int setHargaIkanJawa(int text) {
        this.txt_harga_jawa.setText(text + "");
        return text;
    }

    //exit
    public void home(ActionListener e) {
        this.btn_home.addActionListener(e);
    }

    public JButton getHome() {
        return btn_home;
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

        txt_uang = new javax.swing.JLabel();
        txt_jumlah_sumatera = new javax.swing.JLabel();
        txt_harga_sumatera = new javax.swing.JLabel();
        txt_jumlah_sulawesi = new javax.swing.JLabel();
        txt_harga_sulawesi = new javax.swing.JLabel();
        txt_jumlah_jawa = new javax.swing.JLabel();
        txt_harga_jawa = new javax.swing.JLabel();
        txt_jumlah_kalimantan = new javax.swing.JLabel();
        txt_harga_kalimantan = new javax.swing.JLabel();
        txt_jumlah_papua = new javax.swing.JLabel();
        txt_harga_papua = new javax.swing.JLabel();
        txt_jumlah_makanan = new javax.swing.JLabel();
        txt_harga_makanan = new javax.swing.JLabel();
        txt_jumlah_obat = new javax.swing.JLabel();
        txt_harga_obat = new javax.swing.JLabel();
        btn_jual = new javax.swing.JButton();
        btn_beli = new javax.swing.JButton();
        btn_ikan_sumatera = new javax.swing.JButton();
        btn_ikan_kalimantan = new javax.swing.JButton();
        btn_ikan_sulawesi = new javax.swing.JButton();
        btn_ikan_papua = new javax.swing.JButton();
        btn_ikan_jawa = new javax.swing.JButton();
        btn_makanan = new javax.swing.JButton();
        btn_obat = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_uang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, 25));

        txt_jumlah_sumatera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_jumlah_sumatera, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 25, 20));

        txt_harga_sumatera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_harga_sumatera.setText("500");
        getContentPane().add(txt_harga_sumatera, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 50, 20));

        txt_jumlah_sulawesi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jumlah_sulawesi.setText("0");
        getContentPane().add(txt_jumlah_sulawesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 245, 25, 20));

        txt_harga_sulawesi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_harga_sulawesi.setText("500");
        getContentPane().add(txt_harga_sulawesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 245, 50, 20));

        txt_jumlah_jawa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jumlah_jawa.setText("0");
        getContentPane().add(txt_jumlah_jawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 25, 20));

        txt_harga_jawa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_harga_jawa.setText("500");
        getContentPane().add(txt_harga_jawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 50, 20));

        txt_jumlah_kalimantan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_jumlah_kalimantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 25, 20));

        txt_harga_kalimantan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_harga_kalimantan.setText("500");
        getContentPane().add(txt_harga_kalimantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 20));

        txt_jumlah_papua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jumlah_papua.setText("0");
        getContentPane().add(txt_jumlah_papua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 245, 25, 20));

        txt_harga_papua.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_harga_papua.setText("500");
        getContentPane().add(txt_harga_papua, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 245, 50, 20));

        txt_jumlah_makanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_jumlah_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 25, 20));

        txt_harga_makanan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_harga_makanan.setText("200");
        getContentPane().add(txt_harga_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 50, 20));

        txt_jumlah_obat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txt_jumlah_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 245, 25, 20));

        txt_harga_obat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_harga_obat.setText("1000");
        getContentPane().add(txt_harga_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 245, 50, 20));

        btn_jual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_jual.png"))); // NOI18N
        btn_jual.setBorderPainted(false);
        btn_jual.setContentAreaFilled(false);
        btn_jual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 40, 20));

        btn_beli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_beli.png"))); // NOI18N
        btn_beli.setBorderPainted(false);
        btn_beli.setContentAreaFilled(false);
        btn_beli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 40, 20));

        btn_ikan_sumatera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_sumatera.png"))); // NOI18N
        btn_ikan_sumatera.setBorderPainted(false);
        btn_ikan_sumatera.setContentAreaFilled(false);
        btn_ikan_sumatera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_ikan_sumatera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 115, 25));

        btn_ikan_kalimantan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_kalimantan.png"))); // NOI18N
        btn_ikan_kalimantan.setBorderPainted(false);
        btn_ikan_kalimantan.setContentAreaFilled(false);
        btn_ikan_kalimantan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_ikan_kalimantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 115, 25));

        btn_ikan_sulawesi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_sulawesi.png"))); // NOI18N
        btn_ikan_sulawesi.setBorderPainted(false);
        btn_ikan_sulawesi.setContentAreaFilled(false);
        btn_ikan_sulawesi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_ikan_sulawesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 215, 115, 25));

        btn_ikan_papua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_papua.png"))); // NOI18N
        btn_ikan_papua.setBorderPainted(false);
        btn_ikan_papua.setContentAreaFilled(false);
        btn_ikan_papua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_ikan_papua, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 215, 115, 25));

        btn_ikan_jawa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_jawa.png"))); // NOI18N
        btn_ikan_jawa.setBorderPainted(false);
        btn_ikan_jawa.setContentAreaFilled(false);
        btn_ikan_jawa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_ikan_jawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 115, 25));

        btn_makanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_makanan.png"))); // NOI18N
        btn_makanan.setBorderPainted(false);
        btn_makanan.setContentAreaFilled(false);
        btn_makanan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 150, 115, 25));

        btn_obat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/btn_obat.png"))); // NOI18N
        btn_obat.setBorderPainted(false);
        btn_obat.setContentAreaFilled(false);
        btn_obat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 215, 115, 25));

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_daerah/btn_back.png"))); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 2, 30, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/toko/ui_3.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(v_toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_toko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_beli;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_ikan_jawa;
    private javax.swing.JButton btn_ikan_kalimantan;
    private javax.swing.JButton btn_ikan_papua;
    private javax.swing.JButton btn_ikan_sulawesi;
    private javax.swing.JButton btn_ikan_sumatera;
    private javax.swing.JButton btn_jual;
    private javax.swing.JButton btn_makanan;
    private javax.swing.JButton btn_obat;
    private javax.swing.JLabel txt_harga_jawa;
    private javax.swing.JLabel txt_harga_kalimantan;
    private javax.swing.JLabel txt_harga_makanan;
    private javax.swing.JLabel txt_harga_obat;
    private javax.swing.JLabel txt_harga_papua;
    private javax.swing.JLabel txt_harga_sulawesi;
    private javax.swing.JLabel txt_harga_sumatera;
    private javax.swing.JLabel txt_jumlah_jawa;
    private javax.swing.JLabel txt_jumlah_kalimantan;
    private javax.swing.JLabel txt_jumlah_makanan;
    private javax.swing.JLabel txt_jumlah_obat;
    private javax.swing.JLabel txt_jumlah_papua;
    private javax.swing.JLabel txt_jumlah_sulawesi;
    private javax.swing.JLabel txt_jumlah_sumatera;
    private javax.swing.JLabel txt_uang;
    // End of variables declaration//GEN-END:variables
}
