package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class Item {
    private String nama;
    private float harga;
    public int jumlah;

    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public float getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    public float hargatotal(){
        return(jumlah * harga);
    }
}
