import java.util.Scanner;

public class aula2605 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int num, cont = 1, fat=1;
		
		do {
			System.out.println("Calculadora de fatorial");
			System.out.println("-----------------------");
			System.out.print("Digite o número >inteiro< que deseja calcular o fatorial: ");
			num = kb.nextInt();
			if(num < 0) {
				System.out.println("--------------");
				System.out.println("Valor inválido");
				System.out.println("--------------");
			}
			
		} while(num < 0);
		
		
		while(cont <= num) {
			fat = fat * cont;
			cont++;
		}
		
		System.out.println("O fatorial de " + num + " é: " + fat);
		
		
	}

}
