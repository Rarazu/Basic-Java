/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author MOKLET-1
 */
public class HurufI {
    public static void main(String[] args) {
        char[]nama ={'s','a','l','s','a','b','i','l','a','r','a','h','m','a','w','a','t','i',
                         'n','i','n','g','s','i','h'};
        int Count = 0;
        for (int i=0; i<nama.length; i++) {
           if (nama[i] == 'i' ) Count++;
            }	   	   
        System.out.println("Jumlah huruf i yang ada di nama tersebut adalah: "+ Count);
}
}
