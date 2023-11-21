/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Sala;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class GerenciaSala {

    private ArrayList<Sala> listaSalas = new ArrayList<Sala>();

    public GerenciaSala() {
    }

    public boolean adicionar(Sala sala) {
        if (listaSalas.isEmpty()) {
            listaSalas.add(sala);
            return true;
        } else {

            for (int i = 0; i < listaSalas.size(); i++) {
                if (listaSalas.get(i).getNumSala() == sala.getNumSala()) {
                    return false;
                } 
            }
            listaSalas.add(sala);
            return true;
        }
    }

    public ArrayList<Sala> relatorio() {
        return listaSalas;
    }

    public Sala consultar(int index) {
        return listaSalas.get(index);
    }
    
    public void editar(Sala sala, int index) {
        listaSalas.get(index).setStatus(sala.getStatus());
    }
    
    public int index(Sala sala) {
        return listaSalas.indexOf(sala);
    }
}
