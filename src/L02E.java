import java.util.Scanner;
import java.lang.Math;
/**
 * Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de
 * segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o
 * referido cálculo. Lembre-se de que a variável A deve ser diferente de zero.
 * */
public class L02E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[]valores=new double[4]; // valores[3] = delta
		double x1,x2;
		byte tamanho = (byte)(valores.length-1);
		char indice=65;
		System.out.println("---EQUAÇÃO DE SEGUNDO GRAU COMPLETA---");
		for (byte i=0;i<tamanho;i++){
			do {
				System.out.printf("Digite o valor %c: ", (char)(indice + i));
				valores[i] = sc.nextDouble();
				if (valores[i] == 0) {
					System.out.printf("O valor %c deve ser diferente de 0 (zero) para ser uma equação completa.\n\tDigite novamente: ", (char)(indice + i));
				}
			} while (valores[i] == 0);
		}

		valores[3]=(Math.pow(valores[1],2))-4*valores[0]*valores[2]; // delta

		if(valores[3]<0){
			System.out.printf("\nDelta Negativo %.0f\n",valores[3]);
		}else{
			x1=(-(valores[1])+(Math.sqrt(valores[3])))/(2*valores[0]);
			x2=(-(valores[1])-(Math.sqrt(valores[3])))/(2*valores[0]);
			System.out.printf("""
				x1 = %.2f
				x2 = %.2f
				""",x1,x2);
		}
	}
}
