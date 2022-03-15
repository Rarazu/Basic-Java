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
public class Primer {
    public static void main(String args[]){
        int bil;
        System.out.println("Inilah Bilangan Primer antara 1-10 = ");
        
         for (int i=1; i<=10; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+ " ");
            }             
        }    
    }
}
