package br.escola.bibliohaydee.app;

import br.escola.bibliohaydee.model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== BIBLIOHAYDEE ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            if (!sc.hasNextLine()) {
                opcao = 0;
            } else {
                try {
                    opcao = Integer.parseInt(sc.nextLine().trim());
                } catch (NumberFormatException e) {
                    opcao = -1;
                }
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();
                    System.out.print("Tipo (ALUNO/PROFESSOR): ");
                    String tipoTexto = sc.nextLine().trim().toUpperCase();

                    try {
                        Usuario.Tipo tipo = Usuario.Tipo.valueOf(tipoTexto);
                        usuarios.add(new Usuario(nome, matricula, tipo));
                        System.out.println("Usuário cadastrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: dados inválidos. Digite o tipo como ALUNO ou PROFESSOR.");
                    }
                }
                case 2 -> {
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        for (Usuario u : usuarios) {
                            System.out.println(u.getNome() + " | " + u.getMatricula() + " | " + u.getTipo());
                        }
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}