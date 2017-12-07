package m;

import db_djuko.db_main;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class m_login {

    ResultSet rs;
    protected db_main con;

    public m_login() throws SQLException {
        this.con = new db_main();
    }

    public boolean getPlayer(String username, String password) throws SQLException {
        String query = "SELECT * FROM `player` WHERE username = '" + username + "' AND password = '" + password + "'";
        boolean status = false;
        try {
            rs = con.getResult(query);
            if (rs.next()) {
                status = true;
            }
        } catch (SQLException e) {
            System.out.println("Salah");
        }
        return status;
    }

//    public String getIdPlayer(String username) throws SQLException {
//        String query = "SELECT `id` FROM `player` WHERE `username` = '" + username + "'";
//        ResultSet hasil = con.getResult(query);
//        hasil.next();
//        String data = hasil.getString(1).toUpperCase();
//        return data;
//    }
}
