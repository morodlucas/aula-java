import java.util.Scanner;

public class aula1910pt2 {

	public static void main(String[] args) {

		Scanner kb = new Scanner (System.in);
		int x, y, z;
		
		System.out.print("Aluno 1: ");
		x = kb.nextInt();
		System.out.print("Aluno 2: ");
		y = kb.nextInt();
		System.out.print("Aluno 3: ");
		z = kb.nextInt();
		
		System.out.println("Maior nota: " + acharMaior(x, y, z));
	}

	public static int acharMaior(int x, int y, int z){
		//int maior = 0;
		if(x > y && x > z) {
			// = z;
			return x;
		}
		if(y > z) {
			//maior = y;
			return y;
		}
		
			//maior = z;
		return z;
		
		//return maior;
	}
	
}
