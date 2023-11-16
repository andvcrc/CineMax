/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;

import entities.Ingresso;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class GerenciaIngresso {
    private ArrayList<Ingresso> listaIngresso;

    public GerenciaIngresso() {
    }
    
    public Ingresso consultar(int index) {
        return listaIngresso.get(index);
    }
}
