/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

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
public class Arquivos {
    protected ArrayList escrever;
    protected String file;
    public Arquivos(){}
    
    public Arquivos(String file, ArrayList escrever){
        this.file = file;
        this.escrever = escrever;
    }
    
    public void imprimir(){
        
             try{ 
                 XMLEncoder xmlEncoder= null;
        try{ 
            
            xmlEncoder = new XMLEncoder ( new FileOutputStream (file));
           
            xmlEncoder.writeObject(escrever);
        
        }
        finally{
            if(xmlEncoder != null)
                xmlEncoder.close();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            
        }
    }
    public ArrayList lerXML(){
        ArrayList lido = new ArrayList();
      try{
          XMLDecoder xmlDecoder = null;
          try{
            xmlDecoder = new XMLDecoder(
                    new FileInputStream(file));
            lido = (ArrayList) xmlDecoder.readObject();
            
          }finally{
                    if(xmlDecoder != null)
                        xmlDecoder.close();
                    }
          }catch(IOException e){
              System.out.println(e.getMessage());
          }
      return lido;
      }
    
}
