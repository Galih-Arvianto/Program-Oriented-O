/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataMember;

/**
 *
 * @author galih
 */
public class Member {
   
    private String idMember;
    private String namaMember;
    private String jenisMember;

    public Member(String idMember, String namaMember, String jenisMember) {
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.jenisMember = jenisMember;
    }

    public String getIDMember() {
        return idMember;
    }

    public void setIDMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getJenisMember() {
        return jenisMember;
    }

    public void setJenisMember(String jenisMember) {
        this.jenisMember = jenisMember;
    }

}

