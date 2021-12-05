/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JenisMobil;

import java.text.DecimalFormat;

/**
 *
 * @author galih
 */
public abstract class JenisMobil {
    
    public abstract float hitungWaktu();
    public abstract float hitungBensin();
    
    public void tampilHasil() {
        DecimalFormat df = new DecimalFormat("#.##");
        String format = df.format(this.hitungWaktu());
        System.out.println("Waktu yang Dibutuhkan : " + format + " jam");
        String format2 = df.format(this.hitungBensin());
        System.out.println("Bahan Bakar yang Dibutuhkan : " + format2 + " liter");
    }
}
