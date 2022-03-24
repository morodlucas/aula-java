import java.util.Scanner;

public class aula2403part2 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor da primeira nota: ");
		nota1 = teclado.nextDouble();
		
		System.out.print("Digite o valor da segunda nota: ");
		nota2 = teclado.nextDouble();
		
		System.out.print("Digite o valor da terceira nota: ");
		nota3 = teclado.nextDouble();
				
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A sua média é: " + media);

		
		teclado.close();
	}

}
