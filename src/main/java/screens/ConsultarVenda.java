/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package screens;

import entities.Venda;
import java.util.ArrayList;
import entities.CarrinhoDeCompras;
import managers.GerenciaCarrinhoDeCompras;

/**
 *
 * @author Andre
 */
public class ConsultarVenda extends javax.swing.JInternalFrame {

    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    GerenciaCarrinhoDeCompras gerCarrinho;

    /**
     * Creates new form Vender
     *
     * @param carrinhoDeCompras
     */
    public ConsultarVenda(GerenciaCarrinhoDeCompras gerCarrinho) {
        initComponents();
        this.gerCarrinho = gerCarrinho;
        //tableCarrinhoDeCompras.setModel(carrinhoDeCompras);
        for (int i = 1; i <= gerCarrinho.relatorio().size(); i++) {
            cmbVendas.addItem("" + i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipoIngresso = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCarrinhoDeCompras = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        cmbVendas = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Vendas");
        setMaximumSize(new java.awt.Dimension(418, 468));
        setMinimumSize(new java.awt.Dimension(418, 468));
        setNormalBounds(new java.awt.Rectangle(0, 0, 1098, 648));
        setPreferredSize(new java.awt.Dimension(418, 468));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(406, 446));
        jPanel1.setMinimumSize(new java.awt.Dimension(406, 446));
        jPanel1.setPreferredSize(new java.awt.Dimension(406, 446));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar grande.png"))); // NOI18N
        jLabel1.setText("Consultar Vendas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(6, 6, 338, 42);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 54, 830, 10);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel15.setText("Valor total:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(110, 320, 115, 28);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel16.setText("R$");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(120, 370, 30, 28);

        txtValorTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtValorTotal.setEnabled(false);
        jPanel1.add(txtValorTotal);
        txtValorTotal.setBounds(160, 370, 113, 28);

        tableCarrinhoDeCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableCarrinhoDeCompras.setMaximumSize(new java.awt.Dimension(300, 80));
        tableCarrinhoDeCompras.setMinimumSize(new java.awt.Dimension(300, 80));
        jScrollPane2.setViewportView(tableCarrinhoDeCompras);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(110, 180, 200, 109);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Selecione uma venda:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 70, 177, 22);

        cmbVendas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbVendas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVendasItemStateChanged(evt);
            }
        });
        cmbVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVendasActionPerformed(evt);
            }
        });
        jPanel1.add(cmbVendas);
        cmbVendas.setBounds(240, 70, 120, 28);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(0, 110, 830, 10);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setText("Items:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(110, 140, 80, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVendasActionPerformed

    private void cmbVendasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVendasItemStateChanged
        // TODO add your handling code here:
        tableCarrinhoDeCompras.setModel(gerCarrinho.consultar(cmbVendas.getSelectedIndex()));
        updateValorTotal();
    }//GEN-LAST:event_cmbVendasItemStateChanged

    private void updateValorTotal() {
        txtValorTotal.setText(String.valueOf(gerCarrinho.consultar(cmbVendas.getSelectedIndex()).calculaValorTotal()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbVendas;
    private javax.swing.ButtonGroup grpTipoIngresso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tableCarrinhoDeCompras;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
