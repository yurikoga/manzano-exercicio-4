import java.util.Scanner;
/**
 * Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um
 * valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se
 * de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.
 * */
public class L02B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		short[]nums=new short[2];
		System.out.printf("Digite um número:");
		nums[0]=sc.nextShort();
		if(nums[0]<0){
			nums[1]=(short)(nums[0]* -1);
			System.out.printf("O número convertido para positivo é: %d",nums[1]);
		}else{
			System.out.printf("O número digitado é: %d",nums[1]);
		}
	}
}
