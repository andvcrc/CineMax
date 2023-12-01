/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andre
 */
public class Ingresso extends Venda {
    
    private Sessao sessao;
    
    public Ingresso(String produto, double valor, Sessao sessao) {
        super(produto, valor);
        this.sessao = sessao;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

}
