package m;

import java.sql.ResultSet;
import java.sql.SQLException;
import db_djuko.db_main;

public class m_func_play {

    db_main con;

    public m_func_play() throws SQLException {
        this.con = new db_main();
        con = new db_main();
    }

    public boolean getStatusQuery(String query) {
        boolean succes = false;
        try {
            con.executeQuery(query);
            succes = true;
        } catch (SQLException ex) {
            succes = false;;
        }
        return succes;
    }

    public int getDataInt(String query) throws SQLException {
        ResultSet hasil = con.getResult(query);
        hasil.next();
        int data = hasil.getInt(1);
        return data;
    }
}
