/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMember;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author galih
 */
public class MainApp {

    public static void main(String[] args) {
        String idMember = null, namaMember = null, jenisMember = null;
        int tanggalPinjam, tanggalKembali, bulanPinjam, bulanKembali, tahunPinjam, tahunKembali, sewa, hargaSewa = 0, poin = 0, cashback = 0, pulsa = 0;
        float diskon = 0;

        Scanner input = new Scanner(System.in);

        DataMember dataMember = new DataMember(idMember, namaMember, jenisMember);
        dataMember.tambahMember("M001", "Mr.X", "Silver");
        dataMember.tambahMember("M002", "Mr.Y", "Gold");
        dataMember.tambahMember("M003", "Mr.Z", "Platinum");

        dataMember.tampilMember();

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
        Member cari = dataMember.cariMember(idMember);
        if (cari == null) {
            System.out.println("Member tidak di temukan");
        } else {
            dataMember.checkMember(cari);
            System.out.println("");
            System.out.println("Tanggal Pinjam  : " + tanggalPinjam + "-" + bulanPinjam + "-" + tahunPinjam);
            System.out.println("Tanggal Kembali : " + tanggalKembali + "-" + bulanKembali + "-" + tahunKembali);

            LocalDate from = LocalDate.of(tahunPinjam, bulanPinjam, tanggalPinjam);
            LocalDate to = LocalDate.of(tahunKembali, bulanKembali, tanggalKembali);
            Period period = Period.between(from, to);

            System.out.println("Lama Sewa       : " + period.getDays() + " Hari, " + period.getMonths() + " Bulan, " + period.getYears() + " Tahun");
            System.out.println("");

            if (cari.getJenisMember().equals("Silver")) {
                int waktu = (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365));
                sewa = (25000 * waktu);
                diskon = 0.01f * sewa;
                hargaSewa = (int) ((sewa * (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365))) - diskon);
                poin = waktu * 1;
            } else if (cari.getJenisMember().equals("Gold")) {
                int waktu = (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365));
                sewa = (30000 * waktu);
                diskon = 0.02f * sewa;
                hargaSewa = (int) ((sewa * (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365))) - diskon);
                poin = waktu * 5;
                cashback = 5000;
            } else if (cari.getJenisMember().equals("Platinum")) {
                int waktu = (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365));
                sewa = (45000 * waktu);
                diskon = 0.03f * sewa;
                hargaSewa = (int) ((sewa * (period.getDays() + (period.getMonths() * 30) + (period.getYears() * 365))) - diskon);
                poin = waktu * 10;
                cashback = 10000;
                pulsa = 5000;
            }

            System.out.println("Total Sewa      : Rp." + hargaSewa);
            System.out.println("Jumlah Poin     : " + poin);
            System.out.println("Jumlah Casback  : Rp." + cashback);
            System.out.println("Bonus Pulsa     : Rp." + pulsa);
            System.out.println("=======================================");
        }
        System.out.println("=======================================");
    }
}
