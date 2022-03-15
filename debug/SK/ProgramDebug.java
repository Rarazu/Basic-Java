/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SK;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class ProgramDebug {
    public static void main (String[] args){
    Double panjang, lebar, luas;
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("panjang : ");
    panjang = in.nextDouble();
    System.out.print("lebar :");
    lebar = in.nextDouble();
    
    luas = panjang*lebar;
    System.out.print("luas = "+ luas);
}
}