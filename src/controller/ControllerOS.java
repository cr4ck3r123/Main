/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.OS;
import modelo.Veiculo;
import net.proteanit.sql.DbUtils;
import view.TelaCliente;
import view.TelaOrdemServico;

/**
 *
 * @author Fernando
 */
public class ControllerOS {

    //METODO LISTAR
    public void listar() throws Exception {

        HttpExemplo http = new HttpExemplo();
        String chamada = "http://localhost:8090/WebService/rest/os/listar";
        String json = http.sendGet(chamada);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        //  Usuario u = new Usuario();
        java.lang.reflect.Type usuarioType = new TypeToken<List<Funcionario>>() {
        }.getType();

        List<Funcionario> listaFuncionario = gson.fromJson(json, usuarioType);

        /* Cria o model*/
        
        /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/
        for (Funcionario funRetorno : listaFuncionario) {
            // model.addRow(new Object[]{marcaRetorno.getId(), marcaRetorno.getNome()});  
            TelaOrdemServico.cbfuncionario.addItem(funRetorno.getNome());
        }
      
        
    }

    //Metodo para pesquisar clientes pelo nome com filtro
    public void listarCliente(String nome) throws Exception {

        HttpExemplo http = new HttpExemplo();
        String chamada = "http://localhost:8090/WebService/rest/os/listarCliente/"+nome+"";
       
      
            String json = http.sendGet(chamada);
              Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        java.lang.reflect.Type usuarioType = new TypeToken<List<Cliente>>() {
        }.getType();
        List<Cliente> listaCliente = gson.fromJson(json, usuarioType);
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"ID", "NOME"});
          
        for (Cliente clienteRetorno : listaCliente) {  
                            model.addRow(new Object[]{clienteRetorno.getId(), clienteRetorno.getNome()});  
		         }  
        view.TelaOrdemServico.tblClientesOs.setModel(model);
        view.TelaOrdemServico.tblClientesOs.getColumnModel().getColumn(0).setPreferredWidth(20);
       
      
   //     JOptionPane.showMessageDialog(null, e);

    }
    
    //LISTA VEICULOS DO CLIENTE
    public void listarVeiculo(int id) throws Exception{
        HttpExemplo http = new HttpExemplo();
        String chamada = "http://localhost:8090/WebService/rest/os/listarModelo/"+id+"";
        String json = http.sendGet(chamada);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        
         //  Usuario u = new Usuario();
        java.lang.reflect.Type usuarioType = new TypeToken<List<Veiculo>>() {
        }.getType();

        List<Veiculo> listaVeiculo = gson.fromJson(json, usuarioType);

        /* Cria o model*/
        
        /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/
        TelaOrdemServico.cbVeiculo.removeAllItems();        
        for (Veiculo veiculoRetorno : listaVeiculo) {
            // model.addRow(new Object[]{marcaRetorno.getId(), marcaRetorno.getNome()});  
            TelaOrdemServico.cbVeiculo.addItem(veiculoRetorno.getIdveiculo()+"-"+ veiculoRetorno.getModelo());
        }
        
     
    }
    
    //SETA ID
    public String setarId() throws Exception{
        HttpExemplo http = new HttpExemplo();
        String chamada = "http://localhost:8090/WebService/rest/os/id/";
        String json = http.sendGet(chamada);
   
        return json;     
        
    }

    //RETORNA ID FUNCIONARIO OS
    public String idfuncionario(String nome) throws Exception{
        HttpExemplo http = new HttpExemplo();
        String chamada = "http://localhost:8090/WebService/rest/os/idFuncionario/"+nome+"";
        String json = http.sendGet(chamada);
        
        return json;
    }
    
    
    
    //INSERIR OS
    public String inserir_os(OS os) throws Exception{
        HttpExemplo http = new HttpExemplo();
        String chamada = "http://localhost:8090/WebService/rest/os/adicionar/";
        Gson gson = new Gson();			
			java.lang.reflect.Type usuarioType = new TypeToken<OS>() {
	        }.getType();
	        
                    String json = gson.toJson(os, usuarioType);
                     
                     http.POST(chamada, json);
        
   
    return json;
}
}