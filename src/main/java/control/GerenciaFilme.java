/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.FilmeDAO;
import model.Filme;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFTM
 */
public class GerenciaFilme {

    private ArrayList<Filme> listaFilme = new ArrayList<Filme>();

    public GerenciaFilme() {
    }

    public void adicionar(Filme filme) {
        listaFilme.add(filme);
        new FilmeDAO().salvar(filme);
    }

    public Filme consultar(int posicao) {
        //return (listaFilme.get(posicao));
        return new FilmeDAO().encontrar(posicao);
    }

    public List<Filme> relatorio() {
        return new FilmeDAO().getList();
    }

    public void editar(Filme filme, int posicao) {
        listaFilme.get(posicao).setTitulo(filme.getTitulo());
        listaFilme.get(posicao).setGenero(filme.getGenero());
        listaFilme.get(posicao).setSinopse(filme.getSinopse());
        listaFilme.get(posicao).setDiretor(filme.getDiretor());
        listaFilme.get(posicao).setPosClasIndicativa(filme.getPosClasIndicativa());
        listaFilme.get(posicao).setAno(filme.getAno());
        listaFilme.get(posicao).setDuracao(filme.getDuracao());
        if (filme.getCaminhoImagem() == null) {
            return;
        } else {
            listaFilme.get(posicao).setCaminhoImagem(filme.getCaminhoImagem());
        }
    }
    
    public void excluir(int pos) {
        listaFilme.remove(pos);
    }
    
    public int index(Filme filme) {
        return listaFilme.indexOf(filme);
    }

}
