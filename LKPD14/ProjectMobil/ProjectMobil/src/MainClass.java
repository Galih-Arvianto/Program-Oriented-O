
import JenisMobil.SUV;
import JenisMobil.Sedan;
import JenisMobil.MPV;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author galih
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan sedan = new Sedan(158, 10, 60);
        System.out.println("===========================================");
        System.out.println("Sedan - Solo ke Kudus");
        sedan.tampilHasil();
        Sedan sedan1 = new Sedan(538, 10, 65);
        System.out.println("===========================================");
        System.out.println("Sedan - Solo ke Jakarta");
        sedan1.tampilHasil();
        SUV suv = new SUV(662, 12, 57);
        System.out.println("===========================================");
        System.out.println("SUV - Solo ke Banteng");
        suv.tampilHasil();
        SUV suv1 = new SUV(534, 12, 62);
        System.out.println("===========================================");
        System.out.println("Sedan - Solo ke Bandung");
        suv1.tampilHasil();
        MPV mpv = new MPV(541, 14, 64);
        System.out.println("===========================================");
        System.out.println("MPV - Solo ke Banyuwangi");
        mpv.tampilHasil();
        MPV mpv1 = new MPV(427, 14, 53);
        System.out.println("===========================================");
        System.out.println("MPV - Solo ke Jember");
        mpv1.tampilHasil();
        System.out.println("===========================================");
    }
    
}
