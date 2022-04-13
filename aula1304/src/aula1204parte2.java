import java.util.Scanner;

public class aula1204parte2 {

	public static void main(String[] args) {
		
		double nota1, nota2, media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("A sua média é: " + media);
		
		
		if(media < 6) {
			System.out.println("Você está reprovado lol :)");
		}
		
		else {
			System.out.println("Você está aprovado :O");
		}
		
		
		teclado.close();
		
		
	}

}
