import java.util.Scanner;
/**
 * Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem
 * dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da
 * média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.
 * Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi
 * aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta
 * condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição. */
public class L02D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float[]valores=new float[8];
		float tamanho= valores.length-4;
		char c=65;
		System.out.println("Digite as notas:");
		for(byte cont=0;cont<tamanho;cont++){
			System.out.printf("Nota %c: ",c);
			valores[cont]=sc.nextFloat();
			valores[4]+=valores[cont]; // acumulador
			c++;
		}
		valores[5]=valores[4]/4; // média
		if (valores[5]>=7f){
			System.out.printf("\nMédia: %.2f",valores[5]);
			System.out.println("Aprovado");
		}else{
			System.out.println("\n\tMédia insuficiente");
			System.out.println("\tDigite a Nota do Exame:");
			valores[6]= sc.nextInt(); // nota do exame
			valores[7]=(valores[5]+valores[6])/2; // nova média
			if (valores[7]>=5f){
				System.out.printf("\nMédia: %.2f",valores[7]);
				System.out.println("\t'Aprovado em Exame'");
			}else{
				System.out.printf("\nMédia: %.2f\n",valores[7]);
				System.out.println("Reprovado");
			}
		}
	}
}
