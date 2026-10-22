import java.util.Arrays;
import java.util.Scanner;

/**
 * Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.*/
public class L02H_b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte tamanho=5;
		int maior, menor;

		int[]valores=new int[tamanho];
		for(byte i=0;i<valores.length;i++){
			System.out.printf("Digite o %d° valor:",i+1);
			valores[i]=sc.nextInt();
		}
		maior=valores[0];
		menor=valores[0];
		for (int value:valores){
			if (value > maior){
				maior = value;
			}else if(value < menor){
				menor = value;
			}
		}
		System.out.printf("""
				\n\tO MAIOR valor digitado foi o número inteiro: %d
				\tO MENOR valor digitado foi o número inteiro: %d
				""",maior,menor);

	}
}
