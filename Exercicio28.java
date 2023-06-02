//28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			
		System.out.println("Insira o 1º valor");
		int n1 = sc.nextInt();
		System.out.println("Insira o 2º valor");
		int n2 = sc.nextInt();
		System.out.println("Insira o 3º valor");
		int n3 = sc.nextInt();
		
		if ((n1==n2)||(n2==n3)||(n3==n1)) {
			System.out.println("Valores iguais não são permitidos.");
		} else if ((n1>n2)&&(n1>n3)) {
			System.out.println("O maior valor é "+n1);
		} else if ((n2>n1)&&(n2>n3)) {
			System.out.println("O maior valor é "+n2);
		} else
				System.out.println("O maior valor é "+n3);
	
		} catch (Exception e) {
			System.out.println("Erro. Digite somente números!!!"+e);
		}
		
		sc.close();
		}
	}
