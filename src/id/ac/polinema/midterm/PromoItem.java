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
public class PromoItem extends Item{
    
    
    private float promo;

    public PromoItem(float promo, String nama, float harga, int jumlah) {
        super(nama, harga, jumlah);
        this.promo = promo;
    }
    
    public float hargapromo(){
        return(jumlah * harga)-(promo*jumlah);
    }
    
    public String toString(){
        return "|" + nama +"\t\t"+"|"+ harga +"\t"+"|"+ jumlah +"\t\t"+"|"+ hargapromo()+"\t|"+"\t|"+"\n| - Disc"+"\t\t"+"|"+ promo +"%\t\t|\t";
    }
}
