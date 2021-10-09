/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageLPKD03;

/**
 *
 * @author galih
 */
public class Main {
    public static void main(String[] args) {
        lingkaran li = new lingkaran();
        persegi p = new persegi();
        
        int total = li.hitungLuas(42)* 4 + p.hitungLuas(42);
        System.out.println(total);
    }
}

