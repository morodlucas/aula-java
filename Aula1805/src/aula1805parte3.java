import java.util.Scanner;

public class aula1805parte3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int valor1, contagem = 0, tabuada;
		String resp;
		
		System.out.print("Insira um número inteiro: ");
		valor1 = teclado.nextInt();
		
		System.out.println("A tabuada do " + valor1 + " é: ");
		
		while(contagem <= 10) {
			tabuada = valor1 * contagem;
			System.out.println(valor1 + " * " + contagem + " = " + tabuada);
			contagem = contagem +1;
		}
		
		System.out.println("Deseja continuar? S/N");
		resp = teclado.next();
		
		if(resp.equalsIgnoreCase("s")) {
			while()
		}
		else {
			System.out.print("Obrigado por usar o programa ;)");
		}
		
	}

}
