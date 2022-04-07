/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiculo;

/**
 *
 * @author Usuário
 */
public class carro extends Veiculo{
    
    private int marcha;
    public carro(){   
    }
    
    public carro(String m, int p, float c){
        super(m,p,c);  
    }
         
    
    public void setVelocidade(Float v){
        
        velocidade = v;
    if(velocidade > 20 && velocidade<40){
          marcha=2;
    }if(velocidade<20){
        
        marcha =1;
    }if(velocidade>40 && velocidade<60){
        marcha=3;
    }if(velocidade>60 && velocidade<70){
        marcha=4;
    }if(marcha>70){ 
        marcha=5;
    }
}
    
    
    public void acelera(){
        setVelocidade(getVelocidade()+2.f);
        
    }
    
    public void freia(){
        setVelocidade(getVelocidade()-2.f);
    }
    public static void main(String[] args) {
        carro corsa = new carro("Hatch",5,50.f);
        carro audi = new carro();
        
        int a,b=10;
        System.out.println("Modelo: " +corsa.modelo+ "Total de passageiros: "+corsa.passageiros+ "Tanque de combustivel"+corsa.combustivel+" Litros \n ");
        System.out.println("Acelerando o carro\n");
        
        for(a=0; a<10; a++){
            
            corsa.acelera();
            System.out.println("Marcha: "+corsa.marcha+" Velocidade: "+corsa.getVelocidade());
        }
        
        System.out.println("\nFreiando o carro\n");
        while(b!=0){
            
            corsa.freia();
            System.out.println("Marcha: "+corsa.marcha+" Velocidade: "+ corsa.getVelocidade());
            b--;
        }
        
    }
           
}
