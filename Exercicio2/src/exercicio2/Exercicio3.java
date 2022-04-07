/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao Gustavoo
 */
public class Exercicio3 {
    
    String num[];
   
    public void iniciaVetor(){
        
        int qtd;
        
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos numeros serao adicionados: "));
        
        num = new String[qtd];   
    }        
    
    public void leFones(){
        
        for (int i = 0; i < num.length; i++){
            
            num[i] = JOptionPane.showInputDialog("Informe seu numero de telefone:");
        }
    }
    
      
    public void exibeSC(){
       
        JOptionPane.showMessageDialog(null, "Telefones de SC: \n"+ Arrays.stream(num).filter(i ->(i.charAt(0) == '4') && i.charAt(1) == '7' || i.charAt(1) == '8' || i.charAt(1) == '9').collect(Collectors.toList()));   
    }         
    
    public static void main(String[] args) {
        
        Exercicio3 teste = new Exercicio3();
        
        teste.iniciaVetor();
        teste.leFones();
        teste.exibeSC(); 
    }
}

