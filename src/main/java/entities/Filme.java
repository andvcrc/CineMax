/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.nio.file.Path;

/**
 *
 * @author Andre
 */
public class Filme {
    private int codFilme;
    private String titulo;
    private String genero;
    private String sinopse;
    private String diretor;
    private String clasIndicativa;
    private int ano;
    private int duracao;
    private String caminhoImagem;

    public Filme() {
    }

    public Filme(int codFilme, String titulo, String genero, String sinopse, String diretor, String clasIndicativa, int ano, int duracao, String caminhoImagem) {
        this.codFilme = codFilme;
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.clasIndicativa = clasIndicativa;
        this.ano = ano;
        this.duracao = duracao;
        this.caminhoImagem = caminhoImagem;
    }

    public Filme(String titulo, String genero, String sinopse, String diretor, String clasIndicativa, int ano, int duracao, String caminhoImagem) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.clasIndicativa = clasIndicativa;
        this.ano = ano;
        this.duracao = duracao;
        this.caminhoImagem = caminhoImagem;
    }

    public int getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(int codFilme) {
        this.codFilme = codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getClasIndicativa() {
        return clasIndicativa;
    }

    public void setClasIndicativa(String clasIndicativa) {
        this.clasIndicativa = clasIndicativa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public String getCaminho() {
        return caminhoImagem;
    }

    public void setCaminho(String caminho) {
        this.caminhoImagem = caminho;
    }
    
    
}
