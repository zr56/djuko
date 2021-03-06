package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import v.v_play_sumatera;
import m.m_djuko;
import v.v_popUp_beli;

public class c_play_sumatera {

    JButton t_ikan = new JButton();

    v_play_sumatera theV;
    v_popUp_beli theVB;

    m_djuko theM;
    String username;
    String statusBeli = "beli";

    boolean statusMakanan = false;
    boolean statusObat = false;
    boolean statusIkan = false;
    boolean beriMakan = false;
    boolean beriObat = false;

    int uang;
    int ikan;
    int obat;
    int makanan;
    int jumlah;
    int jumlah_ikan;
    int value;
//    int umur;
    int beri_makan;
//    int kekenyangan[];
    ArrayList<Integer> kekenyangan = new ArrayList<Integer>();
    ArrayList<Integer> umur = new ArrayList<Integer>();
    JButton btn_ikan[];

    public c_play_sumatera(String username) throws SQLException {
        this.theV = new v_play_sumatera();
        this.theM = new m_djuko();
        this.theVB = new v_popUp_beli();
        this.username = username;
        this.theV.setVisible(true);

        ikan = theV.setJumlahIkan(theM.getJumlahIkanSumatera(username));
        uang = theV.setJumlahUang(theM.getJumlahUang(username));
        obat = theV.setJumlahObat(theM.getJumlahObat(username));
        makanan = theV.setJumlahMakanan(theM.getJumlahMakanan(username));
//        beri_makan = theM.getJumlahBeriMakan();

        jumlah_ikan = theM.getJumlahIkanSumatera(username);
        String id[] = theM.cekId_ikan(username);
//        kekenyangan.add(theM.getJumlahKekenyangan(username));

        Random rd = new Random();
        for (int i = 0; i < jumlah_ikan; i++) {
            System.out.println(theM.cekId_ikan(username)[i]);
            int x = rd.nextInt(500);
            int y = rd.nextInt(200);
            System.out.println("" + x + " : " + y);
            theV.tambahIkan(x, y, theM.getJumlahUmur(username, id[i]), theM.getJumlahKekenyangan(username, id[i]), new ikanListener(), theM.cekId_ikan(username));
//            theVB.setHasil("0");
            kekenyangan.add(theM.getJumlahKekenyangan(username, id[i]));
            umur.add(theM.getJumlahUmur(username, id[i]));
        }

        ikan = theV.setJumlahIkan(jumlah_ikan);
        jumlah = theVB.getTotal();

        //back
        theV.home(new backAction());

        //beri makan
        theV.beriMakanListener(new beriMakanAction());
        theV.beriObatListener(new beriObatAction());
    }

    //back
    private class backAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            try {
                c_home_play c = new c_home_play(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_play_sumatera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //beri makan & obat
    private class beriMakanAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (theV.getBeriMakan().isSelected()) {
                beriMakan = true;
                theV.setBeriMakan("ON");
            } else {
                beriMakan = false;
                theV.setBeriMakan("OFF");
            }
        }
    }

    private class beriObatAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (theV.getBeriObat().isSelected()) {
                beriObat = true;
                theV.setBeriObat("ON");
            } else {
                beriObat = false;
                theV.setBeriObat("OFF");
            }
        }
    }

    //ikan listener
    private class ikanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn3 = (JButton) e.getSource();

            try {
                if (beriMakan) {
                    if (makanan <= 0) {
                        System.out.println("-- makanan habis");
                    } else {
                        makanan--;
                        for (int i = 0; i < jumlah_ikan; i++) {
                            if (btn3.getText().equalsIgnoreCase(theM.cekId_ikan(username)[i])) {
                                int a = kekenyangan.get(i);
                                a = a + 5;
                                kekenyangan.set(i, a);
                                theV.hp.setValue(kekenyangan.get(i));
                                theM.addKekenyangan(kekenyangan.get(i), theM.cekId_ikan(username)[i]);
                                System.out.println("> id perawatan = " + theM.cekId_perawatan(username));
                                System.out.println("id ikan = " + theM.cekId_ikan(username)[i]);
                                System.out.println("kekenyangan = " + kekenyangan.get(i));
                            }
                        }
                    }
                    theV.setMakanan(makanan);
                    theM.addMakanan(makanan, theM.cekId_perawatan(username));
                } else if (beriObat = true) {
                    if (obat <= 0) {
                        System.out.println("-- obat habis");
                    } else {
                        obat--;
                        for (int i = 0; i < jumlah_ikan; i++) {
                            if (btn3.getText().equalsIgnoreCase(theM.cekId_ikan(username)[i])) {
                                int a = kekenyangan.get(i);
                                a = a + 10;
                                kekenyangan.set(i, a);
                                theV.hp.setValue(kekenyangan.get(i));
                                int b = umur.get(i);
                                b = b + 1;
                                umur.set(i, b);
                                theV.umur.setValue(umur.get(i));
                                theM.addKekenyangan(kekenyangan.get(i), theM.cekId_ikan(username)[i]);
                                theM.addUmur(umur.get(i), theM.cekId_ikan(username)[i]);
                                System.out.println("> id perawatan = " + theM.cekId_perawatan(username));
                                System.out.println("id ikan = " + theM.cekId_ikan(username)[i]);
                                System.out.println("kekenyangan = " + kekenyangan.get(i));
                                System.out.println("umur = " + umur.get(i));
                            }
                        }
                    }
                    theV.setObat(obat);
                    theM.addObat(obat, theM.cekId_perawatan(username));
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_play_sumatera.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
    }
}
