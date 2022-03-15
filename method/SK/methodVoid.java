/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SK;

/**
 *
 * @author MOKLET-1
 */
public class methodVoid {
   public static String tulisan = "Hai perkenalkan!!";

	public static void cetakTulisan(){
		System.out.println(tulisan);
	}

	public static void cetakNama(String nama){
		System.out.println("Nama : "+nama);
	}
        public static void cetakTanggal(String tanggal){
		System.out.println("Tempat Tanggal Lahir : "+tanggal);
	}
        public static void cetakUmur(String umur){
            System.out.println("Umur : "+ umur);
        }
        public static void cetakHobi(String hobi){
		System.out.println("Hobi : "+hobi);
	}
        public static void main(String[] args){
		cetakTulisan();
		cetakNama("Rara Zahra Urava");
                cetakTanggal("Malang, 11 Maret 2005");
                cetakUmur("15 Tahun");
                cetakHobi("Menonton film/series");
	}
}
