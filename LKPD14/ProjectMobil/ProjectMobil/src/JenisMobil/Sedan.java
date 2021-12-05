/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JenisMobil;

/**
 *
 * @author galih
 */
public class Sedan extends JenisMobil{
    private float jarak, bensin, kecepatan;
    public Sedan (float jarak, float bensin, float kecepatan) {
        this.jarak = jarak;
        this.bensin = bensin;
        this.kecepatan = kecepatan;
    }
    
    public float hitungBensin() {
        float bahanBakar = (float) jarak / bensin;
        return bahanBakar;
    }
    
    public float hitungWaktu() {
        float waktu = (float) jarak / kecepatan;
        return waktu;
    }
}
