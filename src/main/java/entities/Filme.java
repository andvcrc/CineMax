/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Andre
 */
public class Filme {
    private String titulo;
    private String genero;
    private String sinopse;
    private String diretor;
    private int posClasIndicativa;
    private int ano;
    private int duracao;
    private String caminhoImagem;

    public Filme() {
    }

    public Filme(String titulo, String genero, String sinopse, String diretor, int posClasIndicativa, int ano, int duracao, String caminhoImagem) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.posClasIndicativa = posClasIndicativa;
        this.ano = ano;
        this.duracao = duracao;
        this.caminhoImagem = caminhoImagem;
    }
    
    public Filme(String titulo, String genero, String sinopse, String diretor, int posClasIndicativa, int ano, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.posClasIndicativa = posClasIndicativa;
        this.ano = ano;
        this.duracao = duracao;
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

    public int getPosClasIndicativa() {
        return posClasIndicativa;
    }

    public void setPosClasIndicativa(int posClasIndicativa) {
        this.posClasIndicativa = posClasIndicativa;
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

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }
    
}
