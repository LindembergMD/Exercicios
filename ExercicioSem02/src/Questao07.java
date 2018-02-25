import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
	double[] media = new double[6];
	double[] notas = new double[12];
	int contador = 0;
	Scanner resposta = new Scanner(System.in);
	int teste = 0;
	int alunoExame =0;
	int alunoReprovado =0;
	int alunoAprovado =0;
	int testo = 0;
	double mediaTotal=0;

		for(contador = 0; contador < 6; contador++) {

				System.out.println(" Digite a primeira nota do " +contador+" aluno: ");
				notas[teste] = resposta.nextDouble();
				teste++;
				System.out.println(" Digite a segunda nota do " +contador+" aluno: ");
				notas[teste] = resposta.nextDouble();
				teste++;
			}

		for(contador = 0; contador < 6; contador ++) {
			
			media[contador] = (notas[testo] + notas[++testo])/2;
			System.out.println(" A média do "+ contador + " aluno é: " +media[contador]);
			if(media[contador]<3) {
					System.out.println(" O aluno foi reprovado. ");
					alunoReprovado++;
			}else if(3<= media[contador] &&  media[contador] <7){
				System.out.println(" O aluno está na final. ");
				alunoExame++;
			}else if(media[contador]>=7){
				System.out.println(" O aluno foi aprovado ");
				alunoAprovado++;
			}
			testo++;
			
		}
		
		System.out.println(alunoReprovado + " aluno(s) foram reprovados");
		System.out.println(alunoExame + " aluno(s) vão para a final");
		System.out.println(alunoAprovado + " aluno(s) foram aprovados");

		mediaTotal = (media[0]+media[1]+media[2]+media[3]+media[4]+media[5])/6;
		System.out.println("A media da classe é: "+ mediaTotal);

		resposta.close();
	}
}
