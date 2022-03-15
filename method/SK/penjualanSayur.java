/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SK;



/**
 *
 * @author MOKLET-1
 */
public class penjualanSayur {
    public static void cetakBayam(int bayam){
		System.out.println("Bayam terjual sebanyak : "+bayam);
	}
        public static void cetakKangkung(int kangkung){
		System.out.println("Kangkung terjual sebanyak : "+kangkung);
	}
        public static void cetakKubis(int kubis){
            System.out.println("Kubis terjual sebanyak : "+kubis);
        }
         public static void hitungBayam(int bayam){
		System.out.println("Total harga bayam yang terjual : Rp"+bayam);
	}
         public static void hitungKangkung(int kangkung){
		System.out.println("Total harga kangkung yang terjual : Rp"+kangkung);
        }
         public static void hitungKubis(int kubis){
		System.out.println("Total harga kubis yang terjual : Rp"+kubis);
        }        
        public static void main(String[] args){
		cetakBayam(3);
                cetakKangkung(4);
                cetakKubis(5);
                hitungBayam(3*3000);
                hitungKangkung(4*4000);
                hitungKubis(5*2500);
               
	}
}
