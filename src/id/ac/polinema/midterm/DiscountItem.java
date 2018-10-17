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
    private float discount;

    public DiscountItem(float discount, String nama, float harga, int jumlah) { //pengisian constructor dan variabel sesuai sugesti di UTS Github
        super(nama, harga, jumlah);
        this.discount = discount * 100;
    }
    
    public float getdiscount(){
        return (jumlah * harga) * discount ;
    }
    
    public float totalharga(){
        return harga * jumlah - getdiscount();
    }
    
    public String toString(){
        return "|" + nama +"\t\t"+"|"+ harga +"\t"+"|"+ jumlah +"\t\t"+"|"+ totalharga()+"\t|"+"\t|"+"\n| - Disc"+"\t\t"+"|"+ discount +"%\t\t|\t";
    }
}
