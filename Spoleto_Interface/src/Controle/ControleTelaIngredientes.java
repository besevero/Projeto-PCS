/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto;
import Model.Produto_Ingrediente;
import View.TelaExtras;
import View.TelaIngredientes;
import View.TelaInicial;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleTelaIngredientes {
    private Pedido pedido;
    private TelaIngredientes TelaIngredientes;
    private ArrayList<Produto> ingredientes_padrao = new ArrayList();
    private ArrayList<Produto> ingrediente_extra = new ArrayList();
    private Produto_Ingrediente ingredientes = new Produto_Ingrediente();
    
    public ControleTelaIngredientes(TelaIngredientes TelaIngredientes){
        this.pedido = new Pedido();
        this.TelaIngredientes = TelaIngredientes;
    }
    public void apagaPedido(){
            getPedido().getPratos().clear();
    }
    public void cancelar(){
      apagaPedido();
      TelaInicial TelaInicial = new TelaInicial(getPedido());
      TelaInicial.setVisible(true);
        getTelaIngredientes().setVisible(false);
      
     }
    public void proximo(){
     TelaExtras TelaExtras = new TelaExtras(new Pedido());
     TelaExtras.setVisible(true);
        getTelaIngredientes().setVisible(false);
    }
    public void voltar(){
        TelaInicial TelaInicial = new TelaInicial(getPedido());
        TelaInicial.setVisible(true);
        getTelaIngredientes().setVisible(false);
    }
    public void ingredientes_padrao(String nome){
        for(int i = 0 ; i < getIngredientes().getIdIngrediente().size() ; i++){
            if(getIngredientes().getIdIngrediente().get(i).getNome().equals(nome))
                getIngredientes_padrao().add(getIngredientes().getIdIngrediente().get(i));
        }
    }
    public void ingredientes_extra(String nome, boolean extra){
        if(extra){
            for(int i = 0 ; i < getIngredientes().getIdIngrediente().size() ; i++)
                if(getIngredientes().getIdIngrediente().get(i).getNome().equals(nome))
                    getIngrediente_extra().add(getIngredientes().getIdIngrediente().get(i));
        }
    }
    public String inserePadrao(int posicao){
        return getIngredientes_padrao().get(posicao).getNome();
    }
    public String insereExtra(int posicao){
        return getIngrediente_extra().get(posicao).getNome();
    }
    
    
    
    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the TelaIngredientes
     */
    public TelaIngredientes getTelaIngredientes() {
        return TelaIngredientes;
    }

    /**
     * @param TelaIngredientes the TelaIngredientes to set
     */
    public void setTelaIngredientes(TelaIngredientes TelaIngredientes) {
        this.TelaIngredientes = TelaIngredientes;
    }

    /**
     * @return the ingredientes
     */
    public Produto_Ingrediente getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(Produto_Ingrediente ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the ingredientes_padrao
     */
    public ArrayList<Produto> getIngredientes_padrao() {
        return ingredientes_padrao;
    }

    /**
     * @param ingredientes_padrao the ingredientes_padrao to set
     */
    public void setIngredientes_padrao(ArrayList<Produto> ingredientes_padrao) {
        this.ingredientes_padrao = ingredientes_padrao;
    }

    /**
     * @return the ingrediente_extra
     */
    public ArrayList<Produto> getIngrediente_extra() {
        return ingrediente_extra;
    }

    /**
     * @param ingrediente_extra the ingrediente_extra to set
     */
    public void setIngrediente_extra(ArrayList<Produto> ingrediente_extra) {
        this.ingrediente_extra = ingrediente_extra;
    }
}
