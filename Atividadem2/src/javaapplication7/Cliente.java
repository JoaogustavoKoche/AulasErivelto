/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Joao Gustavoo
 */
public class Cliente extends Pessoa implements Conta_Bancaria{
    
    private String TipoPessoa;
    private String Cpfcpnj;
    private String RazaoSocial;
    private double limiteCredito;
    private double totalAtraso;
    private double saldoConta;
    
    
    public Cliente(String nome, int idade, double altura, double peso, String CPF, String TipoPessoa, String Cpfcpnj,String RazaoSocial,double limiteCredito,double totalAtraso,double saldoConta) {
        super(nome, idade, altura, peso, CPF);
        
        this.TipoPessoa = TipoPessoa;
        this.Cpfcpnj = Cpfcpnj;
        this.RazaoSocial = RazaoSocial;
        this.limiteCredito = limiteCredito;
        this.totalAtraso = totalAtraso;  
        this.saldoConta = saldoConta;
    }
    
    
    public void imprimeCli(){
        super.imprimePessoa();
        System.out.println("Tipo pessoa: "+this.TipoPessoa);
        System.out.println("Cpf Cpnj: "+this.Cpfcpnj);
        System.out.println("Razao Social: "+this.RazaoSocial);
        System.out.println("Limite Credito: "+this.limiteCredito);
        System.out.println("Total Atraso: "+this.totalAtraso);   
        System.out.println("Saldo Conta: "+this.saldoConta); 
        System.out.println("Banco: "+getBanco()+
                "\n"+"Agencia: "+getAgencia()+
                "\n"+"Conta: "+getConta()+
                "\n"+"TIpo Conta: "+getTipoConta());  
    }
    

    public String getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(String TipoPessoa) {
        this.TipoPessoa = TipoPessoa;
    }

    public String getCpfcpnj() {
        return Cpfcpnj;
    }

    public void setCpfcpnj(String Cpfcpnj) {
        this.Cpfcpnj = Cpfcpnj;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getTotalAtraso() {
        return totalAtraso;
    }

    public void setTotalAtraso(double totalAtraso) {
        this.totalAtraso = totalAtraso;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
   
    
      public static double dep(double valor) throws ArithmeticException{
        return valor;
    }
    
    public void sacarDinheiro(){

        Scanner ler = new Scanner(System.in);
           
      try{
          
        System.out.println("Qtd para sacar: ");
        double valor = ler.nextDouble();
        
        if(valor > this.limiteCredito)  {
           
           System.out.println("Sacando do limite!");
           System.out.println("Havera cobranças de juros pelo uso do limite da conta");
           
         this.limiteCredito -= valor;  
         
         System.out.println("Dinheiro sacado: "+valor);
         System.out.println("Saldo atual: "+this.limiteCredito);
           
       }else{
         
         this.limiteCredito -= valor;  
         
         System.out.println("Dinheiro sacado: "+valor);
         System.out.println("Saldo atual: "+this.limiteCredito);
       }
       }catch(InputMismatchException erro1){
          System.out.println("Nao é permitido inserir letras,informe apenas numeros inteiros");
          ler.nextLine();
       }finally{
          System.out.println("Finnaly!");
        }  
    }
    
     
    public void depositar(){
        
        Scanner ler = new Scanner(System.in);
        boolean continua = true;
        
   
        try{
  
            System.out.println("Qtd para depositar: ");
            double valor = ler.nextDouble();
        
            this.limiteCredito += valor;
      
            System.out.println("Valor depositado: "+valor);
            System.out.println("Saldo atual: "+this.limiteCredito);   
        
         }catch(InputMismatchException erro1){
            System.out.println("Nao é permitido inserir letras,informe apenas numeros");
            ler.nextLine();
         }finally{
            System.out.println("Finalizando");
        }   
    } 

    public void verificaS(){
       System.out.println("Seu saldo é: "+this.getSaldoConta());   
    }
    
    
    @Override
    public String getTipoConta() {
        String tipoc = "Conta Poupança";
        
        return tipoc;
    }

    @Override
    public int getBanco() {
        
        int banco = 909;
        return banco;
    }

    @Override
    public int getAgencia() {
        
        int agencia = 0202;
        return agencia;
    }

    @Override
    public int getConta() {
       
        int conta = 1010;
        return conta;
    }
}
