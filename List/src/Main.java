import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// criando uma lista do tipo string
		List<String> list = new ArrayList<>();

		list.add("maira");
		list.add("ando");
		list.add("por");
		list.add("aí");
		list.add("te encontrar");

		// adicionando em uma posição específica
		list.add(4, "querendo");

		for (String x : list) {

			System.out.println(x);
		}

		// removendo de uma posição específica
		list.remove(0);
		// removendo de acordo com o conteudo da lista
		list.remove("por");
		// removendo um nó se começar com a letra a 
		list.removeIf(x -> x.charAt(0) == 'a');
   
		System.out.println("---------------------------------------");

		for (String x : list) {

			System.out.println(x);
		}

		// exibindo as posições onde se encontram esses conteudos
		System.out.println("Index of querendo :" + list.indexOf("querendo"));
		System.out.println("Index of te encontrar :" + list.indexOf("te encontrar"));
		System.out.println("Index of você :" + list.indexOf("você"));
		//removendo tudo
		list.removeAll(list);
		list.add("já encontrei");
		for (String x : list) {

			System.out.println(x);

		}
	
		//criar uma nova lista somente com nodos que começam com a palavra j
		List<String> nl = list.stream().filter(x -> x.charAt(0) == 'j').collect(Collectors.toList());

		for (String x : nl) {

			System.out.println(x);

		}

		//exibir da lista já criada, todos os nodos que começam com a letra j minúscula 
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}

}
