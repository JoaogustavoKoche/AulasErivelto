/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface3;

import Interface2.Motor;

/**
 *
 * @author Joao Gustavoo
 */
public class Maverick extends Veiculo{
    
    public Maverick(){
        motor = new Motor("V8") {};
    }
    
    
    @Override
    public void acelerar(){
        System.out.println("Aceleração Super Rapida");
    }
    
    @Override
    public void desacelerar(){
        System.out.println("Desacelaração Lenta");
    }
}
