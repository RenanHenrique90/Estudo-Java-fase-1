package cursojava.executavel;

import java.util.Iterator;

import javax.print.attribute.standard.Media;

import javax.swing.JOptionPane;

public class PrimeiraClassJava {

	public static void main(String[] args) {
		/*
		 * int nota1 = 100; int nota2 = 70; int nota3 = 70; int nota4 = 80; int
		 * mediaAluno = 0;
		 * 
		 * mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
		 */
		// -----------------------------------------------------------------------
		/*
		 * Condi��es l�gicas com IF e Else if (mediaAluno >= 70 && mediaAluno <= 100) {
		 * System.out.println("Voce foi aprovado!"); } else if (mediaAluno < 70 &&
		 * mediaAluno >= 55) { System.out.println("Voce ficou de recupera��o"); } else
		 * if (mediaAluno < 50) { System.out.println("Voce foi reprovado!"); } else {
		 * System.out.println("Nota invalida!"); }
		 */
		// -----------------------------------------------------------------------
		/*
		 * Operadores tern�rios
		 * 
		 * String saidaResuldo = mediaAluno >= 70 ? "Aluno aprovado" : (mediaAluno < 70
		 * && mediaAluno >= 50) ? "Voce esta de recupera��o" : "Voce esta reprovado";
		 * 
		 * System.out.println(saidaResuldo);
		 */
		// -----------------------------------------------------------------------
		/*
		 * Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es
		 * 
		 * if (mediaAluno >= 50) { if (mediaAluno >= 70) {
		 * System.out.println("Aluno est� aprovado direto!"); } else {
		 * System.out.println("Aluno est� em recupera��o!"); } }else {
		 * System.out.println("Aluno est� reprovado!"); }
		 */
		// -----------------------------------------------------------------------

		/*
		 * Switch case: Opera��es Exatas
		 * 
		 * int dia = 7;
		 * 
		 * switch (dia) { case 1: System.out.println("Domingo"); break; case 2:
		 * System.out.println("Segunda-Feira"); break; case 3:
		 * System.out.println("Ter�a-Feira"); break; case 4:
		 * System.out.println("Quarta-Feira"); break; case 5:
		 * System.out.println("Quinta-Feira"); break; case 6:
		 * System.out.println("Sexta-Feira"); break; case 7:
		 * System.out.println("Sabado"); break; default:
		 * System.out.println("Digite um numero de 1 a 7"); break; }
		 */
		// -----------------------------------------------------------------------

		/*
		 * Estrutura de repeti��o While
		 * 
		 * int numero1 = 0; int numero2 = 0;
		 * 
		 * while (numero1 <= 20) { System.out.println(numero1); numero1 ++; }
		 */

		/*
		 * Estrutura de repeti��o Do while
		 * System.out.println("___________________________\n");
		 * 
		 * do { System.out.println(numero2); numero2 ++; } while (numero2 >= 0 &&
		 * numero2 <= 10); System.out.println("Hello World!");
		 */
		// -----------------------------------------------------------------------

		/*
		 * Estrutura de repeti��o FOR
		 * 
		 * for (int numero = 0; numero <= 10; numero ++) { System.out.println(numero); }
		 * 
		 * System.out.println("_____________________\n");
		 * 
		 * for (int numero2 = 10; numero2 >= 0; numero2 --) {
		 * System.out.println(numero2); }
		 */

		// -----------------------------------------------------------------------

		/*
		 * FOR com BREAK
		 * 
		 * for (int numero = 0; numero <= 10; numero++) {
		 * 
		 * if (numero == 3) { System.out.println("Numero encontrado: " + 3); break; }
		 * 
		 * }
		 * 
		 * System.out.
		 * println("Saiu do la�o for depois do break ap�s encontrar o numero 3");
		 */

		// -----------------------------------------------------------------------

		/*
		 * FOR com CONTINUE
		 * 
		 * for (int numero = 0; numero <= 10; numero++) { if (numero == 3) {
		 * System.out.println("Encontrado o numero: " + 3); continue; }
		 * System.out.println("Esse � o la�o FOR"); }
		 * 
		 * for (int numero = 0; numero < 10; numero++) { if (numero == 3 || numero == 6
		 * || numero == 9) { System.out.println("O numero encontrado �: " + numero);
		 * continue; } System.out.println("Esse � o segundo la�o FOR"); }
		 */

		// -----------------------------------------------------------------------

		/*
		 * Trabalhando com entrada de dados no Java usando o import
		 * javax.swing.JOptionPane String carros =
		 * JOptionPane.showInputDialog("Informe a quantidade de carros!"); String
		 * pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas!");
		 * 
		 * double carroNumero = Double.parseDouble(carros); double pessoaNumero =
		 * Double.parseDouble(pessoas);
		 * 
		 * int divisao = (int) (carroNumero / pessoaNumero) ;
		 * 
		 * double resto = carroNumero % pessoaNumero;
		 * 
		 * System.out.println("o numero de carros para cada pessoa �: " + divisao +
		 * "\no numero de carros que sobrou �: " + resto);
		 * 
		 * System.out.println("_____________________________________________\n");
		 * 
		 * String carros1 =
		 * JOptionPane.showInputDialog("Informe a quantidade de carros!"); String
		 * pessoas1 = JOptionPane.showInputDialog("Informe a quantidade de pessoas!");
		 * 
		 * double carroNumero1 = Double.parseDouble(carros1); double pessoaNumero1=
		 * Double.parseDouble(pessoas1);
		 * 
		 * int divisao1 = (int) (carroNumero1 / pessoaNumero1) ;
		 * 
		 * double resto1 = carroNumero1 % pessoaNumero1;
		 * 
		 * JOptionPane.showMessageDialog(null, "o numero de carros para cada pessoa �: "
		 * + divisao1 + "\no numero de carros que sobrou �: " + resto1);
		 */

		// -----------------------------------------------------------------------

		/*
		 * Criando op��es de confirma��o usando paineis String carros =
		 * JOptionPane.showInputDialog("Informe a quantidade de carros!"); String
		 * pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas!");
		 * 
		 * double carroNumero = Double.parseDouble(carros); double pessoaNumero =
		 * Double.parseDouble(pessoas);
		 * 
		 * int divisao = (int) (carroNumero / pessoaNumero) ;
		 * 
		 * double resto = carroNumero % pessoaNumero;
		 * 
		 * int resposta = JOptionPane.showConfirmDialog(null,
		 * "Voc� quer ver resposta da divisao inteira?");
		 * 
		 * if (resposta == 0) { JOptionPane.showMessageDialog(null,
		 * "Essa � a resposta da divisao inteira: " + divisao); }
		 * 
		 * resposta = JOptionPane.showConfirmDialog(null,
		 * "Voc� quer ver a resposta do resto da divis�o?");
		 * 
		 * if (resposta == 0) { JOptionPane.showMessageDialog(null,
		 * "Essa � a resposta do resto da divis�o: " + resto); }
		 */

		// -----------------------------------------------------------------------

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota1);
		double dNota3 = Double.parseDouble(nota1);
		double dNota4 = Double.parseDouble(nota1);

		double notaMedia = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		if (notaMedia >= 70 && notaMedia <= 100) {
			JOptionPane.showMessageDialog(null, "Parabens voc� foi aprovado! Sua nota foi de: " + notaMedia);
		} else if (notaMedia >= 50 && notaMedia < 70) {
			JOptionPane.showMessageDialog(null, "Voce ficou de Recupera��o!");
		}else {
			 JOptionPane.showMessageDialog(null, "Voce foi reprovado!");
		}
	}
}
