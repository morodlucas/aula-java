import java.util.Scanner;

public class aula2508pt2 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int qtdfuncionario;
		double total = 0;
		
		System.out.print("Numero de funcionarios -> ");
		qtdfuncionario = kb.nextInt();
		
		double [] salario = new double [qtdfuncionario];
		String [] nome = new String[qtdfuncionario];
		
		
		for (int i = 0; i < qtdfuncionario; i++) {
			System.out.println("--------------------------");
			kb.nextLine();
			System.out.print("Nome do funcionario "+ i + " -> ");
			nome[i] = kb.nextLine();
			System.out.print("Salario -> ");
			salario[i] = kb.nextDouble();
			
			total = total + salario[i]; //total += salario[i];
		}
		
		System.out.println("Total de pagamento -> " + total);
		System.out.println("Media salarial -> " + total/qtdfuncionario);
		
		
	}

}
