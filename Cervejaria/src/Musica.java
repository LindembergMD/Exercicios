import java.util.Scanner;

public class Musica {
	public static void main(String[] args) {
		int cervejas = 99;
		int resposta=0;
		int quantidade =0;

		Scanner dado = new Scanner(System.in);
		while ( cervejas > 0){
			System.out.println( cervejas + "cervejas na freezer");
			System.out.println(" Pego uma garrafa e passo para a frente");
			cervejas = cervejas - 1;
			System.out.println( "Agora s�o " + cervejas + " cervejas na freezer" );
			
			if ( cervejas == 0){
				System.out.println("\n Deseja reabastecer a freezer? (sim = 1 e n�o = 2)");
				resposta = dado.nextInt();
				if (resposta == 1){
					System.out.println( " Quantas cervejas deseja adicionar? \n");
					quantidade = dado.nextInt();
					cervejas = quantidade;
					System.out.println(" A freezer ser� reabastecida \n");
				}
				else{
					System.out.println("A freezer n�o ser� reabastecida. ");
				}
			}	
		//dado.close(); //fechar dado 
		}
		
	}
}
