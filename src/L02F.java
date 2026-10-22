import java.util.Arrays;
import java.util.Scanner;
/**Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.*/
public class L02F {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]valores=new int[3];
		for (byte i=0;i< valores.length;i++){
			System.out.printf("Digite o %d°valor:",(i+1));
			valores[i]=sc.nextInt();
		}
		int[]ordenados=mediador(valores);
		System.out.printf("\nResultado: %s",Arrays.toString(ordenados));
	}
	static int[] mediador(int[]valores){
		int maior = valores[0];
		int menor = valores[0];
		int somaTotal=0;
		for(int v : valores){
			if(v>maior){
				maior=v;
			}else if(v<menor){
				menor=v;
			}
			somaTotal+=v;
		}
		int segundoMaior=somaTotal-(maior+menor);
		return new int[]{menor,segundoMaior,maior};
	}
}
