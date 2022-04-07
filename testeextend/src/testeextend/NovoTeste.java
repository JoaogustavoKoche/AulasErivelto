/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeextend;

/**
 *
 * @author Usuário
 */
public class NovoTeste extends Teste {
    
    
   
    @Override
    public void fazAlgo(){
        System.out.println("Este é o metodo foi sobrescrito");
    }
    
    
    
    
    public static void main(String[] args) {
        
        
        Teste t = new Teste();
        
        t.fazAlgo(); //retorna "Este é o metodo da super classe"
        
        
        
        NovoTeste tn = new NovoTeste();
        
        
        tn.fazAlgo(); //Retorna "Este metodo foi sobrescrito"
    }
}


