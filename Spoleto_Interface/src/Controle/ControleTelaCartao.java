/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto;
import View.TelaCartao;
import View.TelaNotaFiscal;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
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
    private ArrayList<Pedido> pedidoLido;
    
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
           
            xmlEncoder.writeObject(pedidos);
            
            /*for(int i = 0 ; i<pedidos.size() ; i++){
                for(int j = 0 ; j<pedidos.get(i).getPratos().size() ; j++){
                System.out.print(pedidos.get(i).getPratos().get(j).getNome());
                    xmlEncoder.writeObject(pedidos.get(i).getPratos().get(j));
            }*/
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
    public void lerXML(){
      try{
          XMLDecoder xmlDecoder = null;
          try{
            xmlDecoder = new XMLDecoder(
                    new FileInputStream("relatorio.xml"));
            pedidoLido = (ArrayList<Pedido>) xmlDecoder.readObject();
            
          }finally{
                    if(xmlDecoder != null)
                        xmlDecoder.close();
                    }
          }catch(IOException e){
              System.out.println(e.getMessage());
          }
      for(int i = 0; i<pedidoLido.size();i++){
                System.out.println(pedidoLido.get(i).getPratos().get(i).getNome()+ " - " + pedidoLido.get(i).getPratos().get(i).getQuantidade());
            }
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
