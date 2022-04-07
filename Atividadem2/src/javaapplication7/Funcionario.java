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
public class Funcionario extends Pessoa implements Conta_Bancaria{
    
    
    private int Cadastro;
    private double salario;
    private int dataAdmissao;

    public Funcionario(String nome, int idade, double altura, double peso, String CPF,int Cadastro,double salario,int dataAdmissao) {
        super(nome, idade, altura, peso, CPF);
        
        this.Cadastro = Cadastro;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
    
    
    public void imprimeFun(){
        super.imprimePessoa();
        System.out.println("Cadastro: "+this.Cadastro);
        System.out.println("Salario: "+this.salario);
        System.out.println("Data Admissao: "+this.dataAdmissao);    
    }
    
    public void setCadastro(int Cadastro) {
        this.Cadastro = Cadastro;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataAdmissao(int dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double salarioAtual(){
        
        salario = 4000;
        
        return salario;
    }

    @Override
    public String getTipoConta() {

        String tipoc = "Conta Corrente";
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

       int conta = 2020;
       return conta;
    }

}
