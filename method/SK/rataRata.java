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
public class rataRata {
     public static void main(String[] args){
    int array[], i, n;
    array = new int[100];
    float rata, total=0;
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan banyaknya Nilai: ");
    n = scan.nextInt();
    
    for(i = 1; i <= n; i++){
      System.out.print("Nilai Ke-"+ i +" : ");
      array[i] = scan.nextInt();
      total = total + array[i];
    }
    rata = total/n;
    System.out.println("Hasil nilai total adalah : " + total);
    System.out.println("Hasil rata-rata adalah : " + rata);
  }
}
