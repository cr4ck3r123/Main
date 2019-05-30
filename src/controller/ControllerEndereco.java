/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Endereco;
import view.TelaCliente;
import static view.TelaCliente.txtCep;


/**
 *
 * @author Fernando
 */
public class ControllerEndereco {
    
    
    //INSERE ENDERECO
    		public String inserirEndereco(Endereco dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8081/WebService/rest/servicosEndereco/addEndereco";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Endereco>() {
	        }.getType();
	        
                    String json = gson.toJson(dados, usuarioType);
                 
                    http.POST(chamada, json);
	
			return msg;
			
		}
    
                 //METODO PEGA ENDEREÇO DA API 
                public  Endereco pegaEndereco() throws Exception{
                    
                        String txtcep = txtCep.getText();
                        HttpExemplo http = new HttpExemplo();
			String chamada = "https://viacep.com.br/ws/"+txtcep+"/json/";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                      //  Usuario u = new Usuario();
                        java.lang.reflect.Type usuarioType = new TypeToken<Endereco>() {}.getType();
                                           
                      // System.out.print(json);
		                                             
                     Endereco cep = new Endereco();
                     cep = gson.fromJson(json, usuarioType);
                     System.out.print(cep.getBairro());
		                  
                          
                  
                    return cep;                
                }
                
                 //METODO PARA PEGAR DADOS ENDEREÇO
                public Endereco dadosId(int id) throws Exception{
                    
                    String chamada = "http://localhost:8081/WebService/rest/servicosEndereco/pesqEndereco/"+id+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    Gson gson = new Gson();
                    java.lang.reflect.Type usuarioType = new TypeToken<Endereco>() {}.getType();
                    
                    System.out.print(chamada);
                    Endereco e = new Endereco();
                    e = gson.fromJson(json, usuarioType);
                  
                  return e;
                }
                
                //METODO PEGAR ID ENDERECO
                public String retornoid() throws Exception{
                    
                    String chamada = "http://localhost:8081/WebService/rest/servicosEndereco/idEndereco/";
		    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    
                    return json;
                }
                  //EDITAR ENDEREÇO
                public String editar(Endereco dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8081/WebService/rest/servicosEndereco/editarEndereco/";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Endereco>() {
	        }.getType();
	        
                    String json = gson.toJson(dados, usuarioType);
                    
                    http.PUT(chamada, json);
			
			return msg;
			
		}
                
                 //METODO LISTAR ENDEREÇO
                public  void listarEndereco(int idEndereco) throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8081/WebService/rest/servicosEndereco/listaDeEndereco/"+idEndereco+"";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
                        
                      //  Usuario u = new Usuario();
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Endereco>>() {}.getType();
                      
                        List<Endereco> listaEndereco = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Rua", "Numero", "Bairro"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                        // SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                         
		         for (Endereco endereco : listaEndereco) {  
                            model.addRow(new Object[]{endereco.getId(), endereco.getLogradouro(), endereco.getNumero(), endereco.getBairro()});  
		         }  
		         /* Depois é só setar nosso model na tabela...*/  
                         
		          TelaCliente.tbEndereco.setModel(model);
                          TelaCliente.tbEndereco.getColumnModel().getColumn(0).setPreferredWidth(20);
                          
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
    
                
}
  
