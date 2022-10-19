import java.util.Scanner;

public class aula1910 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Lado 1 do triângulo: ");
		x = kb.nextInt();
		System.out.print("Lado 2 do triângulo: ");
		y = kb.nextInt();
		System.out.print("Lado 3 do triângulo: ");
		z = kb.nextInt();
		
		if(x < y + z && y < x + z && z < x + y) {			
			classificar(x, y, z);
		} else {
			System.out.println("Os valores não formam um triângulo");
		}
	}
	
	// \/ \/ assinatura do método \/ \/
	public static void classificar(int x, int y, int z) {
		if(x == y && y == z) {
			System.out.println("Triângulo equilátero");
		} else if(x == y || x == z || y == z){
			System.out.println("Triângnulo isósceles");
		} else {
			System.out.println("Triângulo escaleno");
		}
	}

}
