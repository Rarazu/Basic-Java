/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SK_Remed;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Ngalam {
    public static void main(String args[]) {
    String huruf, hasil = "";
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Input: ");
    huruf = scanner.nextLine();
    
    int jumlah = huruf.length();
    int jumlahHuruf = jumlah - 1;
    
    for (int i = 0; i < jumlah; i++) {
      hasil = hasil + huruf.charAt(jumlahHuruf);
      jumlahHuruf--;
    }
    System.out.println("Output: " + hasil);
  }
}
