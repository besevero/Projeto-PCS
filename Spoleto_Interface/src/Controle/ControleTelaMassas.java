/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto;
import Model.Produto_Massa;
import View.TelaIngredientes;
import View.TelaMassas;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleTelaMassas {
    
    private Pedido pedido;
    private TelaMassas TelaMassas;
    private ArrayList<Produto> produtos = new ArrayList();
    private Produto_Massa massa = new Produto_Massa("Mate", 3, 3);
     
    
    public ControleTelaMassas(TelaMassas TelaMassas) {
        this.pedido = new Pedido(1);
        this.TelaMassas = TelaMassas;
    }
    public void telaIngredientes(){
        TelaIngredientes TelaIngredientes = new TelaIngredientes();
        TelaIngredientes.setVisible(true);
        TelaMassas.setVisible(false);
    }
    
}
