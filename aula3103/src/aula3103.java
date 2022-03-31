import java.util.Scanner;

public class aula3103 {

	public static void main(String[] args) {

		int centena, dezena, unidade, numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do número de  três digitos: ");
		numero1= teclado.nextInt();
		
		
		centena = numero1 / 100;
		dezena = numero1 % 100 /10;
		unidade = numero1 % 10;
		
		numero2 = unidade * 100 + dezena * 10 + centena;
		
		System.out.println("O número " + numero1 + " invertido é: " + numero2);
		
		
		
		teclado.close();
		
		
	}

}
