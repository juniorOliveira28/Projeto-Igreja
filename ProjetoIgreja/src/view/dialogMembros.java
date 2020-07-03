package view;

import dao.DAOGenerico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Pessoa;
import projetoIgreja.ManipularImagem;

public class DialogMembros extends javax.swing.JDialog {

    private Pessoa pessoa;
    private JfMembros jfMembros;
    private DAOGenerico<Pessoa> daoPessoa;
    private ManipularImagem mImg = null;
    byte[] img = null;
    byte[] imgTemp = null;
    Long idMembro;
    String cidade;
    public String caminho;
    java.awt.Frame parent;
    String cdd;

    public DialogMembros() {
        this.setIcon();
        pessoa = new Pessoa();
        this.setTitle("Membro");
//        this.setBackground(Color.yellow);
        daoPessoa = new DAOGenerico<Pessoa>(Pessoa.class);
        initComponents();
        setLocationRelativeTo(parent);
//        limparCampos();
//        this.setVisible(true);
        btSalvar.setEnabled(true);
        btAlterar.setEnabled(false);
//        btImprimir.setEnabled(false);

        jlImagem.setOpaque(true);
        jlImagem.setBackground(Color.white);
        jlImagem.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    }

    public void limparCampos(String cidade) {
        if (cidade.equals(cdd)) {

            campoId.setText(null);
            campoNome.setText("");
            comboBoxCidade.setSelectedIndex(0);
            campoNomePai.setText("");
            campoNomeMae.setText("");
            campoCpf.setText("");
            campoRg.setText("");
            campoDtBatismo.setText("");
            campoDtNascimento.setText("");
            campoCidadeNascimento.setText("");
            cbSituacao.setSelectedIndex(0);
            campoTelefone.setText("");
            campoObservacao.setText("");

            jlImagem.setIcon(null);
            btSalvar.setEnabled(true);
            btAlterar.setEnabled(false);
            pessoa = new Pessoa();
            mImg = new ManipularImagem();
        }
    }

    public void preencherDialog(Pessoa p) {

        btSalvar.setEnabled(false);
        btAlterar.setEnabled(true);

        pessoa = p;
        campoId.setText(pessoa.getId().toString());
        idMembro = pessoa.getId();

        campoNome.setText(pessoa.getNome());
        comboBoxCidade.setSelectedItem(pessoa.getCidadeIgreja());
        campoCidadeNascimento.setText(pessoa.getCidade());
        campoCpf.setText(pessoa.getCpf());
        campoRg.setText(pessoa.getRg());
        campoDtBatismo.setText(pessoa.getDataBatismo());
        campoDtNascimento.setText(pessoa.getDataNascimento());
        cbSituacao.setSelectedItem(pessoa.getSituacao());
        if (pessoa.getNomeMae().equals("")) {
            campoNomeMae.setText("");
        } else {
            campoNomeMae.setText(pessoa.getNomeMae());
        }
        if (pessoa.getNomePai().equals("")) {
            campoNomePai.setText("");
        } else {
            campoNomePai.setText(pessoa.getNomePai());
        }
        if (pessoa.getTelefone().equals("")) {
            campoTelefone.setText("");
        } else {
            campoTelefone.setText(pessoa.getTelefone());
        }
        if (pessoa.getObservacao().equals("")) {
            campoObservacao.setText("");
        } else {
            campoObservacao.setText(pessoa.getObservacao());
        }
        mImg.exibiImagemLabel(pessoa.getFoto(), jlImagem);

        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFormulario = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDtNascimento = new javax.swing.JLabel();
        jLabelDtBatismo = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservacao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JFormattedTextField();
        campoDtNascimento = new javax.swing.JFormattedTextField();
        campoDtBatismo = new javax.swing.JFormattedTextField();
        campoNomePai = new javax.swing.JTextField();
        campoNomeMae = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        comboBoxCidade = new javax.swing.JComboBox<>();
        cbSituacao = new javax.swing.JComboBox<>();
        campoId = new javax.swing.JTextField();
        jlImagem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btAdicionarImagem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoCidadeNascimento = new javax.swing.JTextField();
        campoRg = new javax.swing.JTextField();
        painelBotoes = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        painelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        painelFormulario.setVerifyInputWhenFocusTarget(false);

        jLabelNome.setText("Nome:");

        jLabelDtNascimento.setText("Data Nasc.:");

        jLabelDtBatismo.setText("Data Batismo:");

        jLabelCpf.setText("Cpf:");

        campoObservacao.setColumns(20);
        campoObservacao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        campoObservacao.setLineWrap(true);
        campoObservacao.setRows(5);
        campoObservacao.setTabSize(10);
        campoObservacao.setToolTipText("");
        campoObservacao.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(campoObservacao);

        jLabel4.setText("Nome do Pai:");

        jLabel5.setText("Nome da Mãe:");

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoDtBatismo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Rg:");

        jLabel7.setText("Cidade Igreja:");

        jLabel8.setText("Telefone:");

        jLabel9.setText("Status:");

        jLabel1.setText("Observação:");

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        comboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "ATALAIA - PR", "CIANORTE - PR", "JUSSARA - PR", "MUNHOZ DE MELO - PR", "PAINÇANDU - PR", "TERRA BOA - PR" }));

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "ATIVO", "INATIVO" }));

        campoId.setEnabled(false);

        jlImagem.setBackground(new java.awt.Color(102, 204, 255));
        jlImagem.setForeground(new java.awt.Color(0, 255, 255));
        jlImagem.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel3.setText("Foto:");

        btAdicionarImagem.setText("Adicionar");
        btAdicionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarImagemActionPerformed(evt);
            }
        });

        jLabel2.setText("Cidade Nasc.:");

        painelBotoes.setBackground(new java.awt.Color(243, 243, 243));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelFormularioLayout = new javax.swing.GroupLayout(painelFormulario);
        painelFormulario.setLayout(painelFormularioLayout);
        painelFormularioLayout.setHorizontalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoNomeMae, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(campoNomePai))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCpf)))
                            .addComponent(jLabel1)
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDtNascimento)
                                    .addComponent(campoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDtBatismo)
                                    .addComponent(campoDtBatismo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(campoCidadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelFormularioLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                                .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 26, Short.MAX_VALUE))))
                                    .addGroup(painelFormularioLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(btAdicionarImagem)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        painelFormularioLayout.setVerticalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelCpf)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDtNascimento)
                            .addComponent(jLabelDtBatismo)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDtBatismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCidadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdicionarImagem)))
                .addGap(11, 11, 11)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (campoNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoNome.requestFocus();
        } else if (campoCpf.getText().trim().length() < 14) {
            JOptionPane.showMessageDialog(null, "O campo Cpf é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoCpf.requestFocus();
        } else if (campoRg.getText().trim().length() < 7) {
            JOptionPane.showMessageDialog(null, "Rg é Inválido!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoRg.requestFocus();
        } else if (campoDtNascimento.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoDtNascimento.requestFocus();
        } else if (campoDtBatismo.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Batismo é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoDtBatismo.requestFocus();
        } else if (campoCidadeNascimento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoCidadeNascimento.requestFocus();
        } else if (comboBoxCidade.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade Igreja é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            comboBoxCidade.requestFocus();
        } else if (cbSituacao.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Status é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            cbSituacao.requestFocus();
        } else if (jlImagem.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "O campo Foto é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pessoa.setNome(campoNome.getText().toUpperCase());
                pessoa.setCidadeIgreja(comboBoxCidade.getSelectedItem().toString().toUpperCase());
                pessoa.setCpf(campoCpf.getText());
                pessoa.setRg(campoRg.getText());
                pessoa.setNomePai(campoNomePai.getText().toUpperCase());
                pessoa.setNomeMae(campoNomeMae.getText().toUpperCase());
                pessoa.setCidade(campoCidadeNascimento.getText().toUpperCase());
                pessoa.setSituacao(cbSituacao.getSelectedItem().toString().toUpperCase());
                pessoa.setTelefone(campoTelefone.getText().toUpperCase());
                pessoa.setObservacao(campoObservacao.getText().toUpperCase());
                pessoa.setDataBatismo(campoDtBatismo.getText());
                pessoa.setDataNascimento(campoDtNascimento.getText());
                pessoa.setFoto(img);
                if (pessoa.getId() == null) {
                    daoPessoa.salvar(pessoa);
                    JOptionPane.showMessageDialog(this, "Cadastro Realizado com sucesso!");
                    pessoa = new Pessoa();
                    img = null;
                    jfMembros.preencherListaMembros(cdd);
                    jfMembros.fecharBotoes();
                    this.dispose();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Cadastro Realizado com sucesso!!!");
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    public void cdd(String cd) {
        cdd = cd;
    }

    public void form(JfMembros jf) {
        jfMembros = jf;
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        System.out.println("Dentro do método alterar");

        if (campoNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoNome.requestFocus();
        } else if (campoCpf.getText().trim().length() < 14) {
            JOptionPane.showMessageDialog(null, "O campo Cpf é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoCpf.requestFocus();
        } else if (campoRg.getText().trim().length() < 7) {
            JOptionPane.showMessageDialog(null, "Rg Inválido!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoRg.requestFocus();
        } else if (campoDtNascimento.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoDtNascimento.requestFocus();
        } else if (campoDtBatismo.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Batismo é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoDtBatismo.requestFocus();
        } else if (campoCidadeNascimento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            campoCidadeNascimento.requestFocus();
        } else if (comboBoxCidade.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade Igreja é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (cbSituacao.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Status é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
            cbSituacao.requestFocus();
        } else if (jlImagem.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "O campo Foto é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pessoa.setNome(campoNome.getText().toUpperCase());
                pessoa.setCidadeIgreja(comboBoxCidade.getSelectedItem().toString().toUpperCase());
                pessoa.setCpf(campoCpf.getText());
                pessoa.setRg(campoRg.getText());
                pessoa.setNomePai(campoNomePai.getText().toUpperCase());
                pessoa.setNomeMae(campoNomeMae.getText().toUpperCase());
                pessoa.setDataBatismo(campoDtBatismo.getText());
                pessoa.setDataNascimento(campoDtNascimento.getText());
                pessoa.setSituacao(cbSituacao.getSelectedItem().toString().toUpperCase());
                pessoa.setCidade(campoCidadeNascimento.getText().toUpperCase());
                pessoa.setTelefone(campoTelefone.getText());
                pessoa.setObservacao(campoObservacao.getText());
                imgTemp = pessoa.getFoto();
                if (img != null) {
                    pessoa.setFoto(img);
                }
                if (pessoa.getId() != null) {
//                    if(imgTemp == img){
                    daoPessoa.alterar(pessoa);
                    JOptionPane.showMessageDialog(null, "Cadastro Alterado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    pessoa = new Pessoa();
                    img = null;
                    jfMembros.preencherListaMembros(cdd);
                    jfMembros.fecharBotoes();
                    this.dispose();
//                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Fim do método alterar");

        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAdicionarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarImagemActionPerformed
        // Instancioando JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Procurar Imagem");
        // Definindo tamanho do dialog para buscar imagem
        fileChooser.setPreferredSize(new Dimension(800, 500));
        // Definindo os tipos de arquivos a serem abertos
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg", "png", "jpeg");
        // passando esses tipos de arquivos para o filtro
        fileChooser.setFileFilter(filter);
        // Definindo que serão abertos apenas arquivos
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        // Abrindo uma janela para adicionar uma imagem
        int retorno = fileChooser.showOpenDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                //carrega a imagem real num buffer
                BufferedImage bi = ImageIO.read(file);
                //cria um buffer auxiliar com o tamanho desejado
                BufferedImage aux = new BufferedImage(128, 175, bi.getType());
                //pega a classe graphics do aux para edição
                Graphics2D g = aux.createGraphics();
                //cria a transformação
                AffineTransform at = AffineTransform.getScaleInstance((double) 128 / bi.getWidth(), (double) 175 / bi.getHeight());
                //pinta e transforma a imagem real no auxiliar
                g.drawRenderedImage(bi, at);
                //seta no jlabel
                jlImagem.setIcon(new ImageIcon(aux));
                img = mImg.getImgBytes(aux);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btAdicionarImagemActionPerformed

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
            java.util.logging.Logger.getLogger(DialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                dialogMembros dialog = new dialogMembros(new javax.swing.JFrame(), true);
                DialogMembros dialog = new DialogMembros();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarImagem;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField campoCidadeNascimento;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JFormattedTextField campoDtBatismo;
    private javax.swing.JFormattedTextField campoDtNascimento;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeMae;
    private javax.swing.JTextField campoNomePai;
    private javax.swing.JTextArea campoObservacao;
    private javax.swing.JTextField campoRg;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JComboBox<String> cbSituacao;
    private javax.swing.JComboBox<String> comboBoxCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDtBatismo;
    private javax.swing.JLabel jLabelDtNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFormulario;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icone.png")));
    }
}
