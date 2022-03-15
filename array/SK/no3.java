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
public class no3 {
    public static void main (String[] args){
           Scanner input=new Scanner(System.in);

    System.out.print("Masukan Jumlah Laptop Yang Mau Dibeli Atau Dilihat : ");
    int n=input.nextInt();

    String nama[]=new String[n];
    String status[]=new String[n];
    int harga[]=new int[n];

    for (int i=0;i<n;i++){
        System.out.println("Laptop Ke : "+(i+1));
        System.out.print("Nama Merek : ");
        nama[i]=input.next();

        System.out.print("Harga : ");
        harga[i]=input.nextInt();

        if (harga[i]<=6000000) {
                status[i]="Worth Untuk Pelajar";
            } else {
                status[i]="Worth Untuk Professional User";
            }
    }
    System.out.println("DAFTAR HARGA REKOMENDASI LAPTOP");
    System.out.println("No       Nama        Harga        Status");
    
    for (int i=0; i<n;i++) {
        System.out.println((i+1)+"        "+nama[i]+"        "+harga[i]+"      "
                + "  "+status[i]);
    }

    }
}
