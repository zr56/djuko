package m;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import db_djuko.db_main;

public class m_registrasi {

    private db_main kon;

    public m_registrasi() {
        try {
            kon = new db_main();
        } catch (SQLException ex) {
            Logger.getLogger(m_registrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void simpan(String username, String password) throws SQLException {
        String query = "INSERT INTO `player` VALUES (NULL, '" + username + "', '" + password + "', 2000, 1)";
        try {
            kon.executeQuery(query);
        } catch (Exception ex) {
            Logger.getLogger(m_registrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
