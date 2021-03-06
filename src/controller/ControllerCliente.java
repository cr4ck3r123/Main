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
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Endereco;
import modelo.Cliente;
import modelo.Usuario;

import static view.TelaCliente.txtCep;

import static view.TelaUsuario.tblUsuario;

/**
 *
 * @author Fernando
 */
public class ControllerCliente {

    // METODO LISTAR
    public void listarCliente() throws Exception {

        HttpExemplo http = new HttpExemplo();
        String chamada = "https://app-api-restfull.herokuapp.com/api/listaCliente";
        String json = http.sendGet(chamada);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        Usuario u = new Usuario();
        java.lang.reflect.Type usuarioType = new TypeToken<List<Cliente>>() {
        }.getType();

        List<Cliente> listaCliente = gson.fromJson(json, usuarioType);

        /* Cria o model*/
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Nome", "Celular"});

        /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

        for (Cliente clienteRetorno : listaCliente) {
            model.addRow(new Object[]{clienteRetorno.getId(), clienteRetorno.getNome(), clienteRetorno.getCelular()});
        }
        /* Depois é só setar nosso model na tabela...*/

        view.TelaCliente.tblCliente.setModel(model);
        view.TelaCliente.tblCliente.getColumnModel().getColumn(0).setPreferredWidth(20);

    }

    //METODO INSERIR 
    public String inserir(Cliente dados) throws Exception {

        String msg = "deu";
        String chamada = "https://app-api-restfull.herokuapp.com/api/cliente";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        java.lang.reflect.Type usuarioType = new TypeToken<Cliente>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);
        System.out.print("----->"+json);
        http.POST(chamada, json);

        return msg;

    }

    //METODO INSERIR ENDERECO
    public String inserirEndereco(Endereco dados) throws Exception {

        String msg = "deu";
        String chamada = "http://localhost:8090/WebService/rest/endereco/adicionar";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<Cliente>() {
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

    //METODO DELETAR
    public void deletarCliente(Cliente dados) throws Exception {
        String chamada = "https://app-api-restfull.herokuapp.com/api/cliente";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        java.lang.reflect.Type usuarioType = new TypeToken<Cliente>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);
        System.out.print(json);
        
        http.DELETE(chamada, json);

    }

    //METODO PARA PEGAR DADOS POR ID CLIENTE
    public Cliente dadosId(int id) throws Exception {

        System.out.print(id);
        String chamada = "https://app-api-restfull.herokuapp.com/api/cliente/" + id + "";
        HttpExemplo http = new HttpExemplo();
        String json = http.sendGet(chamada);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        java.lang.reflect.Type usuarioType = new TypeToken<Cliente>() {
        }.getType();

        Cliente c = new Cliente();
        c = gson.fromJson(json, usuarioType);

        return c;
    }

    //EDITAR CLIENTE
    public String editar(Cliente dados) throws Exception {

        String msg = "deu";
        String chamada = "http://localhost:8090/WebService/rest/cliente/update/";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        java.lang.reflect.Type usuarioType = new TypeToken<Cliente>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);

        http.PUT(chamada, json);

        return msg;

    }

    //METODO PEGAR ULTIMO ID
    public int retornoid() throws Exception {

        String chamada = "https://app-api-restfull.herokuapp.com/api/listaCliente/";
        HttpExemplo http = new HttpExemplo();
        String json = http.sendGet(chamada);
        java.lang.reflect.Type usuarioType = new TypeToken<List<Cliente>>() {
        }.getType();
        // System.out.print(json);

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        List<Cliente> listaCliente = gson.fromJson(json, usuarioType);

        ArrayList<Integer> meuArrayList = new ArrayList<Integer>();
        int x = 0;
        
        for (Cliente clienteRetorno : listaCliente) {

            int id = clienteRetorno.getId();
            
            if (x < id) {
                x = id;
            }

        }
        System.out.print("Ultimo id" + x+"\n");
        return x;
    }

}
