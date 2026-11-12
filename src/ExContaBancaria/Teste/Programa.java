package ExContaBancaria.Teste;

import ExContaBancaria.Dominio.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Titular: ");
        String titular = sc.nextLine();

        System.out.println("Haverá depósito inicial? (s/n)");
        char respota = sc.next().charAt(0);

        Conta conta;
        if (respota == 's') {
            System.out.println("Valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println("Dados da conta: ");
        System.out.println(conta);
        System.out.println("");
        System.out.println("Valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Dados atualizados: ");
        System.out.println(conta);
        System.out.println("");
        System.out.println("Valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Dados atualizados: ");
        System.out.println(conta);

        sc.close();
    }
}
