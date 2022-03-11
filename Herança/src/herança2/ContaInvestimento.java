/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança2;

/**
 *
 * @author Joao Gustavoo
 */
class ContaInvestimento extends ContaBancaria {
    
    private double taxaAdministracao;
    private double saldoMinimo;
    
    public ContaInvestimento(String nome, String cpf) {
        super(nome, cpf);
    }
    
}
