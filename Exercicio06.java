/* 06) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a 
área do retângulo.
*/
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
			
			try {
				System.out.print("Digite o valor da base: ");
				float base = ler.nextFloat();
				System.out.print("Digite o valor da altura: ");
				float altura = ler.nextFloat();
				
				float area = base * altura;
				
				if ( base == altura ) {
					System.out.println("Não é um retângulo."); }
				
					else
				
				System.out.println("O valor da área do retângulo é: "+area);
				
			} catch (Exception e) {
				System.out.println("Erro, insira apenas números !!!"+e);
			}
			
			ler.close();
			
		} 
		
	}

