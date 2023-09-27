package atividade6;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;              // Atributo encapsulado para armazenar o código da turma
    private Disciplina disciplina;      // Atributo encapsulado para representar a disciplina da turma
    private List<Aluno> alunos;         // Lista de alunos na turma

    // Construtor da classe Turma
    public Turma(String codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>(); // Inicializando a lista de alunos
    }

    // Método getter para obter o código da turma
    public String getCodigo() {
        return codigo;
    }

    // Método setter para definir o código da turma
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método getter para obter a disciplina da turma
    public Disciplina getDisciplina() {
        return disciplina;
    }

    // Método setter para definir a disciplina da turma
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // Método getter para obter a lista de alunos na turma
    public List<Aluno> getAlunos() {
        return alunos;
    }

    // Método para adicionar um aluno à lista de alunos da turma
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Sobrescrevendo o método toString() para formatar a saída dos dados da turma
    @Override
    public String toString() {
        return "Turma: " + codigo + ", " + disciplina;
    }
}
