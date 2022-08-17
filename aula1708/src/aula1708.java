import java.util.Scanner;

public class aula1708 {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		
		int[] x = new int[1000];
		int y, maior = Integer.MIN_VALUE;
		
		System.out.print("Tamanho do vetor: ");
		y = kb.nextInt();
		
		for(int i = 0; i < y; i++) {
			System.out.print("indice " + i +": ");
			x[i] = kb.nextInt();
			if(x[i] > maior || i == 0) {
				maior = x[i];
			}
			
		}

		System.out.println("maior: " + maior);
		
	}

}


//x.length