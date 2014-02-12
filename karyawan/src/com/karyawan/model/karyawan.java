/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karyawan.model;

import java.sql.Date;

/**
 *
 * @author ars
 */
public class karyawan {
    private String nik;
    private String nama;
    private String jeniskelamin;
    private String alamat;
    private String IDtelp;
    private String email;
    private String jabatan;
    private String status;
    
    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik=nik;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getJeniskelamin(){
        return jeniskelamin;
    }
    public void setJeniskelamin(String jeniskelamin){
        this.jeniskelamin=jeniskelamin;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getIDtelp(){
        return IDtelp;
    }
    public void setIDtelp(String IDtelp){
        this.IDtelp=IDtelp;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
                }
    public String getJabatan(){
        return jabatan;
   
    }
    public void setJabatan(String jabatan){
        this.jabatan=jabatan;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }

  
}
