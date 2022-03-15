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
public class no4 {
    public static void main (String[] args){
        int matrix1[][] = new int[2][3];
        matrix1[0][0] = 5;
        matrix1[0][1] = 7;
        matrix1[0][2] = 2;
        matrix1[1][0] = 10;
        matrix1[1][1] = 12;
        matrix1[1][2] = 15;

        int matrix2[][] = new int[2][3];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[0][2] = 3;
        matrix2[1][0] = 4;
        matrix2[1][1] = 5;
        matrix2[1][2] = 6;
        
          System.out.println("Matriks A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j]+" ");
                }
            System.out.println(" ");
            }
        
        System.out.println("Matriks B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j]+" ");
                }
            System.out.println(" ");
            }
        
        System.out.println("hasil pengurangan");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j]-matrix2[i][j]+ " ");
                }
            System.out.println(" ");
            
        }  
        int[][] Example =    new int [5][5];

        
        }
    }

