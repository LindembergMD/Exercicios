package unipe.aulas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		Menu menu = new Menu();
		ManipulaVetor manipulaVetor = new ManipulaVetor();
		int opcao = 0;
		int[] vetor = null;
		
		while(true){
			menu.menu();
			opcao = manipulaVetor.obterValor();
			
			switch(opcao){
			case 1:{
				vetor = manipulaVetor.inicializaVetor();
				break;
			}
			case 2:{
				menu.menuImpressao();
				int tipo = manipulaVetor.obterValor();
				manipulaVetor.imprimirVetor(vetor, tipo);
				break;
			}
			case 3:{
				manipulaVetor.ordenarPesquisa();
				break;
			}
			case 4:{
				manipulaVetor.alfabetica();
				break;
			}
			case 5:{
				manipulaVetor.numerica();
				break;
			}
				
			case 9:{
				System.exit(0);
			}
			default:{
				System.out.println("Digite uma opção válida ");
				break;
			}
			}
		}
	}

}
