//arrumar

import java.util.Random;
import java.util.Scanner;

public class aula2809 {

	public static void main(String[] args) {

		
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		 int x[][];
		 int y[][];
		 int z[][];
		 int l1, c1, l2, c2, soma;
		 
		 System.out.print("Quantidade de linhas da matriz 1 -> ");
		 l1 = kb.nextInt();
		 
		 System.out.print("Quantidade de colunas da matriz 1 -> ");
		 c1 = kb.nextInt();
		 l2 = c1;
		 
		 System.out.print("Quantidade de linhas da matriz 2 -> ");
		 l2 = kb.nextInt();
		 
		 System.out.print("Quantidade de colunas da matriz 2 -> ");
		c2 = kb.nextInt();
		 
		x = new int[l1][c1];
		y = new int[l2][c2];
		z = new int[l1][c2];
		
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][i] = r.nextInt(20);
				System.out.print(x[i][i] + "\t");
			}
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < l2; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][i] = r.nextInt(20);
				System.out.print(x[i][i] + "\t");
			}
		}
		
		for (int i = 0; i < l1; i++) {
			for (int k = 0; k < c2; k++) {
				soma = 0;
				for (int j = 0; j < c1; j++) {
					soma += x[i][j] * y[j][k];
				}
				z[i][k] = soma;
			}
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				System.out.print(x[i][i] + "\t");
			}
		}
	}

}
