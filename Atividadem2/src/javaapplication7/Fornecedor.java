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
public class Fornecedor extends Pessoa{
    
    private String tipoPessoa;
    private String CpfCpnj;
    private String razaosocial;

    public Fornecedor(String nome, int idade, double altura, double peso, String CPF, String tipoPessoa, String CpfCpnj, String razaosocial) {
        super(nome, idade, altura, peso, CPF);
        
        this.tipoPessoa = tipoPessoa;
        this.CpfCpnj = CpfCpnj;
        this.razaosocial = razaosocial;
    }
    
    
    public void imprimeForn(){
        super.imprimePessoa();
        System.out.println("Tipo pessoa: "+this.tipoPessoa);
        System.out.println("Cpf Cpnj: "+this.CpfCpnj);
        System.out.println("Razao Social: "+this.razaosocial);   
    }
    
    

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpfCpnj() {
        return CpfCpnj;
    }

    public void setCpfCpnj(String CpfCpnj) {
        this.CpfCpnj = CpfCpnj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    } 
}
