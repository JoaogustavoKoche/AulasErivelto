/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores;

/**
 *
 * @author usuario
 */
public class empregado {
    
    nome name;
    endereco address;
    
    //construtor para evitar o erro
    //de referencia nula, ou seja,
    //java.lang.nullpointerexception
    
    public empregado(){
   
        name = new nome();
        address = new endereco(); 
    }
}
