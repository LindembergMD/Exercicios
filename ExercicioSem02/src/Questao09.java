import java.util.Scanner;

public class Questao09 {
	

		public static void main(String[] args) {
		String[] cliente = new String[20];
		String[] sexo = new String[20];
		double[] peso=new double[20];	
		int[] idade=new int[20];
		double[] altura=new double[20];
		Scanner resposta = new Scanner(System.in);	
		double contador =0;
		int teste=0;
		int mediaIdade=0;
		int quantidade=0;
		int faixaEtaria=0;
		int mulherPeso=0;
		int pessoas=0;
		double verificador = Integer.MAX_VALUE;
		String maiorIdade = " ";
		String maisBaixa = " ";
		
		while(!"fim".equals(cliente[teste])) {

					System.out.println(" Digite nome do cliente: (Digite 'fim' para sair)");
					cliente[teste] = resposta.next();
					if("fim".equals(cliente[teste])) {
						break;
					}
					System.out.println(" Digite o sexo: ");
					sexo[teste] = resposta.next();
					System.out.println("Digite a idade: ");
					idade[teste]=resposta.nextInt();
	
					System.out.println("Digite o peso: ");
					peso[teste]=resposta.nextDouble();
					System.out.println("Digite a altura: ");
					altura[teste]=resposta.nextDouble();
					
					if("masculino".equals(sexo[teste])){
						mediaIdade = idade[teste] + mediaIdade;
						pessoas++;	
					}
					if("feminino".equals(sexo[teste]) && altura[teste] > 1.6 && altura[teste]<1.7 && peso[teste]> 70) {
						mulherPeso++;
					}
					if(idade[teste]>=18 && idade[teste]>=25) {
						faixaEtaria++;
					}
					if(idade[teste]>contador) {
						maiorIdade= cliente[teste];
						contador = idade[teste];
					}
					if("feminino".equals(sexo[teste]) && verificador > altura[teste]) {
						maisBaixa = cliente[teste];
						verificador = 	altura[teste];
					}
					teste++;
					quantidade = teste;
					
				}

		
		System.out.println("A quantidade de pacientes é: "+quantidade);
		mediaIdade = mediaIdade/pessoas;
		System.out.println("A media de idade é de: "+mediaIdade);
		System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg é: "+ mulherPeso);
		System.out.println("A quantidade de pessoas com idade entre 18 e 25 é: "+faixaEtaria);
		System.out.println("O nome do paciente mais velho é: "+maiorIdade);
		System.out.println("O nome da mulher mais baixa é: "+maisBaixa);
		resposta.close();
		
	}
}