package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Por favor, insira o nome do novo Cliente:");
			Cliente c1 = new Cliente();
			c1.setNome(sc.nextLine());
			
			System.out.println("A conta ser� do tipo Corrente ou Poupan�a?");
			System.out.println("CC digite 1");
			System.out.println("CP digite 2");
			int accountType = sc.nextInt();
			
			if(accountType == 1) {			
				Conta cc = new ContaCorrente(c1);
				System.out.print("O Sr/Sra " + c1.getNome() +" deseja realizar um dep�sito inicial na conta? (1 = SIM/N�O)");
				int initOperation = sc.nextInt();
				if(initOperation == 1) {
					System.out.println("Entre com o valor a ser depositado:");
					double montante = sc.nextDouble();
					cc.deposito(montante);
					System.out.println("O estado atual da sua conta �:");
					cc.meuExtrato();
					} else{
							System.out.println("Obrigado!");
							System.out.println("O estado atual da sua conta �:");
							cc.meuExtrato();
						}
			} else {
				Conta cp = new ContaPoupanca(c1);
				System.out.print("O Sr/Sra " + c1.getNome() +" deseja realizar um dep�sito inicial na conta? (1 = SIM/ 2 = N�O)");
				int initOperation = sc.nextInt();
				if(initOperation == 1) {
					System.out.println("Entre com o valor a ser depositado:");
					double montante = sc.nextDouble();
					cp.deposito(montante);
					System.out.println("O estado atual da sua conta �:");
					cp.meuExtrato();
				} else{
					System.out.println("Obrigado!");
					System.out.println("O estado atual da sua conta �:");
					cp.meuExtrato();
				}
			}
					
		System.out.println("Obrigado por utilizar o sistema do Banco ABC");
		sc.close();
	}

}
