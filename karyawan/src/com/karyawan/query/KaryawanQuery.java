/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karyawan.query;
import com.karyawan.dao.KaryawanDAO;
import com.karyawan.model.karyawan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ars
 */
public class KaryawanQuery implements KaryawanDAO{
private Connection conn = null;
    public KaryawanQuery(Connection conn) {
        this.conn = conn;
    }
    @Override
    public void insert(karyawan ky) {
        //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
         String sql = "insert into tbkaryawan(nik,nama,jeniskelamin,alamat,IDtelp,email,jabatan,status) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, ky.getNik());
            st.setString(2, ky.getNama());
            st.setString(3, ky.getJeniskelamin());    
            st.setString(4, ky.getAlamat());
            st.setString(5, ky.getIDtelp());
            st.setString(6, ky.getEmail());
            st.setString(7, ky.getJabatan());
            st.setString(8, ky.getStatus());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String nik) {
       String sql = "delete from tbkaryawan where nik=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nik);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String oldNik, karyawan ky) {
        //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
         String sql = "UPDATE tbkaryawan SET nama=?,jeniskelamin=?,alamat=?,IDtelp=?,email=?,jabatan=?,status=? WHERE nik=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, ky.getNama());
            st.setString(2, ky.getJeniskelamin());    
            st.setString(3, ky.getAlamat());
            st.setString(4, ky.getIDtelp());
            st.setString(5, ky.getEmail());
            st.setString(6, ky.getJabatan());
            st.setString(7, ky.getStatus());
            
            st.setString(8, oldNik);
            st.executeUpdate();
            st.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public karyawan loadNama(String nama) {
        //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        karyawan karyawan = null;
        String sql = "SELECT nik,nama,jeniskelamin,alamat,IDTelp,email,jabatan,status FROM tbkaryawan WHERE namakaryawan=?";
    try {
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
            if (rs.next()) {
                karyawan = new karyawan();
                karyawan.setNik(rs.getString(1));
                karyawan.setNama(rs.getString(2));
                karyawan.setJeniskelamin(rs.getString(3));
                karyawan.setAlamat(rs.getString(4));
                karyawan.setIDtelp(rs.getString(5));
                karyawan.setEmail(rs.getString(6));
                karyawan.setJabatan(rs.getString(7));
                karyawan.setStatus(rs.getString(8));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return karyawan;
    
    }

    @Override
    public karyawan load(String nik) {
        //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
         karyawan karyawan = null;
        String sql = "SELECT nik,nama,jeniskelamin,alamat,IDtelp,email,jabatan,status FROM tbkaryawan WHERE nik=?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nik);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
            karyawan = new karyawan();
           karyawan.setNik(rs.getString(1));
                karyawan.setNama(rs.getString(2));
                karyawan.setJeniskelamin(rs.getString(3));
                karyawan.setAlamat(rs.getString(4));
                karyawan.setIDtelp(rs.getString(5));
                karyawan.setEmail(rs.getString(6));
                karyawan.setJabatan(rs.getString(7));
                karyawan.setStatus(rs.getString(8));
            
            }
        } catch (SQLException ex) {
        Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return karyawan;
    }

    @Override
    public List<karyawan> getAll() {
         //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "SELECT nik,nama,jeniskelamin,alamat,IDTelp,email,jabatan,status FROM tbkaryawan";
        List<karyawan> list = new ArrayList<karyawan>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            karyawan s = new karyawan();
            s.setNik(rs.getString(1));
            s.setNama(rs.getString(2));
             s.setJeniskelamin(rs.getString(3));
            s.setAlamat(rs.getString(4));
            s.setIDtelp(rs.getString(5));
            s.setEmail(rs.getString(6));
            s.setJabatan(rs.getString(7));
            s.setStatus(rs.getString(8));
            
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
    }
    

    @Override
    public List<karyawan> getAll(String name) {
        //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
         String sql = "SELECT * FROM tbkaryawan WHERE nama like?";
        List<karyawan> list = new ArrayList<karyawan>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + name + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            karyawan s = new karyawan();
           s.setNik(rs.getString(1));
            s.setNama(rs.getString(2));
             s.setJeniskelamin(rs.getString(3));
            s.setAlamat(rs.getString(4));
            s.setIDtelp(rs.getString(5));
            s.setEmail(rs.getString(6));
            s.setJabatan(rs.getString(7));
            s.setStatus(rs.getString(8));
            
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
            }

    @Override
    public List<karyawan> getAllNik(String nik) {
        //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
String sql = "SELECT * FROM tbkaryawan WHERE nik LIKE ?";
        List<karyawan> list = new ArrayList<karyawan>();
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, "%" + nik + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
            karyawan s = new karyawan();
            s.setNik(rs.getString(1));
            s.setNama(rs.getString(2));
             s.setJeniskelamin(rs.getString(3));
            s.setAlamat(rs.getString(4));
            s.setIDtelp(rs.getString(5));
            s.setEmail(rs.getString(6));
            s.setJabatan(rs.getString(7));
            s.setStatus(rs.getString(8));
            
            list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
    
    
    
    
}
