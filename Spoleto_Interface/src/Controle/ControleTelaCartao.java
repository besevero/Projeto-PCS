/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaCartao;
import View.TelaNotaFiscal;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleTelaCartao {
    private Pedido pedido;
    private ArrayList<Pedido> pedidos = new ArrayList();
    private TelaCartao TelaCartao;
    
    public ControleTelaCartao(TelaCartao TelaCartao){
        this.pedido = new Pedido();
        this.TelaCartao = TelaCartao;
    }
    public void cancelar(){
        TelaCartao.setVisible(false);
    }
    
    public boolean imprimir(String senha){
        pedidos.add(pedido);
        if(senha.equals("123")){
            
             try{ 
                 XMLEncoder xmlEncoder= null;
        try{ 
            
            xmlEncoder = new XMLEncoder ( new FileOutputStream ("relatorio.xml"));
            for(int i = 0 ; i<pedidos.size() ; i++){
                for(int j = 0 ; j<pedidos.get(i).getPratos().size() ; j++){
                System.out.print(pedidos.get(i).getPratos().get(j).getNome());
                    xmlEncoder.writeObject(pedidos.get(i).getPratos().get(j));
            }        
        }
        }
        finally{
            if(xmlEncoder != null)
                xmlEncoder.close();
            
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            
        }
        TelaNotaFiscal TelaNotaFiscal = new TelaNotaFiscal(pedido);
        TelaNotaFiscal.setVisible(true);
        TelaCartao.setVisible(false);    
        
        return true;
        }
        else 
            return false;
        
    }
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TelaCartao getTelaCartao() {
        return TelaCartao;
    }

    public void setTelaCartao(TelaCartao TelaCartao) {
        this.TelaCartao = TelaCartao;
    }
}
