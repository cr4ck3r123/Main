/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerCliente;
import controller.ControllerEndereco;
import controller.ControllerFuncionario;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Endereco;
import modelo.Funcionario;


/**
 *
 * @author Fernando
 */
public class TelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public int btnInsert = 0;

    public TelaFuncionario() {
        initComponents();

        tabelas.setEnabledAt(1, false);

    }

    //SETAR CAMPOS 
    void setarCampos() throws Exception {

        tabelas.setEnabledAt(0, true);
        tabelas.setEnabledAt(1, true);
        
        ativarTodosCampos();
        int row = tblFuncionario.getSelectedRow();
        int id = Integer.parseInt(tblFuncionario.getValueAt(row, 0).toString());
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print(id);
       
        Funcionario fun = new Funcionario();
        ControllerFuncionario controlFun = new ControllerFuncionario();
        fun = controlFun.dadosFunId(id);
        txtId.setText("" + id);
        txtNome.setText(fun.getNome());
        txtDatNasc.setText(fmt.format(fun.getDatanascimento()));
        txtRG.setText(fun.getRg());
        txtCpf.setText(fun.getCpf());
        txtTelefone.setText(fun.getTelefone());
        txtCelular.setText(fun.getCelular());
        txtEmail.setText(fun.getEmail());
        txtFuncao.setText(fun.getFuncao());
        txtPesq.setEnabled(false);
        btnPesq.setEnabled(false);
        tblFuncionario.setEnabled(true);

        Endereco e = new Endereco();
        ControllerEndereco controllerEndereco = new ControllerEndereco();
        e = controllerEndereco.dadosId(id);

        idEnd.setText(String.valueOf(e.getId()));
        txtRua.setText(e.getLogradouro());
        txtNum.setText(String.valueOf(e.getNumero()));
        txtComplemento.setText(e.getComplemento());
        txtCepFun.setText(e.getCep());
        txtBairro.setText(e.getBairro());
        txtCidade.setText(e.getLocalidade());
        cbEstado.setSelectedItem(e.getUf());
       // controllerEndereco.listarEndereco(id);
      
    }



 /*   //SETAR ID 
    public void id() {
        ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
        try {
            String id = controllerFuncionario.;
            txtId.setText(id);
        } catch (Exception ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */

  //SETAR ID 
    public int id() throws Exception {
        ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
        int id = controllerFuncionario.retornoid();
            
            txtId.setText(String.valueOf(id+1));       
            
        return id;
    }
    //ATIVA TODOS OS CAMPOS
    void ativarTodosCampos() {

        lbNome.setEnabled(true);
        lbRg.setEnabled(true);
        lbCelular.setEnabled(true);
        lbEmail.setEnabled(true);
        lbDataNasc.setEnabled(true);
        lbCpf.setEnabled(true);
        lbTelefone.setEnabled(true);
        txtNome.setEnabled(true);
        txtRG.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);
        txtDatNasc.setEnabled(true);
        txtCpf.setEnabled(true);
        txtTelefone.setEnabled(true);
        lbPesq.setEnabled(false);
        txtPesq.setEnabled(false);
        tblFuncionario.setEnabled(false);
        lblFuncao.setEnabled(true);
        txtFuncao.setEnabled(true);
        
        lbRua.setEnabled(true);
        txtRua.setEnabled(true);
        lbNum.setEnabled(true);
        txtNum.setEnabled(true);
        lbComplemento.setEnabled(true);
        txtComplemento.setEnabled(true);
        lbCep.setEnabled(true);
        txtCepFun.setEnabled(true);
        lbBairro.setEnabled(true);
        txtBairro.setEnabled(true);
        lbCidade.setEnabled(true);
        txtCidade.setEnabled(true);
        lbEstado.setEnabled(true);
        cbEstado.setEnabled(true);

        btnPesq.setEnabled(false);
        btnEditar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnRemover.setEnabled(true);
        btnNovo.setEnabled(false);
    }

    void ativarCampos() {

        lbNome.setEnabled(true);
        lbRg.setEnabled(true);
        lbCelular.setEnabled(true);
        lbEmail.setEnabled(true);
        lbDataNasc.setEnabled(true);
        lbCpf.setEnabled(true);
        lbTelefone.setEnabled(true);
        txtNome.setEnabled(true);
        txtRG.setEnabled(true);
        txtCelular.setEnabled(true);
        txtEmail.setEnabled(true);
        txtDatNasc.setEnabled(true);
        txtCpf.setEnabled(true);
        txtTelefone.setEnabled(true);
        lbPesq.setEnabled(false);
        txtPesq.setEnabled(false);
        tblFuncionario.setEnabled(false);

        btnPesq.setEnabled(false);
        //   btnEditar.setEnabled(true);
        btnInserir.setEnabled(true);
        //  btnRemover.setEnabled(true);
        btnNovo.setEnabled(false);
    }

    //METODO LIMPAR CAMPOS
    void limpar() {

        txtDatNasc.setText("");
        txtDatNasc.setEnabled(false);
        lbDataNasc.setEnabled(false);
        txtCelular.setText("");
        lbCelular.setEnabled(false);
        txtCelular.setEnabled(false);
        lbTelefone.setEnabled(false);
        txtTelefone.setText("");
        txtTelefone.setEnabled(false);
        txtNome.setText(null);
        lbNome.setEnabled(false);
        txtRG.setText(null);
        lbRg.setEnabled(false);
        txtRG.setEnabled(false);
        txtEmail.setText(null);
        txtEmail.setEnabled(false);
        lbEmail.setEnabled(false);
        lbCpf.setEnabled(false);
        txtNome.setEnabled(false);
        txtNome.setText(null);
        txtCpf.setEnabled(false);
        txtCpf.setText(null);
        lbPesq.setEnabled(true);
        txtPesq.setEnabled(true);
        lblFuncao.setEnabled(false);
        txtFuncao.setText(null);
        txtFuncao.setEnabled(false);
        tblFuncionario.setEnabled(true);
        
        //LIMPA DADOS ENDEREÇO
        txtRua.setText(null);
        txtNum.setText(null);
        txtComplemento.setText(null);
        txtCepFun.setText(null);
        txtBairro.setText(null);
        txtCidade.setText(null);
        
        btnInserir.setEnabled(false);
        btnEditar.setEnabled(false);
        btnPesq.setEnabled(true);
        btnNovo.setEnabled(true);

        tabelas.setEnabledAt(0, false);
        tabelas.setEnabledAt(1, false);
        tabelas.setSelectedIndex(0);
        
    }

    //DESABILITA ENDEREÇO
    void limpaEndereco() {
        lbRua.setEnabled(false);
        txtRua.setEnabled(false);
        txtRua.setText(null);
        lbNum.setEnabled(false);
        txtNum.setEnabled(false);
        txtNum.setText(null);
        lbComplemento.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtComplemento.setText(null);
        lbCep.setEnabled(false);
        txtCepFun.setEnabled(false);
        txtCepFun.setText(null);
        lbBairro.setEnabled(false);
        txtBairro.setEnabled(false);
        txtBairro.setText(null);
        lbEstado.setEnabled(false);
        cbEstado.setEnabled(false);
        cbEstado.setToolTipText(null);
        lbCidade.setEnabled(false);
        txtCidade.setEnabled(false);
        txtCidade.setText(null);
    }

    
    //ATUALIZA TABELA
    void tabela() throws Exception {
        ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
        controllerFuncionario.listarFuncionario();
     //   ControllerEndereco controllerEndereco = new ControllerEndereco();
     //   controllerEndereco.listarEndereco(Integer.parseInt(txtId.getText()));    

    }

    //METODO INSERIR 
    public Funcionario inserir() throws ParseException {

//            
        String dataRecebida = txtDatNasc.getText();

        String[] dataSeparada = dataRecebida.split("/");
        LocalDate hoje = LocalDate.of(Integer.parseInt(dataSeparada[2]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[0]));

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(txtNome.getText().toUpperCase());
        funcionario.setDatanascimento(Date.valueOf(hoje));
        funcionario.setCpf(txtCpf.getText().toUpperCase());
        funcionario.setRg(txtRG.getText().toUpperCase());
        funcionario.setEmail(txtEmail.getText());
        funcionario.setTelefone(txtTelefone.getText().toUpperCase());
        funcionario.setCelular(txtCelular.getText().toUpperCase());
        funcionario.setFuncao(txtFuncao.getText().toUpperCase());

        return funcionario;
    }

    //EDITAR PESSOA
    public void editar() {

        String dataRecebida = txtDatNasc.getText();
        String[] dataSeparada = dataRecebida.split("/");
        LocalDate hoje = LocalDate.of(Integer.parseInt(dataSeparada[2]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[0]));

        try {
            Funcionario funcionario = new Funcionario();
            ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
            funcionario.setNome(txtNome.getText().toUpperCase());
            funcionario.setDatanascimento(Date.valueOf(hoje));
            funcionario.setCpf(txtCpf.getText().toUpperCase());
            funcionario.setRg(txtRG.getText());
            funcionario.setTelefone(txtTelefone.getText());
            funcionario.setCelular(txtCelular.getText());
            funcionario.setEmail(txtEmail.getText());
            funcionario.setIdfuncionario(Integer.parseInt(txtId.getText()));
            funcionario.setFuncao(txtFuncao.getText());
            controllerFuncionario.editar(funcionario);

            Endereco endereco = new Endereco();
            ControllerEndereco controllerEndereco = new ControllerEndereco();
            endereco.setLogradouro(txtRua.getText().toUpperCase());
            endereco.setNumero(Integer.parseInt(txtNum.getText()));
            endereco.setComplemento(txtComplemento.getText().toUpperCase());
            endereco.setCep(txtCepFun.getText());
            endereco.setBairro(txtBairro.getText().toUpperCase());
            endereco.setLocalidade(txtCidade.getText().toUpperCase());
            endereco.setUf(cbEstado.getSelectedItem().toString().toUpperCase());
            endereco.setId(Integer.parseInt(idEnd.getText()));
            controllerEndereco.editar(endereco);

            tabela();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(txtComplemento, "Preencha todos os campos!!!");
            //  Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //METODO INSERIR ENDERECO JSON
    public Endereco inserirEndereco() throws Exception {

        Endereco endereco = new Endereco();
      //  int id = Integer.parseInt(idEnd.getText());
      //  int num = Integer.parseInt(txtId.getText());
    //    endereco.setId(id);
        endereco.setLogradouro(txtRua.getText().toUpperCase());
        endereco.setNumero(Integer.parseInt(txtNum.getText()));
        endereco.setComplemento(txtComplemento.getText().toUpperCase());
        endereco.setCep(txtCepFun.getText());
        endereco.setBairro(txtBairro.getText().toUpperCase());
        endereco.setLocalidade(txtCidade.getText().toUpperCase());
        endereco.setUf(cbEstado.getSelectedItem().toString().toUpperCase());
        int idFuncionario = id();
        endereco.setPessoa_idpessoa(idFuncionario);
        return endereco;
    }

    //METODO INSERE 
    int insere() {
        if (txtNome.getText().equals("") || txtRG.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Atenção preencha todos os campos!!!");

        } else {
            try {
                Funcionario funcionario = new Funcionario();
                ControllerFuncionario controllerFuncionario = new ControllerFuncionario();
                funcionario = inserir();
                try {
                    controllerFuncionario.inserir(funcionario);
                    JOptionPane.showMessageDialog(rootPane, "Usuario inserido com sucesso!");
                 //   tabela();
                    btnInsert = 1;
                } catch (ParseException ex) {
                    Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                    // JOptionPane.showMessageDialog(rootPane, "Data Invalida!");
                }
            } catch (Exception ex) {
                Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Data Invalida!");

            }

        }
        return btnInsert;
    }

    //INSERE ENDEREÇO
    int insereEndereco() {

        if (txtRua.getText().equals("") || txtCepFun.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Atenção preencha todos os campos!!!");

        } else {
            try {
                Endereco endereco = new Endereco();
                ControllerEndereco controllerEndereco = new ControllerEndereco();
                endereco = inserirEndereco();
                try {
                    controllerEndereco.inserirEndereco(endereco);
                    JOptionPane.showMessageDialog(rootPane, "Endereço inserido com sucesso!!!");
                    limpar();
                   

                } catch (ParseException ex) {
                    Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (Exception ex) {
                Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
            btnInsert = 2;
          
            
            tabelas.setEnabledAt(1, false);
            tabelas.setSelectedIndex(0);
            btnInserir.setEnabled(true);
            btnNovo.setEnabled(false);
        }
        return btnInsert;

    }

  

    //METODO PARA VALIDAR CPF
    public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0         
                // (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public static String imprimeCPF(String CPF) {
        return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "."
                + CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        tabelas = new javax.swing.JTabbedPane();
        cliente = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtDatNasc = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        lbTelefone = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        lbDataNasc = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbRg = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        txtPesq = new javax.swing.JTextField();
        btnPesq = new javax.swing.JToggleButton();
        lbPesq = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtFuncao = new javax.swing.JTextField();
        lblFuncao = new javax.swing.JLabel();
        endereco = new javax.swing.JPanel();
        txtRua = new javax.swing.JTextField();
        txtCepFun = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idEnd = new javax.swing.JTextField();
        lbRua = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbEndereco = new javax.swing.JTable();
        txtNum = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox();
        txtComplemento = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cadastro de Funcionarios");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/question.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/insert-card.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil-black-tool-interface-symbol.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/recycle-bin.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tabelas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        cliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setEnabled(false);

        try {
            txtDatNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDatNasc.setEnabled(false);

        txtRG.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRG.setEnabled(false);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setEnabled(false);

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setEnabled(false);

        lbTelefone.setText("TELEFONE");
        lbTelefone.setEnabled(false);

        lbCelular.setText("CELULAR");
        lbCelular.setEnabled(false);

        lbDataNasc.setText("DATA NASCIMENTO");
        lbDataNasc.setEnabled(false);

        txtEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmail.setEnabled(false);

        lbEmail.setText("E-MAIL");
        lbEmail.setEnabled(false);

        jLabel7.setText("ID");
        jLabel7.setEnabled(false);

        txtId.setEnabled(false);

        lbNome.setText("NOME");
        lbNome.setEnabled(false);

        lbRg.setText("RG");
        lbRg.setEnabled(false);

        lbCpf.setText("CPF");
        lbCpf.setEnabled(false);

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "DATA NASC", "E-MAIL", "CELULAR", "TELEFONE", "CPF", "RG"
            }
        ));
        tblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFuncionario);

        txtPesq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });

        btnPesq.setBackground(new java.awt.Color(153, 255, 255));
        btnPesq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPesq.setText("PESUISAR");

        lbPesq.setText("DIGITE");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setEnabled(false);

        txtFuncao.setEnabled(false);

        lblFuncao.setText("FUNÇÃO");
        lblFuncao.setEnabled(false);

        javax.swing.GroupLayout clienteLayout = new javax.swing.GroupLayout(cliente);
        cliente.setLayout(clienteLayout);
        clienteLayout.setHorizontalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteLayout.createSequentialGroup()
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addComponent(lbRg)
                                        .addGap(214, 214, 214))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteLayout.createSequentialGroup()
                                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(clienteLayout.createSequentialGroup()
                                                .addComponent(lbTelefone)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtRG))
                                        .addGap(18, 18, 18)))
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addComponent(lbCpf)
                                        .addGap(104, 227, Short.MAX_VALUE))
                                    .addComponent(txtCpf)))
                            .addGroup(clienteLayout.createSequentialGroup()
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbEmail)
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(334, 334, 334)
                                        .addComponent(lbDataNasc))
                                    .addComponent(txtEmail))
                                .addGap(0, 34, Short.MAX_VALUE))))
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addGroup(clienteLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDatNasc))))
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                            .addGroup(clienteLayout.createSequentialGroup()
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbPesq)
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(clienteLayout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCelular)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFuncao)
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addComponent(lblFuncao)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        clienteLayout.setVerticalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataNasc)
                    .addComponent(jLabel7)
                    .addComponent(lbNome))
                .addGap(5, 5, 5)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRg)
                    .addComponent(lbCpf))
                .addGap(1, 1, 1)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtRG, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(lbCelular)
                    .addComponent(lblFuncao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPesq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelas.addTab("Cliente", cliente);

        endereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRua.setEnabled(false);

        txtCepFun.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCepFun.setEnabled(false);
        txtCepFun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFunFocusLost(evt);
            }
        });

        txtBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBairro.setEnabled(false);

        lbCidade.setText("CIDADE");
        lbCidade.setEnabled(false);

        lbEstado.setText("UF");
        lbEstado.setEnabled(false);

        lbNum.setText("N°");
        lbNum.setEnabled(false);

        jLabel8.setText("ID");
        jLabel8.setEnabled(false);

        idEnd.setEnabled(false);

        lbRua.setText("RUA");
        lbRua.setEnabled(false);

        lbCep.setText("CEP");
        lbCep.setEnabled(false);

        lbBairro.setText("BAIRRO");
        lbBairro.setEnabled(false);

        tbEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "RUA", "N°", "CEP", "BAIRRO", "CIDADE", "UF"
            }
        ));
        tbEndereco.setEnabled(false);
        jScrollPane3.setViewportView(tbEndereco);

        txtNum.setEnabled(false);

        txtCidade.setEnabled(false);

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR" }));
        cbEstado.setEnabled(false);
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        txtComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComplemento.setEnabled(false);

        lbComplemento.setText("COMPLEMENTO");
        lbComplemento.setEnabled(false);

        javax.swing.GroupLayout enderecoLayout = new javax.swing.GroupLayout(endereco);
        endereco.setLayout(enderecoLayout);
        enderecoLayout.setHorizontalGroup(
            enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(enderecoLayout.createSequentialGroup()
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(enderecoLayout.createSequentialGroup()
                                .addComponent(idEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRua)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(enderecoLayout.createSequentialGroup()
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBairro)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCidade)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEstado)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(enderecoLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(344, 344, 344)
                                    .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbNum)
                                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(enderecoLayout.createSequentialGroup()
                                    .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbComplemento)
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCep)
                                        .addComponent(txtCepFun, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        enderecoLayout.setVerticalGroup(
            enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNum)
                    .addComponent(jLabel8)
                    .addComponent(lbRua))
                .addGap(6, 6, 6)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(enderecoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enderecoLayout.createSequentialGroup()
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbComplemento)
                            .addComponent(lbCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCepFun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBairro)
                        .addGap(1, 1, 1)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enderecoLayout.createSequentialGroup()
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCidade)
                            .addComponent(lbEstado))
                        .addGap(2, 2, 2)
                        .addGroup(enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabelas.addTab("Endereço", endereco);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabelas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnRemover)
                    .addComponent(btnInserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelas))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

        if (btnInsert == 0) {
            insere();
            tabelas.setSelectedIndex(1);
            tabelas.setEnabledAt(0, false);
            tabelas.setEnabledAt(1, true);

        } else if (btnInsert == 1) {
            insereEndereco();
            ControllerFuncionario ctrl = new ControllerFuncionario();
            try {
                ctrl.listarFuncionario();
            } catch (Exception ex) {
                Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:

        try {
            ativarTodosCampos();
           // id();
          //  idEndereco();
            //idVeiculo();
            btnInserir.setEnabled(true);
            btnNovo.setEnabled(false);
            btnRemover.setEnabled(false);
            btnEditar.setEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ControllerFuncionario funcionario = new ControllerFuncionario();

        try {
            
            funcionario.listarFuncionario();

        } catch (Exception ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        int resposta = JOptionPane.showConfirmDialog(txtComplemento, "Deseja realmente excluir os dados deste cliente", "Atenção!!!", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(txtId.getText());
            ControllerCliente cliente = new ControllerCliente();
            try {
//                cliente.deletarCliente(id);
                tabela();
                limpar();
                tabelas.setEnabledAt(0, true);
                tabelas.setEnabledAt(1, false);
                tabelas.setEnabledAt(2, false);
                btnInserir.setEnabled(false);
                btnEditar.setEnabled(false);
                btnRemover.setEnabled(false);
                tabelas.setSelectedIndex(0);

            } catch (Exception ex) {
                Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnRemoverActionPerformed
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            editar();
            tabela();

        } catch (Exception ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);

        }
        limpar();
        tabelas.setEnabledAt(0, true);
        tabelas.setEnabledAt(1, false);
        btnInserir.setEnabled(false);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        tabelas.setSelectedIndex(0);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void txtCepFunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFunFocusLost
        ControllerEndereco controllerEndereco = new ControllerEndereco();
         String x = txtCepFun.getText();
        try {
            Endereco cep = new Endereco();
            cep = controllerEndereco.pegaEndereco(x);
            txtRua.setText(cep.getLogradouro());
            txtCidade.setText(cep.getLocalidade());
            txtBairro.setText(cep.getBairro());
            cbEstado.setSelectedItem(cep.getUf());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "CPF invalido!!!");
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCepFunFocusLost

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqActionPerformed

    private void tblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioMouseClicked
        try {
            setarCampos();

        } catch (Exception ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblFuncionarioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JToggleButton btnPesq;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JPanel cliente;
    private javax.swing.JPanel endereco;
    private javax.swing.JTextField idEnd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbPesq;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JTabbedPane tabelas;
    public static javax.swing.JTable tbEndereco;
    public static javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    public static javax.swing.JTextField txtCepFun;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    public static javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDatNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFuncao;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
