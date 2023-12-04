/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Andre
 */
public class Sessao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private Filme filme;
    private Sala sala;
    private Date dataHora;
    private List<Integer> poltronasReservadas = new ArrayList<Integer>();
    private ArrayList<Integer> poltronas = new ArrayList<Integer>();

    public Sessao(Filme filme, Sala sala, Date dataHora, ArrayList<Integer> poltronas) {
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
        for(int i=0; i < 50; i++){
            this.poltronas.add(poltronas.get(i));
        }
    }

    public Sessao(Filme filme, Sala sala, Date dataHora) {
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

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date hora) {
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
