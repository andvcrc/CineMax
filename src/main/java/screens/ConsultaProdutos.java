/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package screens;

import entities.Produto;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import managers.GerenciaProduto;

/**
 *
 * @author Andre
 */
public class ConsultaProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroFilmes
     */
    GerenciaProduto gerProduto;
    String imagemDefault = "src/main/resources/images/cartaz.png";
    JFileChooser navegador = new JFileChooser();
    int retornoFileChooser = -2;

    public ConsultaProdutos(GerenciaProduto gerProduto) {
        this.gerProduto = gerProduto;
        initComponents();
        gerProduto.relatorio().forEach(el -> cmbSelecionarProduto.addItem(String.valueOf(el.getNome())));
        removeFiltrosDeBusca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnImagem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cmbSelecionarProduto = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setTitle("Consulta de Produtos");
        setMaximumSize(new java.awt.Dimension(407, 673));
        setMinimumSize(new java.awt.Dimension(407, 673));
        setPreferredSize(new java.awt.Dimension(407, 673));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(395, 631));
        jPanel1.setMinimumSize(new java.awt.Dimension(395, 631));
        jPanel1.setPreferredSize(new java.awt.Dimension(395, 631));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar grande.png"))); // NOI18N
        jLabel1.setText("Consultar Produtos");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Preço:");

        txtPreco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPreco.setEnabled(false);

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirme.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartaz.png"))); // NOI18N
        btnImagem.setEnabled(false);
        btnImagem.setMaximumSize(new java.awt.Dimension(180, 260));
        btnImagem.setMinimumSize(new java.awt.Dimension(180, 260));
        btnImagem.setPreferredSize(new java.awt.Dimension(180, 260));
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Produto:");

        cmbSelecionarProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbSelecionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelecionarProdutoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel11.setText("Selecione um produto:");

        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addGap(40, 40, 40)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtNome)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(112, 112, 112))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
        // TODO add your handling code here:
        navegador.setDialogTitle("Imagem do produto:");

        retornoFileChooser = navegador.showOpenDialog(this);

        if (estadoDoSelecionadorDeArquivos()) {
            BufferedImage imagem;
            File file = navegador.getSelectedFile();
            try {
                imagem = ImageIO.read(file);
                btnImagem.setIcon(new ImageIcon(imagem.getScaledInstance(180, 260, 100)));
            } catch (IOException ex) {
                Logger.getLogger(ConsultaProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImagemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().trim().isEmpty() || txtPreco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não foi possível alterar! \nPreencha todos os campos e tente novamente.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else if (!isNumeric(txtPreco.getText().toString())) {
            JOptionPane.showMessageDialog(this, "Número inválido!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (estadoDoSelecionadorDeArquivos()) {
                if (retornoFileChooser == 0) {
                    Produto produto = new Produto(txtNome.getText(), Double.parseDouble(txtPreco.getText()), navegador.getSelectedFile().getPath());

                    gerProduto.editar(produto, cmbSelecionarProduto.getSelectedIndex());

                    JOptionPane.showMessageDialog(this, "Editado com sucesso!");

                    estadoPosEditarSalvar();
                } else {
                    Produto produto = new Produto(txtNome.getText(), Double.parseDouble(txtPreco.getText()));

                    gerProduto.editar(produto, cmbSelecionarProduto.getSelectedIndex());

                    JOptionPane.showMessageDialog(this, "Editado com sucesso!");

                    estadoPosEditarSalvar();
                    listarProdutos();
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cmbSelecionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelecionarProdutoActionPerformed
        try {
            preencheCampos();
        } catch (Exception e) {
            return;
        }
    }//GEN-LAST:event_cmbSelecionarProdutoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        estadoEditar();
    }//GEN-LAST:event_btnEditarActionPerformed

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void listarProdutos() {
        cmbSelecionarProduto.removeAllItems();
        gerProduto.relatorio().forEach(el -> cmbSelecionarProduto.addItem(String.valueOf(el.getNome())));
    }

    private void estadoEditar() {
        txtNome.setEnabled(true);
        txtPreco.setEnabled(true);
        btnImagem.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnEditar.setEnabled(false);
    }

    private void estadoPosEditarSalvar() {
        txtNome.setEnabled(false);
        txtPreco.setEnabled(false);
        btnImagem.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(true);
    }

    private void preencheCampos() {

        txtNome.setText(gerProduto.consultar(cmbSelecionarProduto.getSelectedIndex()).getNome());
        txtPreco.setText(String.valueOf(gerProduto.consultar(cmbSelecionarProduto.getSelectedIndex()).getPreco()));
        carregaImagem(gerProduto.consultar(cmbSelecionarProduto.getSelectedIndex()).getCaminhoImagem());
    }

    private void limparCampos() {
        txtNome.setText("");
        txtPreco.setText("");
        carregaImagem(imagemDefault);
    }

    private void removeFiltrosDeBusca() {
        FileFilter[] removeFiltroDefault = navegador.getChoosableFileFilters();
        navegador.removeChoosableFileFilter(removeFiltroDefault[0]);
        navegador.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        navegador.setFileSelectionMode(JFileChooser.FILES_ONLY);
    }

    private boolean estadoDoSelecionadorDeArquivos() {
        switch (retornoFileChooser) {
            case JFileChooser.APPROVE_OPTION:
                return true;
            case JFileChooser.CANCEL_OPTION:
                JOptionPane.showMessageDialog(this, "Selecione um arquivo antes de continuar!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return false;
            case JFileChooser.ERROR_OPTION:
                JOptionPane.showMessageDialog(this, "Selecione um arquivo válido antes de continuar!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return false;
            case -2:
                return true;
            default:
                JOptionPane.showMessageDialog(this, "Selecione um arquivo válido antes de continuar!", "Erro!", JOptionPane.ERROR_MESSAGE);
                return false;
        }
    }

    private void carregaImagem(String caminhoImagem) {
        BufferedImage imagem;
        File file = new File(caminhoImagem);
        if (!caminhoImagem.equals(imagemDefault)) {
            try {
                imagem = ImageIO.read(file);
                btnImagem.setIcon(new ImageIcon(imagem.getScaledInstance(180, 260, 100)));
            } catch (IOException ex) {
                Logger.getLogger(ConsultaProdutos.class.getName()).log(Level.SEVERE, "Imagem não encontrada!", ex);
            }
        } else {
            try {
                imagem = ImageIO.read(file);
                btnImagem.setIcon(new ImageIcon(imagem));
            } catch (IOException ex) {
                Logger.getLogger(ConsultaProdutos.class.getName()).log(Level.SEVERE, "Imagem não encontrada!", ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImagem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbSelecionarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
