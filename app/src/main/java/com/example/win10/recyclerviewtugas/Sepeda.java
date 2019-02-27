package com.example.win10.recyclerviewtugas;

public class Sepeda {
    private String nama;
    private String merk;


    public Sepeda(String nama, String merk) {
        this.nama = nama;
        this.merk = merk;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

}