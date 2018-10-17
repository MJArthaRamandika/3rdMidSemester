/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Artha Ramandika
 */
public class DiscountItem extends Item //menggunakan extends supaya variabel di class Item bisa dipakai
{
    public float discount;

    public DiscountItem(float discount, String nama, float harga, int jumlah) { //pengisian constructor dan variabel sesuai sugesti di UTS Github
        super(nama, harga, jumlah);
        this.discount = discount;
    }
    public float hargadiskon(float harga){//pembuatan method sesuai sugesti di UTs github
        return(jumlah * harga)-(harga *discount);
    }
}
