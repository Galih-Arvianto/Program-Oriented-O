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
public class Operasi {
    int jumlahkan(int a, int b){
        return (a+b);
    }
    
    int jumlahkan(int a, int b, int c){
        return (a+b+c);
    }
    
    double jumlahkan(double a, double b){
        return (a+b);
    }
     
    double jumlahkan(double a, double b, double c){
        return (a+b+c);
    }
    double jumlahkan (int a, double b, double c){
        return (a + b + c);    
    }
        double jumlahkan (double a, int b, double c){
        return (a + b + c);
    }
    double jumlahkan (double a, double b, int c){
        return (a + b + c);
    }
}