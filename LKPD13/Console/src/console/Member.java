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
public class Member {
    // atribut
    private String idMember;
    private String namaMember;
    private String jenisMember;

    // Konstruktor
    public Member(String idMember, String namaMember, String jenisMember) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.jenisMember = jenisMember;
    }

    //Method Get Set digunakan agar variable String idMember, namaMember dan jenisMember tidak diketahui oleh user
    
    //Method Get ID Member
    public String getIDMember() {
        return idMember;
    }

    //Method Set ID Member
    public void setIDMember(String idMember) {
        this.idMember = idMember;
    }

    //Method Get Nama Member
    public String getNamaMember() {
        return namaMember;
    }

    //Method Set Nama Member
    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    //Method Get Jenis Member
    public String getJenisMember() {
        return jenisMember;
    }

    //Method Set Jenis Member
    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }

}
