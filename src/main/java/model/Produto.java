/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andre
 */
public class Produto extends Venda {
        
    private String caminhoImagem;
    
    public Produto(String produto, double valor) {
        super(produto, valor);
    }

    public Produto(String produto, double valor, String caminhoImagem) {
        super(produto, valor);
        this.caminhoImagem = caminhoImagem;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }
  
}
