/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SK;

import java.util.Scanner;



/**
 *
 * @author MOKLET-1
 */
public class no5 {
   public static void main(String[] args) {
    
      int[] larikInt = {5, 3, 7, 9, 8, 6, 2, 1, 4};
      int matrix [][] = new int [5][5];  
 
      System.out.println("\nElemen larik sesuai urutan aslinya :");
      for (int x = 0; x < larikInt.length; x++)
         System.out.print(larikInt[x] + "  ");

      mengurutkanElemen(larikInt);
       System.out.println("\nMasukkan Angka Pertama yang diurut:");
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        
        System.out.println("Hasil Pengurutan:");
         for(int i=n; i< larikInt.length; i++){ 
             
            System.out.println(i);
         }
      System.out.println();
    
   }

   public static void mengurutkanElemen(int[] larikA) {
      for (int x = larikA.length - 1; x >= 1; x--) {
         for (int j = 0; j <= x; j++) {
            if (larikA[j] > larikA[x])
               menukar(larikA, j, x);
         }
      }
   }
 
   public static void menukar(int[] larikB, int indekj, int indekx) {
      int sementara;
 
      sementara = larikB[indekx];
      larikB[indekx] = larikB[indekj];
      larikB[indekj] = sementara;
   }
       }
