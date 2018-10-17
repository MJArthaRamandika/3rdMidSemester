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
public class PromoItem extends Item
{
    private float promo;

    public PromoItem(float promo, String nama, float harga, int jumlah) {
        super(nama, harga, jumlah);
        this.promo = promo;
    }
    
    public float hargapromo(float harga){
        return(jumlah * harga)-promo;
    }
}
