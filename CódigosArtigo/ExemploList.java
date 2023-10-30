package CódigosArtigo;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Criando uma lista de números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionando elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessando elementos por índice
        int primeiroNumero = numeros.get(0); // Acessa o primeiro elemento (10)

        // Iterando pelos elementos da lista
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
