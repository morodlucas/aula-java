import java.util.Random;

public class aula2408pt2 {

	public static void main(String[] args) {
		
		Random gen = new Random();
		
		int [] x = new int [10];
		int y;
		
		for (int i = 0; i < x.length; i++) {
			
			x[i] = gen.nextInt(1, 11);
			System.out.print(x[i] + " ");
		}
		
		
		for(int cont = 1; cont <= x.length; cont++) {
			
			for (int i = 0; i < x.length - 1 ; i++) {
			
				if(x[i] > x[i+1]) {
					y = x[i+1];
					x[i+1] = x[i];
					x[i] = y;
				}
			
			}
		}
		
		System.out.println("");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
	}

}
