package br.escola.bibliohaydee.model;
 
public class Livro {
 
    private String titulo;
    private Autor autor;
    private String isbn;
 
    public Livro(String titulo, Autor autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public Autor getAutor() {
        return autor;
    }
 
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
 
    public String getIsbn() {
        return isbn;
    }
 
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
 
    // Exibe os detalhes do livro
    public void mostrarLivro() {
        System.out.println("=== DADOS DO LIVRO ===");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + (this.autor != null ? this.autor.getNome() : "Desconhecido"));
        System.out.println("ISBN: " + this.isbn);
    }
}
 
 
