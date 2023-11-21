/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class GerenciaProduto {
    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public GerenciaProduto() {
    }
    
    public boolean adicionar(Produto produto) {
        if (listaProdutos.isEmpty()) {
            listaProdutos.add(produto);
            return true;
        } else {

            for (int i = 0; i < listaProdutos.size(); i++) {
                if (listaProdutos.get(i).getNome().equals(produto.getNome())) {
                    return false;
                } 
            }
            listaProdutos.add(produto);
            return true;
        }
    }
    
    public Produto consultar(int index) {
        return listaProdutos.get(index);
    }
    
    public void editar(Produto produto, int index) {
        listaProdutos.get(index).setNome(produto.getNome());
        listaProdutos.get(index).setPreco(produto.getPreco());
        if (produto.getCaminhoImagem() == null) {
            return;
        } else {
            listaProdutos.get(index).setCaminhoImagem(produto.getCaminhoImagem());
        }
    }
    
    public ArrayList<Produto> relatorio() {
        return listaProdutos;
    }
}
