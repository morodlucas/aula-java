import java.util.Random;

public class aula1409pt2 {

	public static void main(String[] args) {
		//array bidimensional - pt2
		
		int[][] x = new int [3][3];
		int aux;
		
		Random r = new Random();
		
		for (int linha = 0; linha < x.length; linha++) {
			for (int coluna = 0; coluna < x.length; coluna++) {
				x[linha][coluna] = r.nextInt(10);
				System.out.print(x[linha][coluna] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int linha = 0, coluna = x.length-1; linha < x.length; linha++, coluna--) {
			aux = x[linha][linha];
			x[linha][linha] = x[linha][coluna];
			x[linha][coluna] = aux;
		}
		
		System.out.println();
		
		for (int linha = 0; linha < x.length; linha++) {
			for (int coluna = 0; coluna < x.length; coluna++) {
				System.out.print(x[linha][coluna] + "\t");
			}
			System.out.println();
		}
		

	}

}
