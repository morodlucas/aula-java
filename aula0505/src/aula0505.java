import java.util.Scanner;

public class aula0505 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		double a, b, c, delta, res1, res2;
		
		System.out.print("Digite o valor de 'a': ");
		a = teclado.nextDouble();
		if (a == 0) {
			System.out.println("Imposs�vel fazer o c�lculo. Valor de 'a' igual a 0.");
			teclado.close();
		} else {
			
		
		
		System.out.print("Digite o valor de 'b': ");
		b = teclado.nextDouble();
		
		System.out.print("Digite o valor de 'c': ");
		c = teclado.nextDouble();
		
		delta = b * b - 4 * a* c;
			if (delta < 0) {
			System.out.println("Imposs�vel fazer o c�lculo. Valor de 'delta' menor que 0.");
			teclado.close();
			} else {
			
				res1 = (-b + Math.sqrt(delta)) / (2 * a);
				res2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("O valor do x1 �: " + res1);
				System.out.println("O valor do x2 �: " + res2);
				teclado.close();
				}
		}
		
		
	}

}
