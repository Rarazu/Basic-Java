/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Array {
    public static void main (String[] args){
        String[] nama = {"Deanne","Victoria","Erna","Nathalie","Pamela","Armand","Omar","Alvaro","Ben","Danny"};
        
        Scanner s = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan nama yang dicari: ");
        cari = s.nextLine();
       
        boolean found = Arrays.stream(nama).anyMatch(t -> t.equals(cari));
                 
        if(found)
          System.out.println("Data ditemukan");
        else
          System.out.println("Data tidak ditemukan");
 
        
       } 
}


    