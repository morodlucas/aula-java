import java.util.Scanner;

public class aula1509 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		String[] nomes;
		double[][] rodada;
		int qtdjog, qtdpart;
		double soma;

		System.out.print("Quantidade de jogadores -> ");
		qtdjog = kb.nextInt();

		nomes = new String[qtdjog];

		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Nome do jogador #" + (i + 1) + " -> ");
			//kb.nextLine();
			nomes[i] = kb.next();
		}

		System.out.println("");

		System.out.print("Quantidade de partidas -> ");
		qtdpart = kb.nextInt();

		rodada = new double[qtdjog][qtdpart + 1];

		System.out.println("-------------------------");
		
		for (int i = 0; i < nomes.length; i++) {

			System.out.println("Jogador #" + (i + 1) + " " + nomes[i]);
			
			soma = 0;

			for (int j = 0; j < qtdpart; j++) {

				System.out.print("Acuracia " + (j+1) + " do jogador " + nomes[i] + " -> ");
				rodada[i][j] = kb.nextDouble();
				soma += rodada[i][j];
				
			}
			
			rodada[i][qtdpart] = soma;
			
			System.out.println("Soma dos pontos -> " + soma);
			
			System.out.println("-------------------");
			
		}

	}

}
