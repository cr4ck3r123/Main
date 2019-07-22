/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
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
        String chamada = "https://app-api-restfull.herokuapp.com/api/endereco";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<Endereco>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);

        http.POST(chamada, json);

        return msg;

    }

    //METODO PEGA ENDEREÇO DA API 
    public Endereco pegaEndereco(String txtCep) throws Exception {

        HttpExemplo http = new HttpExemplo();
        String chamada = "https://viacep.com.br/ws/" + txtCep + "/json/";
        String json = http.sendGet(chamada);
        Gson gson = new Gson();

        //  Usuario u = new Usuario();
        java.lang.reflect.Type usuarioType = new TypeToken<Endereco>() {
        }.getType();

                      // System.out.print(json);
        Endereco cep = new Endereco();
        cep = gson.fromJson(json, usuarioType);
        System.out.print(cep.getBairro());

        return cep;
    }

    //METODO PARA PEGAR DADOS ENDEREÇO
    public Endereco dadosId(int id) throws Exception {
         System.out.print("Dados id endereco"+id+"\n");
      
         HttpExemplo http = new HttpExemplo();
         String chamada = "https://app-api-restfull.herokuapp.com/api/listaEndereco";
         String json = http.sendGet(chamada);
        java.lang.reflect.Type enderecoType = new TypeToken<List<Endereco>>() {
        }.getType();
       
        Gson gson = new Gson();
        List<Endereco> listaEndereco = gson.fromJson(json, enderecoType);
        
         
     
        for (Endereco enderecoRetorno : listaEndereco) {

            int getIdPessoa = enderecoRetorno.getPessoa_idpessoa();

            if (getIdPessoa == id) {
                id = enderecoRetorno.getId();
                chamada = "https://app-api-restfull.herokuapp.com/api/endereco/" + id + "";
                json = http.sendGet(chamada);
              
                 Endereco e = new Endereco();
                   java.lang.reflect.Type endereco = new TypeToken<Endereco>() {
        }.getType();
                 e = gson.fromJson(json, endereco);
                 return e;
            } 
        }
         
    return null;
    }

    //METODO PEGAR ID ENDERECO
    public String retornoid() throws Exception {

        String chamada = "https://app-api-restfull.herokuapp.com/api/listaEndereco/";
       HttpExemplo http = new HttpExemplo();
        String json = http.sendGet(chamada);
        java.lang.reflect.Type usuarioType = new TypeToken<List<Endereco>>() {
        }.getType();
                       // System.out.print(json);

        Gson gson = new Gson();
        List<Endereco> listaEndereco = gson.fromJson(json, usuarioType);
           
        ArrayList<Integer> meuArrayList = new ArrayList<Integer>();
        int x=0;
        for (Endereco enderecoRetorno : listaEndereco) {                   
           int id = enderecoRetorno.getId();
           
           if(x < id){
               x=id;
           }          
          
        }
        System.out.print("Ultimo id"+x); 
      
        return String.valueOf(x+1);
       
    }

    //EDITAR ENDEREÇO

    public String editar(Endereco dados) throws Exception {

        String msg = "deu";
        String chamada = "http://localhost:8090/WebService/rest/endereco/editar/";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<Endereco>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);

        http.PUT(chamada, json);

        return msg;

    }

    //METODO LISTAR ENDEREÇO
    public void listarEndereco(int idPessoa) throws Exception {

        HttpExemplo http = new HttpExemplo();
        String chamada = "https://app-api-restfull.herokuapp.com/api/endereco/" + idPessoa + "";
        String json = http.sendGet(chamada);
        Gson gson = new Gson();
       
        java.lang.reflect.Type enderecoType = new TypeToken<Endereco>() {
        }.getType();

        Endereco Endereco = gson.fromJson(json, enderecoType);

        /* Cria o model*/
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Rua", "Numero", "Bairro"});

        /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/
                        // SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        
            model.addRow(new Object[]{Endereco.getId(), Endereco.getLogradouro(), Endereco.getNumero(), Endereco.getBairro()});
        
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
