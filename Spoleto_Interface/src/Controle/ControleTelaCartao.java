/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaCartao;
import View.TelaNotaFiscal;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleTelaCartao {
    private Pedido pedido;
    private ArrayList<Pedido> pedidos = new ArrayList();
    private TelaCartao TelaCartao;
    private ArrayList<Pedido> pedidoLido;
    private Arquivos persistencia = new Arquivos("relatorio.xml", pedidos);
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
            persistencia.imprimir();

        TelaNotaFiscal TelaNotaFiscal = new TelaNotaFiscal(pedido);
        TelaNotaFiscal.setVisible(true);
        TelaCartao.setVisible(false);    
        
        return true;
        }
        else 
            return false;
        
    }
    public void lerXML(){
      persistencia.lerXML();
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
