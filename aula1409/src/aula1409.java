import java.util.Random;

public class aula1409 {

	public static void main(String[] args) {
		//array bidimensional
		
		int[][] x = new int [2][2];
		int dp = 0, ds = 0;
		
		Random r = new Random();
		
		for (int linha = 0; linha < x.length; linha++) {
			for (int coluna = 0; coluna < x.length; coluna++) {
				x[linha][coluna] = r.nextInt(10);
				System.out.print(x[linha][coluna] + "\t");
				if(linha == coluna) {
					dp += x[linha][coluna];
				}
				if(linha + coluna == x.length - 1) {
					ds += x[linha][coluna];
				}
			}
			System.out.println();
		}
		
		
		System.out.println("soma da diagonal principal = " + dp);
		
		System.out.println("soma da diagonal secundária = " + ds);
		

	}

}
