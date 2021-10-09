package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

     // HashSet  n�o mant�m a rodem, porem � mais r�pido
		
		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
					
		}
		
		// treeSet  ordena os dados
		
		Set<String> set1 = new TreeSet<>();
		
		set.add("Radio");
		set.add("Notebook");
		set.add("Smartphone");
		
		System.out.println();
		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			
			System.out.println(p);
		}
		
		// mant�m a ordem em que os itens foram inseridos
		
		Set<String> set2 = new LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Tablet");
		
		/* remove tods que possuem acima de 3 caracteres
		
		set.removeIf(x -> x.length() >= 3);
		
		==========================================
		
		 remove todos os nomes  que inicia, com a letra T
		
		set.removeIf(x -> x.charAt(0) == 'T'); 
		
		*/
		
		
		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
					
		}
	}
}