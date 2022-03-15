/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import java.util.Scanner;
import static modul7.EvaluasiMethod.terbesar;

/**
 *
 * @author MOKLET-1
 */
public class contoh {
     int a, b, c, d, e, hasil;
   
     public static void main(String[] args)
    {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan bilangan I :");int bil1 = input.nextInt();
        System.out.println("Masukkan bilangan II :");int bil2 = input.nextInt();
        System.out.println("Masukkan bilangan III :");int bil3 = input.nextInt();
        System.out.println("Masukkan bilangan IV :");int bil4 = input.nextInt();
        System.out.println("Masukkan bilangan V :");int bil5 = input.nextInt();
        
        terbesar (bil1, bil2, bil3, bil4, bil5);
        contoh data = new contoh ();
        
         
    }
     int jumblah (){
      
         if  ( a > b && a > c && a > d && a > e ) { 
           return a;
         }else if  ( b > a && b > c && b > d && b > e){ 
            return b;
         }else if (c > a && c > b && c > d && c > e){
            return c ;
         }else if (d > a && d > b && d > c && d > e){
            return d ;
           }else{
            return e;
                   } 
         }
}