package ExContaBancaria.Dominio;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private static final double TAXA_SAQUE = 5.0;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    
    public Conta(int numero,  String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
        
    }

    public int getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor - TAXA_SAQUE;
    }

    @Override
    public String toString() {
        return "Conta: " + numero
                + ", Titular: " + titular
                + ", Saldo: $ " + String.format("%.2f", saldo);
    }
}
