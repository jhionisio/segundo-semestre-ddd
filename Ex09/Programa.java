package Ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Quadrado> listaQuadrado = new ArrayList<>();
		ArrayList<Retangulo> listaRetangulo = new ArrayList<>();
		ArrayList<Circulo> listaCirculo = new ArrayList<>();

		System.out.println("Digite a quantidade de formas: ");
		int qtdFormas = ler.nextInt();

		for (int i = 1; i <= qtdFormas; i++) {
			System.out.println("Digite o número da forma\n" + "1- Quadrado\n"
					+ "2- Retângulo\n" + "3- Círculo\n");
			int opcaoForma = ler.nextInt();

			if (opcaoForma == 1) {
				System.out.println("Digite o valor do lado do quadrado: ");
				double lado = ler.nextDouble();

				Quadrado quadrado = new Quadrado(lado, lado, lado, lado);
				quadrado.calculoPer();
				quadrado.calculoArea();

				listaQuadrado.add(quadrado);

			} else if (opcaoForma == 2) {
				System.out.println("Digite o valor da altura do retângulo: ");
				double lado = ler.nextDouble();
				System.out.println("Digite o valor da base do retângulo: ");
				double base = ler.nextDouble();

				Retangulo retangulo = new Retangulo(lado, base, lado, base);
				retangulo.calculoPer();
				retangulo.calculoArea();

				listaRetangulo.add(retangulo);

			} else if (opcaoForma == 3) {
				System.out.println("Digite o valor do raio do círculo:");
				double raio = ler.nextDouble();

				Circulo circulo = new Circulo(raio);
				circulo.calculoPer();
				circulo.calculoArea();

				listaCirculo.add(circulo);
			}
		}

		for (Quadrado q : listaQuadrado) {
			System.out.printf(
					"Quadrado\n" + "infos registradas: lado = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
					q.getLado(), q.calculoPer(), q.calculoArea());
		}
		for (Retangulo r : listaRetangulo) {
			System.out.printf(
					"\nRetângulo\n" + "infos registradas: lado = %.2f - base = %.2f\n" + "Perímetro: %.2f\n"
							+ "Área: %.2f",
					r.getLado(), r.getBase(), r.calculoPer(), r.calculoArea());
		}
		for (Circulo c : listaCirculo) {
			System.out.printf(
					"\nCírculo\n" + "infos registradas: raio = %.2f\n" + "Perímetro: %.2f\n" + "Área: %.2f",
					c.getRaio(), c.calculoPer(), c.calculoArea());
		}
		ler.close();
	}
}
