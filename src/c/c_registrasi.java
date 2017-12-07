package c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import v.v_registrasi;
import m.m_registrasi;

public class c_registrasi {

    m_registrasi theM = new m_registrasi();
    v_registrasi theV = new v_registrasi();

    public c_registrasi() {
        theV.setVisible(true);
        theV.addBuatAkunListener(new simpanListener());
        theV.keluar(new keluarAction());
    }

    private class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.getSimpan().setEnabled(true);
            String id = theV.getId().getText();
            String user = (String) theV.get_userDaftar().getText();
            String pass = (String) theV.get_passDaftar().getText();

            try {
                if (user.isEmpty() || pass.isEmpty()) {
                    theV.pesanTampil("jangan biarkan kosong");
                } else if (id.isEmpty()) {
                    theM.simpan(user, pass);
                    theV.dispose();
                    c_home_play a = new c_home_play(user);
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_registrasi.class.getName()).log(Level.SEVERE, null, ex);
            }

            theV.get_userDaftar().setText("");
            theV.get_passDaftar().setText("");
        }
    }

    public class keluarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            theV.dispose();
        }
    }
}
