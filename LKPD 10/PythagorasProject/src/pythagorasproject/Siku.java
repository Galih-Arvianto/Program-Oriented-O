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
public class Siku {
 void hasil(){
        System.out.println("\nMENGHITUNG SISI SIKU");
        System.out.println("Masukan");
        Scanner masukan = new Scanner(System.in);
        System.out.print("A : ");
        double a = masukan.nextDouble();
        System.out.print("C : ");
        double c = masukan.nextDouble();
        if (a < c){
            double b = Math.sqrt((c*c) - (a*a));
            System.out.println("Sisi siku dari "+ a + " dan "+ c + " adalah " + b + "\n");
        } else if (a > c){ //Jika ada orang iseng yang memasukan a lebih besar dari sisi miringnya
            double b = Math.sqrt((a*a) - (c*c));
            System.out.println("Sisi siku dari "+ a + " dan "+ c + " adalah " + b + "\n");
        }
    }
}
