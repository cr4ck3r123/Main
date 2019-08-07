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
import modelo.Funcionario;

/**
 *
 * @author Fernando
 */
public class ControllerFuncionario {

    //METODO INSERIR 
    public String inserir(Funcionario dados) throws Exception {

        String msg = "deu";
        String chamada = "https://app-api-restfull.herokuapp.com/api/funcionario";
        HttpExemplo http = new HttpExemplo();
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        java.lang.reflect.Type usuarioType = new TypeToken<Funcionario>() {
        }.getType();

        String json = gson.toJson(dados, usuarioType);

        http.POST(chamada, json);

        return msg;

    }

    public Funcionario dadosId(int id) {
        return null;
    }

    //METODO PEGAR ID FUNCIONARIO
    public Funcionario dadosFunId(int id) throws Exception {

        String chamada = "https://app-api-restfull.herokuapp.com/api/funcionario/" + id + "";
        HttpExemplo http = new HttpExemplo();
        String json = http.sendGet(chamada);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        java.lang.reflect.Type usuarioType = new TypeToken<Funcionario>() {
        }.getType();

        Funcionario fun = new Funcionario();
        fun = gson.fromJson(json, usuarioType);

        return fun;
    }

    // METODO LISTAR
    public void listarFuncionario() throws Exception {

        HttpExemplo http = new HttpExemplo();
        String chamada = "https://app-api-restfull.herokuapp.com/api/listaFuncionario";
        String json = http.sendGet(chamada);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        Funcionario fun = new Funcionario();
        java.lang.reflect.Type usuarioType = new TypeToken<List<Funcionario>>() {
        }.getType();

        List<Funcionario> listaFuncionario = gson.fromJson(json, usuarioType);

        /* Cria o model*/
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Id", "Nome", "Celular"});

        /* Itera a lista, criando o objeto "Cliente" apenas para pegar suas Strings.*/
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

        for (Funcionario funcionarioRetorno : listaFuncionario) {
            model.addRow(new Object[]{funcionarioRetorno.getIdfuncionario(), funcionarioRetorno.getNome(), funcionarioRetorno.getCelular()});
        }
        /* Depois é só setar nosso model na tabela...*/

        view.TelaFuncionario.tblFuncionario.setModel(model);
        view.TelaFuncionario.tblFuncionario.getColumnModel().getColumn(0).setPreferredWidth(20);

    }

    public void editar(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
