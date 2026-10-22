import java.util.Scanner;
import java.util.Arrays;
/**
 * Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.*/
public class L02H {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte tamanho=5;
		int[]valores=new int[tamanho];
		for(byte i=0;i<valores.length;i++){
			System.out.printf("Digite o %d° valor:",i+1);
			valores[i]=sc.nextInt();
		}
		// Arrays.sort = ordem crescente
		Arrays.sort(valores);

		System.out.printf("\nMaior valor digitado: %d\nMenor valor digitado: %d",valores[tamanho-1],valores[0]);

	}
}
