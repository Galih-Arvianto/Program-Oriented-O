/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoverloading;

/**
 *
 * @author galih
 */
public class ProjectOverloading {

    public static void main(String[] args) {

        MyClass m = new MyClass();
        
        m.myMethod();
        m.myMethod(1.20);
        m.myMethod(2, 2.0);
        
    }
    
}

