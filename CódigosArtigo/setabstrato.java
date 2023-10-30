package CódigosArtigo;

// import
import java.util.*;
 
// Main class
public class setabstrato {
 
    // Main driver method
    public static void main(String[] args) throws Exception
    {
 
        // Try usado para pegar exeções
        try {
 
            // inicialisar o abstractset
            AbstractSet<Integer> abs_set
                = new TreeSet<Integer>();
 
            // colocando exemplos usando método add() 
            // messmo com numeros embaralhados, o abstractset ainda ordena-os
            abs_set.add(1);
            abs_set.add(4);
            abs_set.add(6);
            abs_set.add(2);
            abs_set.add(7);
 
            // Printing the elements inside TreeSet
            System.out.println("AbstractSet antes do "+"removeAll() : "
                               + abs_set);
 
            // inicialisando um array usado para remoção
            Collection<Integer> listaRemocao
                = new ArrayList<Integer>();
 
            // colocando exemplos
            listaRemocao.add(4);
            listaRemocao.add(2);
            listaRemocao.add(7);
 
            // usando o array para remoção
            System.out.println("Elementos da coleção"+" sendo removidos : "+ listaRemocao);
 
            // removendo os elementos
            abs_set.removeAll(listaRemocao);
 
            // Printing the elements of ArrayList
            System.out.println("AbstractSet depois do "
                               + "removeAll() : "
                               + abs_set);
        }
 
        // Catch block to handle the exceptions
        catch (NullPointerException e) {
 
            // Display exception on console
            System.out.println("Exception thrown : " + e);
        }
    }
}