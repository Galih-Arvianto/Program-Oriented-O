/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import java.util.ArrayList;

/**
 *
 * @author galih
 */
public class DataMember extends Member {

    //Deklarasi ArrayList dari Class Member dengan nama dataMember
    ArrayList<Member> dataMember = new ArrayList<Member>();

    private String idMember, namaMember, jenisMember;

    //Konstruktor
    DataMember(String idMember, String namaMember, String jenisMember) {
        super(idMember, namaMember, jenisMember);
    }

    //Method Cari Member berdasarkan ID Member
    public Member cariMember(String idMember) {
        Member hasil = null;

        //Looping Data Member untuk mengecek kondisi apakah sesuai dengan ID Member yang dicari
        for (Member member : this.dataMember) {
            //Jika ID Member pada Member sesuai dengan ID Member yang dicari
            if (member.getIDMember().equals(idMember)) {
                hasil = member;
                break;
            }
        }

        return hasil;
    }

    //Method Tambah Member
    public void tambahMember(String idMember, String namaMember, String jenisMember) {
        //Deklarasi Pembuatan Class Member
        Member member = new Member(idMember, namaMember, jenisMember);
        //Memanggil method add pada Array List untuk membuat member baru dengan parameter ID, Nama dan Jenis Member
        dataMember.add(member);
    }

    //Method Tampil Member
    public void tampilMember() {
        System.out.println("=======================================");
        System.out.println("Data Member");
        System.out.println("=======================================");
        for (Member member : this.dataMember) {
            //Mengambil Data Member yaitu ID, Nama dan Jenis Member
            System.out.println("ID    Member : " + member.getIDMember());
            System.out.println("Nama  Member : " + member.getNamaMember());
            System.out.println("Jenis Member : " + member.getJenisMember());
        }
        System.out.println("=======================================");
    }

    //Melakukan pengecekan member
    public void checkMember(Member member) {
        System.out.println("ID    Member : " + member.getIDMember());
        System.out.println("Nama  Member : " + member.getNamaMember());
        System.out.println("Jenis Member : " + member.getJenisMember());
    }

}
