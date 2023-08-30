package atividade3;

// Classe que representa um item no estoque
public class ItemEstoque {
    private String nome;
    private int quantidade;

    // Construtor para criar um novo item no estoque
    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Métodos para acessar informações do item
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
