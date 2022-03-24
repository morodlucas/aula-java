import java.util.Scanner;

public class aula2403 {

	public static void main(String[] args) {
		int val1, val2, res;
		Scanner teclado = new Scanner(System.in);
		//Scanner atribui a variavel "teclado" ao comando de buscar dados nos comandos do teclado
		//System.in é como a máquina identifica o teclado
		

		System.out.println("Digite o primeiro valor :) ");
		
		val1 = teclado.nextInt();
		//val1 fica atribuido ao valor do inteiro recebido na variável teclado, que é ligada aos comandos feitos no teclado ^^
		//"nextInt" pq é uma variável inteira, se fosse double, seria "nextDouble"
		
		System.out.println("Digite o segundo valor :O ");
		
		val2 = teclado.nextInt();
		
		res = val1 + val2;
		
		System.out.println("O resultado é " + res + " :()");
		
		teclado.close();
		//fecha o recurso quando não precisa mais -> boa prática
		
	}

}