/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBangunDatar2;

/**
 *
 * @author galih
 */
public class PersegiPanjang {
    int hitungLuas(int c, int d){
        return c * d;
    }
    
    double hitungLuas(double c, double d){
        return c * d;
    }
    
    int hitungKeliling(int c, int d){
        return 2*c + 2*d;
    }
    double hitungKeliling(double c, double d){
        return 2*d + 2*c;
    }
}