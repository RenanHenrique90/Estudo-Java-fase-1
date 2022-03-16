package cursojava.executavel;

import java.util.Iterator;

import javax.print.attribute.standard.Media;

public class PrimeiraClassJava {

	public static void main(String[] args) {
		
		int nota1 = 100;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 80;
		int mediaAluno = 0;
		
		mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
		//-----------------------------------------------------------------------
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
		//-----------------------------------------------------------------------
		/*Operadores tern�rios
		
		String saidaResuldo = mediaAluno >= 70 ? "Aluno aprovado" : (mediaAluno < 70 && mediaAluno >= 50)  ? "Voce esta de recupera��o" : "Voce esta reprovado";
		
		System.out.println(saidaResuldo);*/
		//-----------------------------------------------------------------------
		/*Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es
		
		if (mediaAluno >= 50) {
			if (mediaAluno >= 70) {
				System.out.println("Aluno est� aprovado direto!");
			} else {
				System.out.println("Aluno est� em recupera��o!");
			}
		}else {
			System.out.println("Aluno est� reprovado!");
		}*/
		//-----------------------------------------------------------------------
		
		/*Switch case: Opera��es Exatas
		
		int dia = 7;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;	
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Digite um numero de 1 a 7");
			break;
		}*/
		//-----------------------------------------------------------------------
		
		/*Estrutura de repeti��o While
		
		int numero1 = 0;
		int numero2 = 0;
		
		while (numero1 <= 20) {
			System.out.println(numero1);
			numero1 ++;
		}*/
		
		/*Estrutura de repeti��o Do while
		System.out.println("___________________________\n");
		
		do {
			System.out.println(numero2);
			numero2 ++;
		} while (numero2 >= 0 && numero2 <= 10);
		    System.out.println("Hello World!");*/
		//-----------------------------------------------------------------------
		
		/*Estrutura de repeti��o FOR
		
		for (int numero = 0; numero <= 10; numero ++) {
			System.out.println(numero);
		}
		
		System.out.println("_____________________\n");
		
		for (int numero2 = 10; numero2 >= 0; numero2 --) {
			System.out.println(numero2);
		}*/
		
		//-----------------------------------------------------------------------
		
		/*FOR com BREAK
		
		for (int numero = 0; numero <= 10; numero++) {
			
			if (numero == 3) {
				System.out.println("Numero encontrado: " + 3);
				break;
			}
			
		}
		
		System.out.println("Saiu do la�o for depois do break ap�s encontrar o numero 3");*/
		
		/*FOR com CONTINUE*/
		
		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3) {
				System.out.println("Encontrado o numero: " + 3);
				continue;
			}
			System.out.println("Esse � o la�o FOR");
		}
		
		for (int numero = 0; numero < 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("O numero encontrado �: " + numero);
				continue;
			}
			System.out.println("Esse � o segundo la�o FOR");
		}
		
	}
}
