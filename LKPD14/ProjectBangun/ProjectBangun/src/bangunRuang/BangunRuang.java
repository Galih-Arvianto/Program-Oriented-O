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
public abstract class BangunRuang {
    public abstract double hitungVolume();

    public abstract double hitungLuasPermukaan();

    public void tampilHasil() {
        System.out.println("Luasnya     :" + this.hitungVolume() + " cm");
        System.out.println("Kelilingnya :" + this.hitungLuasPermukaan() + " cm");
    }
}
