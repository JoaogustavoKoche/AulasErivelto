/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;
import javax.swing.*;
/**
 *
 * @author Joao Gustavoo
 */
public class Exercicio12 {
    
    
    public static void temperatura() {
        
        float f;
        double c;
    
        f = Float.parseFloat(JOptionPane.showInputDialog("Entre com uma temperatura em Fahrenheit: "));
    
        c = (f - 32)/1.8;
    
        JOptionPane.showMessageDialog(null, "Graus em Celsius: "+c);  
    }

    public static void main(String args[]) {
         
       temperatura();
    }
}


