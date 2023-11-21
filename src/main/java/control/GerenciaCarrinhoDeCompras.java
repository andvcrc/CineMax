/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.CarrinhoDeCompras;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class GerenciaCarrinhoDeCompras {
    private ArrayList<CarrinhoDeCompras> listaCarrinho = new ArrayList<>();

    public GerenciaCarrinhoDeCompras() {
    }
    
    public void adicionar(CarrinhoDeCompras carrinhoDeCompras) {
        listaCarrinho.add(carrinhoDeCompras);
    }
    
    public ArrayList<CarrinhoDeCompras> relatorio() {
        return listaCarrinho;
    }
    
    public CarrinhoDeCompras consultar(int index) {
        return listaCarrinho.get(index);
    }
}
