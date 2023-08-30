package atividade3;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> itens;

    public Estoque() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        itens.add(new ItemEstoque(nome, quantidade));
    }

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

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (ItemEstoque item : itens) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }

    public void listarItens() {
        System.out.println("Itens no estoque:");
        for (ItemEstoque item : itens) {
            System.out.println("Nome: " + item.getNome() + ", Quantidade: " + item.getQuantidade());
        }
    }
}
