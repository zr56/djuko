package db_djuko;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class db_main {

    private Connection con;
    private Statement stm;

    public db_main() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/djuko_04";
        String username = "root";
        String password = "";
        this.con = DriverManager.getConnection(url, username, password);
        this.stm = con.createStatement();
    }

    public void executeQuery(String query) throws SQLException  {
        this.stm.execute(query);
    }

    public ResultSet getResult(String query) throws SQLException {
        ResultSet rs = stm.executeQuery(query);
        return rs;
    }
}
