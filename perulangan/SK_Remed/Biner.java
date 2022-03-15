/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SK_Remed;

/**
 *
 * @author MOKLET-1
 */
public class Biner {
    public static void main(String[] args) {
   int angka = 20;
        StringBuilder builder = new StringBuilder();

        do {
            builder.append(angka % 2);
            angka = angka / 2;
        } while (angka > 0);

        System.out.println(builder.reverse().toString());
}
}
