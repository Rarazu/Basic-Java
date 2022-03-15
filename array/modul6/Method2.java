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
public class Method2 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Apakah anda ingin mengetahui protokol kesehatan di sekolah? (ketik 1/2)");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.println("Ketikkan jawaban : ");
        int jawab = scan.nextInt();
        switch (jawab){

            case 1 :
                String [] teks = {"Pakai Masker", "Cek Suhu Tubuh", "Cuci Tangan pakai sabun","Siapkan Handsanitizer"," selalu jagaJarak", "Jaga Imun tubuh"};
                    for (int a = 0; a < teks.length; a++)
                         System.out.println("Protokol Kesehatan di sekolah : "+ (teks[a])); break;

            case 2 :
                System.out.println("Tetap jaga kesehatan"); break;
            default :
                System.out.println("Tidak dapat menemukan jawaban"); break;
        }        
    }
}


