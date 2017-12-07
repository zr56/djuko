package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.m_djuko;
import v.tabel_ikan;

public class c_tabel_ikan {

    tabel_ikan theV;
    m_djuko theM;
    String username;

    int daerah;
    int uang;

    public c_tabel_ikan(String username) throws SQLException {
        this.theM = new m_djuko();
        this.theV = new tabel_ikan();
        this.username = username;
        this.theV.setVisible(true);

        daerah = theM.getJumlahDaerah(username);
        uang = theM.getJumlahUang(username);

        theV.setTbIkan(theM.getTabelIkan(username));
        theV.btnJualIkanListener(new jualAction());
        theV.btnBack(new backAction());
    }

    private class jualAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int baris = theV.getTabelIkan().getSelectedRow();
            theV.getJual().setEnabled(true);
            if (baris != -1) {
                String id = (String) theV.getTabelIkan().getValueAt(baris, 0);

                try {
                    System.out.println("uang 1 : " + uang);
                    theM.jualIkan(id);
                    if (daerah == 1) {
                        uang = uang + 1000;
                    } else if (daerah == 2) {
                        uang = uang + 2000;
                    } else if (daerah == 3) {
                        uang = uang + 3000;
                    } else if (daerah == 4) {
                        uang = uang + 4000;
                    } else {
                        uang = uang + 5000;
                    }
                    System.out.println("uang 2 : " + uang);
                    theM.addUang(uang, theM.cekId(username));
                    theV.setTbIkan(theM.getTabelIkan(username));
                    System.out.println("sukses");
                } catch (SQLException ex) {
                    Logger.getLogger(c_tabel_ikan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private class backAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theV.dispose();
            try {
                c_home_play home = new c_home_play(username);
            } catch (SQLException ex) {
                Logger.getLogger(c_tabel_ikan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
