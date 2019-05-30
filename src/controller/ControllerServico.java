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
    public  void listarCliente() throws Exception{
                    
                        HttpExemplo http = new HttpExemplo();
			String chamada = "http://localhost:8081/WebServiceChat/rest/servicos/listarServicos";
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
    
                        
                //METODO INSERIR SERVICOS
    public String inserir(Servico dados) throws Exception {
			
			String msg = "deu";
			String chamada = "http://localhost:8081/WebServiceChat/rest/servicos/addServico";
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
                    
                    String chamada = "http://localhost:8081/WebServiceChat/rest/servicos/idServico/";
		    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    
                    return json;
                }
    
    //METODO PARA PEGAR DADOS POR ID SERVICO
                public Cliente dadosId(int id) throws Exception{
                    
                    String chamada = "http://localhost:8081/WebServiceChat/rest/servicosCliente/pesqPessoa/"+id+"";
                    HttpExemplo http = new HttpExemplo();
                    String json = http.sendGet(chamada);
                    Gson gson = new Gson();
                    
                    java.lang.reflect.Type usuarioType = new TypeToken<Cliente>() {}.getType();
                    
                    Cliente c = new Cliente();
                   c = gson.fromJson(json, usuarioType);
                    
                  return c;
                }
    
}
