package atividade2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário para inserir o primeiro número
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            // Solicita ao usuário para inserir o segundo número
            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            // Solicita ao usuário para inserir a operação desejada (+, -, *, /)
            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado = 0;

            // Realiza a operação selecionada pelo usuário
            switch (operacao) {
                case '+':
                    resultado = numero1 + numero2; // Soma
                    break;
                case '-':
                    resultado = numero1 - numero2; // Subtração
                    break;
                case '*':
                    resultado = numero1 * numero2; // Multiplicação
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2; // Divisão, evita divisão por zero
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }

            // Exibe o resultado da operação
            System.out.println("Resultado: " + resultado);
        }
    }
}
