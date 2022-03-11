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
public abstract class Quadrado implements FiguraGeometrica{
    
    private int lado;
    
    public int getLado(){
        return lado;
    }
    
    public void setLado(int lado){
        this.lado = lado;
    }
    
    @Override
    public int getArea(){
        int area = 0;
        area = lado * lado;
        return area;
    }
    
    @Override
    public int getPerimetro(){
        int perimetro = 0;
        
        perimetro = lado * 4;
        return perimetro;
    }
    
    public String getNomeFigura(){
        return "Quadrado";
    }
}
