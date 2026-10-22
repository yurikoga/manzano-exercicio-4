// import java.util.Arrays; = chama a classe Arrays, para possibilitar a manipulação dos arrays
import java.util.Arrays;
import java.util.Scanner;

/**Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.*/
public class L02F_b {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]valores=new int[3];
		for (byte i=0;i< valores.length;i++){
			System.out.printf("Digite o %d°valor:",(i+1));
			valores[i]=sc.nextInt();
		}
		//ordena o Array em ordem Crescente
		Arrays.sort(valores);
		// Arrays.toString() = imprime o array formatado como "[a,b,c]"
		System.out.println("\nResultado:"+Arrays.toString(valores));
		sc.close();
	}
}
