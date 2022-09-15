package Ex06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

			System.out.printf("CADASTRO DE PESSOAS \n" +
					"Qual você é?: :\n\n" +
					"1) fisica\n" +
					"2) juridica\n" +
					"3) Sair\n\n");
			System.out.printf("Digite uma opc:");

			option = ler.nextInt();

			if (option == 1) {

				do {

					PF pf = new PF();

					id = pFL.size() + 1;
					pf.setId(id);

					System.out.printf("Digite o nome: ");
					name = ler.next();
					pf.setName(name);

					System.out.printf("Digite o cpf: ");
					cpf = ler.nextInt();
					pf.setCpf(cpf);

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					pFL.add(pf);

					System.out.printf("Pessoa física cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 2) {

				do {

					PJ pj = new PJ();

					id = pJL.size() + 1;
					pj.setId(id);

					System.out.printf("Digite o nome: ");
					name = ler.next();
					pj.setName(name);

					System.out.printf("Digite o cnpj: ");
					cnpj = ler.nextInt();
					pj.setCnpj(cnpj);

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					pJL.add(pj);

					System.out.printf("Pessoa jurídica cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			}

		} while (option != 0);

		ler.close();
	}

}
