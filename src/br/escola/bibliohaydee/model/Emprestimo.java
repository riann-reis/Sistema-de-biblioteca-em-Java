package br.escola.bibliohaydee.model;
 
public class Emprestimo {
 
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;
 
    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
 
    public void mostrarEmprestimo() {
        System.out.println("=== DADOS DO EMPRESTIMO ===");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Leitor: " + usuario.getNome());
        System.out.println("Data do emprestimo: " + dataEmprestimo);
        System.out.println("Data da devolucao: " + dataDevolucao);
    }
 
    public Livro getLivro() {
        return livro;
    }
 
    public Usuario getUsuario() {
        return usuario;
    }
 
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
 
    public String getDataDevolucao() {
        return dataDevolucao;
    }
}
 