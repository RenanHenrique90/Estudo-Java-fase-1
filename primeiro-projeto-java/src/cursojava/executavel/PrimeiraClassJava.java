package cursojava.executavel;

import javax.print.attribute.standard.Media;

public class PrimeiraClassJava {

	public static void main(String[] args) {
		
		int nota1 = 100;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 80;
		int mediaAluno = 0;
		
		mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Condi��es l�gicas com IF e Else
		if (mediaAluno >= 70 && mediaAluno <= 100) {
			System.out.println("Voce foi aprovado!");
		} else if (mediaAluno < 70 && mediaAluno >= 55) {
			System.out.println("Voce ficou de recupera��o");
		} else if (mediaAluno < 50) {
			System.out.println("Voce foi reprovado!");
		} else {
			System.out.println("Nota invalida!");
		}*/
		
		/*Operadores tern�rios
		
		String saidaResuldo = mediaAluno >= 70 ? "Aluno aprovado" : (mediaAluno < 70 && mediaAluno >= 50)  ? "Voce esta de recupera��o" : "Voce esta reprovado";
		
		System.out.println(saidaResuldo);*/
		
		/*Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es*/
		
		if (mediaAluno >= 50) {
			if (mediaAluno >=70) {
				System.out.println("Aluno est� aprovado direto!");
			} else {
				System.out.println("Aluno est� em recupera��o!");
			}
		}else {
			System.out.println("Aluno est� reprovado!");
		}
	}
}
