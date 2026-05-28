package br.com.etecia.myapp;

public class Livro {

    private String titulo;

    private  String categoria;

    private  int ImgLivro;

    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImgLivro() {
        return ImgLivro;
    }

    public void setImgLivro(int imgLivro) {
        ImgLivro = imgLivro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro(String titulo, String categoria, int imgLivro, double preco) {
        this.titulo = titulo;
        this.categoria = categoria;
        ImgLivro = imgLivro;
        this.preco = preco;
    }
}
