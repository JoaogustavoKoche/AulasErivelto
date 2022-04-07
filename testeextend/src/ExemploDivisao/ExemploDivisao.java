/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploDivisao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuário
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
                System.out.println("Numedorador");
                int numerador = sc.nextInt();
                
                System.out.println("Denominador");
                int denominador = sc.nextInt();
                
                int resultados = calculaQuociente(numerador, denominador);
                System.out.println("Resultado: "+resultados);
                
                
                continua = false;
            }catch (InputMismatchException erro1){
                
                System.out.println("Nao é permitido inserir letras, informe apenas numeros inteiros!");
                sc.nextLine(); // descata a entrada errada do usuario
            }catch(ArithmeticException erro2){
                System.out.println("O numero do divisor deve ser diferente de 0!");
            }finally{
                System.out.println("Execução do Finally");
            }
        }while(continua);     
    }
}
