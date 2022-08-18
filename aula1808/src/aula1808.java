import java.util.Scanner;

public class aula1808 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double media, maior = 0;
		
		double[] temperatura = new double[7];
		String[] dia = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
		
		for (int i = 0; i < dia.length; i++) {
			System.out.print("Temperatura do(a) " + dia[i] + ": ");
			temperatura[i] = kb.nextDouble();
			System.out.println("-------------------------");
		}
		
		media = (temperatura[1] + temperatura[2] + temperatura[3] + temperatura[4] + temperatura[5] + temperatura [6] + temperatura[0])/7;
		
		System.out.println("-------------------------------------");
		
		System.out.println("Média da semana -> " + media);
		
		for (int i = 0; i < dia.length; i++) {
			if(temperatura[i] > media) {
				System.out.println("Acima da média -> " + dia[i]);;
				System.out.println("-------------------------------------");
			}	
		}
		
		
		kb.close();
		
	}

}
