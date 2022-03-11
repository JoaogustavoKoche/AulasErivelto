/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Joao Gustavoo
 */
public abstract class Triangulo implements FiguraGeometrica{
    
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int getBase(){
        return base;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }
    
    
    public String getNomeFigura(){
        
        return "Triangulo";
    }
    
    @Override
    public int getArea(){
        int area = 0;
        area = (base * altura)/ 2;
        return area;
    }
    
    
    @Override
    public int getPerimetro(){
        int perimetro = 0;
        perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
    
}
