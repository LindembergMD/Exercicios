import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		String nome = " ";
		Scanner resposta = new Scanner(System.in);
		double salario = 0;
		double novoSalario = 0;
		
		
		while( !"fim".equals(nome)) {
			
			System.out.println("Digite seu nome: (Para sair digite fim)");
			nome = resposta.next();
			if ( "fim".equals(nome)) {
				break;
			}
			System.out.println("Digite o seu salário: ");
			salario = resposta.nextDouble();


			if (salario < 500) {
				novoSalario = salario + salario * 0.2;
				System.out.println("Olá " + nome + ", você receberá 20% de aumento e seu novo salário será de: " + novoSalario);
			}
			else {
				System.out.println("Desculpe " + nome + ", mas o aumento é só para quem recebe menos de R$ 500,00 e você recebe mais que isso ");
				}
		}
		
		resposta.close();
}
	
}
