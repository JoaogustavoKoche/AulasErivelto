/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao Gustavoo
 */
public class Exercicio13 {
    
    float f;
    double c;
    
    public void temperatura(){
        
        f = Float.parseFloat(JOptionPane.showInputDialog("Forneca uma temperatura em Fahrenheit: "));
    }
    
    public void mostrar(){
       
        c = (f - 32)/1.8;
        JOptionPane.showMessageDialog(null, "Graus em Cesius: "+c);
    }

    public static void main(String args[]) {
        
        Exercicio13 teste = new Exercicio13();
        teste.temperatura();
        teste.mostrar();
    }
}
    
 

