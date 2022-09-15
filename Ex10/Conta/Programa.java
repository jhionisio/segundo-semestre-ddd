package Ex10.Conta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		ArrayList<ContaSalario> SL = new ArrayList<>();
		ArrayList<ContaPoupanca> PL = new ArrayList<>();
		ArrayList<ContaCorrente> CL = new ArrayList<>();
		int option;
		String agencia;
		String numero;
		double saldo;
		int cnpj;
		double rentabilidade;
		double cheqEsp;

		int confirmar;

		do {

			System.out.printf("CADASTRO DE CONTA\n" +
					"Qual tipo de conta você deseja?:\n\n" +
					"1) Poupança\n" +
					"2) Corrente\n" +
					"3) Salário\n" +
					"4) Sair\n\n");
			System.out.printf("Digite uma opc:");

			option = ler.nextInt();

			if (option == 1) {

				do {

					ContaPoupanca cp = new ContaPoupanca();

					try {
						System.out.printf("Digite a agência: ");
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

					} catch (Exception e) {
						System.out.printf("Erro: revise os dados que foram digitados");
					}

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					if (confirmar == 1) {
						PL.add(cp);
					}

					System.out.printf("Pessoa física cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 2) {

				do {

					ContaCorrente cc = new ContaCorrente();

					try {
						System.out.printf("Digite a agência: ");
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
					} catch (Exception e) {
						System.out.printf("Revise as informações e tente novamente.", e);
					}

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					if (confirmar == 1) {
						CL.add(cc);
					}

					System.out.printf("Pessoa física cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			} else if (option == 3) {

				do {

					ContaSalario cs = new ContaSalario();

					try {

						System.out.printf("Digite a agência: ");
						agencia = ler.next();
						cs.setAgencia(agencia);

						System.out.printf("Digite o número: ");
						numero = ler.next();
						cs.setNumero(numero);

						System.out.printf("Digite quanto deseja depositar: ");
						saldo = ler.nextDouble();
						cs.setSaldo(saldo);

						System.out.printf("Digite o CNPJ do chefe: ");
						cnpj = ler.nextInt();
						cs.setCnpjChefe(cnpj);

					} catch (Exception e) {
						System.out.printf("Revise as informações e tente novamente", e);
					}

					System.out.printf("Tá certo?\n\n" +
							"0 - fazer de novo\n" +
							"1 - continuar\n\n");
					System.out.printf("escolha uma opc: ");

					confirmar = ler.nextInt();

					if (confirmar == 1) {
						SL.add(cs);
					}

					System.out.printf("Pessoa física cadastrada ");
					System.in.read();

				} while (confirmar != 1);

			}

		} while (option != 4);

		ler.close();
	}

}
