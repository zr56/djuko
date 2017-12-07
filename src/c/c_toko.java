package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.v_toko;
import m.m_djuko;
import v.v_popUp_beli;
import v.v_home_play;

public class c_toko {

    v_toko theV;
    v_home_play theVHP;
    v_popUp_beli theVP;
    m_djuko theM;
    String username;
    String statusBeli = "beli";
    boolean statusMakanan = false;
    boolean statusObat = false;
    boolean statusSumatera = false;
    boolean statusKalimantan = false;
    boolean statusSulawesi = false;
    boolean statusPapua = false;
    boolean statusJawa = false;

    int hargaBeliIkan = 500;
    int hargaBeliIkanKalimantan = 600;
    int hargaBeliIkanSulawesi = 700;
    int hargaBeliIkanPapua = 800;
    int hargaBeliIkanJawa = 10000;

    int hargaBeliMakanan = 200;
    int hargaJualMakanan = 100;
    int hargaBeliObat = 1000;
    int hargaJualObat = 500;

    int jumlah;
    int uang;
    int makanan;
    int obat;
    int ikanSumaetra = 0;
    int ikanKalimantan = 0;
    int ikanSulawesi = 0;
    int ikanPapua = 0;
    int ikanJawa = 0;
    int level;

    public c_toko(String username) throws SQLException {
        this.theV = new v_toko();
        this.theM = new m_djuko();
        this.theVP = new v_popUp_beli();
        this.theVHP = new v_home_play();
        this.username = username;
        this.theV.setVisible(true);

        uang = theV.setJumlahUang(theM.getJumlahUang(username));
        makanan = theV.setJumlahMakanan(theM.getJumlahMakanan(username));
        obat = theV.setJumlahObat(theM.getJumlahObat(username));
        ikanSumaetra = theV.setJumlahIkanSumatera(theM.getJumlahIkanSumatera(username));
        ikanKalimantan = theV.setJumlahIkanKalimantan(theM.getJumlahIkanKalimantan(username));
        ikanSulawesi = theV.setJumlahIkanSulawesi(theM.getJumlahIkanSulawesi(username));
        ikanPapua = theV.setJumlahIkanPapua(theM.getJumlahIkanPapua(username));
        ikanJawa = theV.setJumlahIkanJawa(theM.getJumlahIkanJawa(username));
        level = theM.getJumlahLevel(username);

        theV.setBtnBeli(new setBeliAction());
        theV.setBtnJual(new setJualAction());
        theV.btnMakananListener(new tekanMakanan());
        theV.btnIkanSumateraListener(new tekanIkanSumatera());
        theV.btnIkanKalimantanListener(new tekanIkanKalimantan());
        theV.btnIkanSulawesiListener(new tekanIkanSulawesi());
        theV.btnIkanPapuaListener(new tekanIkanPapua());
        theV.btnIkanJawaListener(new tekanIkanJawa());

        theVP.btnKurang(new kurangAction());
        theVP.btnTambah(new tambahAction());
        theVP.btnBeli(new beliItem());
        theVP.btnBatal(new batalAction());

        if (level == 1) {
            theV.getIkanSumatera().setEnabled(true);
        } else if (level == 2) {
            theV.getIkanKalimantan().setEnabled(true);
        } else if (level == 3) {
            theV.getIkanSulawesi().setEnabled(true);
        } else if (level == 4) {
            theV.getIkanPapua().setEnabled(true);
        } else {
            theV.getIkanJawa().setEnabled(true);
        }

        theV.home(new homeAction());
    }

    //set harga beli & jual
    private class setBeliAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusBeli = "beli";
            theV.setHargaMakanan(200);
            theV.setHargaObat(1000);
        }
    }

    private class setJualAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusBeli = "jual";
            theV.setHargaMakanan(100);
            theV.setHargaObat(500);
        }
    }

    //tekan
    private class tekanMakanan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusMakanan = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class tekanObat implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusObat = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class tekanIkanSumatera implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusSumatera = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class tekanIkanKalimantan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusKalimantan = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class tekanIkanSulawesi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusSulawesi = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class tekanIkanPapua implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusPapua = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class tekanIkanJawa implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusJawa = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    //exit
    private class homeAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theV.dispose();
                c_home_play hp = new c_home_play(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //beli / jual action
    private class makananAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusMakanan = true;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class obatAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusObat = false;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class sumateraAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusSumatera = false;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class kalimantanAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusKalimantan = false;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class sulawesiAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusSulawesi = false;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class papuaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusPapua = false;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    private class jawaAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            statusJawa = false;
            theVP.getKurang().setEnabled(false);
            theVP.setVisible(true);
        }
    }

    //action item
    private void beliMakananAction() {
        try {
            if (statusBeli.equalsIgnoreCase("beli")) {
                for (int i = 0; i < jumlah; i++) {
                    makanan++;
                    if (uang <= 0) {
                        theV.pesanTampil("Maaf, uang habis");
                    } else {
                        if (theM.addMakanan(makanan, theM.cekId(username))) {
                            uang = uang - hargaBeliMakanan;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            } else if (statusBeli.equalsIgnoreCase("jual")) {
                for (int i = 0; i < jumlah; i++) {
                    makanan--;
                    if (makanan <= 0) {
                        theV.pesanTampil("Maaf, stok habis");
                    } else {
                        if (theM.addMakanan(makanan, theM.cekId(username))) {
                            uang = uang + hargaJualMakanan;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            }
            theV.setUang(theM.getJumlahUang(username));
            theV.setMakanan(theM.getJumlahMakanan(username));
        } catch (SQLException ex) {
            Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void beliObatAction() {
        try {
            if (statusBeli.equalsIgnoreCase("beli")) {
                for (int i = 0; i < jumlah; i++) {
                    obat++;
                    if (uang <= 0) {
                        theV.pesanTampil("Maaf, uang habis");
                    } else {
                        if (theM.addObat(obat, theM.cekId(username))) {
                            uang = uang - hargaBeliObat;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            } else if (statusBeli.equalsIgnoreCase("jual")) {
                for (int i = 0; i < jumlah; i++) {
                    obat--;
                    if (makanan <= 0) {
                        theV.pesanTampil("Maaf, stok habis");
                    } else {
                        if (theM.addObat(obat, theM.cekId(username))) {
                            uang = uang + hargaJualObat;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            }
            theV.setUang(theM.getJumlahUang(username));
            theV.setObat(theM.getJumlahObat(username));
        } catch (SQLException ex) {
            Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void beliIkanSumatera() {
        try {
            if (statusBeli.equalsIgnoreCase("beli")) {
                for (int i = 0; i < jumlah; i++) {
                    ikanSumaetra++;
                    if (uang <= 0) {
                        theV.pesanTampil("Maaf, uang habis");
                    } else {
                        if (theM.addIkanSumatera(theM.cekId_perawatan(username))) {
                            uang = uang - hargaBeliIkan;
                            theM.addUang(uang, theM.cekId(username));
                            System.out.println("sukses");
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            }
            theV.setUang(theM.getJumlahUang(username));
            theV.setIkanSumatera(theM.getJumlahIkanSumatera(username));
        } catch (SQLException ex) {
            Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void beliIkanKalimantan() {
        try {
            if (statusBeli.equalsIgnoreCase("beli")) {
                for (int i = 0; i < jumlah; i++) {
                    ikanKalimantan++;
                    if (uang <= 0) {
                        theV.pesanTampil("Maaf, uang habis");
                    } else {
                        if (theM.addIkanKalimantan(theM.cekId_perawatan(username))) {
                            uang = uang - hargaBeliIkanKalimantan;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            }
            theV.setUang(theM.getJumlahUang(username));
            theV.setIkanKalimantan(theM.getJumlahIkanKalimantan(username));
        } catch (SQLException ex) {
            Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, username, ex);
        }
    }

    private void beliIkanSulawesi() {
        try {
            if (statusBeli.equalsIgnoreCase("beli")) {
                for (int i = 0; i < jumlah; i++) {
                    ikanSulawesi++;
                    if (uang <= 0) {
                        theV.pesanTampil("Maaf, uang habis");
                    } else {
                        if (theM.addIkanSulawesi(theM.cekId_perawatan(username))) {
                            uang = uang - hargaBeliIkanSulawesi;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            }
            theV.setUang(theM.getJumlahUang(username));
            theV.setIkanSulawesi(theM.getJumlahIkanSulawesi(username));
        } catch (SQLException ex) {
            Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, username, ex);
        }
    }

    private void beliIkanPapua() {
        try {
            if (statusBeli.equalsIgnoreCase("beli")) {
                for (int i = 0; i < jumlah; i++) {
                    ikanPapua++;
                    if (uang <= 0) {
                        theV.pesanTampil("Maaf, uang habis");
                    } else {
                        if (theM.addIkanPapua(theM.cekId_perawatan(username))) {
                            uang = uang - hargaBeliIkanPapua;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            }
            theV.setUang(theM.getJumlahUang(username));
            theV.setIkanPapua(theM.getJumlahIkanPapua(username));
        } catch (SQLException ex) {
            Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, username, ex);
        }
    }

    private void beliIkanJawa() {
        try {
            if (statusBeli.equalsIgnoreCase("beli")) {
                for (int i = 0; i < jumlah; i++) {
                    ikanJawa++;
                    if (uang <= 0) {
                        theV.pesanTampil("Maaf, uang habis");
                    } else {
                        if (theM.addIkanJawa(theM.cekId_perawatan(username))) {
                            uang = uang - hargaBeliIkanJawa;
                            theM.addUang(uang, theM.cekId(username));
                        } else {
                            System.out.println("gagal");
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, username, ex);
        }
    }

    //caller
    private class beliItem implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (statusMakanan) {
                beliMakananAction();
            } else if (statusObat) {
                beliObatAction();
            } else if (statusSumatera) {
                beliIkanSumatera();
            } else if (statusKalimantan) {
                beliIkanKalimantan();
            } else if (statusSulawesi) {
                beliIkanSulawesi();
            } else if (statusPapua) {
                beliIkanPapua();
            } else if (statusJawa) {
                beliIkanJawa();
            }

            statusMakanan = false;
            statusSumatera = false;
            statusKalimantan = false;
            statusSulawesi = false;
            statusPapua = false;
            statusJawa = false;
            statusObat = false;
            jumlah = 1;
            theVP.setHasil(jumlah + "");
            theVP.dispose();
        }
    }

    //tombol pop up
    private class kurangAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (jumlah <= 2) {
                theVP.getKurang().setEnabled(false);
            }

            jumlah--;
            theVP.setHasil(jumlah + "");
        }
    }

    private class tambahAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theVP.getTambah().setEnabled(true);
            if (jumlah < 2) {
                theVP.getKurang().setEnabled(false);
            } else if (jumlah >= 2) {
                theVP.getKurang().setEnabled(true);
            }

            jumlah++;
            theVP.setHasil(jumlah + "");
        }
    }

    public class batalAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theVP.dispose();
            statusObat = false;
            statusMakanan = false;
            statusKalimantan = false;
            statusJawa = false;
            statusPapua = false;
            statusSulawesi = false;
            statusSumatera = false;
        }
    }
}
