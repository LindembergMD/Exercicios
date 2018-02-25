import java.util.Scanner;

public class Questao08 {

public static void main(String[] args) {
	int dias=0;
	int totalCliente = 0;
	int totalPousada = 0;
	String cliente = " ";
	int taxa=0;
	Scanner resposta = new Scanner(System.in);
	
	while(!"fim".equals(cliente)) {
		System.out.println("Qual o nome do cliente? (Digite 'fim' para sair)");
		cliente = resposta.next();
		if("fim".equals(cliente)) {
			break;
		}
		System.out.println("Quantos dias o cliente passou? ");
		dias=resposta.nextInt();
		
		if(dias<10) {
			taxa = 15;
			totalCliente = dias*40 + 15;
			System.out.println("O cliente deve pagar: "+ totalCliente);
			totalPousada = totalCliente + totalPousada;
		}else if(dias>=10){
			taxa = 8;
			totalCliente = dias*40 + 8;
			System.out.println("O cliente deve pagar: "+ totalCliente);
			totalPousada = totalCliente + totalPousada;
		}
	}
	resposta.close();
	System.out.println("O total arrecadado pela pousada foi de: "+ totalPousada);
}
}
