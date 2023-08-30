package atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (// Cria um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in)) {
            // Mostra as opções de conversão
            System.out.println("Escolha a direção da conversão:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            int escolha = scanner.nextInt(); // Lê a escolha do usuário

            double temperatura;
            double resultado;

            // Verifica a escolha do usuário
            if (escolha == 1) {
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble(); // Lê a temperatura em Celsius
                resultado = (temperatura * 9 / 5) + 32; // Converte para Fahrenheit
                System.out.println("Temperatura em Fahrenheit: " + resultado); // Mostra o resultado
            } else if (escolha == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble(); // Lê a temperatura em Fahrenheit
                resultado = (temperatura - 32) * 5 / 9; // Converte para Celsius
                System.out.println("Temperatura em Celsius: " + resultado); // Mostra o resultado
            } else {
                System.out.println("Escolha inválida."); // Mostra mensagem de erro para escolha inválida
            }
        }
    }
}
