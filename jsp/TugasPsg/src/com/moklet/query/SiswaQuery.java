/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moklet.query;
import com.moklet.dao.SiswaDAO;
import com.moklet.model.siswa;
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
public class SiswaQuery implements SiswaDAO{
    private Connection conn = null;
    public SiswaQuery(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(siswa sw) {
        String sql = "insert into tbsiswa(nis, nama, alamat, IDtelp) values (?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, sw.getNis());
            st.setString(2, sw.getNama());
            st.setString(3, sw.getAlamat());
            st.setString(4, sw.getIDtelp());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String nis) {
        String sql = "delete from tbsiswa where nis=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nis);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String oldNis, siswa sw) {
        String sql = "UPDATE tbsiswa SET nama=?,alamat=?,IDtelp=? WHERE nis=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, sw.getNama());
            st.setString(2, sw.getAlamat());
            st.setString(3, sw.getIDtelp());
            st.setString(4, oldNis);
            st.executeUpdate();
            st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public siswa loadNama(String nama) {
       siswa siswa = null;
        String sql = "SELECT nis,nama,alamat,IDTelp FROM tbsiswa WHERE namasiswa=?";
    try {
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
            if (rs.next()) {
                siswa = new siswa();
                siswa.setNis(rs.getString(1));
                siswa.setNama(rs.getString(2));
                siswa.setAlamat(rs.getString(3));
                siswa.setIDtelp(rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return siswa;
    }

    @Override
    public siswa load(String nis) {
        siswa siswa = null;
        String sql = "SELECT nis,nama,alamat,IDtelp FROM tbsiswa WHERE nis=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nis);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
            siswa = new siswa();
            siswa.setNis(rs.getString(1));
            siswa.setNama(rs.getString(2));
            siswa.setAlamat(rs.getString(3));
            siswa.setIDtelp(rs.getString(4));
            }
        } catch (SQLException ex) {
        Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return siswa;
    }

    @Override
    public List<siswa> getAll() {
        String sql = "SELECT nis,nama,alamat,IDTelp FROM tbsiswa";
        List<siswa> list = new ArrayList<siswa>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            siswa s = new siswa();
            s.setNis(rs.getString(1));
            s.setNama(rs.getString(2));
            s.setAlamat(rs.getString(3));
            s.setIDtelp(rs.getString(4));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
    }

    @Override
    public List<siswa> getAll(String name) {
        String sql = "SELECT * FROM tbsiswa WHERE nama like?";
        List<siswa> list = new ArrayList<siswa>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + name + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            siswa s = new siswa();
            s.setNis(rs.getString(1));
            s.setNama(rs.getString(2));
            s.setAlamat(rs.getString(3));
            s.setIDtelp(rs.getString(4));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<siswa> getAllNis(String nis) {
        String sql = "SELECT * FROM tbsiswa WHERE nis LIKE ?";
        List<siswa> list = new ArrayList<siswa>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + nis + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            siswa s = new siswa();
            s.setNis(rs.getString(1));
            s.setNama(rs.getString(2));
            s.setAlamat(rs.getString(3));
            s.setIDtelp(rs.getString(4));
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SiswaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
}
