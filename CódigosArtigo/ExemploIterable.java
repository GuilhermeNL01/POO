package CódigosArtigo;

import java.util.ArrayList;
import java.util.List;

public class ExemploIterable {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

