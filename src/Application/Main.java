package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastro Bancario");
		System.out.print("Digite o nome: ");
		String nome = sc.next();
		System.out.print("Digite a Conta: ");
		int conta = sc.nextInt();

		System.out.println("Deseja iniciar conta com algum valor? ");
		System.out.print("1 - Sim\n2 - Nao\n: ");
		int op = sc.nextInt();
		Banco banco;
		if (op == 1) {
			System.out.print("Deseja iniciar a conta com quanto?: ");
			double extrato = sc.nextDouble();
			banco = new Banco(nome, conta, extrato);
		} else {
			banco = new Banco(nome, conta);
		}
		System.out.printf("Conta %d, Nome: %s, Extrato R$ %.2f\n", banco.getConta(), banco.getName(), banco.getExtrato());

		System.out.println("Deseja fazer Alguma operacao?");
		System.out.print("1 - Deposito\n2 - Saque\n: ");
		op = sc.nextInt();
		if (op == 1) {
			System.out.print("Digite o valor do Deposito: ");
			double dep = sc.nextDouble();
			banco.Deposito(dep);
		} else {
			System.out.println("Digite o valor do Saque: ");
			double seq = sc.nextDouble();
			banco.Saque(seq);
		}
		System.out.printf("Conta %d, Nome: %s, Extrato R$ %.2f", banco.getConta(), banco.getName(), banco.getExtrato());

		sc.close();
	}

}
