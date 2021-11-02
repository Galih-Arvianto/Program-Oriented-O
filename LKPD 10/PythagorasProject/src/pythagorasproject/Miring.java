/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class Miring {
    void hasil(){
        System.out.println("Input Angka");
        Scanner masukan = new Scanner(System.in);
        System.out.print("Sisi A:");
        double x = masukan.nextDouble();
        System.out.print("Sisi B:");
        double y = masukan.nextDouble();
        double z = Math.sqrt((x* x) + (y * y));
        System.out.println("Hasil: "+z+"");
    }
}