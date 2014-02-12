/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datakelas.dao;
import com.datakelas.model.kelas;
import java.util.List;
/**
 *
 * @author Intan
 */
public interface KelasDAO {
    public void insert(kelas kls);
    public void delete(String kodekelas);
    public void update(String oldkodekelas, kelas kls);
    public kelas loadKelas(String jurusan);
    public kelas load(String kodekelas);
    public List<kelas>getAll();
    public List<kelas>getAll(String jurusan);
    public List<kelas>getAllKd(String kodekelas);
    
}
