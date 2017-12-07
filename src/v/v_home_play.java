package v;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class v_home_play extends javax.swing.JFrame {

    public v_home_play() {
        initComponents();
        btn_sumatera.setEnabled(false);
        btn_kalimantan.setEnabled(false);
        btn_sulawesi.setEnabled(false);
        btn_jawa.setEnabled(false);
        btn_papua.setEnabled(false);
    }

    public JTextField getId() {
        return id;
    }

    //tabel
    public void tabelListener(ActionListener e) {
        this.btn_tabel.addActionListener(e);
    }

    public JButton getTabel() {
        return btn_tabel;
    }

    //action listener
    public void btnSumateraListener(ActionListener e) {
        this.btn_sumatera.addActionListener(e);
    }

    public void btnKalimantanListener(ActionListener e) {
        this.btn_kalimantan.addActionListener(e);
    }

    public void btnSulawesiListener(ActionListener e) {
        this.btn_sulawesi.addActionListener(e);
    }

    public void btnPapuaListener(ActionListener e) {
        this.btn_papua.addActionListener(e);
    }

    public void btnJawaListener(ActionListener e) {
        this.btn_jawa.addActionListener(e);
    }

    public JButton getSumatera() {
        return btn_sumatera;
    }

    public JButton getKalimantan() {
        return btn_kalimantan;
    }

    public JButton getSulawesi() {
        return btn_sulawesi;
    }

    public JButton getPapua() {
        return btn_papua;
    }

    public JButton getJawa() {
        return btn_jawa;
    }

    public void setUang(int text) {
        this.txt_uang.setText(text + "");
    }

    public void setMakanan(int text) {
        this.jumlah_makanan.setText(text + "");
    }

    public void setObat(int text) {
        this.jumlah_obat.setText(text + "");
    }

    public int setJumlahUang(int text) {
        this.txt_uang.setText(text + "");
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

    public String setNama(String text) {
        this.nama.setText(text + "");
        return text;
    }

    //toko
    public void toko(ActionListener e) {
        this.btn_toko.addActionListener(e);
    }

    public JButton getToko() {
        return btn_toko;
    }

    //exit
    public void keluar(ActionListener e) {
        this.btn_exit.addActionListener(e);
    }

    public JButton getKeluar() {
        return btn_exit;
    }

    //pesan
    public void tampilPesan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public int tampilYesNo(String pesan) {
        return JOptionPane.showConfirmDialog(this, pesan, null, JOptionPane.YES_NO_OPTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sumatera = new javax.swing.JButton();
        btn_kalimantan = new javax.swing.JButton();
        btn_sulawesi = new javax.swing.JButton();
        btn_papua = new javax.swing.JButton();
        btn_jawa = new javax.swing.JButton();
        jumlah_makanan = new javax.swing.JLabel();
        jumlah_obat = new javax.swing.JLabel();
        txt_uang = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        btn_toko = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_tabel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sumatera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_sumatera.png"))); // NOI18N
        btn_sumatera.setBorderPainted(false);
        btn_sumatera.setContentAreaFilled(false);
        btn_sumatera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_sumatera, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 160, -1));

        btn_kalimantan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_kalimantan.png"))); // NOI18N
        btn_kalimantan.setBorderPainted(false);
        btn_kalimantan.setContentAreaFilled(false);
        btn_kalimantan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_kalimantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 160, -1));

        btn_sulawesi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_sulawesi.png"))); // NOI18N
        btn_sulawesi.setBorderPainted(false);
        btn_sulawesi.setContentAreaFilled(false);
        btn_sulawesi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_sulawesi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 160, -1));

        btn_papua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_papua.png"))); // NOI18N
        btn_papua.setBorderPainted(false);
        btn_papua.setContentAreaFilled(false);
        btn_papua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_papua, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 160, -1));

        btn_jawa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_jawa.png"))); // NOI18N
        btn_jawa.setBorderPainted(false);
        btn_jawa.setContentAreaFilled(false);
        btn_jawa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_jawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 160, -1));

        jumlah_makanan.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jumlah_makanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jumlah_makanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 30, 30));

        jumlah_obat.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jumlah_obat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jumlah_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 30, 30));

        txt_uang.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        getContentPane().add(txt_uang, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 40, 100, 25));

        nama.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        nama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 15, 120, 20));

        btn_toko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_toko.png"))); // NOI18N
        btn_toko.setBorderPainted(false);
        btn_toko.setContentAreaFilled(false);
        btn_toko.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_toko, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 33, 37, 37));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_home.png"))); // NOI18N
        btn_exit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 5, 30, -1));

        btn_tabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/btn_tabel.png"))); // NOI18N
        btn_tabel.setBorderPainted(false);
        btn_tabel.setContentAreaFilled(false);
        btn_tabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 33, 34, 34));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeplay/ui.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        id.setEditable(false);
        id.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        id.setOpaque(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 20, -1));

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
            java.util.logging.Logger.getLogger(v_home_play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_home_play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_home_play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_home_play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_home_play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_jawa;
    private javax.swing.JButton btn_kalimantan;
    private javax.swing.JButton btn_papua;
    private javax.swing.JButton btn_sulawesi;
    private javax.swing.JButton btn_sumatera;
    private javax.swing.JButton btn_tabel;
    private javax.swing.JButton btn_toko;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jumlah_makanan;
    private javax.swing.JLabel jumlah_obat;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel txt_uang;
    // End of variables declaration//GEN-END:variables
}
