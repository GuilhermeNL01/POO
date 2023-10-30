package CódigosArtigo;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        // Criando um conjunto de números inteiros
        Set<Integer> numerosUnicos = new HashSet<>();

        // Adicionando elementos ao conjunto
        numerosUnicos.add(10);
        numerosUnicos.add(20);
        numerosUnicos.add(10); // Tentativa de adicionar um valor duplicado

        // Iterando pelo conjunto e imprimindo valores únicos
        for (int numero : numerosUnicos) {
            System.out.println(numero);
        }
    }
}
