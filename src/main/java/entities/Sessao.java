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
    private int codSessao;
    private Filme filme;
    private Sala sala;
    private String hora;

    public Sessao(int codSessao, Filme filme, Sala sala, String hora) {
        this.codSessao = codSessao;
        this.filme = filme;
        this.sala = sala;
        this.hora = hora;
    }

    public Sessao(Filme filme, Sala sala, String hora) {
        this.filme = filme;
        this.sala = sala;
        this.hora = hora;
    }

    public Sessao() {
    }

    public int getCodSessao() {
        return codSessao;
    }

    public void setCodSessao(int codSessao) {
        this.codSessao = codSessao;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    } 
    
}
