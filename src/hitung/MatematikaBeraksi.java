package hitung;

public class MatematikaBeraksi {
    
    public static void main(String[] args) {
        // membuat objek
        Matematika ifah = new Matematika(5, 3);

        System.out.println("Hasil Penjumlahan : " + ifah.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + ifah.setPengurangan());
        System.out.println("Hasil Perkalian   : " + ifah.setPerkalian());
        System.out.println("Hasil Pembagian   : " + ifah.setPembagian());
    }
}
    

