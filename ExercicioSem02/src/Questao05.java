import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		int gasolina = 0;
		double conta = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Ol�, quantos litros de gasolina voc� precisa? ");
		gasolina = resposta.nextInt();
		conta = gasolina * 2.5 + (2*3);
		System.out.println("Voc� comprou dois refrigerantes e abasteceu "+ gasolina +" litros de gasolina sua conta � de: "+ conta);

		resposta.close();
	}
}
