
import java.util.*;

class Somardoisnumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		//declarando dados
		int num1,num2,soma;
		//ler dados
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		//soma
		soma = num1 + num2;
		//imprimir na tela
		System.out.println("A soma de " + num1 + " + " + num2 + " e igual a: " + soma);
	}
}
