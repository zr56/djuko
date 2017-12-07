package m;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class m_djuko extends m_func_play {

    public m_djuko() throws SQLException {
    }

    public String cekId(String username) throws SQLException {
        String query = "SELECT `id_player` FROM `player` where `username` = '" + username + "'";
        ResultSet hasil = con.getResult(query);
        hasil.next();
        String data = hasil.getString(1).toUpperCase();
        return data;
    }

    public String cekId_perawatan(String username) throws SQLException {
        String query = "SELECT p.`id_perawatan` FROM `perawatan` p JOIN `player` pl ON p.`id_player`=pl.`id_player` WHERE pl.`username` = '" + username + "'";
        ResultSet hasil = con.getResult(query);
        hasil.next();
        String data = hasil.getString(1).toUpperCase();
        return data;
    }

    public String[] cekId_ikan(String username) throws SQLException {
        String query = "SELECT i.`id_ikan` FROM `ikan` i JOIN `perawatan` p "
                + "ON i.`id_perawatan`=p.`id_perawatan` JOIN `player` pl ON "
                + "p.`id_player`=pl.`id_player` WHERE pl.`username`='" + username + "'";
        boolean status = false;
        String id[];
        int hitung = 0;
        ResultSet hasil = con.getResult(query);
        while (hasil.next()) {
            hitung++;
        }
        hasil.beforeFirst();
        id = new String[hitung];
        int i = 0;
        while (hasil.next()) {
            id[i] = hasil.getString(1);
            i++;
        }
        return id;
    }

    //ikan
    //sumatera
    public int getJumlahIkanSumatera(String username) throws SQLException {
        String query = "SELECT COUNT(*) FROM `player` p JOIN `perawatan` pr "
                + "ON p.`id_player`=pr.`id_player` JOIN `ikan` i ON pr.`id_perawatan`=i.`id_perawatan` "
                + "WHERE p.`username`='" + username + "' AND i.`daerah`=1";
        return getDataInt(query);
    }

    public boolean addIkanSumatera(String id_perawatan) throws SQLException {
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`, `daerah`) "
                + "VALUES (NULL, " + id_perawatan + ", 30, 1, 1)";
        return getStatusQuery(query);
    }

    //kalimantan
    public int getJumlahIkanKalimantan(String username) throws SQLException {
        String query = "SELECT COUNT(*) FROM `player` p JOIN `perawatan` pr "
                + "ON p.`id_player`=pr.`id_player` JOIN `ikan` i ON pr.`id_perawatan`=i.`id_perawatan` "
                + "WHERE p.`username`='" + username + "' AND i.`daerah`=2";
        return getDataInt(query);
    }

    public boolean addIkanKalimantan(String id_perawatan) throws SQLException {
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`, `daerah`) "
                + "VALUES (NULL, " + id_perawatan + ", 30, 1, 2)";
        return getStatusQuery(query);
    }

    //sulawesi
    public int getJumlahIkanSulawesi(String username) throws SQLException {
        String query = "SELECT COUNT(*) FROM `player` p JOIN `perawatan` pr "
                + "ON p.`id_player`=pr.`id_player` JOIN `ikan` i ON pr.`id_perawatan`=i.`id_perawatan` "
                + "WHERE p.`username`='" + username + "' AND i.`daerah`=3";
        return getDataInt(query);
    }

    public boolean addIkanSulawesi(String id_perawatan) throws SQLException {
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`, `daerah`) "
                + "VALUES (NULL, " + id_perawatan + ", 30, 1, 3)";
        return getStatusQuery(query);
    }

    //papua
    public int getJumlahIkanPapua(String username) throws SQLException {
        String query = "SELECT COUNT(*) FROM `player` p JOIN `perawatan` pr "
                + "ON p.`id_player`=pr.`id_player` JOIN `ikan` i ON pr.`id_perawatan`=i.`id_perawatan` "
                + "WHERE p.`username`='" + username + "' AND i.`daerah`=4";
        return getDataInt(query);
    }

    public boolean addIkanPapua(String id_perawatan) throws SQLException {
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`, `daerah`) "
                + "VALUES (NULL, " + id_perawatan + ", 30, 1, 4)";
        return getStatusQuery(query);
    }

    //jawa
    public int getJumlahIkanJawa(String username) throws SQLException {
        String query = "SELECT COUNT(*) FROM `player` p JOIN `perawatan` pr "
                + "ON p.`id_player`=pr.`id_player` JOIN `ikan` i ON pr.`id_perawatan`=i.`id_perawatan` "
                + "WHERE p.`username`='" + username + "' AND i.`daerah`=5";

        return getDataInt(query);
    }

    public boolean addIkanJawa(String id_perawatan) throws SQLException {
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`, `daerah`) "
                + "VALUES (NULL, " + id_perawatan + ", 30, 1, 5)";
        return getStatusQuery(query);
    }

    //makanan
    public int getJumlahMakanan(String username) throws SQLException {
        String query = "SELECT p.`stok_makanan` FROM `perawatan` p JOIN `player` pl ON p.`id_player`=pl.`id_player` WHERE pl.`username` = '" + username + "'";
        return getDataInt(query);
    }

    public boolean addMakanan(int makanan, String idplayer) throws SQLException {
        String query = "UPDATE `perawatan` SET `stok_makanan` = '" + (makanan + "") + "'where `id_player` =" + idplayer;
        return getStatusQuery(query);
    }

    //obat
    public int getJumlahObat(String username) throws SQLException {
        String query = "SELECT p.`stok_obat` FROM `perawatan` p JOIN `player` pl ON p.`id_player`=pl.`id_player` WHERE pl.`username` = '" + username + "'";
        return getDataInt(query);
    }

    public boolean addObat(int obat, String idplayer) throws SQLException {
        String query = "UPDATE `perawatan` SET `stok_obat` = '" + (obat + "") + "' where `id_player` = " + idplayer;
        return getStatusQuery(query);
    }

    //uang
    public int getJumlahUang(String username) throws SQLException {
        String query = "SELECT `uang` FROM `player` WHERE `username` = '" + username + "'";
        return getDataInt(query);
    }

    public boolean addUang(int uang, String idplayer) throws SQLException {
        String query = "UPDATE `player` SET `uang` = '" + (uang + "") + "'where `id_player` =" + idplayer;
        return getStatusQuery(query);
    }

    //umur
    public int getJumlahUmur(String username, String idikan) throws SQLException {
        String query = "SELECT i.`umur` FROM `ikan` i JOIN `perawatan` "
                + "p ON i.`id_perawatan`=p.`id_perawatan` JOIN `player` pl "
                + "ON p.`id_player`=pl.`id_player` WHERE pl.`username`='" + username + "' "
                + "AND i.`id_ikan`=" + idikan;
        return getDataInt(query);
    }

    public boolean addUmur(int umur, String idikan) {
        String query = "UPDATE `ikan` SET `umur`='" + umur + "'  WHERE `id_ikan`=" + idikan;
        return getStatusQuery(query);
    }

    public boolean addKekenyangan(int kekenyangan, String idikan) throws SQLException {
//        String query = "UPDATE `ikan` i JOIN `perawatan` p ON i.`id_perawatan`=p.`id_perawatan` JOIN `player` ON p.`id_player`=`player`.`id_player` SET i.`kekenyangan`= '" + (kekenyangan + "") + "' WHERE `player`.`id_player`='" + idplayer + "'";
        String query = "UPDATE `ikan` SET `kekenyangan`='" + kekenyangan + "'  WHERE `id_ikan`=" + idikan;
        return getStatusQuery(query);
    }

    //kekenyangan
    public int getJumlahKekenyangan(String username, String idikan) throws SQLException {
        String query = "SELECT i.`kekenyangan` FROM `ikan` i JOIN `perawatan` "
                + "p ON i.`id_perawatan`=p.`id_perawatan` JOIN `player` "
                + "pl ON p.`id_player`=pl.`id_player` WHERE "
                + "pl.`username`='" + username + "' and i.id_ikan=" + idikan;
        return getDataInt(query);
    }

    //tabel ikan
    public DefaultTableModel getTabelIkan(String username) throws SQLException {
        Object[] atas = {"id", "id perawatan", "kekenyangan", "umur", "daerah"};
        DefaultTableModel tm = new DefaultTableModel(null, atas);

        String sql = "SELECT i.`id_ikan`, i.`id_perawatan`, i.`kekenyangan`, i.`umur`, i.`daerah` "
                + "FROM `player` p JOIN `perawatan` pr ON p.`id_player`=pr.`id_player` JOIN `ikan` i "
                + "ON pr.`id_perawatan`=i.`id_perawatan` WHERE p.`username`='" + username + "' and i.`umur`>=5";
        for (int i = tm.getRowCount() - 1; i >= 0; i--) {
            tm.removeRow(i);
        }
        ResultSet rs = con.getResult(sql);
        while (rs.next()) {
            String kolom[] = new String[5];
            for (int i = 0; i < kolom.length; i++) {
                kolom[i] = rs.getString(i + 1);
            }
            tm.addRow(kolom);
        }
        return tm;
    }

    public void jualIkan(String idikan) throws SQLException {
        String query = "DELETE FROM `ikan` WHERE `id_ikan`= " + idikan;
        con.executeQuery(query);
    }

    public int getJumlahDaerah(String username) throws SQLException {
        String query = "SELECT i.`daerah` FROM `player` p JOIN `perawatan` pr "
                + "ON p.`id_player`=pr.`id_player` JOIN `ikan` i ON pr.`id_perawatan`=i.`id_perawatan` "
                + "WHERE p.`username`='" + username + "'";
        return getDataInt(query);
    }

    //jumlah level
    public int getJumlahLevel(String username) throws SQLException {
        String query = "SELECT `level` FROM `player` WHERE `username`='" + username + "'";
        return getDataInt(query);
    }

    public boolean tambahLevel(int level, String username) throws SQLException {
        String query = "UPDATE `player` SET `level`=" + level + " WHERE `username`='" + username + "'";
        return getStatusQuery(query);
    }
}
