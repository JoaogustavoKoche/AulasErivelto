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
public class Pessoa<String> {
    
    private String Nome;
    private int idade;
    private double altura;
    private double peso;
    private String CPF;

   
    
    public Pessoa(String Nome, int idade, double altura, double peso, String CPF){
        
        this.Nome = Nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.CPF = CPF;
    }

    public void imprimePessoa(){
        
        System.out.println("Nome: "+this.Nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);
        System.out.println("CPF: "+this.CPF);
    }
    
    
    
    public String getNome() {
        return Nome;
    }
    

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
