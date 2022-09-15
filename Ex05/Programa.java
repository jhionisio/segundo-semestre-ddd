package Ex05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);

		ArrayList<ContaSalario> contaSalarioList = new ArrayList<>();
		ArrayList<ContaPoupanca> contaPoupancaList = new ArrayList<>();
		ArrayList<ContaCorrente> contaCorrenteList = new ArrayList<>();

		int option;

		String agencia;
		String numero;
		double saldo;
		int cnpj;

		double rentabilidade;
		double cheqEsp;

		int confirmar;

		do {

			System.out.printf("CADASTRO DE CONTA \n" +
					"Qual você é?: :\n\n" +
					"1) poupança\n" +
					"2) corrente\n" +
					"3) salario\n" +
					"4) Sair\n\n");
			System.out.printf("Digite uma opc:");

			option = ler.nextInt();

			if (option == 1) {

				do {

					ContaPoupanca cp = new ContaPoupanca();

					System.out.printf("Digite a agencia: ");
					agencia = ler.next();
					cp.setAgencia(agencia);

					System.out.printf("Digite o número: ");
					numero = ler.next();
					cp.setNumero(numero);

					System.out.printf("Digite quanto deseja depositar: ");
					saldo = ler.nextDouble();
					cp.setSaldo(saldo);

					System.out.printf("Digite o limite de cheque especial: ");
					rentabilidade = ler.nextDouble();
					cp.setRentabilidade(rentabilidade);

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					contaPoupancaList.add(cp);

					System.out.printf("Pessoa física cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 2) {

				do {

					ContaCorrente cc = new ContaCorrente();

					System.out.printf("Digite a agencia: ");
					agencia = ler.next();
					cc.setAgencia(agencia);

					System.out.printf("Digite o número: ");
					numero = ler.next();
					cc.setNumero(numero);

					System.out.printf("Digite quanto deseja depositar: ");
					saldo = ler.nextDouble();
					cc.setSaldo(saldo);

					System.out.printf("Digite o limite de cheque especial: ");
					cheqEsp = ler.nextDouble();
					cc.setCheqEsp(cheqEsp);

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					contaCorrenteList.add(cc);

					System.out.printf("Pessoa física cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 3) {

				do {

					ContaSalario cs = new ContaSalario();

					System.out.printf("Digite a agencia: ");
					agencia = ler.next();
					cs.setAgencia(agencia);

					System.out.printf("Digite o número: ");
					numero = ler.next();
					cs.setNumero(numero);

					System.out.printf("Digite quanto deseja depositar: ");
					saldo = ler.nextDouble();
					cs.setSaldo(saldo);

					System.out.printf("Digite o cnpj do chefe: ");
					cnpj = ler.nextInt();
					cs.setCnpjChefe(cnpj);

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					contaSalarioList.add(cs);

					System.out.printf("Pessoa física cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			}

		} while (option != 4);

		ler.close();
	}

}
