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
public class Demonstracao {
    
    public static void main(String[] args) {
        
        ParticipanteForum participante = new ParticipanteForum(); // instanciando o objeto
        
        Leitor leitor = participante; //upcast para leitor
        System.out.println("O participante esta lendo "+leitor.lendo());
        Progamador progamador = participante; // upcast para Progamador
        
        String java = "Java";
        progamador.pensado(java.toCharArray());
        System.out.println("E programando "+progamador.digitando());
    }
   
}
