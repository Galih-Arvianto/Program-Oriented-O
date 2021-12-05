/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author galih
 */
public class Lingkaran extends BangunDatar {

    // atribut jari-jari
    public double jari = 10;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas() {
        double luas = 3.14 * this.jari * this.jari;
        return luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling() {
        double keliling = 2 * 3.14 * this.jari;
        return keliling;
    }
}
