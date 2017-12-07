package m;

import java.sql.ResultSet;
import java.sql.SQLException;

public class m_home_play extends m_func_play {

    public m_home_play() throws SQLException {
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
//uang

    public int getJumlahUang(String username) throws SQLException {
//        String query = "SELECT `uang` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT `uang` FROM `player` WHERE `username` = '" + username + "'";
        return getDataInt(query);
    }

    public boolean addUang(int uang, String idplayer) throws SQLException {
//        String query = "UPDATE `perawatan` SET `uang` = '" + (uang + "") + "'where `idplayer` =" + idplayer;
        String query = "UPDATE `player` SET `uang` = '" + (uang + "") + "'where `id_player` =" + idplayer;
        return getStatusQuery(query);
    }
//ikan
    //sumatera

    public int getJumlahIkan(String username) throws SQLException {
//        String query = "SELECT `ikan` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT COUNT(i.`id_perawatan`) jumlah_ikan FROM `perawatan` AS p JOIN ikan AS i ON p.`id_perawatan` = i.`id_perawatan` JOIN `player` pl ON pl.`id_player`=p.`id_player` WHERE pl.`username`='" + username + "' GROUP BY i.`id_perawatan`";
        return getDataInt(query);
    }

    public boolean addIkan(String id_perawatan) throws SQLException {
//        String query = "UPDATE `perawatan` SET `ikan` ='" + (ikan + "") + "'where `idplayer` =" + idplayer;
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`) VALUES (null, '" + id_perawatan + "', 50, 1)";
        return getStatusQuery(query);
    }

    //kalimantan
    public int getJumlahIkanKalimantan(String username) throws SQLException {
//        String query = "SELECT `ikan_kalimantan` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT COUNT(i.`id_perawatan`) jumlah_ikan FROM `perawatan` AS p JOIN ikan AS i ON p.`id_perawatan` = i.`id_perawatan` JOIN `player` pl ON pl.`id_player`=p.`id_player` WHERE pl.`username`='" + username + "' GROUP BY i.`id_perawatan`";
        return getDataInt(query);
    }

    public boolean addIkanKalimantan(String id_perawatan) throws SQLException {
//        String query = "UPDATE `perawatan` SET `ikan_kalimantan` ='" + (ikan + "") + "'where `idplayer` =" + idplayer;
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`) VALUES (null, '" + id_perawatan + "', 50, 1)";
        return getStatusQuery(query);
    }

    //sulawesi
    public int getJumlahIkanSulawesi(String username) throws SQLException {
//        String query = "SELECT `ikan_sulawesi` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT COUNT(i.`id_perawatan`) jumlah_ikan FROM `perawatan` AS p JOIN ikan AS i ON p.`id_perawatan` = i.`id_perawatan` JOIN `player` pl ON pl.`id_player`=p.`id_player` WHERE pl.`username`='" + username + "' GROUP BY i.`id_perawatan`";
        return getDataInt(query);
    }

    public boolean addIkanSulawesi(String id_perawatan) throws SQLException {
//        String query = "UPDATE `perawatan` SET `ikan_sulawesi` ='" + (ikan + "") + "'where `idplayer` =" + idplayer;
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`) VALUES (null, '" + id_perawatan + "', 50, 1)";
        return getStatusQuery(query);
    }

    //papua
    public int getJumlahIkanPapua(String username) throws SQLException {
//        String query = "SELECT `ikan_papua` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT COUNT(i.`id_perawatan`) jumlah_ikan FROM `perawatan` AS p JOIN ikan AS i ON p.`id_perawatan` = i.`id_perawatan` JOIN `player` pl ON pl.`id_player`=p.`id_player` WHERE pl.`username`='" + username + "' GROUP BY i.`id_perawatan`";
        return getDataInt(query);
    }

    public boolean addIkanPapua(String id_perawatan) throws SQLException {
//        String query = "UPDATE `perawatan` SET `ikan_papua` ='" + (ikan + "") + "'where `idplayer` =" + idplayer;
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`) VALUES (null, '" + id_perawatan + "', 50, 1)";
        return getStatusQuery(query);
    }

    //jawa
    public int getJumlahIkanJawa(String username) throws SQLException {
//        String query = "SELECT `ikan_jawa` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT COUNT(i.`id_perawatan`) jumlah_ikan FROM `perawatan` AS p JOIN ikan AS i ON p.`id_perawatan` = i.`id_perawatan` JOIN `player` pl ON pl.`id_player`=p.`id_player` WHERE pl.`username`='" + username + "' GROUP BY i.`id_perawatan`";
        return getDataInt(query);
    }

    public boolean addIkanJawa(String id_perawatan) throws SQLException {
//        String query = "UPDATE `perawatan` SET `ikan_jawa` ='" + (ikan + "") + "'where `idplayer` =" + idplayer;
        String query = "INSERT INTO `ikan`(`id_ikan`, `id_perawatan`, `kekenyangan`, `umur`) VALUES (null, '" + id_perawatan + "', 50, 1)";
        return getStatusQuery(query);
    }

//makanan
    public int getJumlahMakanan(String username) throws SQLException {
//        String query = "SELECT `makanan` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT p.`stok_makanan` FROM `perawatan` p JOIN `player` pl ON p.`id_player`=pl.`id_player` WHERE pl.`username` = '" + username + "'";
        return getDataInt(query);
    }

    public boolean addMakanan(int makanan, String idplayer) throws SQLException {
        String query = "UPDATE `perawatan` SET `makanan` = '" + (makanan + "") + "'where `idplayer` =" + idplayer;
        return getStatusQuery(query);
    }
//obat

    public int getJumlahObat(String username) throws SQLException {
//        String query = "SELECT `obat` FROM `perawatan` pe join `player` p on pe.`idplayer` = p.`id` where `username` = '" + username + "'";
        String query = "SELECT p.`stok_obat` FROM `perawatan` p JOIN `player` pl ON p.`id_player`=pl.`id_player` WHERE pl.`username` = '" + username + "'";
        return getDataInt(query);
    }

    public boolean addObat(int obat, String idplayer) throws SQLException {
        String query = "UPDATE `perawatan` SET `obat` = '" + (obat + "") + "' where `idplayer` = " + idplayer;
        return getStatusQuery(query);
    }

    public int getMinimalUang_1() throws SQLException {
        String query = "SELECT `min_uang` FROM `level` WHERE `id_level`=1";
        return getDataInt(query);
    }

    public int getMinimalUang_2() throws SQLException {
        String query = "SELECT `min_uang` FROM `level` WHERE `id_level`=2";
        return getDataInt(query);
    }

    public int getMinimalUang_3() throws SQLException {
        String query = "SELECT `min_uang` FROM `level` WHERE `id_level`=3";
        return getDataInt(query);
    }

    public int getMinimalUang_4() throws SQLException {
        String query = "SELECT `min_uang` FROM `level` WHERE `id_level`=4";
        return getDataInt(query);
    }

    public int getMinimalUang_5() throws SQLException {
        String query = "SELECT `min_uang` FROM `level` WHERE `id_level`=5";
        return getDataInt(query);
    }

    //min ikan
    public int getMinimalIkan_1() throws SQLException {
        String query = "SELECT `min_ikan` FROM `level` WHERE `id_level`=1";
        return getDataInt(query);
    }

    public int getMinimalIkan_2() throws SQLException {
        String query = "SELECT `min_ikan` FROM `level` WHERE `id_level`=2";
        return getDataInt(query);
    }

    public int getMinimalIkan_3() throws SQLException {
        String query = "SELECT `min_ikan` FROM `level` WHERE `id_level`=3";
        return getDataInt(query);
    }

    public int getMinimalIkan_4() throws SQLException {
        String query = "SELECT `min_ikan` FROM `level` WHERE `id_level`=4";
        return getDataInt(query);
    }

    public int getMinimalIkan_5() throws SQLException {
        String query = "SELECT `min_ikan` FROM `level` WHERE `id_level`=5";
        return getDataInt(query);
    }

}
