/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoOverride;

/**
 *
 * @author Joao Gustavoo
 */
public class Teste {
    
    public void fazAlgo(){
        System.out.println("Este metodo nao recebe parametro");        
    }
    
    public void fazAlgo(String mensagem){
        System.out.println("Mensagem");
    }
}


/*A sobrecarga de métodos consiste em voce
declarar vários métodos em uma única classe ou
em classes descendentes, com o mesmo nome,
porém eles tem que ter assinaturas diferentes.
– 
A assinatura do método é o escopo do método
identificado pelo seu retorno, pelo seu nome,
bem como o recebimento ou não de seus
parâmetros.

Repare que os métodos da classe Teste,
tem o mesmo nome, porém eles serão
identificados no momento de serem
invocados, pela sua assinatura, ou seja a
passagem de parâmetros ou não passagem
de parâmetros.

Como disse antes, a sobrecarga de métodos
voce pode fazer tanto na mesma classe,
como também nas classes herdadas,
bastando tão somente voce saber qual é a
assinatura do método da super classe para
poder sobrecarregá-lo.*/