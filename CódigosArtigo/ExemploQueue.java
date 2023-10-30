package CódigosArtigo;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        // Criando uma fila de strings
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos à fila
        fila.offer("Primeiro");
        fila.offer("Segundo");
        fila.offer("Terceiro");

        // Removendo o elemento da frente da fila
        String primeiroElemento = fila.poll();

        // Acessando o elemento da frente da fila sem removê-lo
        String elementoDaFrente = fila.peek();

        // Iterando pelos elementos restantes na fila
        for (String elemento : fila) {
            System.out.println(elemento);
        }
    }
}
