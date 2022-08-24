import java.util.Random;

public class aula2408 {

	public static void main(String[] args) {
		
		Random gen = new Random();
		
		//%x randomizar até o número x
		//fora do parêteses gera números pos e neg
		
		int x = gen.nextInt(1, 11);
		double z = gen.nextDouble() * 100;
		
		System.out.println(x);
		System.out.println();
		System.out.println(z);
		
		

	}

}
