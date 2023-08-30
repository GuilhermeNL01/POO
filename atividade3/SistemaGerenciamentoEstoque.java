package atividade3;

import java.util.Scanner;

public class SistemaGerenciamentoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Atualizar quantidade");
            System.out.println("4. Listar itens");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarItem(nome, quantidade);
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String itemRemover = scanner.nextLine();
                    estoque.removerItem(itemRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do item a ser atualizado: ");
                    String itemAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(itemAtualizar, novaQuantidade);
                    break;
                case 4:
                    estoque.listarItens();
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
    }
}
