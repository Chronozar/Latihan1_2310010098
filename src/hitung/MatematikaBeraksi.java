package hitung;

public class MatematikaBeraksi {
    
    public static void main(String[] args) {
        // membuat objek
        Matematika edo = new Matematika(9, 8);

        System.out.println("Hasil Penjumlahan : " + edo.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + edo.setPengurangan());
        System.out.println("Hasil Perkalian   : " + edo.setPerkalian());
        System.out.println("Hasil Pembagian   : " + edo.setPembagian());
    }
}
    

