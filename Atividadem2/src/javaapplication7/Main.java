/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Joao Gustavoo
 */
public class Main {
    
    public static <String> void main(String[] args) {
        
        
        //definindo pessoa, fornecedor, funcionario e cliente
        
        Pessoa pes1 = new Pessoa("Pedro",30,1.70,60.6,"999.999.999-99"); 
        
        Fornecedor for1 = new Fornecedor("Pedro",30,1.70,60.6,"999.999.999-99","Fisica","999.999.999-99","Pedross"); 
        
        Funcionario fun1 = new Funcionario("Pedro",30,1.70,60.6,"999.999.999-99",10,50,40);
        
        Cliente cli1 = new Cliente("Pedro",30,1.70,60.6,"999.999.999-99","Fisica","999.999.999-99","Pedross",9000,100,20000);
        

        //fun1.imprimeFun();
        //for1.imprimeForn();
        //pes1.imprimePessoa();
        cli1.imprimeCli();
       

        //Metodos para verificar saldo, sacar e depositar.
        //cli1.verificaS();
        //cli1.sacarDinheiro();
        //cli1.depositar();
        
        
    }    
}
