/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;

import java.util.Calendar;

/**
 *
 * @author Galih
 */
public class KaryawanTetap extends JenisKaryawan{
    
     private String golongan;
     
     public String getGolongan() {
     return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
    
    public KaryawanTetap(String kode, String nama, String alamat, String tanggalLahir, String golongan, int status, int jumlahAnak ){
        this.setKode(kode);
        this.setNama(nama);
        this.setAlamat(alamat);
        this.setTanggalLahir(tanggalLahir);
        this.setGolongan(golongan);
        this.setStatus(status);
        this.setJumlahAnak(jumlahAnak);
    }

    public KaryawanTetap() {
    }

    @Override
    public float hitungGajiPokok() {
        float gajiPokok = 0;
        if(this.getGolongan().equals("A")){
            gajiPokok = 5000000;
        }
        else if(this.getGolongan().equals("B")){
            gajiPokok = 6000000;
        }
        else if(this.getGolongan().equals("C")){
            gajiPokok = 7000000;
        }
        else if(this.getGolongan().equals("D")){
            gajiPokok = 8000000;
        }
        return gajiPokok;
    }
    
    public float tunjanganMenikah(){
        float tunjangan = 0;
        if(this.getStatus() == 1){
            tunjangan = (float) (this.hitungGajiPokok() * 0.10);
        }
        return tunjangan;
    }
    
    public float tunjanganPegawai(){
        float tunjangan = 0;
        if(this.getUmur() > 30){
             tunjangan = (float) (this.hitungGajiPokok() * 0.15);
        }
        return tunjangan;
    }
    
    public float tunjanganAnak(){
        float tunjangan = 0;
        if(this.getStatus() == 1 && this.getJumlahAnak() >0){
             tunjangan = (float) ((this.hitungGajiPokok() * 0.05) * this.getJumlahAnak());
        }
        return tunjangan;
    }
    
     public float hitungGajiKotor(){
         float totalGajiKotor = 0;
         totalGajiKotor = this.hitungGajiPokok() + this.tunjanganMenikah() + this.tunjanganPegawai() + this.tunjanganAnak();
         return totalGajiKotor;
     }
     
     public float potongan(){
         float potongan = 0;
         potongan = (float) (this.hitungGajiKotor() * 0.025);
         return potongan;
     }
    
     public float hitungGajiBersih(){
         float totalGajiBersih = 0;
         totalGajiBersih = this.hitungGajiKotor() - this.potongan();
         return totalGajiBersih;
     }
     
    public int getUmur(){
        int tahunLahir = Integer.valueOf(this.getTanggalLahir().substring(0, 4));
        Calendar kalender = Calendar.getInstance();
        int tahunSekarang = kalender.get(Calendar.YEAR);
        int umur = tahunSekarang - tahunLahir;
        return umur;
    }
    
    public String getStatusKaryawan(){
        if(this.getStatus() == 1 ){
            return "Menikah";
        }
        else{
            return "Belum Menikah";
        }
    }
}
