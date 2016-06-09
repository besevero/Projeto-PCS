/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author PPGI
 */
public class Produto_Ingrediente extends Produto{
  
     private ArrayList<Produto> idIngrediente = new ArrayList();
    
     public Produto_Ingrediente(){
        idIngrediente.add(new Produto ("Alcaparra", 0.00, 100));
        idIngrediente.add(new Produto ("Alho", 0.00, 100));
        idIngrediente.add(new Produto ("Alho Poró", 0.00, 100));
        idIngrediente.add(new Produto ("Azeitona Preta", 0.00, 100));
        idIngrediente.add(new Produto ("Bacon", 0.00, 100));
        idIngrediente.add(new Produto ("Brócolis", 0.00, 100));
        idIngrediente.add(new Produto ("Camarão", 0.00, 100));
        idIngrediente.add(new Produto ("Carne de Sol", 0.00, 100));
        idIngrediente.add(new Produto ("Cenoura", 0.00, 100));
        idIngrediente.add(new Produto ("Champignon", 0.00, 100));
        idIngrediente.add(new Produto ("Cebola", 0.00, 100));
        idIngrediente.add(new Produto ("Ervilha", 0.00, 100));
        idIngrediente.add(new Produto ("Frango", 0.00, 100));
        idIngrediente.add(new Produto ("Gorgonzola", 0.00, 100));
        idIngrediente.add(new Produto ("Linguiça Calabresa", 0.00, 100));
        idIngrediente.add(new Produto ("Milho", 0.00, 100));
        idIngrediente.add(new Produto ("Ovo de Codorna", 0.00, 100));
        idIngrediente.add(new Produto ("Palmito", 0.00, 100));
        idIngrediente.add(new Produto ("Passas", 0.00, 100));
        idIngrediente.add(new Produto ("Peito de Peru", 0.00, 100));
        idIngrediente.add(new Produto ("Queijo Coalho", 0.00, 100));
        idIngrediente.add(new Produto ("Queijo Minas", 0.00, 100));
        idIngrediente.add(new Produto ("Presunto", 0.00, 100));
        idIngrediente.add(new Produto ("Salmão", 0.00, 100));
        idIngrediente.add(new Produto ("Tomate", 0.00, 100));
        idIngrediente.add(new Produto ("Tomate Seco", 0.00, 100));
    }
     
    public Produto_Ingrediente(String nome, float valor,
                               String Tipo_Ingrediente,int quantidade) {
        super(nome, valor, quantidade);
    }

    /**
     * @return the idIngrediente
     */
    public ArrayList<Produto> getIdIngrediente() {
        return idIngrediente;
    }

    /**
     * @param idIngrediente the idIngrediente to set
     */
    public void setIdIngrediente(ArrayList<Produto> idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    
    }
    
