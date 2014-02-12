/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karyawan.dao;
import com.karyawan.model.karyawan;
import java.util.List;

/**
 *
 * @author ars
 */
public interface KaryawanDAO {
    public void insert(karyawan ky);
    public void delete(String nik);
     public void update(String oldNik, karyawan ky);
    public karyawan loadNama(String nama);
    public karyawan load(String nik);
    public List<karyawan> getAll();
    public List<karyawan> getAll(String name);
    public List<karyawan> getAllNik(String nik);
    
    
}
