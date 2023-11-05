/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import entities.Sessao;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class GerenciaSessao {
    ArrayList<Sessao> listaSessao = new ArrayList<Sessao>();

    public GerenciaSessao() {
    }

    
    
    public ArrayList<Sessao> relatorio() {
        return listaSessao;
    }

    public void adicionar(Sessao sessao) {
        listaSessao.add(sessao);
    }

    public Sessao consultar(int index) {
        return listaSessao.get(index);
    }
    
    public void editar(Sessao sessao, int index) {
        listaSessao.get(index).setFilme(sessao.getFilme());
        listaSessao.get(index).setDataHora(sessao.getDataHora());
        listaSessao.get(index).setSala(sessao.getSala());
    }
    
}
