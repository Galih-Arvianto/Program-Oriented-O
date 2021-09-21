
package mypackage;

public class OperasiBilangan {
    // atribut
    public int bilanganPertama;
    public int bilanganKedua;
    
    // methods
    public void hitungPenjumlahan(){
        int hasil = bilanganPertama + bilanganKedua;
        System.out.println("Hasil penjumlahannya: " + hasil);
    }
    
    public void hitungPengurangan(){
        int hasil = bilanganPertama - bilanganKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
    
    public void hitungPerkalian(){
        double hasil = bilanganPertama * bilanganKedua;
        System.out.println("Hasil perkaliannya: " + hasil);
    }
    
    public void hitungPembagian(){
        double hasil = (double)bilanganPertama / (double)bilanganKedua;
        System.out.println("Hasil pembagiannya: " + hasil);
    }
}
