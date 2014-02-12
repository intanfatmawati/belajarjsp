/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moklet.dao;
import com.moklet.model.siswa;
import java.util.List;
/**
 *
 * @author Intan
 */
public interface SiswaDAO {
    
    public void insert(siswa sw);
    public void delete(String nis);
    public void update(String oldNis, siswa sw);
    public siswa loadNama(String nama);
    public siswa load(String nis);
    public List<siswa> getAll();
    public List<siswa> getAll(String name);
    public List<siswa> getAllNis(String nis);
}
