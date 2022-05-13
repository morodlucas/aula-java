import java.util.Scanner;

public class aula1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int v1, v2, v3, aux;
		
		System.out.println("Digite 3 valores");
		v1 = teclado.nextInt();
		v2 = teclado.nextInt();
		v3 = teclado.nextInt();
		
		if (v1 > v2) {
			aux = v1;
			v1 = v2;
			v2 = aux;
		}
		
		if (v1 > v3) {
			aux = v1;
			v1 = v3;
			v3 = aux;
		}
		
		if (v2 > v3) {
			aux = v2;
			v2 = v3;
			v3 = aux;
		}
		
		System.out.println("Os valores fornecidos, em ordem crescente, são: " + v1 + ", " + v2 + ", " + v3 + ".");
		
		
	}

}
