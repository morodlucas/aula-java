import java.util.Scanner;

public class aula0505parte2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int v1, v2, v3, res;
		System.out.println("Digite 3 valores inteiros diferentes.");
		System.out.print("Digite o valor 1: ");
		v1 = teclado.nextInt();

		System.out.print("Digite o valor 2: ");
		v2 = teclado.nextInt();
		if (v1 == v2) {
			System.out.print("Os valores devem ser diferentes.");
		} else {

			System.out.print("Digite o valor 3: ");
			v3 = teclado.nextInt();
			if (v3 == v2 || v3 == v1) {
				System.out.print("Os valores devem ser diferentes.");
			} else {
				if (v1 < v2 && v1 < v3) {
				
				}

			}

		}

		teclado.close();
	}

}
