import java.util.Scanner;

public class aula3103parte2 {

	public static void main(String[] args) {

		double m, c, n, i;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do capital investido: ");
		c = teclado.nextDouble();
		
		System.out.print("Digite o valor da taxa de juros (0 - 100%): ");
		i = teclado.nextDouble();
		
		System.out.print("Digite o valor do tempo em meses: ");
		n = teclado.nextDouble();
		
		m = c * Math.pow((1+i), n);
		
		System.out.println("O montante gerado é de R$" + String.format("%.2f", m));
		
		teclado.close();
				
	}

}
