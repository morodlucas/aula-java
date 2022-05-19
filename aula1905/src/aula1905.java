import java.util.Scanner;

public class aula1905 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		String nome;
		double nota1, nota2, media;
		int alunost, alunosap = 0, alunosrep = 0, contador = 1;
		
		System.out.print("Digite o total de alunos: ");
		alunost = kb.nextInt();
		
		while(contador <= alunost) {
			
			System.out.println();
			
			System.out.println("Aluno " + contador);
			System.out.print("Nome do aluno: ");
			nome = kb.next();
			
			System.out.print("Primeira nota: ");
			nota1 = kb.nextDouble();
			System.out.print("Segunda nota: ");
			nota2 = kb.nextDouble();
			
			media = (nota1 + nota2) / 2;
			
			if(media >= 6 && media <= 10) {
				System.out.println("O aluno foi aprovado.");
				alunosap++;
			}
			else {
				if(media > 10 || media < 0) {
					System.out.println("Isso é impossível.");
				}
				if(media < 6 && media >= 0) {
					System.out.println("O aluno foi reprovado.");
					alunosrep++;
				}
			}
			
			contador++;

		}
	
		System.out.println();
		System.out.println("O total de alunos aprovados é de " + alunosap + " aluno(s).");
		System.out.println("O total de alunos reprovados é de " + alunosrep + " aluno(s).");
		
	}

}
