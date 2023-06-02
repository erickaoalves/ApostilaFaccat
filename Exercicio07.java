/* 07) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva 
a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		try {
			
			System.out.println("Digite a idade em anos: ");
			int anos = ler.nextInt();
			System.out.println("Digite a quantidade de meses que passou do seu ultimo mêsversário: ");
			int meses = ler.nextInt();
			System.out.println("Digite a quantidade de dias que passou do seu utlimo mêsversário: ");
			int dias = ler.nextInt();
			
			int resultado = anos * 365 + meses * 30 + dias;

			System.out.println("Sua idade expressa em dias é "+resultado);
			
		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);

		}
	
		ler.close();
	}

}
