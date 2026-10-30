package br.escola.bibliohaydee.model;

public class Usuario {

    public enum Tipo { ALUNO, PROFESSOR }

    private String nome;
    private String matricula;
    private Tipo tipo;
    private int limiteEmprestimos;
    private int emprestimosAtivos;

    public Usuario(String nome, String matricula, Tipo tipo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula não pode ser vazia.");
        }
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo não pode ser nulo.");
        }
        this.nome = nome.trim();
        this.matricula = matricula.trim();
        this.tipo = tipo;
        this.limiteEmprestimos = (tipo == Tipo.PROFESSOR) ? 5 : 3;
        this.emprestimosAtivos = 0;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public Tipo getTipo() { return tipo; }
    public int getLimiteEmprestimos() { return limiteEmprestimos; }
    public int getEmprestimosAtivos() { return emprestimosAtivos; }

    public boolean podeEmprestar() {
        return emprestimosAtivos < limiteEmprestimos;
    }

    public void registrarEmprestimo() {
        if (!podeEmprestar()) {
            throw new IllegalStateException("Limite de empréstimos atingido.");
        }
        emprestimosAtivos++;
    }

    public void registrarDevolucao() {
        if (emprestimosAtivos > 0) {
            emprestimosAtivos--;
        }
    }

    @Override
    public String toString() {
        return nome + " | matrícula: " + matricula + " | " + tipo
                + " | empréstimos: " + emprestimosAtivos + "/" + limiteEmprestimos;
    }
}