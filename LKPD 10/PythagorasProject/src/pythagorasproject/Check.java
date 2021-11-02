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
public class Check {
      void checking(){
        System.out.println("Input Angka");
        Scanner masukan = new Scanner(System.in);
        System.out.print("sisi A : ");
        double x = masukan.nextDouble();
        System.out.print("sisi B : ");
        double y = masukan.nextDouble();
        System.out.print("sisi C : ");
        double z = masukan.nextDouble();
        if (Math.sqrt((x * x) + (y * y)) % (z) == 0){
            System.out.println("Triple Pythagoras ");
        }
        else {
            System.out.println("Bukan");
        }
    }
}

