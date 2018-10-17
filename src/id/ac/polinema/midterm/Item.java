package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Di awal pengerjakan,saya kesulitan untuk membuat wakatime.
//karena itu,saya mengerjakan terlebih dahulu dan baru saat ini wakatime saya selesai.
/**
 *
 * @author dhanifudin
 */
public class Item {
    
    protected String nama;
    protected float harga;
    protected int jumlah;

    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    public String toString(){
        return "|" + (nama) + "\t\t|" +(harga)+ "\t|" + (jumlah)+ "\t\t|"+(harga*jumlah)+ "/|";
    }
}
