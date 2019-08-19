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
import modelo.Estoque;
import modelo.Servico;


/**
 *
 * @author Fernando
 */
public class ControllerEstoque {
    
    //METODO INSERIR SERVICOS
    public String inserir(Estoque dados) throws Exception {
			
			String msg = "deu";
			String chamada = "https://app-api-restfull.herokuapp.com/api/estoque";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Estoque>() {
	        }.getType();
	                                
                    String json = gson.toJson(dados, usuarioType);
                                  
                    http.POST(chamada, json);
                    
		return msg;
			
		}
    
               //METODO PEGAR ID SERVICO
                public String retornoid() throws Exception{
                    
                    String chamada = "http://localhost:8090/WebService/rest/estoque/id/";
		    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    
                    return json;
                }
    
                
                 // METODO LISTAR
    public  void listar() throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "https://app-api-restfull.herokuapp.com/api/listaEstoque";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                        Estoque estoque = new Estoque();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Estoque>>() {}.getType();
                      
                        List<Estoque> listaEstoque = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"ID", "DESCRIÇÃO", "QTDE", "R$"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                         //SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                         
		         for (Estoque estoqueRetorno : listaEstoque) {  
                            model.addRow(new Object[]{estoqueRetorno.getIdestoques(), estoqueRetorno.getDescricao(), estoqueRetorno.getQtde(), estoqueRetorno.getValor()});  
		         }  
		         /* Depois é só setar nosso model na tabela...*/  
                         
		      view.TelaEstoque.tblEstoque.setModel(model);
                      view.TelaEstoque.tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(20);
                          
                   
                }
    
        // METODO LISTAR
    public  void listarServEstoque() throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8090/WebService/rest/estoque/listar";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                        Estoque estoque = new Estoque();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Estoque>>() {}.getType();
                      
                        List<Estoque> listaEstoque = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"ID", "DESCRIÇÃO", "QTDE", "R$"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                         //SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                         
		         for (Estoque estoqueRetorno : listaEstoque) {  
                            model.addRow(new Object[]{estoqueRetorno.getIdestoques(), estoqueRetorno.getDescricao(), estoqueRetorno.getQtde(), estoqueRetorno.getValor()});  
		         }  
		         /* Depois é só setar nosso model na tabela...*/  
                         
		      view.TelaServPecas.tblServPec.setModel(model);
                      view.TelaServPecas.tblServPec.getColumnModel().getColumn(0).setPreferredWidth(20);
                          
                   
                }
    
    
      //METODO PARA PEGAR DADOS POR ID 
                public Estoque dadosId(int id) throws Exception{
                    
                    String chamada = "http://localhost:8090/WebService/rest/estoque/pesquisar/"+id+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    Gson gson = new Gson();
                    
                    java.lang.reflect.Type usuarioType = new TypeToken<Estoque>() {}.getType();
                    
                    Estoque estoque = new Estoque();
                   estoque = gson.fromJson(json, usuarioType);
                    
                  return estoque;
                }
}
