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
public class EvaluasiMethod {
     public static void terbesar(int a, int b, int c, int d, int e)
     {
         int maks = 0;
         if  ( a > b && a > c && a > d && a > e )  { 
            maks = a ;
        }else  if  ( b > a && b > c && b > d && b > e){ 
            maks = b ; 
        }else if (c > a && c > b && c > d && c > e){
            maks = c ;
        }else if (d > a && d > b && d > c && d > e){
          }else{ 
            maks = e ; 
             } 
        System.out.println("Bilangan tertingginya adalah  "+ maks );
      
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan bilangan I :");int bil1 = input.nextInt();
        System.out.println("Masukkan bilangan II :");int bil2 = input.nextInt();
        System.out.println("Masukkan bilangan III :");int bil3 = input.nextInt();
        System.out.println("Masukkan bilangan IV :");int bil4 = input.nextInt();
        System.out.println("Masukkan bilangan V :");int bil5 = input.nextInt();
        
        terbesar (bil1, bil2, bil3, bil4, bil5);
         // TODO code application logic here
    }
 }


