package com.example.qidamapps.Model;
/*
 * Tanggal Pengerjaan : 04-05-2019
 * NIM      : 10116055
 * Nama     : Qidam Zola Farhan
 * Kelas    : IF-2 / AKB-2
 */
public class ModelMusik {

    private String band,judul;
    public ModelMusik(String band, String judul){
        this.judul = judul;
        this.band = band;
    }
    public String getJudul(){

        return judul;
    }
    public void setJudul(String judul){

        this.judul = judul;
    }

    public String getBand(){

        return band;
    }
    public void setBand(String band){

        this.band = band;
    }
}
