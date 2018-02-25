import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		double salario = 0;
		double prestacao = 0;
		double limite = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Olá, digite o seu salário: ");
		salario = resposta.nextDouble();
		System.out.println("Muito bem, agora digite o valor da prestação: ");
		prestacao = resposta.nextDouble();
		
		limite = salario * 0.3; 
		if(prestacao > limite) {
			System.out.println("Desculpe a sua prestação é maior que 30% do seu salário. Não será possível concluir seu empréstimo.");
		}
		else {
			System.out.println("O empréstimo poderá ser concedido. ");
		}
		resposta.close();
	}
}
