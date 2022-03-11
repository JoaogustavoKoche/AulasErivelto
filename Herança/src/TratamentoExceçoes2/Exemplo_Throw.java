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
public class Exemplo_Throw {
    
    public static void saque(double valor){
        if(valor > 400){
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }else{
            System.out.println("Valor retirado da conta: R$"+valor);
        }
    }
    
    public static void main(String[] args) {
        saque(1500);
    }  
}


/*A classe Throwable oferece alguns métodos que podem
verificar os erros reproduzidos, quando gerados para dentro
das classes. Esse tipo de verificação é visualizado no rastro
da pilha (stracktrace), que mostra em qual linha foi gerada a
exceção. Abaixo estão descritos os principais métodos que
podem ser tratados no bloco catch para visualizar em que
momento foi gerado o erro.

printStrackTrace – Imprime uma mensagem da pilha de
erro encontrada em um exceção.

getStrackTrace – Recupera informações do stracktrace
que podem ser impressas através do método
printStrackTrace.

getMessage – Retorna uma mensagem contendo a lista
de erros armazenadas em um exceção no formato String.*/
