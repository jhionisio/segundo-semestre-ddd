package Ex10.Conta;

import Ex07.Conta;
import Ex07.IConta;

public class ContaSalario extends Conta implements IConta {

	private int cnpjChefe;

	public int getCnpjChefe() {
		return cnpjChefe;
	}

	public void setCnpjChefe(int cnpjChefe) {
		this.cnpjChefe = cnpjChefe;
	}

	public ContaSalario() {

	}

	@Override
	public void depositar(double valor) {

	}

}
