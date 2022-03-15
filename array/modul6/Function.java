/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    static int s, volume;  
    static Scanner inputan = new Scanner(System.in);  
  
    static int volumekubus(int sisi) {  
        int volume = sisi * sisi * sisi;  
        return volume;  
    }  
  
    static void input() {  
        System.out.print("Masukkan sisi       : ");  
        s = inputan.nextInt();  
    }  
  
    public static void main(String[] args) {  
        System.out.println("MENGHITUNG VOLUME KUBUS =");  
        input();  
        System.out.println("Volumenya adalah    : " + volumekubus(s));  
    }  

}
            
            // TODO code application logic here
        
    
    

