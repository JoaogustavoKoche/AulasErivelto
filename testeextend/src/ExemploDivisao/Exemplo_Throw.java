/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploDivisao;

/**
 *
 * @author Usuário
 */
public class Exemplo_Throw {
    
    public static void saque(double valor){
        if(valor > 400){
            IllegalArgumentException erro = new IllegalArgumentException();
            
            throw erro;
        }else{
            System.out.println("Valor retirado da conta: R$ "+valor);
            
        }
    }
    
    public static void main(String[] args) {
        saque(1500);
    }
}
