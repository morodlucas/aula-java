import java.util.Scanner;

public class aula1108pt3 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		int[] x = new int [5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Valor -> ");
			x[i] = kb.nextInt();
		}
	}

}
