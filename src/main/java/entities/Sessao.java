/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Andre
 */
public class Sessao {
    private Filme filme;
    private Sala sala;
    private Object dataHora;
    private int[] poltronas = new int[50];

    public Sessao(Filme filme, Sala sala, Object dataHora, int[] poltronas) {
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
        for(int i=0; i < poltronas.length; i++){
            this.poltronas[i] = poltronas[i];
        }
    }

    public Sessao(Filme filme, Sala sala, Object dataHora) {
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
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
    
}
