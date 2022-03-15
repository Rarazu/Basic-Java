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
public class Nilai {
     public static void main(String[] args) {
         int nilai;
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Masukkan nilai anda = ");
         nilai = scanner.nextInt();
         
         if(nilai > 90){
             System.out.println("Anda mendapatkan Grade A");
         }
         else if (nilai > 80){
             System.out.println("Anda mendapatkan Grade B+");
         }
         else if (nilai > 70){
             System.out.println("Anda mendapatkan Grade B");
         }
         else{
             System.out.println("Anda mendapatkan Grade F");
         }
     }
}
