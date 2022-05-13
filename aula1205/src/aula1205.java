//ARRUMAR DEPOIS

import java.util.Scanner;

public class aula1205 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String cargo;
		double salarioa, salarion, diferenca, porcentagem;
		int tempo;
		
		System.out.print("Informe o cargo exercido: ");
		cargo = teclado.next();
		System.out.print("Informe o tempo de serviço (em anos): ");
		tempo = teclado.nextInt();
		System.out.print("Informe o salário atual: ");
		salarioa = teclado.nextDouble();
		
		
		if(cargo.equalsIgnoreCase("gerente")) {
			if(tempo >= 5) {
				porcentagem = 10;
			}
			else if(tempo >=3) {
				porcentagem = 9;
			}
			else {
				porcentagem = 8;
			}
			
		}
		else if(cargo.equalsIgnoreCase("engenheiro")) {
			if(tempo >= 5) {
				porcentagem = 11;
			}
			else if(tempo >=3) {
				porcentagem = 10;
			}
			else {
				porcentagem = 9;
			}
			
		}
		else if(cargo.equalsIgnoreCase("técnico")) {
			if(tempo >= 5) {
				porcentagem = 12;
			}
			else if(tempo >=3) {
				porcentagem = 11;
			}
			else {
				porcentagem = 10;
			}
			
		}
		else {
			porcentagem = 5;
		}
		
		salarion = salarioa * (1 + salarioa * porcentagem / 100);
		diferenca = salarion - salarioa;
		System.out.print("O novo salário é de R$" + salarion + " e a diferença entre os salários (antigo e atual) é de R$" + diferenca);
		
		teclado.close();
		
	}

}