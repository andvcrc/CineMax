/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class Sessao {
    private Filme filme;
    private Sala sala;
    private Object dataHora;
    private List<Integer> poltronasReservadas = new ArrayList<Integer>();
    private ArrayList<Integer> poltronas = new ArrayList<Integer>();

    public Sessao(Filme filme, Sala sala, Object dataHora, ArrayList<Integer> poltronas) {
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
        for(int i=0; i < 50; i++){
            this.poltronas.add(poltronas.get(i));
        }
    }

    public Sessao(Filme filme, Sala sala, Object dataHora) {
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
        for(int i=0; i < 50; i++){
            poltronas.add(1+i);
        }
    }

    public Sessao() {
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Object getDataHora() {
        return dataHora;
    }

    public void setDataHora(Object hora) {
        this.dataHora = hora;
    } 

    public ArrayList<Integer> getPoltronas() {
        return poltronas;
    }
    
    public void reservaPoltrona(int poltrona) {
        poltronas.remove(poltrona-1);
        poltronasReservadas.add(poltrona);
    }

    public void setPoltronas(ArrayList<Integer> poltronas) {
        this.poltronas = poltronas;
    }
    
}
