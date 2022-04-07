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
public class Exer1 {
    
    
    
    public static void temperatura(double calc){
        
        double celsius = (calc - 32 / 1.8);
        
        JOptionPane.showMessageDialog(null, "Graus em Celsius: "+celsius);
    }
    
   
    public static void main(String[] args) {
        
        double calc = Double.parseDouble(JOptionPane.showInputDialog("Entre com uma temperatura em Fahrenheit: "));
        temperatura(calc);
    }   
}
