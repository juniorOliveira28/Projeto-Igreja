package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import util.RelatorioCartaMudanca;
import util.RelatorioCartaRecomendacao;
import util.RelatorioMembrosVerso;

public class JfMenu extends javax.swing.JFrame {

    public JfMenu() {
        this.setIcon();
        initComponents();
        // Maximizando tela principal
        this.setExtendedState(JfMenu.MAXIMIZED_BOTH);

    }

    // método para centralizar JinternalFrame
    // obs procurar uma maneira mais simples de centralizar
    public void abrirFormulario(JInternalFrame janela) {
        int larguraPainel = painel.getWidth();
        int alturaPainel = painel.getHeight();

        int larguraFrame = janela.getWidth();
        int alturaFrame = janela.getHeight();

        janela.setLocation(larguraPainel / 2 - larguraFrame / 2, alturaPainel / 2 - alturaFrame / 2);
        painel.add(janela);
        janela.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogCadastroMembros = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/fundo.png"));
        Image image = icon.getImage();
        painel = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        menu = new javax.swing.JMenuBar();
        mnMembros = new javax.swing.JMenu();
        membrosJussara = new javax.swing.JMenuItem();
        membrosCianorte = new javax.swing.JMenuItem();
        membrosAtalaia = new javax.swing.JMenuItem();
        membrosTerraBoa = new javax.swing.JMenuItem();
        membrosAtalaia1 = new javax.swing.JMenuItem();
        membrosTerraBoa1 = new javax.swing.JMenuItem();
        mnImprimir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnMembrosInativos = new javax.swing.JMenu();
        membrosTerraBoa3 = new javax.swing.JMenuItem();
        mnCartas = new javax.swing.JMenu();
        cartaMudanca = new javax.swing.JMenuItem();
        cartaRecomendacao = new javax.swing.JMenuItem();

        dialogCadastroMembros.setMinimumSize(new java.awt.Dimension(400, 300));
        dialogCadastroMembros.setModal(true);

        jLabel1.setText("Nome:");

        jLabel2.setText("Cpf:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCadastroMembrosLayout = new javax.swing.GroupLayout(dialogCadastroMembros.getContentPane());
        dialogCadastroMembros.getContentPane().setLayout(dialogCadastroMembrosLayout);
        dialogCadastroMembrosLayout.setHorizontalGroup(
            dialogCadastroMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCadastroMembrosLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(dialogCadastroMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar)
                    .addGroup(dialogCadastroMembrosLayout.createSequentialGroup()
                        .addGroup(dialogCadastroMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(57, 57, 57)
                        .addGroup(dialogCadastroMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        dialogCadastroMembrosLayout.setVerticalGroup(
            dialogCadastroMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCadastroMembrosLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(dialogCadastroMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogCadastroMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(btSalvar)
                .addGap(112, 112, 112))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setResizable(false);

        painel.setBackground(new java.awt.Color(62, 89, 122));

        mnMembros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-membros.png"))); // NOI18N
        mnMembros.setMnemonic('M');
        mnMembros.setText("Membros");
        mnMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMembrosActionPerformed(evt);
            }
        });

        membrosJussara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-adicionar-membros2.png"))); // NOI18N
        membrosJussara.setText("Membros Jussara");
        membrosJussara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosJussaraActionPerformed(evt);
            }
        });
        mnMembros.add(membrosJussara);

        membrosCianorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-adicionar-membros1.png"))); // NOI18N
        membrosCianorte.setText("Membros Cianorte");
        membrosCianorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosCianorteActionPerformed(evt);
            }
        });
        mnMembros.add(membrosCianorte);

        membrosAtalaia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-adicionar-membros3.png"))); // NOI18N
        membrosAtalaia.setText("Membros Atalaia");
        membrosAtalaia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosAtalaiaActionPerformed(evt);
            }
        });
        mnMembros.add(membrosAtalaia);

        membrosTerraBoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-adicionar-membros2.png"))); // NOI18N
        membrosTerraBoa.setText("Membros Terra Boa");
        membrosTerraBoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosTerraBoaActionPerformed(evt);
            }
        });
        mnMembros.add(membrosTerraBoa);

        membrosAtalaia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-adicionar-membros1.png"))); // NOI18N
        membrosAtalaia1.setText("Membros Paiçandu");
        membrosAtalaia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosAtalaia1ActionPerformed(evt);
            }
        });
        mnMembros.add(membrosAtalaia1);

        membrosTerraBoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-adicionar-membros3.png"))); // NOI18N
        membrosTerraBoa1.setText("Membros Munhoz de Melo");
        membrosTerraBoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosTerraBoa1ActionPerformed(evt);
            }
        });
        mnMembros.add(membrosTerraBoa1);

        menu.add(mnMembros);

        mnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impressora.png"))); // NOI18N
        mnImprimir.setMnemonic('i');
        mnImprimir.setText("Imprimir");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-impressora.png"))); // NOI18N
        jMenuItem1.setText("Imprimir Verso");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnImprimir.add(jMenuItem1);

        menu.add(mnImprimir);

        mnMembrosInativos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-membro-inativo.png"))); // NOI18N
        mnMembrosInativos.setMnemonic('M');
        mnMembrosInativos.setText("Membros Inativos");
        mnMembrosInativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMembrosInativosActionPerformed(evt);
            }
        });

        membrosTerraBoa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-membros-inativos.png"))); // NOI18N
        membrosTerraBoa3.setText("Membros Inativos");
        membrosTerraBoa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosTerraBoa3ActionPerformed(evt);
            }
        });
        mnMembrosInativos.add(membrosTerraBoa3);

        menu.add(mnMembrosInativos);

        mnCartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartas-icone.png"))); // NOI18N
        mnCartas.setMnemonic('i');
        mnCartas.setText("Cartas");

        cartaMudanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconeCarta.png"))); // NOI18N
        cartaMudanca.setText("Carta de Mudança");
        cartaMudanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaMudancaActionPerformed(evt);
            }
        });
        mnCartas.add(cartaMudanca);

        cartaRecomendacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone-carta-recomendacao.png"))); // NOI18N
        cartaRecomendacao.setText("Carta de Recomendação");
        cartaRecomendacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaRecomendacaoActionPerformed(evt);
            }
        });
        mnCartas.add(cartaRecomendacao);

        menu.add(mnCartas);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void membrosJussaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosJussaraActionPerformed
        JfMembros jf = new JfMembros();
        jf.cdd("JUSSARA - PR");
        abrirFormulario(jf);
    }//GEN-LAST:event_membrosJussaraActionPerformed

    private void mnMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMembrosActionPerformed
    }//GEN-LAST:event_mnMembrosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RelatorioMembrosVerso rel = new RelatorioMembrosVerso();
        rel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void membrosCianorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosCianorteActionPerformed
        JfMembros jf = new JfMembros();
        jf.cdd("CIANORTE - PR");
        abrirFormulario(jf);
    }//GEN-LAST:event_membrosCianorteActionPerformed

    private void membrosAtalaiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosAtalaiaActionPerformed
        JfMembros jf = new JfMembros();
        jf.cdd("ATALAIA - PR");
        abrirFormulario(jf);
    }//GEN-LAST:event_membrosAtalaiaActionPerformed

    private void membrosTerraBoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosTerraBoaActionPerformed
        JfMembros jf = new JfMembros();
        jf.cdd("TERRA BOA - PR");
        abrirFormulario(jf);
    }//GEN-LAST:event_membrosTerraBoaActionPerformed

    private void membrosAtalaia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosAtalaia1ActionPerformed
        JfMembros jf = new JfMembros();
        jf.cdd("PAIÇANDU - PR");
        abrirFormulario(jf);
    }//GEN-LAST:event_membrosAtalaia1ActionPerformed

    private void membrosTerraBoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosTerraBoa1ActionPerformed
        JfMembros jf = new JfMembros();
        jf.cdd("MUNHOZ DE MELO - PR");
        abrirFormulario(jf);
    }//GEN-LAST:event_membrosTerraBoa1ActionPerformed

    private void mnMembrosInativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMembrosInativosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnMembrosInativosActionPerformed

    private void membrosTerraBoa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosTerraBoa3ActionPerformed
        JfMembros jf = new JfMembros();
        jf.cdd("INATIVO");
        abrirFormulario(jf);
    }//GEN-LAST:event_membrosTerraBoa3ActionPerformed

    private void cartaMudancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaMudancaActionPerformed
        RelatorioCartaMudanca rel = new RelatorioCartaMudanca();
        rel.setVisible(true);
    }//GEN-LAST:event_cartaMudancaActionPerformed

    private void cartaRecomendacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaRecomendacaoActionPerformed
        RelatorioCartaRecomendacao rel = new RelatorioCartaRecomendacao();
        rel.setVisible(true);
    }//GEN-LAST:event_cartaRecomendacaoActionPerformed

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
            java.util.logging.Logger.getLogger(JfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoNome;
    private javax.swing.JMenuItem cartaMudanca;
    private javax.swing.JMenuItem cartaRecomendacao;
    private javax.swing.JDialog dialogCadastroMembros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem membrosAtalaia;
    private javax.swing.JMenuItem membrosAtalaia1;
    private javax.swing.JMenuItem membrosCianorte;
    private javax.swing.JMenuItem membrosJussara;
    private javax.swing.JMenuItem membrosTerraBoa;
    private javax.swing.JMenuItem membrosTerraBoa1;
    private javax.swing.JMenuItem membrosTerraBoa3;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu mnCartas;
    private javax.swing.JMenu mnImprimir;
    private javax.swing.JMenu mnMembros;
    private javax.swing.JMenu mnMembrosInativos;
    private javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables
 public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icone.png")));
    }
}
