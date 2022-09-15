package Ex10.Pessoa;

import Ex08.IPessoa;
import Ex08.Pessoa;

public class PF extends Pessoa implements IPessoa {

	private int cpf;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public PF() {

	}

	@Override
	public String verNome() {
		return null;
	}

}
