import java.util.Scanner;

public class aula1108 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		double y = 0;
		int n, cont, fat = 1;
		
		System.out.print("Valor n -> ");
		n = kb.nextInt();
		
		for(cont = 1; cont <=n; cont++) {
			//para haver acumulo na repetição, a variavel tem que ter seu proprio valor atribuido
			
			fat = fat * cont;
			
			y = y + (double) cont / fat;
		}
		
		System.out.println("valor y -> " + y);
		
		kb.close();
		
	}

}
