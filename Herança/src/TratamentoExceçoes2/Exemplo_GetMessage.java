/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TratamentoExceçoes2;

/**
 *
 * @author Joao Gustavoo
 */
public class Exemplo_GetMessage {
    
    public static void main(String[] args) {
        try{
            
            int[] numero = new int[5];
            
            for(int i=0;i<=10;i++){
                numero[i] = i;
                System.out.println(i);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array fora do indice: "+e.getMessage());
        }
    }
    
}
