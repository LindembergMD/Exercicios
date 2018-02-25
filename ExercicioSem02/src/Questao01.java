import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		double salario =0;
		double percentual = 0;
		double aumento = 0;
		double novoSalario = 0;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite o seu salario: ");
		salario = valor.nextDouble();
		System.out.println(" Agora digite o percentual de aumento: ");
		percentual = valor.nextDouble();
		aumento = salario * (percentual / 100);
		novoSalario = aumento + salario;
		System.out.println(" Você terá um aumento de " + aumento);
		System.out.println(" Seu novo salário será de: " + novoSalario);
		
		valor.close();
	}
	
}