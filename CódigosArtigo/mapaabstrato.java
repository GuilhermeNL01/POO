package CódigosArtigo;

import java.util.*; 
  
public class mapaabstrato { 
  
    public static void main(String[] args) 
    { 
        // inicializando hashmap
        AbstractMap<Integer, String> absMap 
            = new HashMap<Integer, String>(); 
  
        
        // adicionando exemplos
        absMap.put(1, "um"); 
        absMap.put(2, "exemplo"); 
        absMap.put(3, "simples"); 
        absMap.put(4, "6"); 
  
        
        // entryset() para demonstrar o hashmap todo
        System.out.println("mapa abstrato"); 
        System.out.println(absMap.entrySet()); 
    } 
}