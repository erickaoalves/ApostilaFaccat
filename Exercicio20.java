//20) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem 
//    crescente. 

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Digite um valor: ");
			int valor = sc.nextInt();
			
			System.out.println("Digite outro valor: ");
			int valor1 = sc.nextInt();
			
			if (valor==valor1) {
				System.out.println("Por favor insira o valor distinto.");
				
			} else if (valor>valor1) {
				System.out.println("O menor valor digitado: "+valor1+" e o maior valor foi: "+valor);
				
			} else {
				System.out.println("O menor valor digitado: "+valor+" e o maior valor foi: "+valor);

			}
			
		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);
		}
		
		sc.close();


	}

}
