/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datakelas.query;
import com.datakelas.dao.KelasDAO;
import com.datakelas.model.kelas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Intan
 */
public class kelasQuery implements KelasDAO{
    private Connection conn = null;
    public kelasQuery(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(kelas kls) {
        String sql = "insert into tbkelas(kodekelas, jurusan, ketuakelas, walikelas, jumlahsiswa) values (?,?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kls.getKd());
            st.setString(2, kls.getJurusan());
            st.setString(3, kls.getKetua());
            st.setString(4, kls.getWali());
            st.setString(5, kls.getJml());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String kodekelas) {
        String sql = "delete from tbkelas where kodekelas=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kodekelas);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String oldkodekelas, kelas kls) {
        String sql = "UPDATE tbkelas SET jurusan=?,ketuakelas=?,walikelas=?, jumlahsiswa=? WHERE kodekelas=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kls.getJurusan());
            st.setString(2, kls.getKetua());
            st.setString(3, kls.getWali());
            st.setString(4, kls.getJml());
            st.setString(5, oldkodekelas);
            st.executeUpdate();
            st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public kelas loadKelas(String jurusan) {
        kelas kelas = null;
        String sql = "SELECT kodekelas,ketuakelas,walikelas, jumlahsiswa FROM tbkelas WHERE jurusan=?";
    try {
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
            if (rs.next()) {
                kelas = new kelas();
                kelas.setkd(rs.getString(1));
                kelas.setJurusan(rs.getString(2));
                kelas.setKetua(rs.getString(3));
                kelas.setWali(rs.getString(4));
                kelas.setJml(rs.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kelas;
    }

    @Override
    public kelas load(String kodekelas) {
        kelas kelas = null;
        String sql = "SELECT kodekelas,jurusan,ketuakelas,walikelas, jumlahsiswa FROM tbkelas WHERE kodekelas=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, kodekelas);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
            kelas = new kelas();
            kelas.setkd(rs.getString(1));
            kelas.setJurusan(rs.getString(2));
            kelas.setKetua(rs.getString(3));
            kelas.setWali(rs.getString(4));
            kelas.setJml(rs.getString(5));
            }
        } catch (SQLException ex) {
        Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return kelas;
    }

    @Override
    public List<kelas> getAll() {
        String sql = "SELECT kodekelas,jurusan,ketuakelas,walikelas,jumlahsiswa FROM tbkelas";
        List<kelas> list = new ArrayList<kelas>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            kelas s = new kelas();
            s.setkd(rs.getString(1));
            s.setJurusan(rs.getString(2));
            s.setKetua(rs.getString(3));
            s.setWali(rs.getString(4));
            s.setJml(rs.getString(5));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
    }

    @Override
    public List<kelas> getAll(String jurusan) {
        String sql = "SELECT * FROM tbkelas WHERE jurusan like?";
        List<kelas> list = new ArrayList<kelas>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + jurusan + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            kelas s = new kelas();
            s.setkd(rs.getString(1));
            s.setJurusan(rs.getString(2));
            s.setKetua(rs.getString(3));
            s.setWali(rs.getString(4));
            s.setJml(rs.getString(5));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<kelas> getAllKd(String kodekelas) {
        String sql = "SELECT * FROM tbkelas WHERE kodekelas LIKE ?";
        List<kelas> list = new ArrayList<kelas>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + kodekelas + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            kelas s = new kelas();
            s.setkd(rs.getString(1));
            s.setJurusan(rs.getString(2));
            s.setKetua(rs.getString(3));
            s.setWali(rs.getString(4));
            s.setJml(rs.getString(5));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KelasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
