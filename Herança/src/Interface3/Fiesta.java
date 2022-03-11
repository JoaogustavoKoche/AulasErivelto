/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface3;

/**
 *
 * @author Joao Gustavoo
 */
public class Fiesta extends Veiculo{
    
   
    @Override
    public void acelerar(){
        System.out.println("Aceleração Constante");
    }
    
    @Override
    public void desacelerar(){
        System.out.println("Desacelaração Constante");
    }
}
