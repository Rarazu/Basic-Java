/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class BiodataGc {
    public static void main(String[] args) {
        String nama, panggilan, TTL, kota, smp, hobi, motivasi, prestasi;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Nama Lengkap: ");
        nama = keyboard.nextLine();
        
        System.out.print("Nama Akrab: ");
        panggilan = keyboard.nextLine();

        System.out.print("Tempat Tanggal Lahir: ");
        TTL = keyboard.nextLine();

        System.out.print("Asal Kota: ");
        kota = keyboard.nextLine();
        
        System.out.print("Asal SMP: ");
        smp = keyboard.nextLine();
        
        System.out.print("Hobi: ");
        hobi = keyboard.nextLine();
        
        System.out.print("Kalimat Motivasi: ");
        motivasi = keyboard.nextLine();
        
        System.out.print("Prestasi: ");
        prestasi = keyboard.nextLine();
    }
}
