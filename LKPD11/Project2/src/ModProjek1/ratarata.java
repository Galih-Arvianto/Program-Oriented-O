/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModProjek1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author galih
 */
public class ratarata {
 ArrayList<Integer> data = new ArrayList<Integer>();
    void masukkan(){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Masukkan bilangan bulat : ");
            this.data.add(in.nextInt());
            System.out.println("Input list : " + this.data);
            in.nextLine();
            System.out.print("Tambah bilangan? (y/n) : ");
            char ans = in.nextLine().charAt(0);
            if(ans == 'n'){
                break;
            }
        }
    }
    double rata (ArrayList<Integer> data){
        double sum = 0;
        for(Integer a: data){
            sum += a;
        }
        double b = sum/data.size();
        return b;
    }
    
    void output(){
        System.out.println("Total data : "+ this.data.size());    
        System.out.println("Rata-rata : "+ this.rata(this.data));
        System.out.println("Data Max   : "+ Collections.max(this.data));
        System.out.println("Data Mini    : "+ Collections.min(this.data));
    }
}