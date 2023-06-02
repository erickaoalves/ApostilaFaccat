/*23)  Para  o  enunciado  a  seguir  foi  elaborado  um  algoritmo  em  Português  Estruturado  que contém 
 * erros, identifique os erros no algoritmo apresentado abaixo:Enunciado: Tendo como dados de entrada o nome,
 *  a altura e o sexo (M ou F) de uma pessoa, calcule e mostre seu peso ideal, utilizando as seguintes fórmulas: 
 *  - para sexo masculino: 
 *   peso ideal = (72.7 * altura) - 58
 *    - para sexo feminino:  peso ideal = (62.1 * altura) 
 *    - 44.7 inicio ler nome ler sexo se sexo = M 
 *    então peso_ideal  (72.7 * altura) - 58 
 *    senão peso_ideal  (62.1 * altura) – 44.7      
 *    fim_se escrever  
 *    peso_ideal fim 
 */ 
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double pesoIdeal=0;
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite seu sexo");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Digite a sua altura");
		float altura = sc.nextFloat();
		
		if ((sexo=='m')||(sexo=='M')) {
			pesoIdeal = 72.2*altura-58;
			System.out.println("O peso ideal do(a) " +nome+ " é " + pesoIdeal);
		} else if ((sexo=='f')||(sexo=='F')){
			pesoIdeal = 62.1*altura-44.7;
		} else {
			System.out.println("Digite o sexo M ou F, outro caracter não correspondente.");
		}
		System.out.println("O peso ideal do(a) " +nome+ " é " + pesoIdeal);
		sc.close();
	}
}
