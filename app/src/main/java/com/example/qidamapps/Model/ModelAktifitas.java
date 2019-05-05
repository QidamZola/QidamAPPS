package com.example.qidamapps.Model;
/*
 * Tanggal Pengerjaan : 03-05-2019
 * NIM      : 10116055
 * Nama     : Qidam Zola Farhan
 * Kelas    : IF-2 / AKB-2
 */
public class ModelAktifitas {

    private String judul,deskrpsi;
    public ModelAktifitas(String judul, String deskrpsi){
        this.judul = judul;
        this.deskrpsi = deskrpsi;
    }
    public String getJudul(){

        return judul;
    }
    public void setJudul(String judul){

        this.judul = judul;
    }

    public String getDeskrpsi(){

        return deskrpsi;
    }
    public void setDeskrpsi(String deskrpsi){

        this.deskrpsi = deskrpsi;
    }
}
