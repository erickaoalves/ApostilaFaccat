/*Escreva um algoritmo para LER um valor e ESCREVER o seu SUCESSOR.
*/package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		
	try {
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int valor = sc.nextInt();
		int resultado = valor+1;
		
	System.out.println("O número sucessor de "+valor+" é "+resultado);
	
	sc.close();
		
	} catch (Exception e) {
		System.out.println("Por favor, inserir um número correto" + e);}
		
	}

}
