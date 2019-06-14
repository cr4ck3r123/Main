/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Fernando
 */
public class Formatador {
    
    public float converterVirgulaParaPonto(String pString){
        
        String retorno = new String();
        int tamanhoString = pString.length();
        for(int i =0; i < tamanhoString; i++){
            if(pString.charAt(i) == ','){
                retorno += '.';
            }else{
                retorno += pString.charAt(i);
            }
             
            
        }  
        
        return Float.parseFloat(retorno);
    }
    
    public int pegarValor(String num){
        
       String retorno = new String(num);
        int tamanhoString = retorno.indexOf("-");
        System.out.println();
       
      String i = retorno.substring(0, tamanhoString);        
        return Integer.parseInt(i);
    }
    
    
}
