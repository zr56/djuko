package c;

import v.v_home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c_home {

    v_home theV = new v.v_home();

    public c_home() {
        theV.setVisible(true);
        theV.addBtnNewGame(new newListener());
        theV.addBtnContinueGame(new continueListener());
        theV.keluar(new keluarAction());
    }

    private class newListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            c_registrasi con = new c_registrasi();
        }
    }

    private class continueListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theV.dispose();
            try {
                c_login login = new c_login();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class keluarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae)     {
            theV.dispose();
        }
    }
}
