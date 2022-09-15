package Ex10.Pessoa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Ex08.PF;
import Ex08.PJ;

public class Programa {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		ArrayList<PF> pFL = new ArrayList<>();
		ArrayList<PJ> pJL = new ArrayList<>();
		int option;
		int id;
		String name;
		int cnpj;
		int cpf;
		int confirmar;

		do {

			System.out.printf("CADASTRO DE PESSOA\n" +
					"Qual você é?:\n\n" +
					"1) PF\n" +
					"2) PJ\n" +
					"3) Sair\n\n");
			System.out.printf("Digite a opção desejada: ");

			option = ler.nextInt();

			if (option == 1) {

				do {

					PF pf = new PF();

					id = pFL.size() + 1;
					pf.setId(id);

					System.out.printf("Digite o nome: ");
					name = ler.next();
					pf.setName(name);

					System.out.printf("Digite o cof: ");
					cpf = ler.nextInt();
					pf.setCpf(cpf);

					System.out.printf("Escreveu certo?\n\n" +
							"0 - escrever de novo\n" +
							"1 - ta certo\n\n");
					System.out.printf("Escolhe uma opc: ");

					confirmar = ler.nextInt();

					pFL.add(pf);

					System.out.printf("PF cadastrada");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 2) {

				do {

					PJ pj = new PJ();

					try {

						id = pJL.size() + 1;
						pj.setId(id);

						System.out.printf("Digite o nome: ");
						name = ler.next();
						pj.setName(name);

						System.out.printf("Digite o cnpj: ");
						cnpj = ler.nextInt();
						pj.setCnpj(cnpj);

					} catch (Exception e) {
						System.out.printf("Releia e tente novamente", e);
					} finally {

						System.out.printf("Tá certo?\n\n" +
								"0 - fazer de novo\n" +
								"1 - continuar\n\n");
						System.out.printf("escolha uma opc: ");

						confirmar = ler.nextInt();

						if (confirmar == 1) {
							pJL.add(pj);
						}

						System.out.printf("PJ cadastrada");
						System.in.read();

					}

					System.out.printf("Aperte 1 para sair");
					confirmar = ler.nextInt();

				} while (confirmar != 1);

			}

		} while (option != 0);

		ler.close();
	}

}
