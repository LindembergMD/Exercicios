import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		double salario = 0;
		double prestacao = 0;
		double limite = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Ol�, digite o seu sal�rio: ");
		salario = resposta.nextDouble();
		System.out.println("Muito bem, agora digite o valor da presta��o: ");
		prestacao = resposta.nextDouble();
		
		limite = salario * 0.3; 
		if(prestacao > limite) {
			System.out.println("Desculpe a sua presta��o � maior que 30% do seu sal�rio. N�o ser� poss�vel concluir seu empr�stimo.");
		}
		else {
			System.out.println("O empr�stimo poder� ser concedido. ");
		}
		resposta.close();
	}
}
