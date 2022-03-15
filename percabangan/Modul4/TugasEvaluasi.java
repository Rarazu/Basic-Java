/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class TugasEvaluasi {
     public static void main(String[] args) {
        String identitas = "Rara Zahra Urava / X RPL 4 / 38";
        System.out.println("identitas : "+ identitas);
        
        System.out.println("\nSaran Bahan dari Uang Milik Anda\n");
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Uang Pertama: ");
        System.out.println("1. Rp5.000");
        System.out.println("2. Rp10.000");
        System.out.println("Masukkan no pilihan Anda : ");
        int uang1 = scanner.nextInt();
        
        if (uang1 == 1 || uang1 == 2)
        {    
            System.out.println("Uang Kedua: ");
            if (uang1 == 1){
                System.out.println("1. Rp2.000");
                System.out.println("2. Rp20.000");
            }else{
                System.out.println("1. Rp1.000");
                System.out.println("2. Rp2.000");
            }
            System.out.println("masukkan no pilihan anda");
            int uang2 = scanner.nextInt();
        
             if (uang2 >= 1 && uang2 <= 3)
        {
          if(uang1==1)
              switch(uang2)
              {
                  case 1: System.out.println(
                          "Anda dapat membeli telur"); 
                  break;
                  case 2: System.out.println(
                          "Anda dapat membeli beras"); 
               }
          else 
              switch(uang2)
              {
                  case 1: System.out.println(
                          "Anda dapat membeli ketan"); 
                  break;
                  case 2: System.out.println(
                          "Anda dapat membeli minyak"); 
               }
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
                 + "tidak dapat memberikan saran bahan");
        
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
                     + "tidak dapat memberikan saran bahan");
    }
}

