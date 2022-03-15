/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author MOKLET-1
 */
public class luasLapangan {
    public static void main (String[] args) {
    String nama,kelas;
    Double p,l,luas;
    
    nama = "Anfif";
    kelas = "X RPL 1";
    p=7.0;
    l=7.5;
    luas = p*l;
    
    System.out.println("nama: "+ nama);
    System.out.println("kelas: "+ kelas);
    
    if(luas > 60){
            System.out.println("luas persegi: "+ luas+ " m bisa digunakan untuk sepak bola");
        }else{
            System.out.println("luas persegi: "+ luas+ " m tidak bisa digunakan untuk sepak bola");
    }
    
    }
    
    
}
