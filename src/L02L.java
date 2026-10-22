import java.util.Scanner;

/**
 * Elaborar um programa que efetue a leitura do nome e do sexo de uma pessoa, apresentando com
 * saída uma das seguintes mensagens: "Ilmo Sr.", se o sexo informado como masculino, ou a
 * mensagem "Ilma Sra.", para o sexo informado como feminino. Apresente também junto da
 * mensagem de saudação o nome previamente informado. */
public class L02L {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nome,sexo="";
		byte contadora=0;
		System.out.print("Digite o seu nome:");
		nome=sc.nextLine().trim();
		do {
			if (contadora>0&&contadora<4){
				System.out.printf("\tDigitação errada,%d° tentativa, digite novamente\n",contadora);
			}
			System.out.print("Digite o seu sexo:");
			sexo=sc.next().toUpperCase();
			if(contadora==3){
				System.out.println("\tnúmero de tentativas excedidas\n");
				sc.close();
				return;
			}
			contadora++;
		}while(!(sexo.equals("M")||sexo.equals("F")));
		if(sexo.equals("M")){
			System.out.printf("\n\tOlá! Ilmo Sr. %s\n",nome.split(" ")[0]);
		}else{
			System.out.printf("\n\tOlá! Ilma Sra. %s\n",nome.split(" ")[0]);
		}
		sc.close();
	}
}
