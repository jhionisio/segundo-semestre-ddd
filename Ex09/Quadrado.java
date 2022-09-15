package Ex09;

public class Quadrado extends Quadrilatero {

	public Quadrado(double base, double lado, double ladoOposto, double superior) {
		super(base, lado, ladoOposto, superior);
	}

	public double calculoPer() {
		double resultado = lado * 4;
		return resultado;
	}

	public double calculoArea() {
		double resultado = lado * lado;
		return resultado;
	}
}