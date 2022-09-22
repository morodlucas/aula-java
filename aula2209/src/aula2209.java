import java.util.Random;
import java.util.Scanner;

public class aula2209 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner kb = new Scanner(System.in);
		int totalVendedor;
		
		System.out.print("Total de vendedores -> ");
		totalVendedor = kb.nextInt();
		
		String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun"};
		String[] vendedor = new String[totalVendedor];
		double[][] venda = new double[totalVendedor][mes.length+1];
		double totalVenda;
		
		kb.nextLine();
		for (int i = 0; i < totalVendedor; i++) {
			System.out.print("Nome do vendedor #" + (i+1) + ": ");
			vendedor[i] = kb.nextLine();
			totalVenda = 0;
			for (int j = 0; j < mes.length; j++) {
				venda[i][j] = r.nextInt(5);
				totalVenda += venda[i][j];
			}
			venda[i][mes.length] = totalVenda;
		}
		
		System.out.println();
		System.out.println("Tabela de vendas");
		
		for (int i = 0; i < totalVendedor; i++) {
			for (int j = 0; j < mes.length; j++) {
				System.out.print(String.format("%.2f\t", venda[i][j]));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Total de vendas por vendedor");
		for (int i = 0; i < venda.length; i++) {
			System.out.println(vendedor[i] + " -> " + String.format("%.2f", venda[i][mes.length]));
			
		}
		
	}

}
