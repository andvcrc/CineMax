/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package screens;

import entities.Filme;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import managers.GerenciaFilme;

/**
 *
 * @author Andre
 */
public class ConsultaFilmes extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroFilmes
     */
    GerenciaFilme gerFilme;
    String imagemDefault = "src/main/resources/images/cartaz.png";

    public ConsultaFilmes(GerenciaFilme gerFilme) {
        this.gerFilme = gerFilme;
        initComponents();
        estadoInicial();
        gerFilme.relatorio().forEach(el -> cmbSelecionarFilme.addItem(el.getTitulo()));

        // Dimension dimensao = lblCartaz.getSize();
        //lblCartaz.setMaximumSize(dimensao);
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
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbClassificacao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDuracao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopse = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImagem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbSelecionarFilme = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setTitle("Cadastro de Filmes");
        setMaximumSize(new java.awt.Dimension(650, 730));
        setMinimumSize(new java.awt.Dimension(650, 730));
        setPreferredSize(new java.awt.Dimension(650, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar grande.png"))); // NOI18N
        jLabel1.setText("Consultar Filmes");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Título:");

        txtTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTitulo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Classificação:");

        cmbClassificacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "10 Anos", "12 Anos", "14 Anos", "16 Anos", "18 Anos" }));
        cmbClassificacao.setToolTipText("Selecione");
        cmbClassificacao.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Diretor:");

        txtDiretor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDiretor.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Gênero:");

        txtGenero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtGenero.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Duração (hh:mm):");

        txtDuracao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDuracao.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Ano:");

        txtAno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAno.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Sinopse:");

        txtSinopse.setColumns(20);
        txtSinopse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSinopse.setRows(5);
        txtSinopse.setEnabled(false);
        jScrollPane1.setViewportView(txtSinopse);

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/confirme.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnConsultar.setText("Pesquisar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartaz.png"))); // NOI18N
        btnImagem.setMaximumSize(new java.awt.Dimension(180, 260));
        btnImagem.setMinimumSize(new java.awt.Dimension(180, 260));
        btnImagem.setPreferredSize(new java.awt.Dimension(180, 260));
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel10.setText("Selecione um filme:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Cartaz:");

        cmbSelecionarFilme.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbSelecionarFilme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSelecionarFilme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsultar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnExcluir)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cmbClassificacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(11, 11, 11))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(jLabel10)
                    .addComponent(cmbSelecionarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
        // TODO add your handling code here:
        JFileChooser navegador = new JFileChooser();
        navegador.setDialogTitle("Escolha a nova imagem para o cartaz:");

        FileFilter[] removeFiltroDefault = navegador.getChoosableFileFilters();
        navegador.removeChoosableFileFilter(removeFiltroDefault[0]);
        navegador.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        navegador.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int retorno = navegador.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            BufferedImage imagem;
            File file = navegador.getSelectedFile();
            try {
                imagem = ImageIO.read(file);
                btnImagem.setIcon(new ImageIcon(imagem.getScaledInstance(180, 260, 100)));
            } catch (IOException ex) {
                Logger.getLogger(ConsultaFilmes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImagemActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int codigo = 0;
        Filme filme = gerFilme.consultar(codigo);
        txtAno.setText(String.valueOf(filme.getAno()));
        txtTitulo.setText(filme.getTitulo());
        txtDiretor.setText(filme.getDiretor());
        txtDuracao.setText(String.valueOf(filme.getDuracao()));
        txtGenero.setText(filme.getGenero());
        txtSinopse.setText(filme.getSinopse());
        cmbClassificacao.setSelectedIndex(filme.getPosClasIndicativa());
        carregaImagem(filme.getCaminhoImagem());
        estadoPesquisa();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:

        estadoPosEditarSalvar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        estadoEditar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        estadoInicial();
    }//GEN-LAST:event_btnExcluirActionPerformed

    public boolean confereLista(ArrayList<Filme> listaFilmes) {
        if (listaFilmes.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void limparCampos() {
        txtAno.setText("");
        txtDiretor.setText("");
        txtDuracao.setText("");
        txtGenero.setText("");
        txtSinopse.setText("");
        txtTitulo.setText("");
        cmbClassificacao.setSelectedIndex(0);
    }

    public void estadoInicial() {
        limparCampos();
        txtAno.setEnabled(false);
        txtDiretor.setEnabled(false);
        txtDuracao.setEnabled(false);
        txtGenero.setEnabled(false);
        txtSinopse.setEnabled(false);
        txtTitulo.setEnabled(false);
        btnExcluir.setEnabled(false);
        cmbClassificacao.setEnabled(false);
        cmbClassificacao.setSelectedIndex(0);
        btnSalvar.setEnabled(false);
        btnImagem.setEnabled(false);
        btnEditar.setEnabled(false);
        carregaImagem(imagemDefault);
    }
    
    public void estadoPosEditarSalvar() {
        txtAno.setEnabled(false);
        txtDiretor.setEnabled(false);
        txtDuracao.setEnabled(false);
        txtGenero.setEnabled(false);
        txtSinopse.setEnabled(false);
        txtTitulo.setEnabled(false);
        btnExcluir.setEnabled(false);
        cmbClassificacao.setEnabled(false);
        cmbClassificacao.setSelectedIndex(0);
        btnSalvar.setEnabled(false);
        btnImagem.setEnabled(false);
        btnEditar.setEnabled(true);
    }
    
    public void estadoPesquisa() {
        btnEditar.setEnabled(true);
    }

    public void estadoEditar() {
        btnEditar.setEnabled(false);
        cmbClassificacao.setEnabled(true);
        txtAno.setEnabled(true);
        txtDiretor.setEnabled(true);
        txtDuracao.setEnabled(true);
        txtGenero.setEnabled(true);
        txtSinopse.setEnabled(true);
        txtTitulo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnImagem.setEnabled(true);
    }

    public void carregaImagem(String caminhoImagem) {
        BufferedImage imagem;
        File file = new File(caminhoImagem);
        if (!caminhoImagem.equals(imagemDefault)) {
            try {
                imagem = ImageIO.read(file);
                btnImagem.setIcon(new ImageIcon(imagem.getScaledInstance(180, 260, 100)));
            } catch (IOException ex) {
                Logger.getLogger(ConsultaFilmes.class.getName()).log(Level.SEVERE, "Imagem não encontrada!", ex);
            }
        } else {
            try {
                imagem = ImageIO.read(file);
                btnImagem.setIcon(new ImageIcon(imagem));
            } catch (IOException ex) {
                Logger.getLogger(ConsultaFilmes.class.getName()).log(Level.SEVERE, "Imagem não encontrada!", ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImagem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbClassificacao;
    private javax.swing.JComboBox<String> cmbSelecionarFilme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextArea txtSinopse;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
