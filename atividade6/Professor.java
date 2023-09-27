package atividade6;

public class Professor extends Pessoa {
    private String disciplina; // Atributo encapsulado para armazenar a disciplina do professor

    // Construtor da classe Professor que chama o construtor da classe base (Pessoa)
    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    // Método getter para obter a disciplina do professor
    public String getDisciplina() {
        return disciplina;
    }

    // Método setter para definir a disciplina do professor
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Sobrescrevendo o método toString() para formatar a saída dos dados do professor
    @Override
    public String toString() {
        return super.toString() + ", Disciplina: " + disciplina;
    }
}
