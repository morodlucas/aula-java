
		//estrutura de repetição

import java.util.Scanner;

public class Aula1805 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.print("Digite o valor 1: ");
		valor1 = teclado.nextInt();
		System.out.print("Digite o valor 2: ");
		valor2 = teclado.nextInt();
		
		if(valor2 > valor1 && valor1 > 0) {
			while(valor1 <= valor2) {
				System.out.print(valor1 + " ");
				valor1 = valor1 + 1;
			}
		}
		else {
			System.out.println("valores inválidos");
		}
		
		
		
		
		
		
		
	}

}
