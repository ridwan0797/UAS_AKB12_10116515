package com.school.carisma;


public class Model {

    String alamat, nama, image,telepon, provinsi;


    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Model(String image, String nama, String alamat, String telepon, String provinsi) {

        this.nama = nama;
        this.image = image;
        this.telepon = telepon;
        this.provinsi = provinsi;
        this.alamat = alamat;

    }

    public Model()
    {
}

}