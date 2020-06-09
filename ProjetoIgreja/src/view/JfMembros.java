package view;

import dao.DAOGenerico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Pessoa;
import projetoIgreja.ManipularImagem;
import util.RelatorioMembros;

public class JfMembros extends javax.swing.JInternalFrame implements MouseListener {

    private Pessoa pessoa;
    private DAOGenerico<Pessoa> daoPessoa;
    private List<Pessoa> listaPessoas;
    private ManipularImagem mImg = null;
    private DefaultTableModel model;
    byte[] img = null;
    Long idMembro;
    String cidade;
    public String caminho;

    public JfMembros() {
        pessoa = new Pessoa();
        daoPessoa = new DAOGenerico<Pessoa>(Pessoa.class);
        listaPessoas = new ArrayList<Pessoa>();
        initComponents();
        tabela.addMouseListener(this);
        jlImagem.setOpaque(true);
        jlImagem.setBackground(Color.white);
        jlImagem.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        model = (DefaultTableModel) tabela.getModel();
//        preencherListaMembros();
        btAlterar.setEnabled(false);
        btImprimir.setEnabled(false);
        btExcluir.setEnabled(false);
    }

    public void cdd(String cdd) {
        cidade = cdd;
        preencherListaMembros();
    }

    public void preencherListaMembros() {
        try {
            listaPessoas = daoPessoa.buscarTodos(cidade);
            System.out.println("Cidade: " + cidade );
//          evitar duplicação ao adicionar um novo usuário
            model.setNumRows(0);
            for (Pessoa pessoa : listaPessoas) {
                Object[] dados = {pessoa.getNome(), pessoa.getCpf(), pessoa.getRg()};
                model.addRow(dados);
                tabela.setModel(model);
            }
//            tabela.setRowSorter(new TableRowSorter(model));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void limparCampos() {
        campoId.setText(null);
        campoNome.setText("");
        campoDtBatismo.setText("");
        campoDtNascimento.setText("");
        campoNomeMae.setText("");
        campoNomePai.setText("");
        campoRg.setText("");
        campoCpf.setText("");
//        campoCidade.setText("");
        comboBoxCidade.setSelectedIndex(0);
        campoConsulta.setText("");
        jlImagem.setIcon(null);
        btAlterar.setEnabled(false);
        btSalvar.setEnabled(true);
        btImprimir.setEnabled(false);
        btExcluir.setEnabled(false);
        pessoa = new Pessoa();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBotoes = new javax.swing.JPanel();
        btAlterar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        painelFormulario = new javax.swing.JPanel();
        jLabelRg = new javax.swing.JLabel();
        campoRg = new javax.swing.JFormattedTextField();
        jLabelDtNascimento = new javax.swing.JLabel();
        campoCpf = new javax.swing.JFormattedTextField();
        campoNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        campoDtNascimento = new javax.swing.JFormattedTextField();
        jLabelCidade = new javax.swing.JLabel();
        campoDtBatismo = new javax.swing.JFormattedTextField();
        jLabelDtBatismo = new javax.swing.JLabel();
        jLabelNomePai = new javax.swing.JLabel();
        jLabelNomeMae = new javax.swing.JLabel();
        campoNomePai = new javax.swing.JTextField();
        campoNomeMae = new javax.swing.JTextField();
        jlImagem = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        btAdicionarImagem = new javax.swing.JButton();
        campoId = new javax.swing.JTextField();
        painelConsulta = new javax.swing.JPanel();
        btConsulta = new javax.swing.JButton();
        campoConsulta = new javax.swing.JTextField();
        painelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        comboBoxCidade = new javax.swing.JComboBox<>();

        painelBotoes.setBackground(new java.awt.Color(164, 164, 164));

        btAlterar.setText("Alterar");
        btAlterar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeFechar.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btExcluir.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btImprimir.setText("Imprimir");
        btImprimir.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        painelFormulario.setBackground(new java.awt.Color(248, 248, 248));

        jLabelRg.setText("Rg:");

        try {
            campoRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDtNascimento.setText("Data Nasc :");

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

        campoNome.setToolTipText("");
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jLabelCpf.setText("Cpf:");

        try {
            campoDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCidade.setText("Cidade:");

        try {
            campoDtBatismo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDtBatismo.setText("Data Batismo:");

        jLabelNomePai.setText("Nome do Pai:");

        jLabelNomeMae.setText("Nome da Mãe: ");

        campoNomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomePaiActionPerformed(evt);
            }
        });

        campoNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeMaeActionPerformed(evt);
            }
        });

        jlImagem.setBackground(new java.awt.Color(51, 51, 255));
        jlImagem.setForeground(new java.awt.Color(0, 255, 255));
        jlImagem.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabelFoto.setText("Foto:");

        btAdicionarImagem.setText("Adicionar");
        btAdicionarImagem.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btAdicionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarImagemActionPerformed(evt);
            }
        });

        campoId.setEnabled(false);

        painelConsulta.setBackground(new java.awt.Color(164, 164, 164));

        btConsulta.setText("Buscar");
        btConsulta.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });

        campoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConsultaActionPerformed(evt);
            }
        });

        painelTabela.setBackground(new java.awt.Color(248, 248, 248));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cpf", "Rg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(painelTabela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConsulta))
                .addGap(17, 17, 17)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        comboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "ATALAIA - PR", "CIANORTE - PR", "JUSSARA - PR", "MUNHOZ DE MELO - PR", "PAINÇANDU - PR", "TERRA BOA - PR" }));
        comboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFormularioLayout = new javax.swing.GroupLayout(painelFormulario);
        painelFormulario.setLayout(painelFormularioLayout);
        painelFormularioLayout.setHorizontalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormularioLayout.createSequentialGroup()
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
                                        .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelFormularioLayout.createSequentialGroup()
                                        .addComponent(campoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoDtBatismo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDtBatismo))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelRg)
                                            .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelNomePai)
                                    .addComponent(jLabelDtNascimento)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jLabelNomeMae)
                                    .addComponent(campoNomeMae)
                                    .addComponent(campoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelFoto)
                        .addGap(62, 62, 62)
                        .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                        .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                        .addComponent(btAdicionarImagem)
                        .addGap(91, 91, 91))))
        );
        painelFormularioLayout.setVerticalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDtBatismo)
                            .addComponent(jLabelDtNascimento)
                            .addComponent(jLabelRg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDtBatismo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomePai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabelFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdicionarImagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addGap(46, 46, 46)
                .addComponent(btImprimir)
                .addGap(33, 33, 33)
                .addComponent(btFechar)
                .addContainerGap())
            .addComponent(painelFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(painelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConsultaActionPerformed

    }//GEN-LAST:event_campoConsultaActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        if (campoConsulta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum nome informado!");
        } else {
            listaPessoas = daoPessoa.buscarPorNome(campoConsulta.getText());
            try {
                model.setNumRows(0);
                for (Pessoa p : listaPessoas) {
                    Object[] dados = {p.getNome(), p.getCpf(), p.getRg()};
                    model.addRow(dados);
                    tabela.setModel(model);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btConsultaActionPerformed

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

    private void campoNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeMaeActionPerformed

    private void campoNomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomePaiActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
        btSalvar.setEnabled(true);
        btImprimir.setEnabled(false);
        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
        preencherListaMembros();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (campoNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoCpf.getText().trim().length() < 14) {
            JOptionPane.showMessageDialog(null, "O campo Cpf é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoRg.getText().trim().length() < 12) {
            JOptionPane.showMessageDialog(null, "O campo Rg é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoDtBatismo.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Batismo é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoCpf.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (comboBoxCidade.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (jlImagem.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "O campo Foto é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pessoa.setNome(campoNome.getText().toUpperCase());
                pessoa.setCpf(campoCpf.getText());
                pessoa.setRg(campoRg.getText());
                pessoa.setCidade(comboBoxCidade.getSelectedItem().toString().toUpperCase());
                pessoa.setNomeMae(campoNomeMae.getText().toUpperCase());
                pessoa.setNomePai(campoNomePai.getText().toUpperCase());
                pessoa.setDataBatismo(campoDtBatismo.getText());
                pessoa.setDataNascimento(campoDtNascimento.getText());
                pessoa.setFoto(img);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Foto " + pessoa.getFoto());
            if (pessoa.getId() == null) {
                daoPessoa.salvar(pessoa);
                JOptionPane.showMessageDialog(this, "Cadastro Realizado com sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Ja existe usuario cadastro nesse id " + pessoa.getId());
            }
            System.out.println("Cadastro Realizado com sucesso!!!");
        }
        preencherListaMembros();
        mImg = new ManipularImagem();
        pessoa = new Pessoa();
    }//GEN-LAST:event_btSalvarActionPerformed


    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        RelatorioMembros rel = new RelatorioMembros(idMembro, caminho);
        rel.setVisible(true);
    }//GEN-LAST:event_btImprimirActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            if (tabela.getSelectedRow() != -1) {
                int resposta = 0;
                resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir esse membro?");
                if (resposta == JOptionPane.YES_OPTION) {
                    pessoa.setId(idMembro);
                    daoPessoa.excluir(pessoa.getId());
                    preencherListaMembros();
                    JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!");
                }
                btAlterar.setEnabled(false);
                btImprimir.setEnabled(false);
                limparCampos();
                btSalvar.setEnabled(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro " + e);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        System.out.println("Dentro do método alterar");
        int indice = tabela.getSelectedRow();
        pessoa = listaPessoas.get(indice);

        if (campoNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoCpf.getText().trim().length() < 14) {
            JOptionPane.showMessageDialog(null, "O campo Cpf é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoRg.getText().trim().length() < 12) {
            JOptionPane.showMessageDialog(null, "O campo Rg é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoDtBatismo.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Batismo é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (campoCpf.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "O campo Data Nasc é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (comboBoxCidade.getSelectedItem().equals("SELECIONAR")) {
            JOptionPane.showMessageDialog(null, "O campo Cidade é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else if (jlImagem.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "O campo Foto é obrigatório!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                pessoa.setNome(campoNome.getText().toUpperCase());
//                pessoa.setCidade(campoCidade.getText().toUpperCase());
                pessoa.setCidade(comboBoxCidade.getSelectedItem().toString().toUpperCase());
                pessoa.setCpf(campoCpf.getText());
                pessoa.setDataBatismo(campoDtBatismo.getText());
                pessoa.setDataNascimento(campoDtNascimento.getText());
                pessoa.setNomeMae(campoNomeMae.getText().toUpperCase());
                pessoa.setNomePai(campoNomePai.getText().toUpperCase());
                pessoa.setRg(campoRg.getText());
                pessoa.setFoto(img);

                if (pessoa.getId() != null) {
                    daoPessoa.alterar(pessoa);
                    JOptionPane.showMessageDialog(null, "Cadastro Alterado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                    btSalvar.setEnabled(true);
                    btAlterar.setEnabled(false);
                    btImprimir.setEnabled(false);
                    preencherListaMembros();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void comboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCidadeActionPerformed

    }//GEN-LAST:event_comboBoxCidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarImagem;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField campoConsulta;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JFormattedTextField campoDtBatismo;
    private javax.swing.JFormattedTextField campoDtNascimento;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeMae;
    private javax.swing.JTextField campoNomePai;
    private javax.swing.JFormattedTextField campoRg;
    private javax.swing.JComboBox<String> comboBoxCidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDtBatismo;
    private javax.swing.JLabel jLabelDtNascimento;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeMae;
    private javax.swing.JLabel jLabelNomePai;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            limparCampos();
            btAlterar.setEnabled(true);
            btImprimir.setEnabled(true);
            btExcluir.setEnabled(true);
            btSalvar.setEnabled(false);

            int indice = tabela.getSelectedRow();
            pessoa = listaPessoas.get(indice);
            campoId.setText(pessoa.getId().toString());
            idMembro = pessoa.getId();
            campoNome.setText(pessoa.getNome());
//            campoCidade.setText(pessoa.getCidade());
            comboBoxCidade.setSelectedItem(pessoa.getCidade());
            campoCpf.setText(pessoa.getCpf());
            campoRg.setText(pessoa.getRg());
            campoDtBatismo.setText(pessoa.getDataBatismo());
            campoDtNascimento.setText(pessoa.getDataNascimento());
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
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
