/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.CarrinhoDAO;
import model.Carrinho;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class GerenciaCarrinho {
    private ArrayList<Carrinho> listaCarrinho = new ArrayList<>();

    public GerenciaCarrinho() {
    }
    
    public void adicionar(Carrinho carrinhoDeCompras) {
        listaCarrinho.add(carrinhoDeCompras);
        new CarrinhoDAO().salvar(carrinhoDeCompras);
    }
    
    public List<Carrinho> relatorio() {
        try {
            return new CarrinhoDAO().getList();
        } catch (Exception e) {
            return null;
        }
    }
    
    public Carrinho consultar(int index) {
        return new CarrinhoDAO().encontrar(index);
    }
}
