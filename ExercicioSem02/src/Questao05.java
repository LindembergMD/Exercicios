import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		int gasolina = 0;
		double conta = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Olá, quantos litros de gasolina você precisa? ");
		gasolina = resposta.nextInt();
		conta = gasolina * 2.5 + (2*3);
		System.out.println("Você comprou dois refrigerantes e abasteceu "+ gasolina +" litros de gasolina sua conta é de: "+ conta);

		resposta.close();
	}
}
