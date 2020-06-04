package view;

import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import util.RelatorioMembrosVerso;

public class JfMenu extends javax.swing.JFrame {

    public JfMenu() {
        initComponents();
        this.setIcon();

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
        painel = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        mnMembros = new javax.swing.JMenu();
        membros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        mnMembros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Membros.png"))); // NOI18N
        mnMembros.setMnemonic('M');
        mnMembros.setText("Membros");
        mnMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMembrosActionPerformed(evt);
            }
        });

        membros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionarMembros.png"))); // NOI18N
        membros.setText("Cadastrar Membros");
        membros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membrosActionPerformed(evt);
            }
        });
        mnMembros.add(membros);

        menu.add(mnMembros);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impressora.png"))); // NOI18N
        jMenu2.setMnemonic('i');
        jMenu2.setText("Imprimir");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impressora.png"))); // NOI18N
        jMenuItem1.setText("Imprimir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        menu.add(jMenu2);

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

    private void membrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membrosActionPerformed
        JfMembros membros = new JfMembros();
        abrirFormulario(membros);
    }//GEN-LAST:event_membrosActionPerformed

    private void mnMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMembrosActionPerformed
    }//GEN-LAST:event_mnMembrosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RelatorioMembrosVerso rel = new RelatorioMembrosVerso();
        rel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JDialog dialogCadastroMembros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem membros;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu mnMembros;
    private javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo-igreja.png")));
    }
}
