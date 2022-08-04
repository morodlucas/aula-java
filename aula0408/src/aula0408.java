import java.util.Scanner;

public class aula0408 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int valor, validacao = 0, total = 0;
		
		do {
		
			System.out.println("Digite um valor inteiro e positivo");
			valor = kb.nextInt();
			
				if(valor > 0) {
					validacao++;
				}
				else {
					System.out.println("Erro");
					System.out.println("-------------------------");
				}
				
		} while(validacao == 0);
		
		for(int cont = 2; cont < valor; cont++) {
			if(valor % cont == 0) {
				total++;
				break;
			}
		}
		
		if(total == 0) {
			System.out.println("------------------------------------");
			System.out.println(valor + " eh um numero primo");
		}
		else {
			System.out.println("------------------------------------");
			System.out.println(valor + " nao eh um numero primo");
		}
		kb.close();
	}

}
