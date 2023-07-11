package Main;

import java.util.Scanner;
import entities.pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exit = "";
		pessoa p;
		Scanner sc = new Scanner(System.in);

		System.out.println("insert your account's number:");

		int num = sc.nextInt();

		System.out.println("Insert your full name :");

		String name = sc.next();

		System.out.println("do you want to insert an initial deposit: y/n");

		char resposta = Character.toUpperCase(sc.next().charAt(0));

		while (resposta != 'N' && resposta != 'Y') {

			System.out.println("Sorry, type again");
			resposta = Character.toUpperCase(sc.next().charAt(0));
		}
			if (resposta == 'Y') {

				System.out.println("insert the money you are going to deposit:");
				double deposito = sc.nextDouble();
				p = new pessoa(num, name, deposito);
				System.out.println("your account details: \n" + "Name:" + p.getNome() + "\n" + "Account's number:"
						+ p.getNum_conta() + "\n" + "avaiable Money:" + p.getbalance());

			} else {

				p = new pessoa(num, name);
				System.out.println("your account details: \n " + "Name:" + p.getNome() + "\n" + "Account's number:"
						+ p.getNum_conta());

			}

			while (!exit.equals("EXIT")) {

				System.out.println("Type DEPOSIT or WITHDRAW!");
				String resp2 = sc.next().toUpperCase();

				while (!resp2.equals("DEPOSIT") && !resp2.equals("WITHDRAW")) {

					resp2 = sc.next().toUpperCase();

				}

				if (resp2.equals("DEPOSIT")) {

					System.out.println("insert how much money you are going to deposit: ");

					p.setdeposito(sc.nextDouble());

					System.out.println("your new balance:" + p.getbalance());

				} else if (resp2.equals("WITHDRAW")) {

					System.out.println(
							"insert how much money you are going to WITHDRAW(OBS. We charge a fee on each withdraw that includes a tax of R$5.00): ");

					double resptemp = sc.nextDouble();

					while (resptemp > p.getbalance()) {

						System.out.println("you money is not enough, try again");

						resptemp = sc.nextDouble();

					}

					if (resptemp == 0) {

						p.res0(resptemp);

						System.out.println("your new balance:" + p.getbalance());

					} else {

						p.withdraw(resptemp);
						System.out.println("your new balance:" + p.getbalance());
					}

				}

				System.out.println("Do you want to exit? type:EXIT");
				exit = sc.next().toUpperCase();
			}
			System.exit(1);
		}
	}
