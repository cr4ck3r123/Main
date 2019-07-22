/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Marca;
import view.TelaCliente;
import static view.TelaCliente.cbMarca;


/**
 *
 * @author Fernando
 */
public class ControllerMarca {
    
              //METODO LISTAR
                public  void listarMarca() throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "https://app-api-restfull.herokuapp.com/api/listaMarca";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                      //  Usuario u = new Usuario();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Marca>>() {}.getType();
                      
                        
                        List<Marca> listaMarca = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Marca"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                       
		         for (Marca marcaRetorno : listaMarca) {  
                           // model.addRow(new Object[]{marcaRetorno.getId(), marcaRetorno.getNome()});  
                             cbMarca.addItem(marcaRetorno.getNome());
		         }                                     
                }
                
                  //METODO PEGAR ID
                public int retornoid() throws Exception{
                    
                    String nome = cbMarca.getSelectedItem().toString();
                    String chamada = "https://app-api-restfull.herokuapp.com/api/marcaNome/"+nome+"/";
		    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                                      
                    Gson gson = new Gson();
                    
                     java.lang.reflect.Type marcaType = new TypeToken<Marca>() {}.getType();
                     Marca marca = new Marca();
                     
                      marca = gson.fromJson(json, marcaType);
                     int id = marca.getId();
                    return id;
                }
    
  
}
