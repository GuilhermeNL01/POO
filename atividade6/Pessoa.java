package atividade6;

public class Pessoa {
    private String nome; // Atributo encapsulado para armazenar o nome da pessoa
    private int idade;   // Atributo encapsulado para armazenar a idade da pessoa

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método getter para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Método setter para definir a idade da pessoa
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Sobrescrevendo o método toString() para formatar a saída dos dados da pessoa
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
