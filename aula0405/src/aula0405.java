import java.util.Scanner;

public class aula0405 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String nome, genero;
		double altura, peso;
		
		System.out.print("Nome do paciente: ");
		nome = teclado.nextLine();
		System.out.print("Gênero (masculino ou feminino): ");
		genero = teclado.nextLine();
		System.out.print("Altura em metros: ");
		altura = teclado.nextDouble();
		
		genero = genero.toLowerCase();
		
		if(!genero.equals("feminino") && !genero.equals("masculino")) {
			System.out.print("Gênero inválido para essa aplicação.");
		} else {
			if(genero.equals("feminino")) {
				peso = 62.1 * altura - 44.7;
			} else {
				peso = 72.7 * altura - 58;
			}
			System.out.println(nome + "O seu peso ideal é: " + peso);
		}
			
		
		
	}


}