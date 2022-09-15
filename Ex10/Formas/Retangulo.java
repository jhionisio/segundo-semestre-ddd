package Ex10.Formas;

import Ex09.Quadrilatero;

public class Retangulo extends Quadrilatero {

	public Retangulo(double base, double lado, double ladoOposto, double superior) {
		super(base, lado, ladoOposto, superior);
	}

	public double calculoPer() {
		double resultado = (base * lado) * 2;
		return resultado;
	}

	public double calculoArea() {
		double resultado = base * lado;
		return resultado;
	}
}