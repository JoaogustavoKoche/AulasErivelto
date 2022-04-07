/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Usuário
 */
public class calculadora {

    private String modelo;
    private String marca;
    private String uso;

    public calculadora(){

    }

    public calculadora (String marca, String modelo){

        this.marca = marca;
        this.modelo = modelo;

    }

    public calculadora (String marca, String modelo, String uso){

        this.marca = marca;
        this.modelo = modelo;
        this.uso = uso;

    }

    public int calcula(int a, int b){

        return a+b;

    }

    public double calcula (double a, double b){

        return a+b;

    }

    public String calcula (String a, String b){

        return a+b;

    }

    public static void main(String args[]) {

        calculadora calc = new calculadora ("optpex", "N110","Empresarial");
        calculadora cald = new calculadora ("Zion","Neo1");

        System.out.println(calc.calcula(900, 1000));
        System.out.println(calc.calcula(99.00,100.1));
        System.out.println(calc.calcula("Sobrecarga de "," contrutores"));
        System.out.println("Calculadora 1 Marca: "+calc.marca+" Modelo: "+calc.modelo+" Uso: "+calc.uso);
        System.out.println("Calculadora 2 Marca: "+cald.marca+" Modelo: "+cald.modelo);

    }

}