package Ex10.Conta;

import Ex07.Conta;
import Ex07.IConta;

public class ContaCorrente extends Conta implements IConta {

    private double cheqEsp;

    public double getCheqEsp() {
        return cheqEsp;
    }

    public void setCheqEsp(double cheqEsp) {
        this.cheqEsp = cheqEsp;
    }

    public ContaCorrente(double cheqEsp) {
        this.cheqEsp = cheqEsp;
    }

    public ContaCorrente() {
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub

    }
}
