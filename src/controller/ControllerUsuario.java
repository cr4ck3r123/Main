/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import static view.TelaUsuario.tblUsuario;

/**
 *
 * @author Fernando
 */
public class ControllerUsuario {
    
    
    	//METODO LOGAR
		public int logar(Usuario dados) throws Exception {			
			int i = 0;
			String login = dados.getLogin();
			String senha = dados.getSenha();			
			String chamada = "http://localhost:8090/WebService/rest/usuario/autenticar/"+login+"/"+senha;
			HttpExemplo http = new HttpExemplo();
		    
		    String json = http.sendGet(chamada);	
		  		
		//Gson gson = new Gson();
		//gson.toJson(resposta);
		    if(json.equals("Usuario logado com sucesso.")) {
		    System.out.print(json);
		    i = 1;
		    }else {
		    	i = 0;
		    	System.out.print("Usuario invalido");
		    }
		String msg= "";
		try {							
			if(json.equals(true)) {
			System.out.print(json);
			}
						
		} catch (Exception e) {
			
		}
		return i;
	}
                    
                
               //METODO LISTAR
                public  void listarUsuario() throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8090/WebService/rest/usuario/listarUsuario";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                      //  Usuario u = new Usuario();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Usuario>>() {}.getType();
                      
                        List<Usuario> listaUsuario = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Nome", "Login"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
		         for (Usuario usuarioRetorno : listaUsuario) {  
		             model.addRow(new Object[]{usuarioRetorno.getId(), usuarioRetorno.getNome(), usuarioRetorno.getLogin()});  
		         }  
		         /* Depois é só setar nosso model na tabela...*/  
                         
		         tblUsuario.setModel(model);
                         tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(20);
                        // JScrollPane p = new JScrollPane(tblUsuario);
                        
                        
                       /* for (Usuario usuarioRetorno : listaUsuario) {
                       
                        
                        System.out.print(usuarioRetorno.getId()+"\n");
                        System.out.print(usuarioRetorno.getLogin()+"\n");
                        System.out.print(usuarioRetorno.getSenha()+"\n");
                        System.out.print(usuarioRetorno.getNome()+"\n");
                        System.out.print(usuarioRetorno.getEmail()+"\n");
                        System.out.print("--------------------------\n");                    
                    }*/
                                    
                }
                
                
                //METODO PARA PEGAR DADOS POR ID
                public Usuario dadosId(int id) throws Exception{
                    
                    String chamada = "http://localhost:8090/WebService/rest/usuario/pesquisar/"+id+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    Gson gson = new Gson();
                    
                    java.lang.reflect.Type usuarioType = new TypeToken<Usuario>() {}.getType();
                    
                    Usuario u = new Usuario();
                    u = gson.fromJson(json, usuarioType);
                    
                  return u;
                }
                
                
                //METODO DELETAR
                public void deletarUsuario(int id) throws Exception{
                    String chamada = "http://localhost:8090/WebService/rest/usuario/delete/"+id+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendDelete(chamada);
                    
                    
                }
                
                
                //METODO PEGAR ID
                public String retornoid() throws Exception{
                    
                    String chamada = "http://localhost:8090/WebService/rest/usuario/idUsuario/";
		    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    
                    return json;
                }
                
                
                //METODO INSERIR
		public String inserir(Usuario dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8090/WebService/rest/usuario/adicionar";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Usuario>() {
	        }.getType();
	        
                    String json = gson.toJson(dados, usuarioType);
                    
                    http.POST(chamada, json);
		  //  http.sendPost(chamada, json, "POST");
	   /*
		   HttpExemplo http = new HttpExemplo();
	        Gson g = new Gson();
	        Usuario u = new Usuario();
	        Type usuarioType = new TypeToken<Usuario>() {
	        }.getType();
	        
	        u.setLogin("programatche");
	        u.setEmail("aaa.com");
	        u.setSenha("4312");
	        String json = g.toJson(u, usuarioType);
	        String url = "http://localhost:8080/WebServiceChat/rest/servicos/inserir/";
	        
	      http.sendPost(url, json, "PUT");
			*/
			return msg;
			
		}
                
                
                //EDITAR
                public String editar(Usuario dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8090/WebService/rest/usuario/update/";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Usuario>() {
	        }.getType();
	        
                    String json = gson.toJson(dados, usuarioType);
                    
                    http.PUT(chamada, json);
		  //  http.sendPost(chamada, json, "POST");
	   /*
		   HttpExemplo http = new HttpExemplo();
	        Gson g = new Gson();
	        Usuario u = new Usuario();
	        Type usuarioType = new TypeToken<Usuario>() {
	        }.getType();
	        
	        u.setLogin("programatche");
	        u.setEmail("aaa.com");
	        u.setSenha("4312");
	        String json = g.toJson(u, usuarioType);
	        String url = "http://localhost:8080/WebServiceChat/rest/servicos/inserir/";
	        
	      http.sendPost(url, json, "PUT");
			*/
			return msg;
			
		}
                
   
}
