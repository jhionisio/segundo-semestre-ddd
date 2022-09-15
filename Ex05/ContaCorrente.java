package Ex05;

public class ContaCorrente extends Conta {

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
}