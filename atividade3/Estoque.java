package atividade3;

import java.util.ArrayList;

// Classe que representa o estoque e gerencia os itens
public class Estoque {
    private ArrayList<ItemEstoque> itens;

    // Construtor para inicializar o estoque
    public Estoque() {
        itens = new ArrayList<>();
    }

    // Adiciona um novo item ao estoque
    public void adicionarItem(String nome, int quantidade) {
        itens.add(new ItemEstoque(nome, quantidade));
    }

    // Remove um item do estoque pelo nome
    public void removerItem(String nome) {
        ItemEstoque itemParaRemover = null;
        for (ItemEstoque item : itens) {
            if (item.getNome().equals(nome)) {
                itemParaRemover = item;
                break;
            }
        }
        if (itemParaRemover != null) {
            itens.remove(itemParaRemover);
        }
    }

    // Atualiza a quantidade de um item no estoque pelo nome
    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (ItemEstoque item : itens) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }

    // Lista todos os itens no estoque
    public void listarItens() {
        System.out.println("Itens no estoque:");
        for (ItemEstoque item : itens) {
            System.out.println("Nome: " + item.getNome() + ", Quantidade: " + item.getQuantidade());
        }
    }
}
