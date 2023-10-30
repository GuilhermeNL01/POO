package CódigosArtigo;

import java.util.HashMap;

public class mapahashe {
  public static void main(String[] args) {
    // inicializa o hashhmap
    HashMap<String, String> cidadescapitais = new HashMap<String, String>();

    // Adiciona chaves e valores
    cidadescapitais.put("Brasil", "Brasilia");
    cidadescapitais.put("Japao", "Tokyo");
    cidadescapitais.put("Suecia", "Estocolmo");
    cidadescapitais.put("USA", "Washington DC");
    System.out.println(cidadescapitais);
  }
}


