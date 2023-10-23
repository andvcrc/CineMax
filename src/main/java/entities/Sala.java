/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Andre
 */
public class Sala {
    private int numSala;
    private String status;
    private int[] poltronas;

    public Sala() {
    }

    public Sala(int numSala, String status, int numPoltronas, int[] poltronas) {
        this.numSala = numSala;
        this.status = status;
        this.poltronas = new int[numPoltronas];
        for(int i=0; i < poltronas.length; i++){
            this.poltronas[i] = poltronas[i];
        }
    }

    public Sala(int numSala, String status) {
        this.numSala = numSala;
        this.status = status;
    }

    public int[] getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int[] poltronas) {
        this.poltronas = poltronas;
    }
    
    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
