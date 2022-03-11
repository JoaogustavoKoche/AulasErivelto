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
public class Fornecedor extends Pessoa{
    
    String cnpj;
    
    @Override
    public void ImprimeNome(){
        System.out.println("O nome do fornecedor é: "+nome+ "\n Cnpj: "+cnpj);
    }
}
