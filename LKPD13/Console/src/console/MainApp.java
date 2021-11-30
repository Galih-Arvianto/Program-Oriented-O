/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author galih
 */
public class MainApp {

    public static void main(String[] args) {
        //Deklarasi Variable yang akan digunakan
        String idMember = null, namaMember = null, jenisMember = null;
        int tanggalPinjam, tanggalKembali, bulanPinjam, bulanKembali, tahunPinjam, tahunKembali, sewa, hargaSewa = 0, poin = 0, cashback = 0, pulsa = 0;
        float diskon = 0;

        //Deklarasi scanner bernama input yang dipakai untuk memasukan inputan
        Scanner input = new Scanner(System.in);

        //Tambah data member, menggunakan method tambahMember yang ada pada Class Data Member
        DataMember dataMember = new DataMember(idMember, namaMember, jenisMember);
        dataMember.tambahMember("M001", "Mr.X", "Silver");
        dataMember.tambahMember("M002", "Mr.Y", "Gold");
        dataMember.tambahMember("M003", "Mr.Z", "Platinum");

        //Memanggil method tampilMember yang ada pada Class Data Member
        dataMember.tampilMember();

        //User memasukan inputan yang diperlukan
        System.out.print("Masukkan ID Member      : ");
        idMember = input.nextLine();
        System.out.print("Masukkan Tanggal Pinjam : ");
        tanggalPinjam = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam   : ");
        bulanPinjam = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam   : ");
        tahunPinjam = input.nextInt();
        System.out.print("Masukkan Tanggal Kembali: ");
        tanggalKembali = input.nextInt();
        System.out.print("Masukkan Bulan Kembali  : ");
        bulanKembali = input.nextInt();
        System.out.print("Masukkan Tahun Kembali  : ");
        tahunKembali = input.nextInt();

        System.out.println("=======================================");
        //Memanggil method cariMember untuk menampilkan Data Member berdasarkan idMember
        Member cari = dataMember.cariMember(idMember);
        //Kondisi jika idMember yang dicari tidak ada
        if (cari == null) {
            System.out.println("Member tidak di temukan");
        } else {
            //Menjalankan method checkMember berdasarkan idMember, apabila idMember terdapat pada Data Member maka akan menampilkan ID, Nama dan Jenis Member
            dataMember.checkMember(cari);
            System.out.println("");
            System.out.println("Tanggal Pinjam  : " + tanggalPinjam + "-" + bulanPinjam + "-" + tahunPinjam);
            System.out.println("Tanggal Kembali : " + tanggalKembali + "-" + bulanKembali + "-" + tahunKembali);

            //Method untuk memasukan inputan tahun, bulan dan tanggal peminjaman serta pengembalian kemudian dimasukan kedalam variable From dan to
            LocalDate from = LocalDate.of(tahunPinjam, bulanPinjam, tanggalPinjam);
            LocalDate to = LocalDate.of(tahunKembali, bulanKembali, tanggalKembali);
            //Menghitung selisih dari peminjaman dan pengembalian
            Period period = Period.between(from, to);

            //Memanggil jumlah Hari, Bulan dan Tahun yang telah dihitung dalam method diatas
            System.out.println("Lama Sewa       : " + period.getDays() + " Hari, " + period.getMonths() + " Bulan, " + period.getYears() + " Tahun");
            System.out.println("");
            
            //Kondisi jika jenis member yang diambil adalah Silver berdasarkan Data Member yang telah dicheck diatas
            if (cari.getJenisMember().equals("Silver")) {
                //Menghitung Jumlah hari, Bulan dan Tahun peminjaman
                int waktu = (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365));
                //Menghitung harga sewa
                sewa = (25000 * waktu);
                //Menghitung diskon
                diskon = 0.01f * sewa;
                //Harga sewa setelah dikurangi diskon
                hargaSewa = (int) (sewa - diskon);
                //Menghitung Poin
                poin = waktu * 1;
            
            //Kondisi jika jenis member yang diambil adalah Gold berdasarkan Data Member yang telah dicheck diatas
            } else if (cari.getJenisMember().equals("Gold")) {
                //Menghitung Jumlah hari, Bulan dan Tahun peminjaman
                int waktu = (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365));
                //Menghitung harga sewa
                sewa = (30000 * waktu);
                //Menghitung diskon
                diskon = 0.02f * sewa;
                //Harga sewa setelah dikurangi diskon
                hargaSewa = (int) (sewa - diskon);
                //Menghitung Poin
                poin = waktu * 5;
                //Cashback
                cashback = 5000;
            } else if (cari.getJenisMember().equals("Platinum")) {
                //Menghitung Jumlah hari, Bulan dan Tahun peminjaman
                int waktu = (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365));
                //Menghitung harga sewa
                sewa = (45000 * waktu);
                //Menghitung diskon
                diskon = 0.03f * sewa;
                //Harga sewa setelah dikurangi diskon
                hargaSewa = (int) (sewa - diskon);
                //Menghitung Poin
                poin = waktu * 10;
                //Cashback
                cashback = 10000;
                //Pulsa
                pulsa = 5000;
            }

            //Menampilkan output yang telah di ambil dari pengkondisian diatas
            System.out.println("Total Sewa      : Rp." + hargaSewa);
            System.out.println("Jumlah Poin     : " + poin);
            System.out.println("Jumlah Casback  : Rp." + cashback);
            System.out.println("Bonus Pulsa     : Rp." + pulsa);
            System.out.println("=======================================");
        }
    }
}
