/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void terbesar(int a, int b, int c)
    {
        int maks;
      if  ( a > b && a > c )  { 
            maks = a ;
        }  else  if  ( b > a && b > c ) { 
            maks = b ; 
          }  
         else{ 
            maks = c ; 
             } 
        System.out.println("Nilai tertingginya adalah = "+ maks );
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan nilai I :");
        int nil1 = input.nextInt();
        
        System.out.println("Masukkan nilai II :");
        int nil2 = input.nextInt();
        
         System.out.println("Masukkan nilai III :");
        int nil3 = input.nextInt();
        
        terbesar (nil1, nil2, nil3);
        // TODO code application logic here
    }
 }

