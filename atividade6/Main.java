package atividade6;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Disciplina (Matemática)
        Disciplina matematica = new Disciplina("Matemática");

        // Criando uma instância de Turma associada à disciplina de Matemática
        Turma turmaMatematica = new Turma("T1", matematica);

        // Criando instâncias de Aluno
        Aluno aluno1 = new Aluno("João", 20, "12345");
        Aluno aluno2 = new Aluno("Maria", 21, "67890");

        // Adicionando os alunos à turma de Matemática
        turmaMatematica.adicionarAluno(aluno1);
        turmaMatematica.adicionarAluno(aluno2);

        // Criando uma instância de Professor para a disciplina de Matemática
        Professor professor = new Professor("Ana", 35, "Matemática");

        // Exibindo informações da turma
        System.out.println("Dados da Turma:");
        System.out.println(turmaMatematica);

        // Exibindo informações dos alunos na turma
        System.out.println("\nAlunos na Turma:");
        for (Aluno aluno : turmaMatematica.getAlunos()) {
            System.out.println(aluno);
        }

        // Exibindo informações do professor da turma
        System.out.println("\nProfessor da Turma:");
        System.out.println(professor);
    }
}
