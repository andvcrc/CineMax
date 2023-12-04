/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Andre
 */
public class Carrinho extends AbstractTableModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private final List<Venda> listaVendas = new ArrayList<>();
    private final String[] columns = {"Produto", "Valor"};
    private double valorTotal = 0;

    public Carrinho() {

    }

    @Override
    public String getColumnName(int column) {
        return this.columns[column];
    }

    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Venda getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaVendas.get(rowIndex);
            case 1:
                return listaVendas.get(rowIndex);
        }
        return null;
    }

    public void addRow(Venda venda) {
        this.listaVendas.add(venda);
        this.fireTableDataChanged();
    }

    public void removeRow(int rowIndex) {
        this.listaVendas.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public List<Venda> relatorio() {
        return listaVendas;
    }

    public double calculaValorTotal() {
        if (!listaVendas.isEmpty()) {
            valorTotal = 0;
            for (int i = 0; i < listaVendas.size(); i++) {
                valorTotal += listaVendas.get(i).getValor();
            }
            return valorTotal;
        } else 
            return 0;   
    }
    
}