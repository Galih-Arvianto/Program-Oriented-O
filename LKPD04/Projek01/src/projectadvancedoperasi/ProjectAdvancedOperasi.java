/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author galih
 */
public class ProjectAdvancedOperasi {
    public static void main(String[] args) {
        //intansiasi class Operasi
        Operasi op = new Operasi();
        System.out.println("a. 3 + 4 = " + op.penjumlahan(3, 4));
        System.out.println("b. 4 + 7 + (-9) = " + op.penjumlahan(4, 7, -9));
        System.out.println("c. 3.4 + (-0.002) + 0.12313 = "+ op.penjumlahan(3.4, -0.002, 0.12313));
    }
    
}