/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface4;

/**
 *
 * @author Joao Gustavoo
 */
public class ContaPoupanca implements Conta{
    
    private double saldo;
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    @Override
    public double getSaldo(){
        return this.saldo;
    }
    
    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

}
