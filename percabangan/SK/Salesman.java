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
public class Salesman {
     public static void main(String[] args) {
         int komisi, harga, jumlah, total;
         Scanner scanner = new Scanner(System.in);
         
        System.out.println("Harga barang = ");
        harga = scanner.nextInt();
        System.out.println("Jumlah barang = ");
        jumlah = scanner.nextInt();
        total = jumlah*harga;
        
        if (total == 200000){
            komisi = total*10/100+10000;
            System.out.println("komisi anda sebesar "+ komisi);
        }
        else if(total > 200000){
            komisi = total*15/100+20000;
            System.out.println("komisi anda sebesar "+ komisi);
        }
        else if (total > 500000){
            komisi = total*20/100+30000;
            System.out.println("komisi anda sebesar "+ komisi);
        }
     }
}
