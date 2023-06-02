/*18)  Ler  o  ano  atual  e  o  ano  de  nascimento  de  uma  pessoa.  Escrever  uma mensagem  que  
 * diga  se  ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). */
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Digite o ano atual: ");
			int anoATual = sc.nextInt();
		
			System.out.println("Digite o seu ano de nascimento: ");
			int anoNascimento = sc.nextInt();

			int idade = anoATual-anoNascimento;
			
			if (idade>=16) {
				System.out.println("Você está apto(a) à votar.");
				
			} else {
				System.out.println("Você não está apto(a) à votar.");

			}
			
		} catch (Exception e) {
		   System.out.println("Erro, insira apenas números !!!"+e);
		}
		
		sc.close();
		
      }
}
