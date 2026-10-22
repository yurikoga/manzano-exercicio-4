import java.util.Scanner;
/**
 * Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem
 * informando se o número é par ou ímpar. */
public class L02I_b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]tipo={"Par","Ímpar"};
		int valorDigitado,modulo;
		System.out.print("Digite um valor:");
		valorDigitado= sc.nextInt();
		modulo=valorDigitado%2;
		System.out.printf("\n\tO número %d é %s\n",valorDigitado,tipo[modulo]);
		sc.close();
	}
}
