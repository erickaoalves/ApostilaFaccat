/*17)  Ler  as  notas  da  1a.  e  2a.  avaliações  de  um  aluno.  Calcular  a  média aritmética 
 *  simples  e  escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota 
 *  igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. */
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
			try {
				System.out.println("Digite o valor da 1ª nota: ");
				float nota1 = sc.nextFloat();
				
				System.out.println("Digite o valor da 2ª nota: ");
				float nota2 = sc.nextFloat();
				
				float media = (nota1+nota2)/2;
				
				if ((media<0) || (media>10)) {
					    System.out.println("O programa aceita somente números entre 0 e 10, inclusive!");}
				else if (media>=6){
						System.out.println("Aluno(a) Aprovado(a) com sucesso! Sua média foi: "+media);
					}
				else {
						System.out.println("Aluno(a) Reprovado(a) :/ Sua média foi: "+media);
					}
					
					sc.close();
			} catch (Exception e) {
				System.out.println("Erro, insira apenas números !!!"+e);
			}
		} 
	}

