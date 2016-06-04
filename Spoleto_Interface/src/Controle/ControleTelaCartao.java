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

/**
 *
 * @author Bernardo
 */
public class ControleTelaCartao {
    private Pedido pedido;
    private TelaCartao TelaCartao;
    
    public ControleTelaCartao(TelaCartao TelaCartao){
        this.pedido = new Pedido();
        this.TelaCartao = TelaCartao;
    }
    public void cancelar(){
        TelaCartao.setVisible(false);
    }
    
    public boolean imprimir(String senha){
        if(senha.equals("123")){
            
             try{ 
                 XMLEncoder xmlEncoder= null;
        try{ 
            
            xmlEncoder = new XMLEncoder ( new FileOutputStream ("relatorio.xml"));
            xmlEncoder.writeObject(pedido);
            
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
