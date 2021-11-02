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
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        while (true){
            System.out.println("Menu Pilihan");
            System.out.println("1. Cek Triple Pythagoras");
            System.out.println("2. Menentukan Sisi Miring ");
            System.out.println("3. Menentukan Sisi Siku-Siku ");
            System.out.println("4. Exit");
            Scanner pilih = new Scanner(System.in);
            System.out.print("Mau yang mana : ");
            int select = pilih.nextInt();

            pilih.nextLine();
            
            switch (select){
                case 1:
                    Check cekPyth = new Check();
                    cekPyth.checking();
                    break;
                case 2:
                    Miring sm = new Miring();
                    sm.hasil();
                    break;
                case 3:
                    Siku sk = new Siku();
                    sk.hasil();
                    break;
                case 4:
                    System.out.println("Thank");
                    System.exit(0);
                default:
                    System.out.println("Ulang");
                    
            }
        }
  
    
 }
}