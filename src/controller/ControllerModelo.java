/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Marca;
import modelo.Modelo;
import static view.TelaCliente.cbMarca;
import static view.TelaCliente.cbModelo;

/**
 *
 * @author Fernando
 */
public class ControllerModelo {
    
                 //METODO LISTAR
                public  int listarModelo(int id) throws Exception{
                    
                     
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8081/WebServiceChat/rest/servicosVeiculo/listarModelos/"+id+"";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                      //  Usuario u = new Usuario();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Modelo>>() {}.getType();
                      
                        
                        List<Modelo> listaModelo = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		        // DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Marca"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                          cbModelo.removeAllItems();
		         for (Modelo marcaRetorno : listaModelo) {  
                           // model.addRow(new Object[]{marcaRetorno.getId(), marcaRetorno.getNome()});  
                             cbModelo.addItem(marcaRetorno.getNome());
                             
		         } 
                        
                      return 1;
		      
                                    
                }
}
