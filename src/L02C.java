import java.util.Scanner;
/**
 * Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
 * dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não
 * foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o
 * valor da média do aluno para qualquer condição.
 * */
public class L02C {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float[]valores=new float[6];
		char c=65;
		System.out.println("Digite as notas:");
		for(byte cont=0;cont<valores.length-2;cont++){
			System.out.printf("Nota %c: ",c);
			valores[cont]=sc.nextFloat();
			valores[4]+=valores[cont];
			c++;
		}
		valores[5]=valores[4]/(valores.length-2);
		if (valores[5]>=5){
			System.out.println("\nMédia: "+valores[5]);
			System.out.println("Aprovado");
		}else{
			System.out.println("\n	Média: "+valores[5]);
			System.out.println("Reprovado");
		}
	}
}
