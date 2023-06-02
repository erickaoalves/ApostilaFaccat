/* 05) Escreva um algoritmo para LER um valor e ESCREVER o seu ANTECESSOR.
*/
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			try {
				
			System.out.println("Digite um valor :");
			int valor = sc.nextInt();
			int resultado = valor-1;
			
			System.out.println("O número antecessor de "+valor+" é "+resultado);
			
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Por favor, inserir um número correto" + e);}
	}

}
