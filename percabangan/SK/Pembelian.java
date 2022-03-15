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
public class Pembelian {
    public static void main(String[] args) {
        int harga, jumlah, diskon, total ;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Harga barang = ");
        harga = scanner.nextInt();
        System.out.println("Jumlah barang = ");
        jumlah = scanner.nextInt();
        total = jumlah*harga;
        
        if (total>=50000){
            diskon = total*20/100;
            total = total-diskon;
            System.out.println("barang di diskon 20% jadi totalnya menjadi "+ total);
    }
        else if(total<50000){
             diskon = total*0/100;
             total = total-diskon;
             System.out.println("barang tidak mendapatkan diskon jadi totalnya "+ total);
        }
    }
}
