import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		int numero=0;
		int quantidade=0;
		Scanner resposta = new Scanner(System.in);
		
		while (quantidade < 10){
			System.out.println("Digite um número: ");
			numero = resposta.nextInt();
			if (numero % 2 == 0 && numero != 0){
				System.out.println(" O número " + numero + " é par.");
			}else if (numero % 2 == 1){
				System.out.println(" O número " + numero + " é ímpar.");
			}else{
				System.out.println("Zero é um número neutro. :)");
			}
			quantidade = quantidade + 1;
			
			
		}
		
		resposta.close();
	}

}