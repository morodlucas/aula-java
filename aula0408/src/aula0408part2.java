import java.util.Scanner;

public class aula0408part2 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		double y = 0;
		int n;
		
		System.out.println("valor inteiro para n");
		n = kb.nextInt();
		
		for(int cont = 1; cont <= n; cont++) {
			y = y + (double)cont / (n - cont + 1);
		}
		
		System.out.println(y);
		
		
		
	}

}
