package CódigosArtigo;

import java.util.ArrayList;

public class listaarray { 
  public static void main(String[] args) { 
    ArrayList<String> compras = new ArrayList<String>();
    compras.add("batata");
    compras.add("linguica");
    compras.add("ovo");
    compras.add("queijo");
    for (String i : compras) {
      System.out.println(i);
    }
    System.out.println(compras.size());
  } 
}

