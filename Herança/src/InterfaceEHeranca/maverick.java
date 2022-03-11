/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceEHeranca;

/**
 *
 * @author Joao Gustavoo
 */
class maverick extends carro implements carro.chassi,carro.motor,carro.carroceria{
    
    public void numeracao(){
        System.out.println("123456789-1230");
    }
   
    public void fabricante_chassi(){
        System.out.println("Brasil chassi");
    }
    
    public String material_chassi(){
     return "Aco carbono 21";
    }
    
    public String numero(){
     return ("14752321-2582");
    }
    
    public String potencia(){
     return "250 CV";
    }
    
    public String fabricante_mator(){
     return "Brasil fabricante de motores";
    }
    
    public String fabricante_carroceria(){
     return "Brasil fabricante de carrocerias";
    }

    public String pintura(){
        return "pintura mtelica perolizada";
    }
    
    public String material_carroceria(){
     return "Aço carbono 16";
    }
    
    public void ligar(){
     System.out.println("Ligando mavecão V8");
    }  
}