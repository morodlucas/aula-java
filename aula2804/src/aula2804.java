import java.util.Scanner;

public class aula2804 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double diaria;
		
		
		System.out.println("Digite o número de diárias: ");
		diaria = teclado.nextDouble();
		
		
		if(diaria > 15) {
			diaria = 250 * diaria + diaria * 15.5;
		}
		
		if(diaria == 15) {
			diaria = 250 * diaria + diaria * 36;
		}
		
		if(diaria < 15) {
			diaria = 250 * diaria + diaria * 58;
		}
		
		System.out.println("O valor a ser pago é de: R$" + diaria);
		teclado.close();
		
	}

}
