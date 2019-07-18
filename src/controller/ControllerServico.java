/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Servico;
import modelo.Usuario;


/**
 *
 * @author Fernando
 */
public class ControllerServico {
    
    
     // METODO LISTAR
    public  void listar() throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8090/WebService/rest/servico/listar";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                        Servico s = new Servico();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Servico>>() {}.getType();
                      
                        List<Servico> listaServico = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"ID", "DESCRIÇÃO", "QTDE", "R$"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                         //SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                         
		         for (Servico servicoRetorno : listaServico) {  
                            model.addRow(new Object[]{servicoRetorno.getIdservicos(), servicoRetorno.getTipoServico(), servicoRetorno.getQtde(), servicoRetorno.getValor()});  
		         }  
		         /* Depois é só setar nosso model na tabela...*/  
                         
		      view.TelaServico.tblServico.setModel(model);
                       view.TelaServico.tblServico.getColumnModel().getColumn(0).setPreferredWidth(20);
                          
                   
                }
    
         // METODO LISTAR
    public  void listarServPecas() throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8090/WebService/rest/servico/listar";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                        Servico s = new Servico();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Servico>>() {}.getType();
                      
                        List<Servico> listaServico = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"ID", "DESCRIÇÃO", "QTDE", "R$"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                         //SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                         
		         for (Servico servicoRetorno : listaServico) {  
                            model.addRow(new Object[]{servicoRetorno.getIdservicos(), servicoRetorno.getTipoServico(), servicoRetorno.getQtde(), servicoRetorno.getValor()});  
		         }  
		         /* Depois é só setar nosso model na tabela...*/  
                         
		      view.TelaServPecas.tblServPec.setModel(model);
                       view.TelaServPecas.tblServPec.getColumnModel().getColumn(0).setPreferredWidth(20);
                          
                   
                }
                        
                //METODO INSERIR SERVICOS
    public String inserir(Servico dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8090/WebService/rest/servico/adicionar";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Servico>() {
	        }.getType();
	                                
                    String json = gson.toJson(dados, usuarioType);
                                  
                    http.POST(chamada, json);
                    
		return msg;
			
		}
    
    //METODO PEGAR ID SERVICO
                public String retornoid() throws Exception{
                    
                    String chamada = "http://localhost:8090/WebService/rest/servico/id/";
		    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    
                    return json;
                }
    
                //METODO PARA PEGAR DADOS POR ID SERVICO
                public Servico dadosId(int idServico) throws Exception{
                    
                    String chamada = "http://localhost:8090/WebService/rest/servico/pesquisar/"+idServico+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    Gson gson = new Gson();
                    
                    java.lang.reflect.Type usuarioType = new TypeToken<Servico>() {}.getType();
                    
                    Servico servico = new Servico();
                   servico = gson.fromJson(json, usuarioType);
                    
                  return servico;
                }
    
   //METODO DELETAR
                public void deletar(Usuario dados) throws Exception{
                    String chamada = "http://localhost:8090/WebService/rest/servico/delete/";
                    HttpExemplo http = new HttpExemplo();
                    Gson gson = new Gson();
                    java.lang.reflect.Type usuarioType = new TypeToken<Servico>() {
	        }.getType();
                    String json = gson.toJson(dados, usuarioType);
                     http.DELETE(chamada, json);
                    
                    
                }
}
