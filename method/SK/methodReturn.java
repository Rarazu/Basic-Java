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
public class methodReturn {
    public static String nama = "Rara Zahra Urava";
    public static String tanggal = "Malang, 11 Maret 2005";
    public static String hobi = "Menonton film/series";
	public static String getNama(){
		return nama;
	}
        public static String getTanggal(){
		return tanggal;
	}

	public static int hitungUmur(int lahir, int sekarang){
		int umur = sekarang - lahir;
		return umur;
	}
        public static String getHobi(){
		return hobi;
	}

	public static void main(String[] args){

		String namaSaya = getNama();
		System.out.println("Nama saya: "+namaSaya);
                
                String tanggalLahir = getTanggal();
                System.out.println("Tempat Tanggal Lahir: "+tanggalLahir);

		int umurSaya = hitungUmur(2005, 2020);
		System.out.println("Umur saya: "+umurSaya);
                
                String hobiSaya = getHobi();
                System.out.println("Hobi saya: "+hobiSaya);
	}

}

