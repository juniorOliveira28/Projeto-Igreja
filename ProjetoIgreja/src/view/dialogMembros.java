package view;

import dao.DAOGenerico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
import util.RelatorioMembros;

public class dialogMembros extends javax.swing.JDialog {

    private Pessoa pessoa;
    private JfMembros jfMembros;
    private DAOGenerico<Pessoa> daoPessoa;
    private ManipularImagem mImg = null;
    byte[] img = null;
    Long idMembro;
    String cidade;
    public String caminho;
    java.awt.Frame parent;

    public dialogMembros() {
        pessoa = new Pessoa();
//        jfMembros = new JfMembros();
        daoPessoa = new DAOGenerico<Pessoa>(Pessoa.class);
        initComponents();
        setLocationRelativeTo(parent);
        btSalvar.setEnabled(true);
        btAlterar.setEnabled(false);
        btImprimir.setEnabled(false);

        jlImagem.setOpaque(true);
        jlImagem.setBackground(Color.white);
        jlImagem.setBorder(BorderFactory.createLineBorder(Color.lightGray));
    }

    public void limparCampos() {
//        campoId.setText(null);
//        campoNome.setText("");
//        campoDtBatismo.setText("");
//        campoDtNascimento.setText("");
//        campoNomeMae.setText("");
//        campoNomePai.setText("");
//        campoRg.setText("");
//        campoCpf.setText("");
//        comboBoxCidade.setSelectedIndex(0);
//        cbSituacao.setSelectedIndex(0);
////        campoConsulta.setText("");
//        campoTelefone.setText("");
//        campoObservacao.setText("");
//        jlImagem.setIcon(null);
//        btSalvar.setEnabled(true);
////        jfMembros.preencherListaMembros();
//        pessoa = new Pessoa();
//        jfMembros.preencherListaMembros();
//        this.setVisible(false);
    }

    public void preencherDialog(Pessoa p) {
//        limparCampos();
        btSalvar.setEnabled(false);
        btAlterar.setEnabled(true);
        btImprimir.setEnabled(true);
        pessoa = p;
        System.out.println("Pessoa dialog: " + p.getNome());
        campoId.setText(pessoa.getId().toString());
        idMembro = pessoa.getId();
        campoNome.setText(pessoa.getNome());
        comboBoxCidade.setSelectedItem(pessoa.getCidade());
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

        if (pessoa.getCidade().equals("JUSSARA - PR")) {
            caminho = "/relatorios/carteirinhaJussara.jasper";
        } else if (pessoa.getCidade().equals("CIANORTE - PR")) {
            caminho = "/relatorios/carteirinhaCianorte.jasper";
        } else if (pessoa.getCidade().equals("ATALAIA - PR")) {
            caminho = "/relatorios/carteirinhaAtalaia.jasper";
        } else if (pessoa.getCidade().equals("TERRA BOA - PR")) {
            caminho = "/relatorios/carteirinhaTerraBoa.jasper";
        } else if (pessoa.getCidade().equals("PAIÇANDU - PR")) {
            caminho = "/relatorios/carteirinhaPaicandu.jasper";
        } else if (pessoa.getCidade().equals("MUNHOZ DE MELO - PR")) {
            caminho = "/relatorios/carteirinhaMunhozMelo.jasper";
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma Cidade Selecionada");
        }
//       
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFormulario = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        campoDtNascimento = new javax.swing.JFormattedTextField();
        jLabelDtNascimento = new javax.swing.JLabel();
        jLabelDtBatismo = new javax.swing.JLabel();
        campoDtBatismo = new javax.swing.JFormattedTextField();
        campoRg = new javax.swing.JFormattedTextField();
        jLabelRg = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        campoCpf = new javax.swing.JFormattedTextField();
        campoNomePai = new javax.swing.JTextField();
        jLabelNomePai = new javax.swing.JLabel();
        jLabelNomeMae = new javax.swing.JLabel();
        campoNomeMae = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        comboBoxCidade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        cbSituacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jlImagem = new javax.swing.JLabel();
        btAdicionarImagem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservacao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        painelFormulario.setBackground(new java.awt.Color(255, 255, 255));

        campoNome.setToolTipText("");
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        try {
            campoDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDtNascimento.setText("Data Nasc.:");

        jLabelDtBatismo.setText("Data Batismo:");

        try {
            campoDtBatismo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelRg.setText("Rg:");

        jLabelCpf.setText("Cpf:");

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        campoNomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomePaiActionPerformed(evt);
            }
        });

        jLabelNomePai.setText("Nome do Pai:");

        jLabelNomeMae.setText("Nome da Mãe: ");

        campoNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeMaeActionPerformed(evt);
            }
        });

        jLabelCidade.setText("Cidade:");

        comboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "ATALAIA - PR", "CIANORTE - PR", "JUSSARA - PR", "MUNHOZ DE MELO - PR", "PAINÇANDU - PR", "TERRA BOA - PR" }));
        comboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone:");

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "ATIVO", "INATIVO" }));

        jLabel1.setText("Status:");

        campoId.setEnabled(false);

        jLabelFoto.setText("Foto:");

        jlImagem.setBackground(new java.awt.Color(102, 204, 255));
        jlImagem.setForeground(new java.awt.Color(0, 255, 255));
        jlImagem.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btAdicionarImagem.setText("Adicionar");
        btAdicionarImagem.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btAdicionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarImagemActionPerformed(evt);
            }
        });

        campoObservacao.setColumns(20);
        campoObservacao.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        campoObservacao.setLineWrap(true);
        campoObservacao.setRows(5);
        campoObservacao.setTabSize(10);
        campoObservacao.setToolTipText("");
        campoObservacao.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(campoObservacao);

        jLabel3.setText("Observação:");

        javax.swing.GroupLayout painelFormularioLayout = new javax.swing.GroupLayout(painelFormulario);
        painelFormulario.setLayout(painelFormularioLayout);
        painelFormularioLayout.setHorizontalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRg)
                    .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campoDtNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDtNascimento, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoDtBatismo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDtBatismo))
                .addContainerGap(365, Short.MAX_VALUE))
            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelFormularioLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelFormularioLayout.createSequentialGroup()
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormularioLayout.createSequentialGroup()
                                    .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelFormularioLayout.createSequentialGroup()
                                            .addComponent(jLabelNome)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(campoNome))
                                    .addGap(18, 18, 18)
                                    .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCpf)
                                        .addGroup(painelFormularioLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(18, 18, 18))
                        .addGroup(painelFormularioLayout.createSequentialGroup()
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCidade))
                            .addGap(18, 18, 18)
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(painelFormularioLayout.createSequentialGroup()
                                    .addComponent(cbSituacao, 0, 148, Short.MAX_VALUE)
                                    .addGap(18, 18, 18))))
                        .addGroup(painelFormularioLayout.createSequentialGroup()
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelNomePai, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeMae, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomeMae, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNomePai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(84, 144, Short.MAX_VALUE)))
                    .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                            .addComponent(jLabelFoto)
                            .addGap(62, 62, 62)
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                            .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                            .addComponent(btAdicionarImagem)
                            .addGap(81, 81, 81)))
                    .addGap(11, 11, 11)))
        );
        painelFormularioLayout.setVerticalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelDtBatismo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDtBatismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painelFormularioLayout.createSequentialGroup()
                            .addComponent(jLabelRg)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelFormularioLayout.createSequentialGroup()
                            .addComponent(jLabelDtNascimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(278, Short.MAX_VALUE))
            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelFormularioLayout.createSequentialGroup()
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(painelFormularioLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabelFoto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelFormularioLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btAdicionarImagem))
                        .addGroup(painelFormularioLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(jLabelNomePai)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCidade)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        painelBotoes.setBackground(new java.awt.Color(243, 243, 243));

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

        btImprimir.setText("Imprimir");
        btImprimir.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
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
                .addComponent(btImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (campoNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoCpf.getText().trim().length() < 14) {
            JOptionPane.showMessageDialog(null, "O campo Cpf é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoRg.getText().trim().length() < 12) {
            JOptionPane.showMessageDialog(null, "O campo Rg é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoCpf.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoDtBatismo.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Batismo é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (comboBoxCidade.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (cbSituacao.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Status é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (jlImagem.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "O campo Foto é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pessoa.setNome(campoNome.getText().toUpperCase());
                pessoa.setCpf(campoCpf.getText());
                pessoa.setRg(campoRg.getText());
                pessoa.setCidade(comboBoxCidade.getSelectedItem().toString().toUpperCase());
                pessoa.setSituacao(cbSituacao.getSelectedItem().toString().toUpperCase());
                pessoa.setNomeMae(campoNomeMae.getText().toUpperCase());
                pessoa.setNomePai(campoNomePai.getText().toUpperCase());
                pessoa.setTelefone(campoTelefone.getText().toUpperCase());
                pessoa.setObservacao(campoObservacao.getText().toUpperCase());
                pessoa.setDataBatismo(campoDtBatismo.getText());
                pessoa.setDataNascimento(campoDtNascimento.getText());
                pessoa.setFoto(img);
                if (pessoa.getId() == null) {
                    daoPessoa.salvar(pessoa);
                    JOptionPane.showMessageDialog(this, "Cadastro Realizado com sucesso!");
                    pessoa = new Pessoa();
                    mImg = new ManipularImagem();
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

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void campoNomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomePaiActionPerformed

    private void campoNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeMaeActionPerformed

    private void comboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCidadeActionPerformed

    }//GEN-LAST:event_comboBoxCidadeActionPerformed

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

    String cdd;

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
        } else if (campoCpf.getText().trim().length() < 14) {
            JOptionPane.showMessageDialog(null, "O campo Cpf é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoRg.getText().trim().length() < 12) {
            JOptionPane.showMessageDialog(null, "O campo Rg é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoDtNascimento.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoDtBatismo.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Batismo é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (comboBoxCidade.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (cbSituacao.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Status é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (jlImagem.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "O campo Foto é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pessoa.setNome(campoNome.getText().toUpperCase());
                System.out.println("Setando valores");
                pessoa.setCidade(comboBoxCidade.getSelectedItem().toString().toUpperCase());
                pessoa.setSituacao(cbSituacao.getSelectedItem().toString().toUpperCase());
                pessoa.setCpf(campoCpf.getText());
                pessoa.setDataBatismo(campoDtBatismo.getText());
                pessoa.setDataNascimento(campoDtNascimento.getText());
                pessoa.setNomeMae(campoNomeMae.getText().toUpperCase());
                pessoa.setNomePai(campoNomePai.getText().toUpperCase());
                pessoa.setRg(campoRg.getText());
                pessoa.setTelefone(campoTelefone.getText());
                pessoa.setObservacao(campoObservacao.getText());
                pessoa.setFoto(img);
                if (pessoa.getId() != null) {
                    daoPessoa.alterar(pessoa);
                    JOptionPane.showMessageDialog(null, "Cadastro Alterado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    pessoa = new Pessoa();
                    jfMembros.preencherListaMembros(cdd);
                    jfMembros.fecharBotoes();
                    this.dispose();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Fim do método alterar");

        }
    }//GEN-LAST:event_btAlterarActionPerformed

//    public void fecharDialog() {
//        pessoa = new Pessoa();
//        this.setVisible(false);
//        JfMembros jf = new JfMembros();
//        jf.preencherListaMembros();
//    }

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        RelatorioMembros rel = new RelatorioMembros(idMembro, caminho);
        this.setVisible(false);
        rel.setVisible(true);
    }//GEN-LAST:event_btImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(dialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogMembros.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                dialogMembros dialog = new dialogMembros(new javax.swing.JFrame(), true);
                dialogMembros dialog = new dialogMembros();
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
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JFormattedTextField campoDtBatismo;
    private javax.swing.JFormattedTextField campoDtNascimento;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeMae;
    private javax.swing.JTextField campoNomePai;
    private javax.swing.JTextArea campoObservacao;
    private javax.swing.JFormattedTextField campoRg;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JComboBox<String> cbSituacao;
    private javax.swing.JComboBox<String> comboBoxCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDtBatismo;
    private javax.swing.JLabel jLabelDtNascimento;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeMae;
    private javax.swing.JLabel jLabelNomePai;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFormulario;
    // End of variables declaration//GEN-END:variables
}
