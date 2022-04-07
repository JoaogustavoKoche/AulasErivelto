/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Joao Gustavoo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
        
        int maior = 0;
        int menor = 99999;
        int qtd;    
        int soma = 0;
          
        System.out.println("Digite quantos celulares vao ser digitados: ");{
            
            qtd = ler.nextInt();
         
            int[] a = new int[qtd];

            
            for(int i = 0; i < qtd; i++) {
         
                System.out.println("Digite o valor"); 
           
                a[i] = ler.nextInt();
                
                soma += a[i];
                        
                if(a[i] > maior){

                    maior = a[i];
                }

                if(a[i] < menor){

                    menor = a[i]; 
                }    
            }    
  
            double media =(soma / qtd);
 
            System.out.println("Valores");
            System.out.println("Media: "+media);
            System.out.println("Menor: "+menor);
            System.out.println("Maior: "+maior);          
        }  
    }
}
