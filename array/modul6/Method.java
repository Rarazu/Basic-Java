/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Method {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        String protokol[] = {"mohon untuk : ","Sering mencuci tangan","Pakai masker jika keluar","Jaga jarak",
                               "Siap handsanitizer","Perkuat imun tubuh","Cek suhu tubuh"};

        System.out.println("Mohon masukkan nama anda !");
        String nama=in.nextLine();
        System.out.println("Nama = "+  nama);
        System.out.println("Mohon masukkan suhu tubuh anda !");
        int suhuTubuh = in.nextInt();
        System.out.println("Suhu tubuh = "+ suhuTubuh+"C ");

           for(String p : protokol){
               if(suhuTubuh <= 37){
                   System.out.println(p +" ");

               }else if(suhuTubuh >= 38){
                   System.out.println("Suhu tubuh anda melebihi batas normal, dimohon untuk berhati hati, dan periksa ke dokter jika mengalami gejala covid-19");
               }
               
           }
}
}