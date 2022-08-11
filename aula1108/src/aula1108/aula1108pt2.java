package aula1108;

import java.util.Scanner;

public class aula1108pt2 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int cont, produtos, validacao;
		double total = 0, preco;
		
		System.out.print("Quantidade de produtos: ");
		produtos = kb.nextInt();
		
		for(cont = 1; cont <= produtos; cont++){
		
		System.out.print("Valor do produto: R$");
		preco = kb.nextInt();
		
		total = total + preco;
		}
		
		System.out.println("Valor total: R$" + String.format("%.2f", total));
		
		System.out.println("------------------------");
		System.out.println("Voce deseja pagar parcelado (2x)?");
		System.out.println("1 para SIM // 0 para NAO");
		validacao = kb.nextInt();
		
		System.out.println("-------------------------");
		
		if(validacao == 1) {
			System.out.println("Houve um acrescimo de 15,5% por causa da forma de pagamento.");
			
			total = total/2 + total * 15.5/100;
			
			System.out.println("O valor total a ser pago sao duas parcelas de R$" + String.format("%.2f", total));
		}
		else {
			System.out.println("O pagamento sera feito a vista.");
			System.out.println("Ha um desconto de 10%");
			
			total = total - total * 10/100;
			
			System.out.println("O valor total a ser pago sera de: R$" + String.format("%.2f", total));
		}
		
		kb.close();
		
		
	}

}
