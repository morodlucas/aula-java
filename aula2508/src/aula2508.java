import java.util.Random;

public class aula2508 {

	public static void main(String[] args) {
		
		
		Random gen = new Random();
		int[] x = new int[10];
		boolean achou;
		
		for (int i = 0; i < x.length; ) {
			x[i] = gen.nextInt(1, 51);
			achou = false;
			for (int j = 0; j < i; j++) {
				
				if(x[i] == x[j]) {
					achou = true;
				}
			}
			
			if(achou == false) {
				System.out.print(x[i] + " ");
				i++;
			}
			
			
		}
		
		
	}

}
