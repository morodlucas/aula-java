import java.util.Scanner;

public class aula3103 {

	public static void main(String[] args) {

		int centena, dezena, unidade, numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do n�mero de  tr�s digitos: ");
		numero1= teclado.nextInt();
		
		
		centena = numero1 / 100;
		dezena = numero1 % 100 /10;
		unidade = numero1 % 10;
		
		numero2 = unidade * 100 + dezena * 10 + centena;
		
		System.out.println("O n�mero " + numero1 + " invertido �: " + numero2);
		
		
		
		teclado.close();
		
		
	}

}
