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
public class hitungBelanja {
    public static void main(String[] args) {
        int telur;
        int kecap;
        int hasil;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input jumblah telur: ");
        telur = keyboard.nextInt();
        System.out.print("Input jumblah kecap: ");
        kecap = keyboard.nextInt();

        // penjumlahan
        hasil = telur + kecap;
        System.out.println("Hasil = " + hasil);

       double harga;
       harga = 3000;
       double bayar;
       bayar = hasil*harga;
       
        System.out.println("total yang dibayar = Rp" + bayar);

    }
}