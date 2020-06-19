package view;

import dao.DAOGenerico;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Pessoa;
import util.RelatorioMembros;

public class JfMembros extends javax.swing.JInternalFrame implements MouseListener {
    
    private Pessoa pessoa;
    private DAOGenerico<Pessoa> daoPessoa;
    private List<Pessoa> listaPessoas;
    private DefaultTableModel model;
    private DialogMembros dialog;
    byte[] img = null;
    Long idMembro;
    public String cidade;
    public String caminho;
    Pessoa p;
    List lista;
    
    public JfMembros() {
        
        pessoa = new Pessoa();
        cidade = new String();
        dialog = new DialogMembros();
        daoPessoa = new DAOGenerico<Pessoa>(Pessoa.class);
        listaPessoas = new ArrayList<Pessoa>();
        lista = new ArrayList<>();
        
        initComponents();
        
        tabela.addMouseListener(this);
        model = (DefaultTableModel) tabela.getModel();
        btImprimir.setEnabled(false);
        btExcluir.setEnabled(false);
    }
    
    public void cdd(String cdd) {
        cidade = cdd;
        dialog.cdd(cdd);
        preencherListaMembros(cdd);
    }
    
    public void fecharBotoes() {
        btImprimir.setEnabled(false);
        btExcluir.setEnabled(false);
    }
    
    public void preencherListaMembros(String cd) {
        listaPessoas = daoPessoa.buscarTodos(cd);
        try {
//          evitar duplicação ao adicionar um novo usuário
            model.setNumRows(0);
            for (Pessoa pessoa : listaPessoas) {
                Object[] dados = {pessoa.getNome(), pessoa.getCpf(), pessoa.getCidade(), pessoa.getSituacao()};
                model.addRow(dados);
                tabela.setModel(model);
//              Centralizando dados da tabela
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment((int) CENTER_ALIGNMENT);
                tabela.setDefaultRenderer(String.class, centerRenderer);
                ((DefaultTableCellRenderer) tabela.getTableHeader().
                        getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
            }
//            tabela.setRowSorter(new TableRowSorter(model));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            e.printStackTrace();
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogCadastro = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        btFechar = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btNovoMembro = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        painelConsulta = new javax.swing.JPanel();
        campoConsulta = new javax.swing.JTextField();
        btConsulta = new javax.swing.JButton();
        painelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        dialogCadastro.setModal(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dialogCadastroLayout = new javax.swing.GroupLayout(dialogCadastro.getContentPane());
        dialogCadastro.getContentPane().setLayout(dialogCadastroLayout);
        dialogCadastroLayout.setHorizontalGroup(
            dialogCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCadastroLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogCadastroLayout.setVerticalGroup(
            dialogCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        setVisible(true);

        painelBotoes.setBackground(new java.awt.Color(51, 51, 51));

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeFechar.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-imprimir-carteirinha.png"))); // NOI18N
        btImprimir.setText("Imprimir");
        btImprimir.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        btNovoMembro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-adicionar-membro.png"))); // NOI18N
        btNovoMembro.setText("Novo");
        btNovoMembro.setMaximumSize(new java.awt.Dimension(71, 23));
        btNovoMembro.setMinimumSize(new java.awt.Dimension(71, 23));
        btNovoMembro.setPreferredSize(new java.awt.Dimension(71, 23));
        btNovoMembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoMembroActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-remover-membro.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btExcluir.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovoMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btImprimir)
                .addGap(18, 18, 18)
                .addComponent(btFechar)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovoMembro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelConsulta.setBackground(new java.awt.Color(51, 51, 51));

        campoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConsultaActionPerformed(evt);
            }
        });

        btConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-pesquisar.png"))); // NOI18N
        btConsulta.setText("Buscar");
        btConsulta.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(campoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConsulta))
                .addContainerGap())
        );

        painelTabela.setBackground(new java.awt.Color(51, 51, 51));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cpf", "Cidade", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setName(""); // NOI18N
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConsultaActionPerformed

    }//GEN-LAST:event_campoConsultaActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        if (campoConsulta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum nome informado!");
            preencherListaMembros(cidade);
        } else {
            listaPessoas = daoPessoa.buscarPorNome(campoConsulta.getText(), cidade);
            try {
                model.setNumRows(0);
                for (Pessoa p : listaPessoas) {
                    Object[] dados = {p.getNome(), p.getCpf(), p.getCidade(), p.getSituacao()};
                    model.addRow(dados);
                    tabela.setModel(model);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        btExcluir.setEnabled(false);
        btImprimir.setEnabled(false);
    }//GEN-LAST:event_btConsultaActionPerformed
    

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        RelatorioMembros rel = new RelatorioMembros(lista, caminho);
        rel.setVisible(true);
    }//GEN-LAST:event_btImprimirActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed
    private void btNovoMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoMembroActionPerformed
        dialog.limparCampos(cidade);
        dialog.form(this);
        this.getContentPane().setBackground(Color.BLACK);
        dialog.setVisible(true);
    }//GEN-LAST:event_btNovoMembroActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        pessoa = p;
        try {
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir esse membro?");
            System.out.println("Pessoa Excluir: " + pessoa.getNome());
            if (resposta == JOptionPane.YES_OPTION) {
                daoPessoa.excluir(pessoa.getId());
                btExcluir.setEnabled(false);
                btImprimir.setEnabled(false);
                preencherListaMembros(cidade);
                JOptionPane.showMessageDialog(this, "Membro Excluído com Sucesso!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btNovoMembro;
    private javax.swing.JTextField campoConsulta;
    private javax.swing.JDialog dialogCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            int indice = tabela.getSelectedRow();
            pessoa = listaPessoas.get(indice);
//            p = pessoa;
            dialog.form(this);
            dialog.preencherDialog(pessoa);
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getClickCount() == 1) {
            lista = new ArrayList<>();
            int indice = tabela.getSelectedRow();
            if (indice != -1) {
                p = listaPessoas.get(indice);
            }
            btImprimir.setEnabled(true);
            btExcluir.setEnabled(true);
            int[] indices = tabela.getSelectedRows();
            for (int i = 0; i < indices.length; i++) {
                indices[i] = tabela.convertRowIndexToModel(indices[i]);
                pessoa = listaPessoas.get(i);
                idMembro = pessoa.getId();
                lista.add(idMembro);
                
                System.out.println("Membro selecionado : " + p.getId() + " " + p.getNome());
            }
            if (p.getCidade().equals("JUSSARA - PR")) {
                caminho = "/relatorios/carteirinhaJussara.jasper";
            } else if (p.getCidade().equals("CIANORTE - PR")) {
                caminho = "/relatorios/carteirinhaCianorte.jasper";
            } else if (p.getCidade().equals("ATALAIA - PR")) {
                caminho = "/relatorios/carteirinhaAtalaia.jasper";
            } else if (p.getCidade().equals("TERRA BOA - PR")) {
                caminho = "/relatorios/carteirinhaTerraBoa.jasper";
            } else if (!"PAIÇANDU - PR".equals(p.getCidade())) {
                caminho = "/relatorios/carteirinhaPaicandu.jasper";
            } else if (p.getCidade().equals("MUNHOZ DE MELO - PR")) {
                caminho = "/relatorios/carteirinhaMunhozMelo.jasper";
            } else {
//                JOptionPane.showMessageDialog(null, "Nenhuma Cidade Selecionada");
            }
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e
    ) {
    }
    
    @Override
    public void mouseEntered(MouseEvent e
    ) {
    }
    
    @Override
    public void mouseExited(MouseEvent e
    ) {
    }
    
}
