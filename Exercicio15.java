/*15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). */

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio15 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	try {
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor >=0) {
			System.out.println("É positivo!");}
		  else  {
			System.out.println("É negativo!");}
		
	} catch (Exception e) {
		System.out.println("Erro, insira apenas números !!!"+e);
	}
		
	    sc.close();
	}
}