/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDuas;

/**
 *
 * @author Joao Gustavoo
 */
public class ParticipanteForum implements Leitor, Progamador{
    
    String pensamento;
   
    @Override
    public String lendo(){ // metodo definido na interface Leitor
        return "Forum";
    }
    
    @Override
    public String digitando(){ // metodo definido na interface Progamador
        return pensamento;
    }
    
    private String aprendendo(){ // metodo exclusivo desta classe
        return "Java";
    }

    @Override
    public void pensado(char[] ideias) {
       pensamento = new String(ideias);
    }
}
