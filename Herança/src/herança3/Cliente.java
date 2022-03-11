/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança3;

/**
 *
 * @author Joao Gustavoo
 */
public class Cliente extends Pessoa{
    
    String cpf;
    
    @Override
    public void ImprimeNome(){
        System.out.println("Nome do cliente é: "+nome+"\n N* CPF: "+cpf+"\n Seu endereco: "+ endereco);
    }
}
