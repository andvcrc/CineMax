/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import entities.Produto;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class GerenciaProduto {
    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public GerenciaProduto() {
    }
    
    public void adicionar(Produto produto) {
        listaProdutos.add(produto);
    }
    
    public ArrayList<Produto> relatorio() {
        return listaProdutos;
    }
}
