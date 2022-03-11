/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo2;

/**
 *
 * @author Joao Gustavoo
 */
public class Test {
    
    public void fazerAnimalComer(Animal animal){
        
        animal.comer();
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        
        t.fazerAnimalComer(new Animal());
        t.fazerAnimalComer(new Cao());
        t.fazerAnimalComer(new Tigre());
    }
}
