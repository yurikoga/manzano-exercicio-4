import java.util.Scanner;

/**
 * Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas mensagens: "O
 * valor está na faixa permitida", caso o usuário forneça o valor nesta faixa, ou a mensagem "O valor
 * está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9.*/
public class L02J {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int valorDigitado;
		String resultado;
		System.out.print("Digite um valor:");
		valorDigitado= sc.nextInt();
		resultado=!(valorDigitado<1||valorDigitado>9)?"\n\tO valor está na faixa permitida":"\n\tO valor está fora da faixa permitida";
		System.out.println(resultado);
		sc.close();
	}
}
