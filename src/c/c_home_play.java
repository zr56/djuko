package c;

import v.v_home_play;
import m.m_djuko;
import v.v_popUp_beli;
import v.v_login;
import v.tabel_ikan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class c_home_play {

    tabel_ikan theVT;
    v_login theV_login;
    v_home_play theV;
    v_popUp_beli theVB;
    m_djuko theM;

    String username;
    String statusBeli = "beli";
    private String statusLevel;
    boolean statusMakanan = false;
    boolean statusObat = false;
    boolean statusIkan = false;
    boolean statusIkanKalimantan = false;
    boolean statusIkanSulawesi = false;
    boolean statusIkanPapua = false;
    boolean statusIkanJawa = false;
    public boolean statLevel = false;
    int uang;
    int ikan;
    int level;
    int ikanKalimantan;
    int ikanSulawesi;
    int ikanPapua;
    int ikanJawa;
    int obat;
    int makanan;
    int jumlah;

    String nama;
    String user;

    public c_home_play(String username) throws SQLException {
        this.theV = new v_home_play();
        this.theVT = new tabel_ikan();
        this.theV_login = new v_login();
        this.theM = new m_djuko();
        this.theVB = new v_popUp_beli();
        this.username = username;

        uang = theV.setJumlahUang(theM.getJumlahUang(username));
        obat = theV.setJumlahObat(theM.getJumlahObat(username));
        makanan = theV.setJumlahMakanan(theM.getJumlahMakanan(username));
        jumlah = theVB.getTotal();
        level = theM.getJumlahLevel(username);

        ikan = theM.getJumlahIkanSumatera(username);
        ikanKalimantan = theM.getJumlahIkanKalimantan(username);
        ikanSulawesi = theM.getJumlahIkanSulawesi(username);
        ikanPapua = theM.getJumlahIkanPapua(username);
        ikanJawa = theM.getJumlahIkanJawa(username);

        System.out.println("l : " + level);
        System.out.println("i : " + ikan);

        if (level == 1 && uang >= 10000 && ikan >= 3) {
            level++;
            theM.tambahLevel(level, username);
            System.out.println("level kalimantan");
        } else if (level == 2 && uang > 20000 && ikanKalimantan >= 4) {
            level++;
            theM.tambahLevel(level, username);
            System.out.println("level sulawesi");
        } else if (level == 3 && uang > 30000 && ikanSulawesi >= 5) {
            level++;
            theM.tambahLevel(level, username);
            System.out.println("level papua");
        } else if (level == 4 && uang > 40000 && ikanPapua >= 6) {
            level++;
            theM.tambahLevel(level, username);
            System.out.println("level jawa");
        } else if (level == 5 && uang >= 60000 && ikanJawa >= 7) {
            System.out.println("game selesai");
        }
        System.out.println("l2 : " + level);

        if (level == 1) {
            theV.getSumatera().setEnabled(true);
        } else if (level == 2) {
            theV.getKalimantan().setEnabled(true);
        } else if (level == 3) {
            theV.getSulawesi().setEnabled(true);
        } else if (level == 4) {
            theV.getPapua().setEnabled(true);
        } else {
            theV.getJawa().setEnabled(true);
        }

        //daerah
        theV.btnSumateraListener(new sumateraAction());
        theV.btnKalimantanListener(new kalimantanAction());
        theV.btnJawaListener(new jawaAction());
        theV.btnSulawesiListener(new sulawesiAction());
        theV.btnPapuaListener(new papuaAction());

        theV.toko(new tokoAction());
        theV.keluar(new keluarAction());

        theV.tabelListener(new tabel());

        this.theV.setVisible(true);
    }

    //daerah
    private class sumateraAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            try {
                c_play_sumatera p = new c_play_sumatera(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_home_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class kalimantanAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            try {
                c_play_kalimantan p = new c_play_kalimantan(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_home_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class papuaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            try {
                c_play_papua p = new c_play_papua(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_home_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class sulawesiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            try {
                c_play_sulawesi s = new c_play_sulawesi(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_home_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class jawaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            try {
                c_play_jawa j = new c_play_jawa(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_home_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //toko
    private class tokoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theV.dispose();
            try {
                c_toko t = new c_toko(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_home_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class keluarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    }

    private class tabel implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theV.dispose();
            try {
                c_tabel_ikan tb = new c_tabel_ikan(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_home_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
