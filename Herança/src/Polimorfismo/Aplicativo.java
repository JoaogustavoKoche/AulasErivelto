/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author Joao Gustavoo
 */
class Aplicativo {
    
    public static void main(String[] args) {
        
        System.out.println("Polimorfismo\n");
        
        Mamifero mamifero1 = new Elefante();
        
        System.out.println("Cota Diaria de leite do elefante: "+mamifero1.obterCotaDiariaDeleite());
        
        Mamifero mamifero2 = new Rato();
        
        System.out.println("Cota diaria de leite do rato: "+mamifero2.obterCotaDiariaDeleite());
    }
    
}
