import java.util.Scanner;

public class aula1708pt2 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int[] x = new int[5];
		int par = 0;
		
		for(int i = 0; i < x.length; i++) {
			System.out.print("Valor -> ");
			x[i] = kb.nextInt();
			
			if(x[i] % 2 == 0) {
				par++;
			}
		}
		
		System.out.println("Total de pares -> " + par);
		System.out.println("Total de impares -> " + (x.length - par));
		
	}

}
