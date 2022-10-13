import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int valor;
		
		System.out.println("Valor inteiro positivo");
		valor = kb.nextInt();
		if (valor <= 0) {
			System.out.println("o valor deve ser inteiro e positivo");
		} else {
			divisor(valor);
		}
		
	}

	public static void divisor(int valor) {
		
		for (int i = -valor; i <= valor; i++) {
			if(i != 0 && valor % i == 0) {
				System.out.println(i + " é um divisor de " + valor);
			}
		}
	}
	
}
