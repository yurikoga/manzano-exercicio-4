import java.util.Scanner;

/**
 * Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
 * apresentação, caso o valor não seja maior que três. */
public class L02K {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int valor;
		System.out.print("\nDigite um valor:");
		valor=sc.nextInt();
		if (!(valor>3)){
			System.out.printf("\n\tValor digitado: %d\n",valor);
		}
		sc.close();
	}
}
