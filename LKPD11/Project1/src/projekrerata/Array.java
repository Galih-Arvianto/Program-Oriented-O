/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekrerata;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class Array {
  int[] dataBil = new int[100];
    int n;
    void Masukkan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Max data: ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Input bilangan"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    double rata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rata = sum/this.n;
        return rata;
    }
    double Min (int[] data){
        int i;
        int min = dataBil[0];
        for (i = 1; i < n; i++)
             if (dataBil[i] < min)
                min = dataBil[i];
         return min;
    }
    double Max(int[] data){
        int i;
        int max = dataBil[0];
        for (i = 1; i < n; i++)
             if (dataBil[i] > max)
                 max = dataBil[i];
         return max;
    }
    int[] Short (int[] data){
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (dataBil[j] > dataBil[j+1])
                {
                    int temp = dataBil[j];
                    dataBil[j] = dataBil[j+1];
                    dataBil[j+1] = temp;
                }
        return dataBil;
    }
    
    void output(){
        int[] newBil = this.Short(this.dataBil);
        System.out.println("rata-rata: " + this.rata(this.dataBil));
        System.out.println("Nilai Minimum: " + this.Min(this.dataBil));
        System.out.println("Nilai Max: " + this.Max(this.dataBil));
        System.out.print("Urutan: " );
        for (int i=0; i<n; i++){
            System.out.print(newBil[i]+", ");
        }
    }
}
