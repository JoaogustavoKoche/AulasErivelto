/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaerivelto;

/**
 *
 * @author usuario
 */
public class Cadastro {
    
    private String descricao;
    private double precoVenda;
    private double  precoCusto;
    private double margemLucro;
    private double calculadora;
    
    
 
    public double lucro(){
        
        margemLucro = precoVenda - precoCusto;
                
        return  margemLucro;         
    }
    
    public double calc(){
          
     double percentual;
          
     percentual =  precoVenda / precoCusto;
       
     calculadora = ((percentual * 100) - 100); 
        
       return calculadora;  
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(double calculadora) {
        this.calculadora = calculadora;
    }
}
