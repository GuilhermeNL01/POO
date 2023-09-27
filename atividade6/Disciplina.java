package atividade6;

public class Disciplina {
    private String nome; // Atributo encapsulado para armazenar o nome da disciplina

    // Construtor da classe Disciplina
    public Disciplina(String nome) {
        this.nome = nome;
    }

    // Método getter para obter o nome da disciplina
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome da disciplina
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Sobrescrevendo o método toString() para formatar a saída dos dados da disciplina
    @Override
    public String toString() {
        return "Disciplina: " + nome;
    }
}
