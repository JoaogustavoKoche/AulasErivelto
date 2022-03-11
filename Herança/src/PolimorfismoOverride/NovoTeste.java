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
public class NovoTeste extends Teste{
    
    @Override
    public void fazAlgo(){
        System.out.println("Este é o metodo foi sobrescrito");
    }
    
    
    public static void main(String[] args) {
        Teste T = new Teste();
        T.fazAlgo(); //Retorna "este é o metodo da super classe"
        
        
        NovoTeste TN = new NovoTeste();
        
        TN.fazAlgo(); //Retorna "Este metodo foi sobrescrito
    }
}



/*Repare que na sub classe NovoTeste eu
estou substituindo o método fazAlgo da
super classe, isto porque, se eu não o
sobrescrevesse, ele iria herdar o método
fazAlgo() da super classe, e neste caso ele
passa a ter o método com o mesmo nome e
mesma assinatura só que com
implementação nova na sub classe.*/