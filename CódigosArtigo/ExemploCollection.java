package CódigosArtigo;

import java.util.ArrayList;
import java.util.Collection;

public class ExemploCollection {
    public static void main(String[] args) {
        // Criando uma coleção de strings
        Collection<String> nomes = new ArrayList<>();

        // Adicionando elementos à coleção
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");

        // Verificando se um elemento está na coleção
        boolean contemAlice = nomes.contains("Alice");
        System.out.println("A coleção contém Alice? " + contemAlice);

        // Exibindo o tamanho da coleção
        int tamanho = nomes.size();
        System.out.println("Tamanho da coleção: " + tamanho);
    }
}

