import java.util.Scanner;
/**
 * Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.*/
public class L02G {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte tamanho=4;
		int[]valores=new int[tamanho];
		for(byte i=0;i<valores.length;i++){
			System.out.printf("Digite o %d° valor:",i+1);
			valores[i]=sc.nextInt();
		}
		System.out.println("");
		for(int v : valores){
			if(v%2==0 && v%3==0){
				System.out.printf("O número %d é divísivel por 2 e 3\n",v);
			}else if(v%2==0){
				System.out.printf("O número %d é divísivel por 2\n",v);
			}else if(v%3==0){
				System.out.printf("O número %d é divísivel 3\n",v);
			}else{
				System.out.printf("O número %d não é divísivel por 2 ou por 3\n",v);
			}
		}
	}
}
