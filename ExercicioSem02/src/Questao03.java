
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		int tabuada=0;
		int multiplo =1;
		int resultado = 0;
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Olá. Digite a tabuada que você deseja ver. (1 a 9)");
		tabuada = resposta.nextInt();
		for (multiplo = 1; multiplo < 11; multiplo ++){
			resultado = tabuada * multiplo;
			System.out.println( tabuada + "x" + multiplo + "=" + resultado );
		}
		resposta.close();
	}
}