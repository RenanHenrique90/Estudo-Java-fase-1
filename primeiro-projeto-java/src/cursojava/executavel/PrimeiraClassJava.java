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
		/*Condições lógicas com IF e Else
		if (mediaAluno >= 70 && mediaAluno <= 100) {
			System.out.println("Voce foi aprovado!");
		} else if (mediaAluno < 70 && mediaAluno >= 55) {
			System.out.println("Voce ficou de recuperação");
		} else if (mediaAluno < 50) {
			System.out.println("Voce foi reprovado!");
		} else {
			System.out.println("Nota invalida!");
		}*/
		//-----------------------------------------------------------------------
		/*Operadores ternários
		
		String saidaResuldo = mediaAluno >= 70 ? "Aluno aprovado" : (mediaAluno < 70 && mediaAluno >= 50)  ? "Voce esta de recuperação" : "Voce esta reprovado";
		
		System.out.println(saidaResuldo);*/
		//-----------------------------------------------------------------------
		/*Operações lógicas aninhadas: São operações dentro de operações
		
		if (mediaAluno >= 50) {
			if (mediaAluno >= 70) {
				System.out.println("Aluno está aprovado direto!");
			} else {
				System.out.println("Aluno está em recuperação!");
			}
		}else {
			System.out.println("Aluno está reprovado!");
		}*/
		//-----------------------------------------------------------------------
		
		/*Switch case: Operações Exatas
		
		int dia = 7;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
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
		
		/*Estrutura de repetição While
		
		int numero1 = 0;
		int numero2 = 0;
		
		while (numero1 <= 20) {
			System.out.println(numero1);
			numero1 ++;
		}*/
		
		/*Estrutura de repetição Do while
		System.out.println("___________________________\n");
		
		do {
			System.out.println(numero2);
			numero2 ++;
		} while (numero2 >= 0 && numero2 <= 10);
		    System.out.println("Hello World!");*/
		//-----------------------------------------------------------------------
		
		/*Estrutura de repetição FOR
		
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
		
		System.out.println("Saiu do laço for depois do break após encontrar o numero 3");*/
		
		/*FOR com CONTINUE*/
		
		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3) {
				System.out.println("Encontrado o numero: " + 3);
				continue;
			}
			System.out.println("Esse é o laço FOR");
		}
		
		for (int numero = 0; numero < 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("O numero encontrado é: " + numero);
				continue;
			}
			System.out.println("Esse é o segundo laço FOR");
		}
		
	}
}
