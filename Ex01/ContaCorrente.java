package Ex01;

public class ContaCorrente extends Conta {
    private double cheqEsp;

    public double getCheqEsp() {
        return cheqEsp;
    }

    public void setCheqEsp(double cheqEsp) {
        this.cheqEsp = cheqEsp;
    }

    public ContaCorrente() {
    }

    public ContaCorrente(String agencia, String numero, double saldo, double cheqEsp, int id) {
        super(agencia, numero, saldo, id);

        this.cheqEsp = cheqEsp;
    }
}
