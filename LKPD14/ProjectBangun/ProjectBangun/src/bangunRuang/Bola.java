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
public class Bola extends BangunRuang{
    public double jari = 10;
    
    public double hitungVolume() {
        double volume = 4/3 * 3.14 * this.jari * this.jari * this.jari;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        double luas = 4 * 3.14 * this.jari * this.jari;
        return luas;
    }
    
}
