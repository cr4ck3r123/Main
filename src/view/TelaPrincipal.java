/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    TelaUsuario telaUsuario;
    TelaCliente telaCliente;
    TelaServico servico;
    TelaFuncionario funcionario;
    TelaEstoque estoque;
    TelaOrdemServico os;
    TelaSobre sobre;
    TelaContasPagar contasPagar;
    TelaContasReceber contasReceber;
    
    
    public TelaPrincipal() {
        initComponents();
        dataEHora();
      //  hora();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblComp = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem10 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem9 = new javax.swing.JRadioButtonMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jRadioButtonMenuItem11 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem12 = new javax.swing.JRadioButtonMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHora.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        lblHora.setText("Hora");

        lblData.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        lblData.setText("Data");

        lblComp.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblComp.setForeground(new java.awt.Color(0, 0, 153));
        lblComp.setText("Comprimentos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblComp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 740, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblHora))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblData))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer-review.png"))); // NOI18N
        jButton1.setText("CLIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/budget.png"))); // NOI18N
        jButton2.setText("O.S");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/house-key.png"))); // NOI18N
        jButton3.setText("Usuarios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);

        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shopping-list.png"))); // NOI18N
        jMenu2.setText("Cadastros");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Clientes");
        jRadioButtonMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer-review.png"))); // NOI18N
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("Funcionarios");
        jRadioButtonMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/businessman.png"))); // NOI18N
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem6);

        jRadioButtonMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("Serviços");
        jRadioButtonMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/settings.png"))); // NOI18N
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem4);

        jRadioButtonMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem7.setSelected(true);
        jRadioButtonMenuItem7.setText("Estoque");
        jRadioButtonMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/worker-loading-boxes.png"))); // NOI18N
        jRadioButtonMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem7);

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Usuarios");
        jRadioButtonMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/house-key.png"))); // NOI18N
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/customer-support.png"))); // NOI18N
        jMenu5.setText("Movimentação");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jRadioButtonMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem10.setSelected(true);
        jRadioButtonMenuItem10.setText("Movimento");
        jRadioButtonMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mover-opcao.png"))); // NOI18N
        jRadioButtonMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem10);

        jRadioButtonMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem8.setSelected(true);
        jRadioButtonMenuItem8.setText("Ordem de Serviço");
        jRadioButtonMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/budget.png"))); // NOI18N
        jRadioButtonMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem8);

        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/financeior.png"))); // NOI18N
        jMenu7.setText("Financeiro");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jRadioButtonMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Contas a Pagar");
        jRadioButtonMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/insert-card.png"))); // NOI18N
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jRadioButtonMenuItem3);

        jRadioButtonMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem9.setSelected(true);
        jRadioButtonMenuItem9.setText("Contas a Receber");
        jRadioButtonMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desconto-no-pagamento.png"))); // NOI18N
        jRadioButtonMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jRadioButtonMenuItem9);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jMenu8.setText("Relatorios");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jRadioButtonMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem11.setSelected(true);
        jRadioButtonMenuItem11.setText("Mensal");
        jRadioButtonMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/insert-card.png"))); // NOI18N
        jRadioButtonMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jRadioButtonMenuItem11);

        jRadioButtonMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem12.setSelected(true);
        jRadioButtonMenuItem12.setText("Anual");
        jRadioButtonMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desconto-no-pagamento.png"))); // NOI18N
        jRadioButtonMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem12ActionPerformed(evt);
            }
        });
        jMenu8.add(jRadioButtonMenuItem12);

        jMenuBar1.add(jMenu8);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/configuration.png"))); // NOI18N
        jMenu6.setText("Ajuda");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jRadioButtonMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText("Sobre");
        jRadioButtonMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/male-head-side-view-with-cogwheels-thinking-about-dollar-symbol.png"))); // NOI18N
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jRadioButtonMenuItem5);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:

          try {
            
            if(telaUsuario == null){
                telaUsuario = new TelaUsuario();
                              
            }
            telaUsuario.setVisible(true);                            
           // telaUsuario = new TelaUsuario();
            telaUsuario.toFront();
            telaUsuario.requestFocus();        
            
         } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    public void run() {
        // TODO Auto-generated method stub
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            Date hoje = new Date();
            String tempo = formatter.format(hoje); //Pega o tempo de acordo com a formatação
            lblHora.setText(tempo); //Insere o tempo no TextField
            lblHora.repaint(); // Atualiza a tela;
            try {
                Thread.sleep(1000);
            } catch (Exception erro) {
            }
        }
    }

    public void dataEHora() {
        Calendar cal = new GregorianCalendar();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int minuto = cal.get(Calendar.MINUTE);
        int segundo = cal.get(Calendar.SECOND);
        lblData.setText("Data: " + dia + "/" + (mes + 1) + "/" + ano);
        lblHora.repaint();
        if (hora >= 12) {
            lblComp.setText("Boa Tarde!!!");
            System.out.println("Boa Tarde!!!");
        } else if (hora >= 19) {
            lblComp.setText("Boa Noite!!!");
            System.out.println("Boa Noite!!!");
        } else if (hora >= 6) {
            lblComp.setText("Bom Dia!!!");
            System.out.println("Bom Dia");
        }
        lblHora.setText("Hora: " + hora + ":" + minuto + ":" + segundo);

    }

    public void hora() {
        int segundos;
        int minutos;
        int horas;
        Calendar data;
        try {
            while (true) {
                Thread.sleep(1000);
                data = Calendar.getInstance();
                horas = data.get(Calendar.HOUR_OF_DAY);
                minutos = data.get(Calendar.MINUTE);
                segundos = data.get(Calendar.SECOND);
                String time = horas + ":" + minutos + ":" + segundos;
                //  lblHora.setText(time);
                System.out.println(horas + ":" + minutos + ":" + segundos);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        if(telaCliente == null){           
            telaCliente = new TelaCliente();
            
        }
        telaCliente.show();
        telaCliente.toFront();
        telaCliente.requestFocus();
        
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
       if(contasPagar == null){           
        contasPagar = new TelaContasPagar();
            
        }
        contasPagar.show();
        contasPagar.toFront();
        contasPagar.requestFocus();
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(telaCliente == null){           
        telaCliente = new TelaCliente();
            
        }
        telaCliente.show();
        telaCliente.toFront();
        telaCliente.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        if( os == null){         
        os = new TelaOrdemServico();
        os.show();
        os.toFront();
        os.requestFocus();  
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        if( servico == null){           
            servico = new TelaServico();
            
        }
        servico.show();
        servico.toFront();
        servico.requestFocus();
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
       
         if(funcionario == null){           
            funcionario = new TelaFuncionario();
            
        }
        funcionario.show();
        funcionario.toFront();
        funcionario.requestFocus();
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void jRadioButtonMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem7ActionPerformed
           if(estoque == null){           
               try {
                   estoque = new TelaEstoque();
               } catch (Exception ex) {
                   Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
               }
            
        }
        estoque.show();
        estoque.toFront();
        estoque.requestFocus();
    }//GEN-LAST:event_jRadioButtonMenuItem7ActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        if(sobre == null){           
        sobre = new TelaSobre();
            
        }
        sobre.show();
        sobre.toFront();
        sobre.requestFocus();
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void jRadioButtonMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem8ActionPerformed
          if(os == null){           
        os = new TelaOrdemServico();
            
        }
        os.show();
        os.toFront();
        os.requestFocus();
    }//GEN-LAST:event_jRadioButtonMenuItem8ActionPerformed

    private void jRadioButtonMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem9ActionPerformed
        if(contasReceber == null){           
        contasReceber = new TelaContasReceber();
            
        }
        contasReceber.show();
        contasReceber.toFront();
        contasReceber.requestFocus();
    }//GEN-LAST:event_jRadioButtonMenuItem9ActionPerformed

    private void jRadioButtonMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem10ActionPerformed

    private void jRadioButtonMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem11ActionPerformed

    private void jRadioButtonMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         // TODO add your handling code here:

          try {
            
            if(telaUsuario == null){
                telaUsuario = new TelaUsuario();
                              
            }
            telaUsuario.setVisible(true);                            
           // telaUsuario = new TelaUsuario();
            telaUsuario.toFront();
            telaUsuario.requestFocus();        
            
         } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem10;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem11;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem12;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem8;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem9;
    private javax.swing.JLabel lblComp;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables
}
