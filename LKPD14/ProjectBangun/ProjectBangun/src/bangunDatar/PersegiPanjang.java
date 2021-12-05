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
public class PersegiPanjang extends BangunDatar {
    
    public double panjang = 5, lebar = 12;

    public double hitungLuas() {
        double luas = this.panjang * this.lebar;
        return luas;
    }

    // method untuk hitung keliling
    public double hitungKeliling() {
        double keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }

}
