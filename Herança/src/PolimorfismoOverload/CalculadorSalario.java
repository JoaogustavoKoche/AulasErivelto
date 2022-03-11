/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoOverload;

/**
 *
 * @author Joao Gustavoo
 */


/*Overload uma classe qualquer tem 2 ou +metodos com mesmo nome e parametros diferentes*/

public class CalculadorSalario {


    public double calculaSalario(Horista horista){
        return 1;
    }    

    public double calculaSalario(Mensalista mensalista){
        return 2;
    }
}


/*O porque que não existe a diretiva
@Overload (Sobrecarga) no Java :?: :?: :?:
●
● Simples, o compilador javac consegue
identificar métodos cujas as assinaturas são
diferentes, porém não conseguem identificar
os com asssinaturas iguais, daí a
necessidade da sintaxe “@Override”.
●
● 
override : classes filhas escrevem denovo o mesmo
metodo da pai*/ 