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
		System.out.print("Informe o tempo de servi�o (em anos): ");
		tempo = teclado.nextInt();
		System.out.print("Informe o sal�rio atual: ");
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
		else if(cargo.equalsIgnoreCase("t�cnico")) {
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
		System.out.print("O novo sal�rio � de R$" + salarion + " e a diferen�a entre os sal�rios (antigo e atual) � de R$" + diferenca);
		
		teclado.close();
		
	}

}