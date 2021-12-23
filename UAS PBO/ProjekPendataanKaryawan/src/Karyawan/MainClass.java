package Karyawan;

import Karyawan.KaryawanTetap;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Galih
 */
public class MainClass {
     static ArrayList<KaryawanTetap> listKaryawan = new ArrayList<KaryawanTetap>();
     static Scanner input = new Scanner(System.in);
     
     public static void main(String[] args) {
         MenuUtama();
    }

     public static void MenuUtama(){     
         System.out.println("====================");
         System.out.println("MENU UTAMA");
         System.out.println("1.  Tambah Data");
         System.out.println("2.  Hapus Data");
         System.out.println("3.  Cari Data");
         System.out.println("4.  Lihat Data");
         System.out.println("5.  Exit");
         System.out.println("");
         System.out.print("Menu Pilihan: ");
         int pilihan = input.nextInt();
        
        if(pilihan == 1){
           TambahData();
        }
        else if(pilihan == 2){
            HapusData();
        }
        else if(pilihan == 3){
            CariData();
        }
        else if(pilihan == 4){
            LihatData();
        }
        else if(pilihan == 5){
            System.exit(0);
        }
        else{
            System.out.println("Input anda Salah, Program dihentikan");
            System.exit(0);
        }   
    }
     
     
     public static void TambahData(){
         System.out.println("====================");
         System.out.print("Masukkan Kode Karyawan:  ");
         String kode = input.next();
         
         System.out.print("Masukkan Nama Karyawan:  ");
         String nama = input.next();
         
         System.out.print("Masukkan Alamat: ");
         String alamat = input.next();
         
         System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD): ");
         String  tglLahir = input.next();
         
         System.out.print("Masukkan Golongan (A/B/C/D):  ");
         String golongan = input.next();
         
         System.out.print("Masukkan Status Menikah (0/1):  ");
         int status = input.nextInt();
         
         int jmlhAnak = 0;
         if(status == 1){
             System.out.print("Masukkan Jumlah Anak:  ");
             jmlhAnak = input.nextInt();
         }
         
         KaryawanTetap karyawan = new KaryawanTetap(kode, nama, alamat, tglLahir, golongan, status, jmlhAnak);
         listKaryawan.add(karyawan);
         System.out.println("Karyawan berhasil ditambahkan!");
         System.out.println("Pilih subMenu:");
         System.out.println("1. Kembali ke Menu Utama");
         System.out.println("2. Tambah Data kembali");
         System.out.println("");
         System.out.print("Menu Pilihan: ");
         int pilihan = input.nextInt();
         
         if(pilihan == 1){
             MenuUtama();
         }
         else if(pilihan == 2){
             TambahData();
         }
         else{
             System.out.println("Input anda Salah, Program dihentikan");
             System.exit(0);
         }   
     }
     
     public static void HapusData(){
         System.out.println("====================");
         System.out.print("Kode Karyawan yang mau dihapus:  ");
         String kode = input.next();
         
         for(int i = 0; i < listKaryawan.size();i++){
             KaryawanTetap dicari = listKaryawan.get(i);
             if(dicari.getKode().equals(kode)){
                 listKaryawan.remove(i);
             }
         }
         System.out.println(listKaryawan.size());
         System.out.println("Pilih subMenu:");
         System.out.println("1. Kembali ke Menu Utama");
         System.out.println("2. Hapus Data kembali");
         System.out.println("");
         System.out.print("Menu Pilihan: ");
         int pilihan = input.nextInt();
         
         if(pilihan == 1){
             MenuUtama();
         }
         else if(pilihan == 2){
             HapusData();
         }
         else{
             System.out.println("Input anda Salah, Program dihentikan");
             System.exit(0);
         }  
    }
     
     public static void CariData(){
         System.out.println("====================");
         System.out.print("Masukkan Kode Karyawan:  ");
         String kode = input.next();
         
         System.out.println("========================================");
         System.out.println("DATA PROFILE KARYAWAN");
         System.out.println("========================================");
         KaryawanTetap karyawanDicari = new KaryawanTetap();
         for(int i = 0; i < listKaryawan.size();i++){
             karyawanDicari = listKaryawan.get(i);
             if(karyawanDicari.getKode().equals(kode)){
                 break;
             }
         }
         System.out.println("Kode Karyawan:     " + karyawanDicari.getKode());
         System.out.println("Nama Karyawan:     " + karyawanDicari.getNama());
         System.out.println("Golongan:          " +  karyawanDicari.getGolongan());
         System.out.println("Umur:              " +  Integer.toString(karyawanDicari.getUmur()));
         System.out.println("Status Menikah:    " +  karyawanDicari.getStatusKaryawan());
         System.out.println("Jumlah Anak:       " +  Integer.toString(karyawanDicari.getJumlahAnak()));
         System.out.println("-------------------------------------");
         System.out.println("Gaji Pokok             :Rp" + Float.toString(karyawanDicari.hitungGajiPokok()));
         System.out.println("Tunjangan Istri/Suami  :Rp" + Float.toString(karyawanDicari.tunjanganMenikah()));
         System.out.println("Tunjangan Pegawai      :Rp" + Float.toString(karyawanDicari.tunjanganPegawai()));
         System.out.println("Tunjangan Anak         :Rp" + Float.toString(karyawanDicari.tunjanganAnak()));
         System.out.println("------------------------------------- +");
         System.out.println("Gaji Kotor             :Rp" + Float.toString(karyawanDicari.hitungGajiKotor()));
         System.out.println("Potongan               :Rp" + Float.toString(karyawanDicari.potongan()));
         System.out.println("------------------------------------- -");
         System.out.println("Gaji Bersih            :Rp" + Float.toString(karyawanDicari.hitungGajiBersih()));
         
         System.out.println("");
         System.out.println("Pilih subMenu:");
         System.out.println("1. Kembali ke Menu Utama");
         System.out.println("");
         
         System.out.print("Menu Pilihan: ");
         int pilihan = input.nextInt();
         if(pilihan == 1){
             MenuUtama();
         }
         else{
             System.out.println("Input anda Salah, Program dihentikan");
             System.exit(0);
         }
     }
     
     public static void LihatData(){
         System.out.println("========================================");
         System.out.println("DATA KARYAWAN");
         System.out.println("--------------------------------------------------------------------------");
         System.out.println("KODE KARY    NAMA KARY      GOL     USIA    STATUS NIKAH       JUMLAH ANAK");
         System.out.println("--------------------------------------------------------------------------");
         KaryawanTetap karyawan = new KaryawanTetap();
         for(int i = 0; i < listKaryawan.size();i++){
             karyawan = listKaryawan.get(i);
             System.out.println(karyawan.getKode() + "           " + karyawan.getNama() + "           " + karyawan.getGolongan() + "      " + karyawan.getUmur() + "      " + karyawan.getStatusKaryawan() + "       "  +
                     karyawan.getJumlahAnak());
         }
         System.out.println("--------------------------------------------------------------------------");
         System.out.println("Jumlah data: " + listKaryawan.size());
         
         System.out.println("");
         System.out.println("Pilih subMenu:");
         System.out.println("1. Kembali ke Menu Utama");
         System.out.println("");
         
         System.out.print("Menu Pilihan: ");
         int pilihan = input.nextInt();
         if(pilihan == 1){
             MenuUtama();
         }
         else{
             System.out.println("Input anda Salah, Program dihentikan");
             System.exit(0);
         }
    } 
}
