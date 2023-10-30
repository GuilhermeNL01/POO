package CódigosArtigo;

import java.util.*; 
 
public class listaabstrata { 
    public static void main(String args[]) 
    { 
 
        // inicializando a abstractlist utilisando também de linkedlist 
        AbstractList<String> 
            list = new LinkedList<String>(); 
 
        // método add() para preencher a lista
        list.add("um"); 
        list.add("exemplo"); 
        list.add("simples"); 
        list.add("15"); 
        list.add("4"); 
 
        // saida original da lista
        System.out.println("AbstractList: " + list); 
 
        // removendo um dos objetos da lista(0 sendo o primeiro objeto da lista)
        list.remove(2); 
 
        // lista final
        System.out.println("AbstractList final: " + list);
    }
}
