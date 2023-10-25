/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import entities.Filme;
import java.util.ArrayList;

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
    
    }
    
    public Filme consultar(int codigo) {
        return (listaFilme.get(codigo));
    }
    
    public ArrayList<Filme> relatorio () {
        return listaFilme;
    }
    
}
