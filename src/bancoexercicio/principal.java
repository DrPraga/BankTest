package bancoexercicio;

import java.util.Locale;
import java.util.Scanner;

import background.Sistema;

public class principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Account number: ");
		int numeroDaConta = sc.nextInt();

		System.out.print("Account Name: ");
		String nomeDoUsuario = sc.nextLine();
		sc.nextLine();
		
		Sistema Sistema = new Sistema(numeroDaConta, nomeDoUsuario);
		
		
		System.out.print("is there na initial deposit (Y/n)?: ");
		double Deposito;
		String escolhas = "y";
		escolhas = sc.next();
		if (escolhas.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			Deposito = sc.nextDouble();
			Sistema.setDeposito(Deposito);
		}else {
			System.out.println("");
			Deposito = 0.00;
			Sistema.setDeposito(Deposito);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",numeroDaConta,nomeDoUsuario,Sistema.getDeposito());
		
		//primeira parte do codigo --> entrada de(numero, nome, OPCIONAL: deposito inicial)
		
		System.out.println("");
		
		double entradaDeDinheiro;
		System.out.print("Enter a deposit value: ");
		entradaDeDinheiro = sc.nextDouble();
		Sistema.setEntradaDinheiro(entradaDeDinheiro);
		Sistema.AumentoDeposito();
		System.out.println("Upadate account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",numeroDaConta,nomeDoUsuario,Sistema.AumentoDeposito());
		Sistema.setDeposito(Sistema.AumentoDeposito());
		//segunda parte do codigo --> entrada de(deposito e aumento total na conta)
		
		System.out.println("");
		
		double saidaDeDinheiro;
		System.out.print("Enter a withdraw value: ");
		saidaDeDinheiro = sc.nextDouble();
		Sistema.setSaidaDeDinheiro(saidaDeDinheiro);
		Sistema.menosDinheiro();
		System.out.println("Upadate account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n",numeroDaConta,nomeDoUsuario,Sistema.menosDinheiro());
		Sistema.setDeposito(Sistema.menosDinheiro());
		
		sc.close();
	}

}
