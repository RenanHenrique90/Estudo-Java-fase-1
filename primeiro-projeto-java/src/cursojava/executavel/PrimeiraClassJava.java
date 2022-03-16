package cursojava.executavel;

public class PrimeiraClassJava {

	public static void main(String[] args) {

		int nota1 = 100;
		int nota2 = 50;
		int nota3 = 70;
		int nota4 = 80;
		
		int mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (mediaAluno >= 70 && mediaAluno <= 100) {
			System.out.println("Voce foi aprovado!");
		} else if (mediaAluno < 70 && mediaAluno >= 55) {
			System.out.println("Voce ficou de recuperação");
		} else if (mediaAluno < 50) {
			System.out.println("Voce foi reprovado!");
		} else {
			System.out.println("Nota invalida!");
		}
	}
}
