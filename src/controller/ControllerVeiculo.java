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
import modelo.Cliente;
import modelo.Endereco;
import modelo.Veiculo;
import view.TelaCliente;


/**
 *
 * @author Fernando
 */
public class ControllerVeiculo {
    
    
      //METODO INSERIR
    public String inserirVeiculo(Veiculo dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8081/WebService/rest/servicosVeiculo/inserirVeiculo/";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Veiculo>() {
	        }.getType();
	        
                    String json = gson.toJson(dados, usuarioType);
                    System.out.print(json);
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
    
    
               //METODO PARA PEGAR DADOS POR ID CLIENTE
                public Veiculo dadosId(int id) throws Exception{
                    
                    String chamada = "http://localhost:8081/WebService/rest/servicosVeiculo/pesqVeiculo/"+id+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    Gson gson = new Gson();
                    
                    java.lang.reflect.Type usuarioType = new TypeToken<Veiculo>() {}.getType();
                    
                   Veiculo v = new Veiculo();
                   v = gson.fromJson(json, usuarioType);
                    
                  return v;
                }
                
              //METODO PARA PEGAR DADOS POR ID VEICULO
                public Veiculo dadosIdVeiculo(int id) throws Exception{
                    
                    String chamada = "http://localhost:8081/WebService/rest/servicosVeiculo/pVeiculo/"+id+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    Gson gson = new Gson();
                    
                    java.lang.reflect.Type usuarioType = new TypeToken<Veiculo>() {}.getType();
                    
                   Veiculo v = new Veiculo();
                   v = gson.fromJson(json, usuarioType);
                    
                  return v;
                }
                
                
//                  //METODO LISTAR
//                public  void listarVeiculo(int id) throws Exception{
//                    
//                        HttpExemplo http = new HttpExemplo();
//			String chamada = "http://localhost:8081/WebServiceChat/rest/servicos2/listarVeiculo/"+id+"";
//			String json = http.sendGet(chamada);
//			Gson gson = new Gson();
//                        
//                      //  Usuario u = new Usuario();
//                        java.lang.reflect.Type usuarioType = new TypeToken<List<Veiculo>>() {}.getType();
//                      
//                        List<Veiculo> listaVeiculo = gson.fromJson(json, usuarioType);
//                        
//                       
//		         /* Cria o model*/  
//		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"idveiculo", "Marca", "Modelo", "Ano"});
//                         
//		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
//                        // SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
//                         
//		         for (Veiculo veiculoRetorno : listaVeiculo) {  
//                            model.addRow(new Object[]{veiculoRetorno.getIdveiculo(), veiculoRetorno.getMarca(), veiculoRetorno.getModelo(), veiculoRetorno.getAno()});  
//		         }  
//		         /* Depois é só setar nosso model na tabela...*/  
//                         
//		                  TelaCliente.tbVeiculo.setModel(model);
//                                  TelaCliente.tbVeiculo.getColumnModel().getColumn(0).setPreferredWidth(20);
//                          
//                        // JScrollPane p = new JScrollPane(tblUsuario);
//                        
//                        
//                       /* for (Usuario usuarioRetorno : listaUsuario) {
//                       
//                        
//                        System.out.print(usuarioRetorno.getId()+"\n");
//                        System.out.print(usuarioRetorno.getLogin()+"\n");
//                        System.out.print(usuarioRetorno.getSenha()+"\n");
//                        System.out.print(usuarioRetorno.getNome()+"\n");
//                        System.out.print(usuarioRetorno.getEmail()+"\n");
//                        System.out.print("--------------------------\n");                    
//                    }*/
//                                    
//                }
                
                
                 //METODO PEGAR ID
                public String retornoid() throws Exception{
                    
                    String chamada = "http://localhost:8081/WebService/rest/servicosVeiculo/idVeiculo/";
		    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    
                    return json;
                }
                
                
                 //METODO LISTAR VEICULO
                public  void listarVeiculo(int idVeiculo) throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8081/WebService/rest/servicosVeiculo/listarVeiculo/"+idVeiculo+"";
			String json = http.sendGet(chamada);
			Gson gson = new Gson();
               
                        java.lang.reflect.Type usuarioType = new TypeToken<List<Veiculo>>() {}.getType();
                      
                        List<Veiculo> listaVeiculo = gson.fromJson(json, usuarioType);
                        
                       
		         /* Cria o model*/  
		         DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Marca", "Modelo", "Placa"});
                         
		         /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/  
                        // SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                         
		         for (Veiculo veiculo : listaVeiculo) {  
                            model.addRow(new Object[]{veiculo.getIdveiculo(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca()});  
		         }  
		         /* Depois é só setar nosso model na tabela...*/  
                         
		          TelaCliente.tbVeiculo.setModel(model);
                          TelaCliente.tbVeiculo.getColumnModel().getColumn(0).setPreferredWidth(20);
                          
                       
                }
                
                  //EDITAR VEICULO
                public String editar(Veiculo dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8081/WebService/rest/servicosVeiculo/editarVeiculo/";
			HttpExemplo http = new HttpExemplo();
			Gson gson = new Gson();
						
			java.lang.reflect.Type usuarioType = new TypeToken<Veiculo>() {
	        }.getType();
	        
                    String json = gson.toJson(dados, usuarioType);
                    
                    http.PUT(chamada, json);
			
			return msg;
			
		}
                
                
   
}
