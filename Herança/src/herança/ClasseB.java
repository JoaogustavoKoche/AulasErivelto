/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author Joao Gustavoo
 */
public class ClasseB extends ClasseA {

    public void m1(){
        // o codigo de m1 entre aqui
    }
     
    public void m2(){
        // o codigo de m2 entra aqui
    }
    
    public static void main(String[] args) {
        
        ClasseB objB = new ClasseB();
        
        objB.m1();
        objB.m2();  
        objB.m3();
        objB.m4();
    }  
}
