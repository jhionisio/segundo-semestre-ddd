package Ex10.Pessoa;

import Ex08.IPessoa;
import Ex08.Pessoa;

public class PJ extends Pessoa implements IPessoa {

	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public PJ() {

	}

	@Override
	public String verNome() {
		return null;
	}

}