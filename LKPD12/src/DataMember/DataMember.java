/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMember;

import java.util.ArrayList;

/**
 *
 * @author galih
 */
public class DataMember extends Member {

    ArrayList<Member> dataMember = new ArrayList<Member>();

    private String idMember, namaMember, jenisMember;

    DataMember(String idMember, String namaMember, String jenisMember) {
        super(idMember, namaMember, jenisMember);
    }

    public Member cariMember(String idMember) {
        Member hasil = null;

        for (Member member : this.dataMember) {
            if (member.getIDMember().equals(idMember)) {
                hasil = member;
                break;
            }
        }

        return hasil;
    }

    public void tambahMember(String idMember, String namaMember, String jenisMember) {
        Member member = new Member(idMember, namaMember, jenisMember);
        dataMember.add(member);
    }

    public void tampilMember() {
        System.out.println("=======================================");
        System.out.println("Data Member");
        System.out.println("=======================================");
        for (Member member : this.dataMember) {
            System.out.println("ID    Member : " + member.getIDMember());
            System.out.println("Nama  Member : " + member.getNamaMember());
            System.out.println("Jenis Member : " + member.getJenisMember());
        }
        System.out.println("=======================================");
    }

    public void checkMember(Member member) {
        System.out.println("ID    Member : " + member.getIDMember());
        System.out.println("Nama  Member : " + member.getNamaMember());
        System.out.println("Jenis Member : " + member.getJenisMember());
    }

}