package CódigosArtigo;

import java.util.Enumeration;
import java.util.Hashtable;
 
public class mesahashe {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
 
        // adicionar exemplos
         
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
        hashtable.put("D", 4);
 
        // pegar valores especificos
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
 
        // Remover valores especificos
        hashtable.remove("B");
 
        // Enumerar os elementos
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}
