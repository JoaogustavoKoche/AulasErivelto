/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class J_Exemplo {
    
    public static void main(String[] args) {
        
        
        empregado emp = new empregado();
        
        emp.address.estado = JOptionPane.showInputDialog("Entre com o estado: ");
        emp.name.nome_ini = JOptionPane.showInputDialog("Entre com o seu primeiro nome: ");
        
        JOptionPane.showMessageDialog(null, "Estado digitado: "+emp.address.estado);
        JOptionPane.showMessageDialog(null, "Cep digitado: "+emp.address.cep);
        JOptionPane.showMessageDialog(null, "Nome digitado: "+emp.name.nome_ini);
    }    
}
