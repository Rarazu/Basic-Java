/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author MOKLET-1
 */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int mawar=21, melati=3, matahari=5;
        double harga;
        harga = 4500.5;
        double total, bayar;
        boolean pembelian, hasil;
        pembelian= mawar > melati;
        hasil= mawar > matahari;
       
        /*operator penugasan*/
        melati+=3;
        /* Operator Aritmatika */
        total=mawar+melati+matahari;
        bayar=total*harga;
        
        System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari+"="+total);
        System.out.println("total yang dibayar = Rp"+bayar); 
        System.out.println("Bunga mawar > melati " +pembelian);
        System.out.println("pembelian bunga mawar lebih banyak dari matahari dan melati "+hasil);
    }
    }
    




    
    
