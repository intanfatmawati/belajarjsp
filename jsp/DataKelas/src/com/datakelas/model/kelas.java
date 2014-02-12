/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datakelas.model;

/**
 *
 * @author Intan
 */
public class kelas {
    private String kodekelas;
    private String jurusan;
    private String ketuakelas;
    private String walikelas;
    private String jmlsiswa;
    
    public String getKd(){
        return kodekelas;
    }
    public void setkd(String kodekelas){
        this.kodekelas=kodekelas;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setJurusan(String jurusan){
        this.jurusan=jurusan;
    }
    public String getKetua(){
        return ketuakelas;
    }
    public void setKetua(String ketuakelas){
        this.ketuakelas=ketuakelas;
    }
    public String getWali(){
        return walikelas;
    }
    public void setWali(String walikelas){
        this.walikelas=walikelas;
    }
    public String getJml(){
        return jmlsiswa;
    }
    public void setJml(String jmlsiswa){
        this.jmlsiswa=jmlsiswa;
    }
}
