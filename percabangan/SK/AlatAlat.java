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
public class AlatAlat {
    public static void main(String[] args) {
         String pilih;
         Scanner input = new Scanner(System.in);
         System.out.println("anda memilih :");
         pilih = input.nextLine();
         
         switch(pilih){
             case "1" :
                 System.out.println("Alat Olahraga");
                 break;
             case "2" :
                 System.out.println("Alat Elektronik");
                 break;
             case "3" :
                 System.out.println("Alat Masak");
                 break;
             default :
                 System.out.println("Anda salah memasukkan kode");
         }
}
}