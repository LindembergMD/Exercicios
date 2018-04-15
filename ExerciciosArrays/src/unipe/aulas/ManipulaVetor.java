package unipe.aulas;


import java.util.Arrays;
import java.util.Scanner;

public class ManipulaVetor {
	//inicializa o vetor e chama uma função para obter o valor que ficara no veotr
	public int[] inicializaVetor(){
		System.out.println("Inicializando vetor");
		int valor = obterValor();
		int[] retorno = new int[valor];
		System.out.println("Vetor inicializando com " + valor + " elementos");
		preencherVetor(retorno);
		return retorno;
	}
	
	public int[] preencherVetor(int [] vetor){
		Scanner resp= new Scanner(System.in);
		int valor;
		System.out.println("Digite o valor para preencher o vetor: ");
		valor = resp.nextInt();
		/*for(int cont = 0; cont<vetor.length; cont++){
		 vetor[cont] = valor; }		 */
		Arrays.fill(vetor, valor);
		System.out.println("O vetor foi preenchido com o valor: " + valor);
		return vetor;
	}
	
	/*
	 * @param vetor
	 * @param tipo 1 - For | 2 - While | 3 - ArraysToString
	 */
	public void imprimirVetor(int[] vetor, int tipo){
		if(tipo==1){
			for(int i=0; i<vetor.length;i++){
				System.out.println(vetor[i]);
			}
		}//fim if
		if(tipo==2){
			int i=0;
			while(i<vetor.length){
				System.out.println(vetor[i]);
				i++;
			}
		}//fim if 2
		if(tipo==3){
			System.out.println(Arrays.toString(vetor));
		}//fim if 3
	}
	
	
	public int consultarElemento(int[] vetor, int elementoBusca){
		for(int i=0; i<vetor.length; i++){
			if(vetor[i]==elementoBusca){
				return i;
			}
		}//fim for
		return -1;
	}
	
	
	//função/metodo para obter o valor que o usuario quer utilizar
	public int obterValor(){
		int valor = -1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um número: ");
		while(true){
			valor = leitor.nextInt();
			if(valor>0){
				break;
			}
			else{
				System.out.println("Informe um valor maior que zero");
			}				//fim if

		}//fim while
		return valor;
	}//fim de obterValor

//}

public void ordenarPesquisa() {
				int[] lista = new int[3];
		int i=0, busca;
		Scanner resposta = new Scanner(System.in);
			
		for(i=0; i<lista.length; i++){
			System.out.printf(" Digite %d º número para a lista: ", i+1);
			lista[i]= resposta.nextInt();
		}
		System.out.println(" Digite um numero para procurar: ");
		busca = resposta.nextInt();
		for(i=0; i<lista.length; i++){
			if(busca == lista[i]){
				int a=i+1;
				System.out.println(" O número existe na lista e é o " + a+"º");
			}
		}
	}//fim metodo


public void alfabetica() {
	   //criacao das variaveis, scanner e lista
	   int indice;
	   Scanner resposta = new Scanner(System.in);
	   String[] nome = new String[10];
	   //preencher a lista com os nomes
	   for(indice =0; indice < nome.length; indice++){
	     System.out.println("Digite um nome: ");
	     nome[indice] = resposta.next();
	   }//fim for
	   //colocando a lista em ordem alfabética
	  Arrays.sort(nome);
	  
	  for(indice =0; indice < nome.length; indice++){
	     System.out.println("Indice "+ indice +" = "+ nome[indice]);
	   }//fim for
	  }//fim metodo
public void numerica() {
	   //criacao das variaveis, scanner e lista
	   int indice;
	   Scanner resposta = new Scanner(System.in);
	   int[] lista = new int[10];
	   //preencher a lista com os nomes
	   for(indice =0; indice < lista.length; indice++){
	     System.out.println("Digite um número: ");
	     lista[indice] = resposta.nextInt();
	   }//fim for
	  Arrays.sort(lista);
	  
	  for(indice =0; indice < lista.length; indice++){
	     System.out.println("Indice "+ indice+ " = "+ lista[indice]);
	   }//fim for
	  }//fim main


}//fim class

