import java.util.Scanner;
/**
 * Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem
 * informando se o número é par ou ímpar. */
public class L02I {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Paridade = propriedade que determina se um número é ímpar ou par
		int[]paridade={0,1};
		String[]tipo={"Par","Ímpar"};
		int valorDigitado,modulo;
		System.out.print("Digite um valor:");
		valorDigitado= sc.nextInt();
		for(int resto:paridade){
			modulo=valorDigitado%2;
			if (modulo==resto){
				System.out.printf("\n\tO número %d é %s\n",valorDigitado,tipo[resto]);
			}
		}
		sc.close();
	}
}
