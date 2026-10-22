import java.util.Scanner;
import java.lang.Math;
/**
 * Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.
 * */
public class L02A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		short[]valores=new short[3];
		short[]extremos=new short[2];
		System.out.println("\nDigite:");
		char letra=65;
		for (byte cont=0;cont<valores.length-1;cont++){
			System.out.printf("\t%d° termo %c:",(cont+1),letra);
			valores[cont]= sc.nextShort();
			letra++;
		}
		extremos[0]=(short)Math.max(valores[0],valores[1]);
		extremos[1]=(short)Math.min(valores[0],valores[1]);
		valores[2]=(short)(extremos[0]-extremos[1]);
		System.out.printf("\n\tA diferencia entre eles é de %d números\n",valores[2]);
	}
}
