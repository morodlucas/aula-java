import java.util.Scanner;

public class aula1304 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		double area, raio, altura, lata, valor;
		
		System.out.println("Informe o valor do raio em metros: ");
		
		raio =  teclado.nextDouble();
		
		System.out.println("Informe o valor da altura em metros: ");
		
		altura = teclado.nextDouble();
		
		area = 2 * Math.PI * raio * (altura + raio);
		
		lata = area / 15;
		valor = lata * 190;
		
		System.out.println("O valor a ser gasto é R$" + valor + ", isso resultaria na compra de " + lata + " latas.");
		
		teclado.close();
	}

}
