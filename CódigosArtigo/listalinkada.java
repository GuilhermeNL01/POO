package CódigosArtigo;

import java.util.*; 
  
// Main  
public class listalinkada { 
  
    public static void main(String args[]) 
    { 

        // inicializando linked list
        LinkedList<String> ll = new LinkedList<String>(); 
  
        // Adicionando elementos 
        ll.add("2"); 
        ll.add("4"); 
        ll.addLast("5"); 
        ll.addFirst("1"); 
        ll.add(2, "3"); 
  
        System.out.println(ll); 
        // removendo elementos
        ll.remove("3"); 
        ll.remove(3); 
        ll.removeFirst(); 
        ll.removeLast(); 
        
        System.out.println(ll); 
    } 
}

