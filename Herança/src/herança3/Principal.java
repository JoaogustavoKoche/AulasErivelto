/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança3;

/**
 *
 * @author Joao Gustavoo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Cliente c = new Cliente();
        
        c.nome = "Luiz";
        c.cpf = "073.777.796-21";
        c.ImprimeNome();
        
        
        Fornecedor f = new Fornecedor();
       
        f.nome = "Deltatronic";
        f.cnpj = "073.856.9856.52-10";
        f.ImprimeNome();
    }
    
 
    
}
