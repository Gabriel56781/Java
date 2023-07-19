package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.pessoa;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("how many employees will be registered? ");
		int qtd = sc.nextInt();

		List<pessoa> list = new ArrayList<>();

		for (int cont = 0; cont < qtd; cont++) {

			System.out.println("Id:");
			int id = sc.nextInt();

			while (hasid(list, id)) {

				System.out.println("Id already taken , try again!");
				id = sc.nextInt();
			}
			System.out.println("Name:");
			String nome = sc.next();
			System.out.println("Salary:");
			Double s = sc.nextDouble();
			list.add(new pessoa(id, nome, s));

		}

		System.out.println("type the ID you want to increase its salary");
		Integer idc = sc.nextInt();
		// Integer pos = position(list, idc);

		pessoa pos = list.stream().filter(x -> x.getId() == idc).findFirst().orElse(null);

		if (pos == null) {

			System.out.println("This id does not exist");

			for (pessoa p : list) {

				System.out.println(p);

			}
		} else {

			System.out.println("enter with the percentage:");
			double porc = sc.nextDouble();
			pos.increasesalary(porc);

			for (pessoa p : list) {

				System.out.println(p);

			}
		}

	}

	public static Integer position(List<pessoa> list, int id) {

		for (int cont = 0; cont < list.size(); cont++) {

			if (list.get(cont).getId() == id) {

				return cont;

			}

		}
		return null;
	}

	public static boolean hasid(List<pessoa> list, int id) {

		pessoa pos = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		return pos != null;

	}
}
