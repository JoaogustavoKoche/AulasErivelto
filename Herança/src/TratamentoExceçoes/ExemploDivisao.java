/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TratamentoExceçoes;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Joao Gustavoo
 */
public class ExemploDivisao {
    
    public static int calculaQuociente(int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        
        do{
            try{
                System.out.println("Numerador: ");
                int numerador = sc.nextInt();
                
                System.out.println("Denominador");
                int denominador = sc.nextInt();
                
                int resultador = calculaQuociente(numerador, denominador);
                System.out.println("Resultado: "+resultador);
                
                continua = false;           
            }catch(InputMismatchException erro1){
                System.out.println("Nao é permitido inserir letras,informe apenas numeros inteiros");
                sc.nextLine();
            }catch(ArithmeticException erro2){
                System.out.println("O numero do divisor deve ser diferente de 0!");
            }finally{
                System.out.println("Execuçao do Finnaly!");
            }
        }while(continua);
    }
    
}
/*No exemplo da listagem 1, foi utilizado no método a palavra
throws. Essa é uma questão que gera alguns conflitos, pois
além dessa cláusula, existe também o throw. Então qual a
diferença entre as instruções throws e throw?
*/