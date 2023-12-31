/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import control.GerenciaCarrinho;
import control.GerenciaFilme;
import control.GerenciaProduto;
import control.GerenciaSala;
import control.GerenciaSessao;

/**
 *
 * @author Andre
 */
public class MainScreen extends javax.swing.JFrame {

    GerenciaFilme gerFilmes = new GerenciaFilme();
    CadastroFilmes cadFilmes = new CadastroFilmes(gerFilmes);
    GerenciaSala gerSalas = new GerenciaSala();
    CadastroSalas cadSalas = new CadastroSalas(gerSalas);
    GerenciaProduto gerProdutos = new GerenciaProduto();
    CadastroProdutos cadProdutos = new CadastroProdutos(gerProdutos);
    GerenciaSessao gerSessao = new GerenciaSessao();
    GerenciaCarrinho gerCarrinho = new GerenciaCarrinho();
    
    
    String imagemDefault = "src/main/resources/images/logo-icon.png";

    public MainScreen() {
        initComponents();
        setIcon();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        telaDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        cadastroFilmes = new javax.swing.JMenuItem();
        consultaFilmes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        cadastroSalas = new javax.swing.JMenuItem();
        consultaSalas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        cadastroProdutos = new javax.swing.JMenuItem();
        consultaProdutos = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        cadastroSessao = new javax.swing.JMenuItem();
        consultaSessao = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnVender = new javax.swing.JMenuItem();
        btnConsultarVenda = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu9.setText("File");
        jMenuBar2.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar2.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineMax");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(650, 400));

        jPanel1.add(jSeparator1);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copyright.png"))); // NOI18N
        jLabel2.setText("CineMax - Desenvolvido por André Victor Ribeiro Carvalho");
        jPanel1.add(jLabel2);

        telaDesktop.setBackground(new java.awt.Color(62, 130, 195));

        javax.swing.GroupLayout telaDesktopLayout = new javax.swing.GroupLayout(telaDesktop);
        telaDesktop.setLayout(telaDesktopLayout);
        telaDesktopLayout.setHorizontalGroup(
            telaDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        telaDesktopLayout.setVerticalGroup(
            telaDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registro.png"))); // NOI18N
        jMenu1.setText("Cadastros   |");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(110, 38));
        jMenu1.setMinimumSize(new java.awt.Dimension(110, 38));
        jMenu1.setPreferredSize(new java.awt.Dimension(110, 38));

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filme.png"))); // NOI18N
        jMenu4.setText("Filmes");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cadastroFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        cadastroFilmes.setText("Cadastrar");
        cadastroFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFilmesActionPerformed(evt);
            }
        });
        jMenu4.add(cadastroFilmes);

        consultaFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar.png"))); // NOI18N
        consultaFilmes.setText("Consultar");
        consultaFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaFilmesActionPerformed(evt);
            }
        });
        jMenu4.add(consultaFilmes);

        jMenu1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sala.png"))); // NOI18N
        jMenu5.setText("Salas");
        jMenu5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cadastroSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        cadastroSalas.setText("Cadastrar");
        cadastroSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalasActionPerformed(evt);
            }
        });
        jMenu5.add(cadastroSalas);

        consultaSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar.png"))); // NOI18N
        consultaSalas.setText("Consultar");
        consultaSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaSalasActionPerformed(evt);
            }
        });
        jMenu5.add(consultaSalas);

        jMenu1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refrigerante.png"))); // NOI18N
        jMenu7.setText("Produtos");
        jMenu7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cadastroProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        cadastroProdutos.setText("Cadastrar");
        cadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProdutosActionPerformed(evt);
            }
        });
        jMenu7.add(cadastroProdutos);

        consultaProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar.png"))); // NOI18N
        consultaProdutos.setText("Consultar");
        consultaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdutosActionPerformed(evt);
            }
        });
        jMenu7.add(consultaProdutos);

        jMenu1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sessao.png"))); // NOI18N
        jMenu8.setText("Sessão");
        jMenu8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cadastroSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar.png"))); // NOI18N
        cadastroSessao.setText("Cadastro");
        cadastroSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSessaoActionPerformed(evt);
            }
        });
        jMenu8.add(cadastroSessao);

        consultaSessao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar.png"))); // NOI18N
        consultaSessao.setText("Consultar");
        consultaSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaSessaoActionPerformed(evt);
            }
        });
        jMenu8.add(consultaSessao);

        jMenu1.add(jMenu8);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reservas.png"))); // NOI18N
        jMenu2.setText("Vendas   |");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnVender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrinho.png"))); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jMenu2.add(btnVender);

        btnConsultarVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsultarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar.png"))); // NOI18N
        btnConsultarVenda.setText("Consultar Venda");
        btnConsultarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVendaActionPerformed(evt);
            }
        });
        jMenu2.add(btnConsultarVenda);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/relatorio.png"))); // NOI18N
        jMenu3.setText("Relatórios   |");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filme.png"))); // NOI18N
        jMenuItem3.setText("Filmes");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sala.png"))); // NOI18N
        jMenuItem4.setText("Salas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refrigerante.png"))); // NOI18N
        jMenuItem5.setText("Produtos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sessao.png"))); // NOI18N
        jMenuItem6.setText("Sessao");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrinho.png"))); // NOI18N
        jMenuItem7.setText("Vendas");
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        jMenu6.setText("Sair");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(telaDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(telaDesktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void cadastroFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFilmesActionPerformed
        telaCadastro(cadFilmes);
    }//GEN-LAST:event_cadastroFilmesActionPerformed

    private void consultaFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaFilmesActionPerformed
        if (gerFilmes.relatorio().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum filme cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            ConsultaFilmes conFilmes = new ConsultaFilmes(gerFilmes);
            if (conFilmes.isVisible()) {
                conFilmes.toFront();
                conFilmes.requestFocus();
            } else {
                centralizaJif(conFilmes);
            }
        }
    }//GEN-LAST:event_consultaFilmesActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void cadastroSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalasActionPerformed
        telaCadastro(cadSalas);
    }//GEN-LAST:event_cadastroSalasActionPerformed

    private void consultaSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaSalasActionPerformed
        // TODO add your handling code here:
        if (gerSalas.relatorio().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhuma sala cadastrada!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            ConsultaSalas conSalas = new ConsultaSalas(gerSalas);
            if (conSalas.isVisible()) {
                conSalas.toFront();
                conSalas.requestFocus();
            } else {
                centralizaJif(conSalas);
            }
        }
    }//GEN-LAST:event_consultaSalasActionPerformed

    private void cadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProdutosActionPerformed
        telaCadastro(cadProdutos);
    }//GEN-LAST:event_cadastroProdutosActionPerformed

    private void consultaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdutosActionPerformed
        if (gerProdutos.relatorio().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum produto cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            ConsultaProdutos conProdutos = new ConsultaProdutos(gerProdutos);
            if (conProdutos.isVisible()) {
                conProdutos.toFront();
                conProdutos.requestFocus();
            } else {
                centralizaJif(conProdutos);
            }
        }
    }//GEN-LAST:event_consultaProdutosActionPerformed

    private void cadastroSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSessaoActionPerformed
        if (gerFilmes.relatorio().isEmpty() || gerSalas.relatorio().isEmpty()) {
            if(gerFilmes.relatorio().isEmpty())
                JOptionPane.showMessageDialog(this, "Nenhum filme cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
            if(gerSalas.relatorio().isEmpty())
                JOptionPane.showMessageDialog(this, "Nenhuma sala cadastrada!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            CadastroSessao cadSessao = new CadastroSessao(gerFilmes, gerSalas, gerSessao);
            telaCadastro(cadSessao);
        }
    }//GEN-LAST:event_cadastroSessaoActionPerformed

    private void consultaSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaSessaoActionPerformed
        if (gerSessao.relatorio().isEmpty() || gerFilmes.relatorio().isEmpty() || gerSalas.relatorio().isEmpty()) {
            if(gerSessao.relatorio().isEmpty())
               JOptionPane.showMessageDialog(this, "Nenhuma sessão cadastrada!", "Erro!", JOptionPane.ERROR_MESSAGE);
            if(gerFilmes.relatorio().isEmpty())
                JOptionPane.showMessageDialog(this, "Nenhum filme cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
            if(gerSalas.relatorio().isEmpty())
                JOptionPane.showMessageDialog(this, "Nenhuma sala cadastrada!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            ConsultaSessao conSessao = new ConsultaSessao(gerFilmes, gerSalas, gerSessao);
            if (conSessao.isVisible()) {
                conSessao.toFront();
                conSessao.requestFocus();
            } else {
                centralizaJif(conSessao);
            }
        }
    }//GEN-LAST:event_consultaSessaoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        if (gerProdutos.relatorio().isEmpty() || gerSessao.relatorio().isEmpty()) {
            if(gerProdutos.relatorio().isEmpty())
                JOptionPane.showMessageDialog(this, "Nenhum produto cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
            if(gerSessao.relatorio().isEmpty())
                JOptionPane.showMessageDialog(this, "Nenhuma sessão cadastrada!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            Vender vender = new Vender(gerSessao, gerProdutos, gerCarrinho);
            telaCadastro(vender);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnConsultarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVendaActionPerformed
        // TODO add your handling code here:
        ConsultarVenda conVenda = new ConsultarVenda(gerCarrinho);
        if (gerSessao.relatorio().isEmpty() || gerFilmes.relatorio().isEmpty() || gerSalas.relatorio().isEmpty()) {
            if(gerCarrinho.relatorio().isEmpty())
               JOptionPane.showMessageDialog(this, "Nenhuma venda!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (conVenda.isVisible()) {
                conVenda.toFront();
                conVenda.requestFocus();
            } else {
                centralizaJif(conVenda);
            }
        }
    }//GEN-LAST:event_btnConsultarVendaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    private void centralizaJif(Component jif) {
        telaDesktop.add(jif);
        jif.setLocation((telaDesktop.getWidth() - jif.getWidth()) / 2, (telaDesktop.getHeight() - jif.getHeight()) / 2);
        jif.setVisible(true);
    }
    
    private void setIcon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(imagemDefault));
    }
    
    public void telaCadastro(JInternalFrame frame) {
        if (frame.isVisible()) {
            frame.toFront();
            frame.requestFocus();
        } else {
            centralizaJif(frame);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnConsultarVenda;
    private javax.swing.JMenuItem btnVender;
    private javax.swing.JMenuItem cadastroFilmes;
    private javax.swing.JMenuItem cadastroProdutos;
    private javax.swing.JMenuItem cadastroSalas;
    private javax.swing.JMenuItem cadastroSessao;
    private javax.swing.JMenuItem consultaFilmes;
    private javax.swing.JMenuItem consultaProdutos;
    private javax.swing.JMenuItem consultaSalas;
    private javax.swing.JMenuItem consultaSessao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JDesktopPane telaDesktop;
    // End of variables declaration//GEN-END:variables
}
