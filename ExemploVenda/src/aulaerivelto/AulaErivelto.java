/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaerivelto;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class AulaErivelto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
      
       
        System.out.println("Entre com a descrição do produto: ");
        cadastro.setDescricao(scan.nextLine());

        System.out.println("Entre com o valor de venda: ");
        cadastro.setPrecoVenda(Double.parseDouble(scan.nextLine()));
        
        System.out.println("Entre com o preco de custo: ");
        cadastro.setPrecoCusto(Double.parseDouble(scan.nextLine()));    
        
        
        System.out.println("Imprimindo");
        
        System.out.println("Percentual de lucro");
        System.out.println(cadastro.calc());
        System.out.println("Margem de lucro");
        System.out.println(cadastro.lucro());
        System.out.println("Preço de venda");
        System.out.println(cadastro.getPrecoVenda());
        System.out.println("Preço de custo");
        System.out.println(cadastro.getPrecoCusto());  
    } 
}
