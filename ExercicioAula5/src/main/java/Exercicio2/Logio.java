/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;

/**
 *
 * @author Joao Gustavoo
 */
public class Logio {
    
    public static void main(String[] args) {
        
        
        Relogio relogio1 = new Relogio(02, 00, "Casio", "Standard", 6000);
   

        ArrayList<Relogio> logio = new ArrayList<>();
       
        logio.add(relogio1);
       
       
        System.out.println("Imprimindo");
        for (int i = 0; i < logio.size(); i++){
            
            logio.get(i).imprimir();    
        }
    }
}
