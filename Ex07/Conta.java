package Ex07;

import java.util.Scanner;

public abstract class Conta implements IConta {

    Scanner ler = new Scanner(System.in);

    private String agencia;
    private String numero;
    private double saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String verSaldo() {
        return "o seu saldo é: " + saldo;
    }

    public String sacar(double valor) {
        if (saldo != 0) {
            System.out.printf("quanto voce quer sacar?: \n");
            valor = ler.nextDouble();

            String resposta;

            if (valor < saldo) {

                this.saldo = saldo - valor;
                return "foi, saldo restante: " + saldo;

            } else {
                return "n tem saldo o suficiente.";
            }
        }

        return "operação finalizada";
    }
}