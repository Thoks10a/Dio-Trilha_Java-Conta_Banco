package ContaBanco;
import  java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String agencia,nomeCliente;
		float saldo;
		
		System.out.println("Por favor,digite o número!");
		
		numero = sc.nextInt();
		
		System.out.println("Por favor,digite a sua agência!");
		sc.nextLine();
		agencia = sc.nextLine();
		
		System.out.println("Por favor,digite o nome do cliente!");
		
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor,digite o saldo!");
		
		saldo = sc.nextFloat();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nomeCliente,agencia,numero,saldo);
		
		
	}

}