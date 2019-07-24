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
        String chamada = "https://app-api-restfull.herokuapp.com/api/veiculo";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<Veiculo>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);
        System.out.print(json);
        http.POST(chamada, json);

        return msg;

    }

    //METODO PARA PEGAR DADOS POR ID CLIENTE
    public Veiculo dadosId(int idPessoa) throws Exception {

        String chamada = "https://app-api-restfull.herokuapp.com/api/listaVeiculo";
        HttpExemplo http = new HttpExemplo();
        String json = http.sendGet(chamada);
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<List<Veiculo>>() {
        }.getType();

        List<Veiculo> listaVeiculo = gson.fromJson(json, usuarioType);
       
        System.out.print(idPessoa);
        Veiculo v = new Veiculo();       
        for (Veiculo veiculoRetorno : listaVeiculo) {
                int x = veiculoRetorno.getPessoa_idpessoa();
                System.out.print(x);
             if ( idPessoa == x ) {
                veiculoRetorno.getIdveiculo();
                veiculoRetorno.getMarca();
                veiculoRetorno.getModelo();
                veiculoRetorno.getAno();
                veiculoRetorno.getPlaca();
                veiculoRetorno.getKm();
                veiculoRetorno.getCor();
                return v = veiculoRetorno;
            }

            
        }
        
        return v;
        
    }
        //METODO PARA PEGAR DADOS POR ID VEICULO
    public Veiculo dadosIdVeiculo(int id) throws Exception {

        String chamada = "http://localhost:8090/WebService/rest/veiculo/idVeiculo/" + id + "";
        HttpExemplo http = new HttpExemplo();
        String json = http.sendGet(chamada);
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<Veiculo>() {
        }.getType();

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
    public String retornoid() throws Exception {

        String chamada = "http://localhost:8090/WebService/rest/veiculo/id/";
        HttpExemplo http = new HttpExemplo();
        String json = http.sendGet(chamada);

        return json;
    }

    //METODO LISTAR VEICULO
    public void listarVeiculo(int idPessoa) throws Exception {

        HttpExemplo http = new HttpExemplo();
        String chamada = "https://app-api-restfull.herokuapp.com/api/listaVeiculo";
        String json = http.sendGet(chamada);
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<List<Veiculo>>() {
        }.getType();

        List<Veiculo> listaVeiculo = gson.fromJson(json, usuarioType);

        /* Cria o model*/
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Marca", "Modelo", "Placa"});

        /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/
                        // SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        model.setNumRows(0);
        for (Veiculo veiculo : listaVeiculo) {

            if (idPessoa == veiculo.getPessoa_idpessoa()) {
                model.addRow(new Object[]{veiculo.getIdveiculo(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca()});
            }
        }
        /* Depois é só setar nosso model na tabela...*/

        TelaCliente.tbVeiculo.setModel(model);
        TelaCliente.tbVeiculo.getColumnModel().getColumn(0).setPreferredWidth(20);

    }

    //EDITAR VEICULO
    public String editar(Veiculo dados) throws Exception {

        String msg = "deu";
        String chamada = "http://localhost:8090/WebService/rest/veiculo/editar/";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new Gson();

        java.lang.reflect.Type usuarioType = new TypeToken<Veiculo>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);

        http.PUT(chamada, json);

        return msg;

    }

}
