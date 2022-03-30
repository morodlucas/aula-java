import java.util.Scanner;

public class aula3003 {

	public static void main(String[] args) {
		double tempc, tempfa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor da temperatura em celsius: ");
		tempc = teclado.nextDouble();
				
		tempfa = 9 * tempc / 5 + 32;
		
		System.out.println("A temperatura em farenheit é: " + String.format("%.2f", tempfa));
		// %.2f atribui margem de 2 casas decimais pra variável tempfa

		
		teclado.close();		
		
		
	}

}
