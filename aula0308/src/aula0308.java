import java.util.Scanner;

public class aula0308 {

	public static void main(String[] args) {

		//aula da estrutura de repetição FOR
		
		//for({variável de controle: cont}; {condição: V ou F}; {como a variável cont vai ser afetada: incremento ou decremento})
		
		Scanner kb = new Scanner(System.in);
		
		int valor;
		
		do {
			System.out.print("Digite o valor: ");
			valor = kb.nextInt();
		
			if(valor <= 0) {
			System.out.println("Valor inválido");
			System.out.println("-------------------------------------------");
			}
		} while(valor<=0); 
		
		for(int cont = -valor; cont <= valor; cont++) {
			
			if(cont != 0 && valor % cont == 0) {
				System.out.print(cont + "\t");
			}
		}
		
		
		
		
		
	}

}
