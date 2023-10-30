package CódigosArtigo;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando um mapa de nomes e idades
        Map<String, Integer> mapaIdades = new HashMap<>();

        // Adicionando pares chave-valor ao mapa
        mapaIdades.put("Alice", 25);
        mapaIdades.put("Bob", 30);
        mapaIdades.put("Carol", 22);

        // Acessando o valor por chave
        int idadeAlice = mapaIdades.get("Alice");

        // Verificando se uma chave está presente no mapa
        boolean contemChave = mapaIdades.containsKey("Bob");

        // Iterando pelos pares chave-valor no mapa
        for (Map.Entry<String, Integer> entrada : mapaIdades.entrySet()) {
            System.out.println("Nome: " + entrada.getKey() + ", Idade: " + entrada.getValue());
        }
    }
}
