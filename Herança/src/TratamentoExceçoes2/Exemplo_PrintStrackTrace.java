/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TratamentoExceçoes2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Joao Gustavoo
 */
public class Exemplo_PrintStrackTrace {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.println(idade);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        
    }
    
}
