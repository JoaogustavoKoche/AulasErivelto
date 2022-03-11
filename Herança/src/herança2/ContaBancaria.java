/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança2;

/**
 *
 * @author Joao Gustavoo
 */
public class ContaBancaria {
    
    protected String nome;
    protected String cpf;
    protected String numeroConta;
    protected double saldo;
    
    public ContaBancaria(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
  
    public void depositar(double quantia){
        saldo += quantia;
    }
    
    public void sacar(double quantia){
        saldo -= quantia;
    }
    
    public void imprimirSaldo(){
        //o codigo de imprimirSaldo entra aqui
    }
}
