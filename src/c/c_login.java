package c;

import v.v_login;
import m.m_login;
import c.c_home_play;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class c_login {

    v_login theV;
    m_login theM;

    public c_login() throws SQLException {
        this.theV = new v_login();
        this.theM = new m_login();

        theV.btnLogin(new loginAction());
        this.theV.setVisible(true);
        theV.keluar(new keluarAction());
    }

    private class loginAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (theV.getUser().isEmpty()) {
                    theV.pesanTampil("Jangan biarkan username kosong");
                } else if (theV.getPass().isEmpty()) {
                    theV.pesanTampil("Jangan biarkan password kosong");
                } else if (theM.getPlayer(theV.getUser(), theV.getPass())) {
                    new c_home_play(theV.getUser());
                    theV.dispose();
                } else {
                    theV.pesanTampil("username/password salah");
                }
            } catch (SQLException ex) {
                System.out.println("ada something");
            }
        }
    }

    private class keluarAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            theV.dispose();
        }
    }
}
