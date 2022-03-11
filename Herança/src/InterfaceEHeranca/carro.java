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
public class carro {
    
    private String modelo;
    private String ano_fabricacao;
    
    public String getModelo(String modelo){
        return modelo;
    }
    
    public String setModelo(){
        return this.modelo = "Tracker";
    }
    
    public String getano_fabricacao(String ano){
        return ano;
    }
    
    public String setAno_Fabricacao(){
        return this.ano_fabricacao = "2019";
    }

    static interface chassi {
    }

    static interface motor {
    }

    static interface carroceria {
    }
}
