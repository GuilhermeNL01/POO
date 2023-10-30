package CódigosArtigo;

import java.util.*;  
public class dicionario  
{  
public static void main(String args[])  
{  
//inicializar dicionario
Dictionary dict = new Hashtable();  

//adicionar valores de exemplo
dict.put(101, "metamorfose");  
dict.put(102, "manual do anarquista");  
dict.put(103, "vaesen");  
dict.put(104, "simarillion");  
dict.put(105, "cronicas de gelo e fogo");  
dict.put(106, "principe dos espinhos");  
dict.put(107, "neuromancer");  
dict.put(108, "incal");  

System.out.println("lista de livros : " + dict+"\n");  
System.out.println("key especifica : " + dict.get(107)+"\n");  
}  
}  

