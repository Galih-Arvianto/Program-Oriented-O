/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

/**
 *
 * @author galih
 */
public class Balok extends BangunRuang{
    public double panjang = 5, lebar = 10, tinggi = 15;
    
    public double hitungVolume() {
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        double luas = 2 * ((this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.lebar * this.tinggi));
        return luas;
    }
}
