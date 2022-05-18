import java.util.Scanner;

public class Aula1805parte2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int entrada, maior = 0, contador = 1;
		
		while(contador <= 5) {
			System.out.println("Insira um valor");
			entrada = teclado.nextInt();
			if(entrada > maior || contador == 1) {
				maior = entrada;
			}
			contador = contador + 1;
		}
		
		System.out.println("O maior valor é: " + maior);
		
	}

}