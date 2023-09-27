package atividade6;

public class Aluno extends Pessoa {
    private String matricula; // Atributo encapsulado para armazenar a matrícula do aluno

    // Construtor da classe Aluno que chama o construtor da classe base (Pessoa)
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    // Método getter para obter a matrícula do aluno
    public String getMatricula() {
        return matricula;
    }

    // Método setter para definir a matrícula do aluno
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobrescrevendo o método toString() para formatar a saída dos dados do aluno
    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula;
    }
}
