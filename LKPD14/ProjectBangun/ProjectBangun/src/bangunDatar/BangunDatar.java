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
public abstract class BangunDatar {

    public abstract double hitungLuas();

    public abstract double hitungKeliling();

    public void tampilHasil() {
        System.out.println("Luasnya     :" + this.hitungLuas() + " cm");
        System.out.println("Kelilingnya :" + this.hitungKeliling() + " cm");
    }
}
