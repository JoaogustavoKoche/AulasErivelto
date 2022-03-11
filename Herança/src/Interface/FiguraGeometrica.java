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
public interface FiguraGeometrica {
    
    public String getNomefigura();
    public int getArea();
    public int getPerimetro();
    
}


/*A interface é um recurso muito utilizado em Java,
bem como na maioria das linguagens orientadas a
objeto, para “obrigar” a um determinado grupo de
classes a ter métodos ou propriedades em
comum para existir em um determinado contexto,
contudo os métodos podem ser implementados
em cada classe de uma maneira diferente. Podese dizer, a grosso modo, que uma interface é um
contrato que quando assumido por uma classe
deve ser implementado.


Para realizar a chamada/referência a uma interface por
uma determinada classe, é necessário adicionar a palavrachave implements ao final da assinatura da classe que irá
implementar a interface escolhida.
 Sintaxe:
 public class nome_classe implements nome_interface
 Onde: nome_classe – Nome da classe a ser
implementada.
 nome_Interface – Nome da interface a se implementada
pela classe.
 Abaixo é possível ver duas classes que implementam a
interface FiguraGeometrica, uma chamada Quadrado e
outra Triangulo.

*/